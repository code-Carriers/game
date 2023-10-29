/*
 * npm run build 构建执行文件，主要用于生产环境
 * 建议先查阅webapck.prod.conf.js
*/
'use strict'
//获取更新(检测node和npm版本)
require('./check-versions')()
// process.env 是node环境内置的变量，在命令行里可以通过 set 变量名=值的方式来设置，等价于 set NODE_ENV='production'
// ora是一个命令行转圈圈动画插件，好看用的
const ora = require('ora')
// rimraf插件是用来执行UNIX命令rm和-rf的用来删除文件夹和文件，清空旧的文件
const rm = require('rimraf')
// node.js路径模块
const path = require('path')
// chalk插件，用来在命令行中输入不同颜色的文字
const chalk = require('chalk')
// 引入webpack模块使用内置插件和webpack方法
const webpack = require('webpack')
// 引入config下的index.js配置文件，此配置文件我之前介绍了请自行查阅，主要配置的是一些通用的选项
const config = require('../config')
// 下面是生产模式的webpack配置文件，请看我的webpack.prod.conf解释文章
const webpackConfig = require('./webpack.prod.conf')
// 开启转圈圈动画
const spinner = ora('building for ' + process.env.env_config + ' environment...');
spinner.start()
const ProgressPlugin = require('webpack/lib/ProgressPlugin')

// 调用rm方法，第一个参数的结果就是 dist/static，表示删除这个路径下面的所有文件
rm(path.join(config.build.assetsRoot, config.build.assetsSubDirectory), err => {
  // 如果删除的过程中出现错误，就抛出这个错误，同时程序终止
  if (err) throw err
  // 没有错误，就执行webpack编译
  const compiler = webpack(webpackConfig)

  compiler.apply(new ProgressPlugin(function (percentage, msg, current, active, modulepath) {
    if (percentage < 1) {
      modulepath = modulepath ? ' …' + modulepath.substr(modulepath.length - 30) : ''
      current = current ? ' ' + current : ''
      active = active ? ' ' + active : ''
      console.log(chalk.green((percentage * 100).toFixed(0) + '% ' + msg + current + active + modulepath + ' '))
    } else if (percentage === 1) {
      process.stdout.write('\n')
      console.log('webpack: done.')
    }
  }))

  compiler.run(function (err, stats) {
    // 停止转圈圈动画
    spinner.stop()
    // 如果有错误就抛出错误
    if (err) throw err
    // 没有错误就执行下面的代码，process.stdout.write和console.log类似，输出对象
    process.stdout.write(stats.toString({// stats对象中保存着编译过程中的各种消息
      // 增加控制台颜色开关
      colors: true,
      // 不增加内置模块信息
      modules: false,
      // 不增加子级信息
      children: false,
      // 允许较少的输出
      chunks: false,
      // 不将内置模块的信息加到包信息
      chunkModules: false
    }) + '\n\n')
    // 以上就是在编译过程中，持续打印消息
    // 下面是编译出错退出进程
    if (stats.hasErrors()) {
      console.log(chalk.red('  打包错误.\n'))
      process.exit(1)
    }
    // 下面是编译成功的消息
    console.log(chalk.cyan('  已完成打包\n'))
  })
})
