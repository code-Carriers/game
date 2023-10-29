<template>
  <div class="undefine-container">
    <div class="undefine-container-title">{{$route.meta.title}}:未定义资源名称</div>
  </div>
</template>

<script>
  export default {
    name: 'undefine'
  }
</script>

<style>
  .undefine-container {
    margin: 200px auto;
    width: 700px;
    height: 250px;
    background-color: #999999;
    border-radius: 5px;
  }

  .undefine-container-title {
    padding: 90px 120px;
    font-size: 40px;
    color: #fafafa;
    letter-spacing: 0;
    text-shadow: 0 1px 0 #999, 0 2px 0 #888, 0 3px 0 #777, 0 4px 0 #666, 0 5px 0 #555, 0 6px 0 #444, 0 7px 0 #333, 0 8px 7px #001135;
  }
</style>
