@groovy.transform.field jira
def call(Map config) {
  bat 'echo hi how are you'
  jira=(config.jira_id)
  log.info ("jira id is:" + jira)
  
}
