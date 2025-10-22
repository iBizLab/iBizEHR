<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultEntity = logic.param('default').getReal();
def  random = new Random();
def  randomDigits = String.format("%09d", random.nextInt(1_000_000_000));
def  barCodeString = "041" + randomDigits;
defaultEntity.set("barcode",barCodeString);

```
