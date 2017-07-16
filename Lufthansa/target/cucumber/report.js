$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CLApply.feature");
formatter.feature({
  "line": 1,
  "name": "Apply",
  "description": "",
  "id": "apply",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Auto Decline actor-Loan Declined",
  "description": "",
  "id": "apply;auto-decline-actor-loan-declined",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a AUTODECLINE_ACTOR applies for consumer Loan",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he logs into the application tracker",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "his loan application status should be DECLINED",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AUTODECLINE_ACTOR",
      "offset": 2
    }
  ],
  "location": "ApplySteps.a_AUTODECLINE_ACTOR_applies_for_consumer_Loan(String)"
});
formatter.result({
  "duration": 355534172,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.he_logs_into_the_application_tracker()"
});
formatter.result({
  "duration": 141981,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.his_loan_application_status_should_be_DECLINED()"
});
formatter.result({
  "duration": 108196,
  "status": "passed"
});
formatter.uri("features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Logging into Shopping Website",
  "description": "",
  "id": "logging-into-shopping-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Logging in salesforce",
  "description": "",
  "id": "logging-into-shopping-website;logging-in-salesforce",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I go to \"loginURL\" on \"Mozilla\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter \"loginusername\" as \"sayem4@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"lognpassword\" as \"sami3092\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on \"loginbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login should be \"success\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 23
    }
  ],
  "location": "ShoppingSteps.i_go_to_on(String,String)"
});
formatter.result({
  "duration": 15367345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginusername",
      "offset": 9
    },
    {
      "val": "sayem4@gmail.com",
      "offset": 28
    }
  ],
  "location": "ShoppingSteps.i_enter_as(String,String)"
});
formatter.result({
  "duration": 263862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lognpassword",
      "offset": 9
    },
    {
      "val": "sami3092",
      "offset": 27
    }
  ],
  "location": "ShoppingSteps.i_enter_as(String,String)"
});
formatter.result({
  "duration": 1506201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginbutton",
      "offset": 12
    }
  ],
  "location": "ShoppingSteps.i_click_on(String)"
});
formatter.result({
  "duration": 231362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 17
    }
  ],
  "location": "ShoppingSteps.login_should_be(String)"
});
formatter.result({
  "duration": 205702,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Sign up",
  "description": "",
  "id": "logging-into-shopping-website;sign-up",
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
  "name": "\"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" on \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Sign in\" section",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"email id\" as \"juhilpatel8@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"create an account\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Enter personal information",
  "keyword": "And "
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
      "val": "Chrome",
      "offset": 69
    }
  ],
  "location": "ShoppingSteps.go_to_on(String,String,String)"
});
formatter.result({
  "duration": 39587935005,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for com.barclaycardus.e2e.ui.pages.ChannelsWebPage$1@439e3cb4\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:260)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:229)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.waitForPageToLoad(ChannelsWebPage.java:59)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.openPage(ChannelsWebPage.java:53)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage.init(SignInPage.java:20)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.submitASignUpApplication(ShoppingCartUIHelper.java:29)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.go_to_on(ShoppingSteps.java:28)\r\n\tat ✽.Given \"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" on \"Chrome\"(features/Shopping.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 12
    }
  ],
  "location": "ShoppingSteps.i_click_on_section(String)"
});
formatter.result({
  "status": "skipped"
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
    }
  ],
  "location": "ShoppingSteps.i_enter_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "create an account",
      "offset": 12
    }
  ],
  "location": "ShoppingSteps.i_click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.enter_personal_information()"
});
formatter.result({
  "status": "skipped"
});
});