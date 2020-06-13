$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FirstFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Automation test Practice website",
  "description": "",
  "id": "automation-test-practice-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1724711975,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Wiki search for String",
  "description": "",
  "id": "automation-test-practice-website;wiki-search-for-string",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Read Inputfile and extract the Car Registration numbers",
  "keyword": "And "
});
formatter.match({
  "location": "homepagestepdefs.navigateToWebsite()"
});
formatter.result({
  "duration": 572112183,
  "status": "passed"
});
formatter.match({
  "location": "homepagestepdefs.readInputfileAndExtractTheCarRegistrationNumbers()"
});
formatter.result({
  "duration": 4409262744,
  "status": "passed"
});
formatter.after({
  "duration": 90230738,
  "status": "passed"
});
});