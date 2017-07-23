$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Website",
  "description": "",
  "id": "shopping-website",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario: Logging in salesforce"
    },
    {
      "line": 4,
      "value": "#    Given I go to \"loginURL\" on \"Mozilla\""
    },
    {
      "line": 5,
      "value": "#    And I enter \"loginusername\" as \"sayem4@gmail.com\""
    },
    {
      "line": 6,
      "value": "#    And I enter \"lognpassword\" as \"sami3092\""
    },
    {
      "line": 7,
      "value": "#    And I click on \"loginbutton\""
    },
    {
      "line": 8,
      "value": "#    Then Login should be \"success\""
    }
  ],
  "line": 11,
  "name": "Sign up",
  "description": "",
  "id": "shopping-website;sign-up",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@user"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "\"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" And I click on \"Sign in\" section",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter \"email id\" as \"juhilpatel8@gmail.com\" then click on \"create an account\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter personal information and click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can view ORDER HISTORY And DETAILS button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "POSITIVE_ACTOR",
      "offset": 1
    },
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 24
    },
    {
      "val": "Sign in",
      "offset": 81
    }
  ],
  "location": "ShoppingSteps.go_to_And_I_click_on_section(String,String,String)"
});
formatter.result({
  "duration": 38158866051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email id",
      "offset": 9
    },
    {
      "val": "juhilpatel8@gmail.com",
      "offset": 23
    },
    {
      "val": "create an account",
      "offset": 61
    }
  ],
  "location": "ShoppingSteps.i_enter_as_then_click_on_button(String,String,String)"
});
formatter.result({
  "duration": 2368894870,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.enter_personal_information_and_click_on_submit_button()"
});
formatter.result({
  "duration": 10585234575,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.i_can_view_ORDER_HISTORY_And_DETAILS_button()"
});
formatter.result({
  "duration": 62665796,
  "status": "passed"
});
});