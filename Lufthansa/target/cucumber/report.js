$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Website",
  "description": "",
  "id": "shopping-website",
  "keyword": "Feature"
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
        "juhil.patel@gmail.com",
        "2672132112"
      ],
      "line": 26,
      "id": "shopping-website;sign-up-with-table;;2"
    }
  ],
  "keyword": "Examples"
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
  "name": "he enters email as \"juhil.patel@gmail.com\" then clicks on create an account button",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Enter personal information \"Mr\" \"Juhil\" \"Patel\" \"juhil.patel@gmail.com\" \"2672132112\" and click on submit button",
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
  "duration": 37560003438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "juhil.patel@gmail.com",
      "offset": 20
    }
  ],
  "location": "ShoppingSteps.heEntersEmailAsThenClicksOnCreateAnAccountButton(String)"
});
formatter.result({
  "duration": 2366719824,
  "status": "passed"
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
      "val": "juhil.patel@gmail.com",
      "offset": 49
    },
    {
      "val": "2672132112",
      "offset": 73
    }
  ],
  "location": "ShoppingSteps.enterPersonalInformationAndClickOnSubmitButton(String,String,String,String,String)"
});
formatter.result({
  "duration": 36288535334,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.01 seconds\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\Juhil\\AppData\\Local\\Temp\\scoped_dir8588_14658}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0839c4f4b143f38edf5bb5261d4cadfa\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:399)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:215)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:102)\r\n\tat com.sun.proxy.$Proxy49.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:185)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy51.clear(Unknown Source)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.FillUpCreateAnAccountPage.fillUpCreateAnAccountPage(FillUpCreateAnAccountPage.java:101)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.submitPersonalInformation(ShoppingCartUIHelper.java:59)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.enterPersonalInformationAndClickOnSubmitButton(ShoppingSteps.java:106)\r\n\tat ✽.And Enter personal information \"Mr\" \"Juhil\" \"Patel\" \"juhil.patel@gmail.com\" \"2672132112\" and click on submit button(features/Shopping.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ShoppingSteps.heCanViewORDERHISTORYAndDETAILSButton()"
});
formatter.result({
  "status": "skipped"
});
});