<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def candidate_talentpool = sys.dataentity('HR_CANDIDATE_TALENT_POOL');
def defaultParam = logic.param('default').getReal();

def candidateId = defaultParam.get("candidate_id")
def talentpoolJson = defaultParam.get("talentpool")
def talentpoolArray = new groovy.json.JsonSlurper().parseText(talentpoolJson)

talentpoolArray.each { talentpoolItem ->
    
    def newTalentpool = new net.ibizsys.central.util.EntityDTO(); 
    
    
    def talentpoolId = talentpoolItem.get("id")
    def talentpoolName = talentpoolItem.get("name")
    newTalentpool.set("talentpool_id", talentpoolId)
    newTalentpool.set("candidate_id", candidateId)
    newTalentpool.set("name", talentpoolName)
    

    candidate_talentpool.create(newTalentpool); 
}

```
