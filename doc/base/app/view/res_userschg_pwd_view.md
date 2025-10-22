# 修改密码(res_userschg_pwd_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 值规则
* `new_password` : [密码](index/sys_value_rule_index#password)
* `sure_password` : [密码](index/sys_value_rule_index#password)
* `sure_password` : [两次密码不一致](index/value_rule_index)
* `new_password` : [两次密码不一致](index/value_rule_index)


<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>