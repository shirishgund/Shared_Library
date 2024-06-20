@groovy.transform.Field jira
def call(Map config) {
  bat 'echo hi how are you'
  jira=(config.jira_id)
  bat "jira id is"  
  
}
