Feature: Shopping Website

#  Scenario: Logging in salesforce
#    Given I go to "loginURL" on "Mozilla"
#    And I enter "loginusername" as "sayem4@gmail.com"
#    And I enter "lognpassword" as "sami3092"
#    And I click on "loginbutton"
#    Then Login should be "success"

  @user
   Scenario: Sign up
   Given "POSITIVE_ACTOR" go to "http://automationpractice.com/index.php" And I click on "Sign in" section
   When I enter "email id" as "juhilpatel8@gmail.com" then click on "create an account" button
   And Enter personal information and click on submit button
   Then I can view ORDER HISTORY And DETAILS button

#  @smoke
#  Scenario: Sign up with table
#    Given "POSITIVE_ACTOR" go to shoppingcart website And clicks on "Sign in" link
#    When he enters email as "<primaryEmail>" then clicks on create an account button
#    And Enter personal information "<title>" "<firstName>" "<lastName>" "<primaryEmail>" "<phoneNumber>" and click on submit button
#    Then he can view ORDER HISTORY And DETAILS button
#    Examples:
#    |title|firstName|lastName|primaryEmail|phoneNumber|
#    |Mr|Juhil|Patel|juhil.patel@gmail.com|2672132112|