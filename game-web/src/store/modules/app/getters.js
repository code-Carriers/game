const appGetters = {
  sidebar: state => state.app.sidebar,
  visitedViews: state => state.app.visitedViews,
  cachedViews: state => state.app.cachedViews,
  disCachedViews: state => state.app.disCachedViews,
  msgNum: state => state.app.msgNum
}
export default appGetters
