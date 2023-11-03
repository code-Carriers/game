'use strict'
// Template version: 1.2.6
const path = require('path')
const API_PROXY_IP = 'http://127.0.0.1:8201'
module.exports = {
  dev: {
    assetsSubDirectory: 'static',
    assetsPublicPath: '/',
    proxyTable: {
      '/api': {
        target: API_PROXY_IP
      }
    },
    host: '127.0.0.1',
    port: 8889,
    autoOpenBrowser: true,
    errorOverlay: true,
    notifyOnErrors: false,
    poll: false,
    useEslint: true,
    showEslintErrorsInOverlay: false,
    devtool: 'cheap-source-map',
    cacheBusting: true,
    cssSourceMap: false,
  },

  build: {
    index: path.resolve(__dirname, '../dist/index.html'),
    assetsRoot: path.resolve(__dirname, '../dist'),
    assetsSubDirectory: 'static',
    assetsPublicPath: './',
    productionSourceMap: false,
    devtool: '#source-map',
    productionGzip: true,
    productionGzipExtensions: ['js', 'css']
  }
}
