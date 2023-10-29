/*
 * Webpack 开发环境配置文件，用于开发环境构建dev-server发布的内容
 * 执行npm run dev主要会用到这里Webpack配置
 * 建议先查阅webapck.base.conf.js ../config/index.js
*/

'use strict'
// 引入nodejs路径模块
const path = require('path')
// 引入当前目录中的utils工具配置文件
const utils = require('./utils')
// 引入webpack来使用webpack内置插件
const webpack = require('webpack')
// 引入config目录中的index.js配置文件
const config = require('../config')
// 引入webpack-merge插件用来合并webpack配置对象，也就是说可以把webpack配置文件拆分成几个小的模块，然后合并
const merge = require('webpack-merge')
// 引入当前目录下的webpack.base.conf.js配置文件，主要配置的是打包各种文件类型的配置
const baseWebpackConfig = require('./webpack.base.conf')
// 下面是一个自动生成html的插件，能够把资源自动加载到html文件中
const HtmlWebpackPlugin = require('html-webpack-plugin')
// 下面这个插件是用来把webpack的错误和日志收集起来，漂亮的展示给用户
const FriendlyErrorsPlugin = require('friendly-errors-webpack-plugin')
//在当前机器上查找打开端口的简单工具
const portfinder = require('portfinder')

function resolve(dir) {// 此函数是用来返回当前目录的平行目录的路径，因为有个'..'
  return path.join(__dirname, '..', dir)
}

const HOST = process.env.HOST//获取环境地址
const PORT = process.env.PORT && Number(process.env.PORT)//获取环境端口

// 把当前的配置对象和base.conf基础的配置对象合并
const devWebpackConfig = merge(baseWebpackConfig, {
  module: {
    // 下面是把utils配置中的处理css类似文件的处理方法拿过来，并且不生成cssMap文件
    rules: utils.styleLoaders({sourceMap: config.dev.cssSourceMap, usePostCSS: true})
  },
  // cheap-module-eval-source-map is faster for development
  // devtool是开发工具选项，用来指定如何生成sourcemap文件，cheap-module-eval-source-map此款soucemap文件性价比最高
  // 生产环境：#source-map
  // 开发环境：#cheap-module-eval-source-map  编译消耗小
  devtool: config.dev.devtool,

  // these devServer options should be customized in /config/index.js
  devServer: {
    clientLogLevel: 'warning',
    historyApiFallback: true,
    hot: true,
    compress: true,
    host: HOST || config.dev.host,
    port: PORT || config.dev.port,
    open: config.dev.autoOpenBrowser,
    overlay: config.dev.errorOverlay
      ? {warnings: false, errors: true}
      : false,
    publicPath: config.dev.assetsPublicPath,
    proxy: config.dev.proxyTable,
    quiet: true, // necessary for FriendlyErrorsPlugin
    watchOptions: {
      poll: config.dev.poll,
    }
  },
  plugins: [
    // DefinePlugin内置webpack插件，专门用来定义全局变量的，下面定义一个全局变量 process.env 并且值是如下
    /*  'process.env': {
            NODE_ENV: '"development"'
        } 这样的形式会被自动转为
        'process.env': '"development"'
        各位骚年看好了，development如果不加双引号就当做变量处理，程序会报错
    */
    new webpack.DefinePlugin({
      'process.env': require('../config/dev.env')
    }),
    // 当你的程序在运行时，而你现在要替换、添加或删除某个模块，又不想重新加载页面，
    // 这个插件帮助你实现无刷新加载，关于内部实现原理
    new webpack.HotModuleReplacementPlugin(),
    //找到一种和顺序无关的模块ID命名方式
    new webpack.NamedModulesPlugin(), // HMR shows correct file names in console on update.
    // 下面这个插件比较简单，就是当webpack编译错误的时候，来中端打包进程，防止错误代码打包到文件中，你还不知道
    new webpack.NoEmitOnErrorsPlugin(),
    // https://github.com/ampedandwired/html-webpack-plugin
    //用来生成html文件的
    new HtmlWebpackPlugin({
      filename: 'index.html',// 生成的文件的名称
      template: 'index.html',//本地模板文件的位置，支持加载器(如handlebars、ejs、undersore、html等)
      inject: true,//向template或者templateContent中注入所有静态资源，不同的配置值注入的位置不经相同。
      // true或者body：所有JavaScript资源插入到body元素的底部
      //head: 所有JavaScript资源插入到head元素中
      //false： 所有静态资源css和JavaScript都不会注入到模板文件中
      favicon: resolve('favicon.ico'),//添加特定favicon路径到输出的html文档中
      title: '新闻发布'//生成的html文档的标题。
    }),
  ]
})
//详细参考Promise用法
module.exports = new Promise((resolve, reject) => {
  //resolve(value)是在Promise在已经异步完成成功(Resolved)之后执行的
  //reject(value)是在Promise在异步失败之后(Rejected)执行。
  portfinder.basePort = process.env.PORT || config.dev.port
  portfinder.getPort((err, port) => {
    if (err) {
      reject(err)
    } else {
      // publish the new Port, necessary for e2e tests
      process.env.PORT = port
      // add port to devServer config
      devWebpackConfig.devServer.port = port

      // Add FriendlyErrorsPlugin
      devWebpackConfig.plugins.push(new FriendlyErrorsPlugin({
        compilationSuccessInfo: {
          messages: [`项目运行地址: http://${devWebpackConfig.devServer.host}:${port}`]
        },
        onErrors: config.dev.notifyOnErrors
          ? utils.createNotifierCallback()
          : undefined
      }))

      resolve(devWebpackConfig)
    }
  })
})
