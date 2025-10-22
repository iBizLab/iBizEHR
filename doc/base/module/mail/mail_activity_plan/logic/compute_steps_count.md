## 步数计数计算 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
if(data.templates && Array.isArray(data.templates)) {
    data.steps_count = data.templates.length;
} else {
    data.steps_count = 0;
}
```
