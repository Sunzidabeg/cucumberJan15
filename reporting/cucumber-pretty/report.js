$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sunzida/IdeaProjects/Cucu/src/test/java/feature/search.feature");
formatter.feature({
  "line": 1,
  "name": "SearchBox Action",
  "description": "",
  "id": "searchbox-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful search with Valid Credentials",
  "description": "",
  "id": "searchbox-action;successful-search-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters UserName and Password",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBox.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13436098600,
  "status": "passed"
});
formatter.match({
  "location": "SearchBox.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 98800,
  "status": "passed"
});
formatter.match({
  "location": "SearchBox.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 66800,
  "status": "passed"
});
});