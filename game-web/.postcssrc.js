// https://github.com/michael-ciniawsky/postcss-load-config

module.exports = { plugins: { autoprefixer: {}, "postcss-px2rem-exclude": { "remUnit": 75, "exclude": /node_modules|web-CN|web-EN|error|public|undefine|compontents|directive|bus|filter|icons|router|store|styles|utils|static/i } } }
