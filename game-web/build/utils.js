/*
 * npm run dev和 npm run build中可能用到的公共函数
 * 目前主要包括
 * 1、获取兼容的输出路径的函数
 * 2、cssLoader工厂函数
*/
'use strict'
// 引入nodejs路径模块
const path = require('path')
// 引入config目录下的index.js配置文件
const config = require('../config')
// 引入extract-text-webpack-plugin插件，用来将css提取到单独的css文件中
const ExtractTextPlugin = require('extract-text-webpack-plugin')
const packageConfig = require('../package.json')
// exports其实就是一个对象，用来导出方法的最终还是使用module.exports，此处导出assetsPath
exports.assetsPath = function(_path) { // 这个方法的作用就是返回一个干净的相对根路径
  const assetsSubDirectory = process.env.NODE_ENV === 'production'
    ? config.build.assetsSubDirectory
    : config.dev.assetsSubDirectory
  // path.join和path.posix.join的区别就是，前者返回的是完整的路径，后者返回的是完整路径的相对根路径
  // 也就是说path.join的路径是C:a/a/b/xiangmu/b，那么path.posix.join就是b
  return path.posix.join(assetsSubDirectory, _path)
}

// 下面是导出cssLoaders的相关配置
exports.cssLoaders = function(options) {
  // options如果没值就是空对象
  options = options || {}
  // cssLoader的基本配置
  const cssLoader = {
    loader: 'css-loader',
    options: {
      // options是用来传递参数给loader的
      // minimize: process.env.NODE_ENV === 'production',
      // minimize表示压缩，如果是生产环境就压缩css代码
      // 是否开启cssmap，默认是false
      sourceMap: options.sourceMap
    }
  }

  const postcssLoader = {
    loader: 'postcss-loader',
    options: {
      sourceMap: options.sourceMap
    }
  }

  // generate loader string to be used with extract text plugin
  function generateLoaders(loader, loaderOptions) {
    // 将上面的基础cssLoader配置放在一个数组里面
    const loaders = options.usePostCSS ? [cssLoader, postcssLoader] : [cssLoader]
    // 如果该函数传递了单独的loader就加到这个loaders数组里面，这个loader可能是less,sass之类的
    if (loader) {
      loaders.push({
        // 加载对应的loader
        loader: loader + '-loader',
        // Object.assign是es6的方法，主要用来合并对象的，浅拷贝
        options: Object.assign({}, loaderOptions, {
          sourceMap: options.sourceMap
        })
      })
    }

    // Extract CSS when that option is specified
    // (which is the case during production build)
    // 注意这个extract是自定义的属性，可以定义在options里面，主要作用就是当配置为true就把文件单独提取，false表示不单独提取，这个可以在使用的时候单独配置
    if (options.extract) {
      return ExtractTextPlugin.extract({
        use: loaders,
        fallback: 'vue-style-loader',
        publicPath: '../../'
      })
    } else {
      return ['vue-style-loader'].concat(loaders)
    }
    // 上面这段代码就是用来返回最终读取和导入loader，来处理对应类型的文件
  }

  // https://vue-loader.vuejs.org/en/configurations/extract-css.html
  return {
    css: generateLoaders(),// css对应 vue-style-loader 和 css-loader
    postcss: generateLoaders(), // postcss对应 vue-style-loader 和 css-loader
    less: generateLoaders('less'),// less对应 vue-style-loader 和 less-loader
    sass: generateLoaders('sass', {indentedSyntax: true}),// sass对应 vue-style-loader 和 sass-loader
    scss: generateLoaders('sass'),// scss对应 vue-style-loader 和 sass-loader
    stylus: generateLoaders('stylus'), // stylus对应 vue-style-loader 和 stylus-loader
    styl: generateLoaders('stylus')// styl对应 vue-style-loader 和 styl-loader
  }
}

// Generate loaders for standalone style files (outside of .vue)
// 下面这个主要处理import这种方式导入的文件类型的打包，上面的exports.cssLoaders是为这一步服务的
exports.styleLoaders = function(options) {
  const output = []
  // 下面就是生成的各种css文件的loader对象
  const loaders = exports.cssLoaders(options)

  for (const extension in loaders) {
    // 把每一种文件的laoder都提取出来
    const loader = loaders[extension]
    output.push({
      // 把最终的结果都push到output数组中
      test: new RegExp('\\.' + extension + '$'),
      use: loader
    })
  }

  return output
}

exports.createNotifierCallback = () => {// 配合 friendly-errors-webpack-plugin
  // 基本用法：notifier.notify('message');
  const notifier = require('node-notifier')// 发送跨平台通知系统

  return (severity, errors) => {
    // 当前设定是只有出现 error 错误时触发 notifier 发送通知
    if (severity !== 'error') return// 严重程度可以是 'error' 或 'warning'

    const error = errors[0]
    const filename = error.file && error.file.split('!').pop()

    notifier.notify({
      title: packageConfig.name,
      message: severity + ': ' + error.name,
      subtitle: filename || '',
      icon: path.join(__dirname, 'logo.png')// 通知图标
    })
  }
}
