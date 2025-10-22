# employee(employee)  <!-- {docsify-ignore-all} -->


<br>
<p class="panel-title"><b>实体</b></p>

* [员工(HR_EMPLOYEE)](module/hr/hr_employee)



### 维度
##### 常规维度
|    名称col200   | 代码名col150      | 属性col350    |  备注col500  |
| --------  |------------| -----   |  --------|
|department_id|department_id|部门(DEPARTMENT_ID)||
|parent_id|parent_id|管理员标识(PARENT_ID)||

### 指标
##### 常规指标
|    名称col200   | 代码名col150 |  聚合模式col150  | 属性col350      |  备注col500  |
| --------  |------------| -----   |  --------|--------|
|count|count|计数|标识(ID)||

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>