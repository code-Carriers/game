'use strict'
// Template version: 1.2.6
const path = require('path')
const IPU_PROXY_IP = 'http://172.18.0.55:8087'
const PENAVICOSZ_PROXY_IP = 'http://127.0.0.1:8082'
//const PENAVICOSZ_PROXY_IP = 'http://172.18.0.63:8082'
//const PENAVICOSZ_PROXY_IP = 'http://218.17.51.19:8082'
module.exports = {
  dev: {
    assetsSubDirectory: 'static',
    assetsPublicPath: '/',
    proxyTable: {
      '/api/web-penavicosz/ipu': {
        target: IPU_PROXY_IP,
        pathRewrite: {"^/api/web-penavicosz": "/ipu"}
      },
      '/api/web-penavicosz': {
        target: PENAVICOSZ_PROXY_IP,
        pathRewrite: {"^/api/web-penavicosz": "/api"}
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
