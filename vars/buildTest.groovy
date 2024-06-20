def call(Map config) {
  stage("buildscan"){
echo 'echo hi how are you'
String jira=(config.jira_id)
String branch=(config.branch)
echo  'jira id is' + jira
echo  'branch  is' + branch
  }  
}
