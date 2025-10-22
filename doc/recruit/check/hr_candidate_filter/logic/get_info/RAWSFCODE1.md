<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
println " _default ${_default}"


def hr_candidate_filter = logic.param('filter').getReal()

String applicant_id = _default.get('id')

def hrCandidateFilterRuntime = sys.dataentity('hr_candidate_filter')


def filter = hrCandidateFilterRuntime.filter()
filter.eq('applicant_id', applicant_id)
hr_candidate_filter = hrCandidateFilterRuntime.selectOne(filter) as IEntityDTO

println "${hr_candidate_filter}"

```
