$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/TestCases.feature");
formatter.feature({
  "line": 2,
  "name": "Yourlogo Website",
  "description": "",
  "id": "yourlogo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Yourlogo"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "Login and add new address",
  "id": "yourlogo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@TC04_Yourlogo"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "the user logged in to the home page and signin",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "click on my address button and navigate to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click on add new address and fill the mandatory details and save",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});