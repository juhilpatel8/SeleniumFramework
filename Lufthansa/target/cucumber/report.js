$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CLApply.feature");
formatter.feature({
  "line": 1,
  "name": "Apply",
  "description": "",
  "id": "apply",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35154411,
  "status": "passed"
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
  "duration": 650910624,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.he_logs_into_the_application_tracker()"
});
formatter.result({
  "duration": 419529,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.his_loan_application_status_should_be_DECLINED()"
});
formatter.result({
  "duration": 124875,
  "status": "passed"
});
formatter.after({
  "duration": 2587732,
  "status": "passed"
});
formatter.uri("features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Website",
  "description": "",
  "id": "shopping-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3987443,
  "status": "passed"
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
formatter.step({
  "line": 16,
  "name": "click on HyperLink to verify order history",
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
      "val": "Sign in",
      "offset": 81
    }
  ],
  "location": "ShoppingSteps.go_to_And_I_click_on_section(String,String,String)"
});
formatter.result({
  "duration": 36023211328,
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
  "duration": 2546800061,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.enter_personal_information_and_click_on_submit_button()"
});
formatter.result({
  "duration": 7047028641,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.i_can_view_ORDER_HISTORY_And_DETAILS_button()"
});
formatter.result({
  "duration": 1127577629,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.clickOnHyperLinkToVerifyOrderHistory()"
});
formatter.result({
  "duration": 109915107,
  "status": "passed"
});
formatter.after({
  "duration": 830075,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Sign up with table",
  "description": "",
  "id": "shopping-website;sign-up-with-table",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "\"POSITIVE_ACTOR\" go to shoppingcart website And clicks on \"Sign in\" link",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "he enters email as \"\u003cprimaryEmail\u003e\" then clicks on create an account button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Enter personal information \"\u003ctitle\u003e\" \"\u003cfirstName\u003e\" \"\u003clastName\u003e\" \"\u003cprimaryEmail\u003e\" \"\u003cphoneNumber\u003e\" and click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "he can view ORDER HISTORY And DETAILS button",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "shopping-website;sign-up-with-table;",
  "rows": [
    {
      "cells": [
        "title",
        "firstName",
        "lastName",
        "primaryEmail",
        "phoneNumber"
      ],
      "line": 25,
      "id": "shopping-website;sign-up-with-table;;1"
    },
    {
      "cells": [
        "Mr",
        "Juhil",
        "Patel",
        "juhil.patel12@gmail.com",
        "2672132112"
      ],
      "line": 26,
      "id": "shopping-website;sign-up-with-table;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1416389,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Sign up with table",
  "description": "",
  "id": "shopping-website;sign-up-with-table;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "\"POSITIVE_ACTOR\" go to shoppingcart website And clicks on \"Sign in\" link",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "he enters email as \"juhil.patel12@gmail.com\" then clicks on create an account button",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Enter personal information \"Mr\" \"Juhil\" \"Patel\" \"juhil.patel12@gmail.com\" \"2672132112\" and click on submit button",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "he can view ORDER HISTORY And DETAILS button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "POSITIVE_ACTOR",
      "offset": 1
    },
    {
      "val": "Sign in",
      "offset": 59
    }
  ],
  "location": "ShoppingSteps.goToShoppingcartWebsiteAndClicksOnLink(String,String)"
});
formatter.result({
  "duration": 62710720550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "juhil.patel12@gmail.com",
      "offset": 20
    }
  ],
  "location": "ShoppingSteps.heEntersEmailAsThenClicksOnCreateAnAccountButton(String)"
});
formatter.result({
  "duration": 32356470677,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.02 seconds\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\Juhil\\AppData\\Local\\Temp\\scoped_dir11064_14997}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0e4b43a07b2287f35abc9ad367ee8d42\n*** Element info: {Using\u003did, value\u003dSubmitCreate}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:399)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:215)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat sun.reflect.GeneratedMethodAccessor13.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:102)\r\n\tat com.sun.proxy.$Proxy47.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:185)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:809)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.waitForVisibilityOfElementById(ChannelsWebPage.java:86)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.CreateAnAccountPage.CreateAnAccountPage(CreateAnAccountPage.java:38)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.clickOnCreateAnAccount(ShoppingCartUIHelper.java:51)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.heEntersEmailAsThenClicksOnCreateAnAccountButton(ShoppingSteps.java:91)\r\n\tat ✽.When he enters email as \"juhil.patel12@gmail.com\" then clicks on create an account button(features/Shopping.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 28
    },
    {
      "val": "Juhil",
      "offset": 33
    },
    {
      "val": "Patel",
      "offset": 41
    },
    {
      "val": "juhil.patel12@gmail.com",
      "offset": 49
    },
    {
      "val": "2672132112",
      "offset": 75
    }
  ],
  "location": "ShoppingSteps.enterPersonalInformationAndClickOnSubmitButton(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.heCanViewORDERHISTORYAndDETAILSButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1298784,
  "status": "passed"
});
});