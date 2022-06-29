<template>
  <div class="content">
    <p>単価: {{ tanka }}円</p>
    <p>数量:<input type="text" class="input" v-model="num" /> 個</p>
  </div>
</template>

<script>
export default {
  data () {
    return {
      tanka: 100,
      num: "",
    };
  },
};
</script>
<style scoped>
.content {
  margin: 20px;
  background-color: gainsboro;
  padding: 10px;
}
.input {
  margin-left: 10px;
  height: 38px;
  width: 100px;
  font-size: 30px;
}

p {
  font-size: 30px;
}
</style>