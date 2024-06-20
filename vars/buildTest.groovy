@groovy.transform.Field jira
def call(Map config) {
echo 'echo hi how are you'
jira=(config.jira_id)
echo  'jira id is %jira%'
  
}
