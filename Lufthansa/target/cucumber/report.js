$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CLApply.feature");
formatter.feature({
  "line": 1,
  "name": "Apply",
  "description": "",
  "id": "apply",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Auto Decline actor-Loan Declined",
  "description": "",
  "id": "apply;auto-decline-actor-loan-declined",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@user"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "a AUTODECLINE_ACTOR applies for consumer Loan",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he logs into the application tracker",
  "keyword": "When "
});
formatter.step({
  "line": 7,
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
  "duration": 60867749287,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for com.barclaycardus.e2e.ui.pages.ChannelsWebPage$1@5f95f1e1\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:260)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:229)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.waitForPageToLoad(ChannelsWebPage.java:53)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.openPage(ChannelsWebPage.java:47)\r\n\tat com.barclaycardus.e2e.ui.pages.LoanEstimationPage.init(LoanEstimationPage.java:35)\r\n\tat com.barclaycardus.domain.ui.helpers.ApplyUIHelper.submitALoanApplication(ApplyUIHelper.java:29)\r\n\tat com.barclaycardus.cucumber.steps.ApplySteps.a_AUTODECLINE_ACTOR_applies_for_consumer_Loan(ApplySteps.java:25)\r\n\tat ✽.Given a AUTODECLINE_ACTOR applies for consumer Loan(features/CLApply.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ApplySteps.he_logs_into_the_application_tracker()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ApplySteps.his_loan_application_status_should_be_DECLINED()"
});
formatter.result({
  "status": "skipped"
});
});