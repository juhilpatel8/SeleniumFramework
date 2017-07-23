$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Website",
  "description": "",
  "id": "shopping-website",
  "keyword": "Feature"
});
formatter.scenario({
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
  "duration": 4272263113,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4 milliseconds\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\Juhil\\AppData\\Local\\Temp\\scoped_dir4200_11471}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 2732444f6cd1ae73cbd43c299f3790bb\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"header\"]/div[2]/div/div/nav/div[1]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:455)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:102)\r\n\tat com.sun.proxy.$Proxy48.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:185)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy50.getText(Unknown Source)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage.SignInPage(SignInPage.java:40)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.clickOnSignInSection(ShoppingCartUIHelper.java:44)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.go_to_And_I_click_on_section(ShoppingSteps.java:53)\r\n\tat ✽.Given \"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" And I click on \"Sign in\" section(features/Shopping.feature:12)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.enter_personal_information_and_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.i_can_view_ORDER_HISTORY_And_DETAILS_button()"
});
formatter.result({
  "status": "skipped"
});
});