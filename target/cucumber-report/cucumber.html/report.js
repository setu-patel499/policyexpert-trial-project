$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("results.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As user I want to verify \u002773 results for \"cheap home insurance\u0027 text results into policyExpert website",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 10541006000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to helpCentre page successfully",
  "description": "",
  "id": "search-functionality;user-should-navigate-to-helpcentre-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on helpCentre link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover and click on searchbar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I entre text \"cheap home insurance\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I mouse hover and click on searchBtn",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 195440300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnHelpCentreLink()"
});
formatter.result({
  "duration": 2463929900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverAndClickOnSearchbar()"
});
formatter.result({
  "duration": 246236300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cheap home insurance",
      "offset": 14
    }
  ],
  "location": "MyStepdefs.iEntreText(String)"
});
formatter.result({
  "duration": 575685900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverAndClickOnSearchBtn()"
});
formatter.result({
  "duration": 623177800,
  "status": "passed"
});
formatter.after({
  "duration": 928764500,
  "status": "passed"
});
});