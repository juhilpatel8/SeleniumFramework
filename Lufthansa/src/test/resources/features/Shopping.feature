Feature: Logging into Shopping Website

  @user
  Scenario: Logging in salesforce
    Given I go to "loginURL" on "Mozilla"
    And I enter "loginusername" as "sayem4@gmail.com"
    And I enter "lognpassword" as "sami3092"
    And I click on "loginbutton"
    Then Login should be "success"

  @user
   Scenario: Sign up
   Given "POSITIVE_ACTOR" go to "http://automationpractice.com/index.php" on "Chrome"
   And I click on "Sign in" section
   And I enter "email id" as "juhilpatel8@gmail.com"
   And I click on "create an account" button
   And Enter personal information