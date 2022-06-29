<template>
  <div>
    <h1>This is a ref sample</h1>
    <Child ref="refSumPrice" />
    <button class="btn" @click="cal">計算</button>
    <hr />
    <p>合計金額: {{ sumPrice }} 円</p>
  </div>
</template>

<script>
import Child from "./Child.vue";
export default {
  data() {
    return {
      sumPrice: 0,
    };
  },
  components: {
    Child,
  },
  methods: {
    cal() {
      this.sumPrice = this.$refs.refSumPrice.num * this.$refs.refSumPrice.tanka;
    },
  },
  mounted: function () {},
};
</script>
<style>
p {
  font-size: 40px;
}
.btn {
  height: 40px;
  width: 100px;
  margin-left: 20px;
  font-size: 20px;
  background-color: rgba(255, 217, 113, 0.76);
  border: 2px solid #ccc;
}
.btn:hover{
  cursor: pointer;
  background-color:yellow;
}
</style>
