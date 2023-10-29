const Filter =
  {
    register(Vue) {
      Vue.filter('money', function (val) {
        val = val.toString().replace(/\$|\,/g, '')
        if (isNaN(val)) {
          val = '0'
        }
        const sign = (val === (val = Math.abs(val)))
        val = Math.floor(val * 100 + 0.50000000001)
        let cents = val % 100
        val = Math.floor(val / 100).toString()
        if (cents < 10) {
          cents = '0' + cents
        }
        for (let i = 0; i < Math.floor((val.length - (1 + i)) / 3); i++) {
          val = val.substring(0, val.length - (4 * i + 3)) + ',' + val.substring(val.length - (4 * i + 3))
        }
        return (((sign) ? '' : '-') + val + '.' + cents)
      })
      Vue.filter('num', function (val, len) {
        if (isNaN(val)) {
          val = '0'
        }
        if (len === undefined) {
          len = 3
        }
        return Number(val).toFixed(len)
      })
    }
  }
export default Filter
