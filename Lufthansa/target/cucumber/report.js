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
  "duration": 139274312,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.he_logs_into_the_application_tracker()"
});
formatter.result({
  "duration": 54740,
  "status": "passed"
});
formatter.match({
  "location": "ApplySteps.his_loan_application_status_should_be_DECLINED()"
});
formatter.result({
  "duration": 55595,
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
  "line": 4,
  "name": "Logging in salesforce",
  "description": "",
  "id": "logging-into-shopping-website;logging-in-salesforce",
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
  "name": "I go to \"loginURL\" on \"Mozilla\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"loginusername\" as \"sayem4@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \"lognpassword\" as \"sami3092\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on \"loginbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Login should be \"success\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Sign up",
  "description": "",
  "id": "logging-into-shopping-website;sign-up",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@user"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "\"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" on \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on \"Sign in\" section",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"email id\" as \"juhilpatel8@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \"create an account\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
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
  "duration": 7686461093,
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.\u003cinit\u003e(ChannelsWebPage.java:28)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage.\u003cinit\u003e(SignInPage.java:10)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.submitASignUpApplication(ShoppingCartUIHelper.java:28)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.go_to_on(ShoppingSteps.java:28)\r\n\tat ✽.Given \"POSITIVE_ACTOR\" go to \"http://automationpractice.com/index.php\" on \"Chrome\"(features/Shopping.feature:13)\r\nCaused by: org.openqa.selenium.remote.UnreachableBrowserException: Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure.\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: driver.version: SharedDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat com.barclaycardus.e2e.ui.pages.SharedDriver.getRealDriver(SharedDriver.java:67)\r\n\tat com.barclaycardus.e2e.ui.pages.SharedDriver.\u003cclinit\u003e(SharedDriver.java:33)\r\n\tat com.barclaycardus.e2e.ui.pages.ChannelsWebPage.\u003cinit\u003e(ChannelsWebPage.java:28)\r\n\tat com.barclaycardus.e2e.ui.pages.ShoppingCart.SignInPage.\u003cinit\u003e(SignInPage.java:10)\r\n\tat com.barclaycardus.domain.ui.helpers.ShoppingCartUIHelper.submitASignUpApplication(ShoppingCartUIHelper.java:28)\r\n\tat com.barclaycardus.cucumber.steps.ShoppingSteps.go_to_on(ShoppingSteps.java:28)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:264)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:124)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:200)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:153)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\r\nCaused by: org.openqa.selenium.WebDriverException: java.net.SocketException: Connection reset\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027juhil-pc\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: driver.version: SharedDriver\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:76)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:578)\r\n\t... 50 more\r\nCaused by: java.net.SocketException: Connection reset\r\n\tat java.net.SocketInputStream.read(SocketInputStream.java:209)\r\n\tat java.net.SocketInputStream.read(SocketInputStream.java:141)\r\n\tat org.apache.http.impl.io.SessionInputBufferImpl.streamRead(SessionInputBufferImpl.java:136)\r\n\tat org.apache.http.impl.io.SessionInputBufferImpl.fillBuffer(SessionInputBufferImpl.java:152)\r\n\tat org.apache.http.impl.io.SessionInputBufferImpl.readLine(SessionInputBufferImpl.java:270)\r\n\tat org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:140)\r\n\tat org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:57)\r\n\tat org.apache.http.impl.io.AbstractMessageParser.parse(AbstractMessageParser.java:260)\r\n\tat org.apache.http.impl.DefaultBHttpClientConnection.receiveResponseHeader(DefaultBHttpClientConnection.java:161)\r\n\tat org.apache.http.impl.conn.CPoolProxy.receiveResponseHeader(CPoolProxy.java:153)\r\n\tat org.apache.http.protocol.HttpRequestExecutor.doReceiveResponse(HttpRequestExecutor.java:271)\r\n\tat org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:123)\r\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:254)\r\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)\r\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)\r\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)\r\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:72)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:143)\r\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:89)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:134)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:67)\r\n\t... 51 more\r\n",
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