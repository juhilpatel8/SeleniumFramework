Feature:Apply

  @user
  Scenario: Auto Decline actor-Loan Declined
  Given a AUTODECLINE_ACTOR applies for consumer Loan
  When he logs into the application tracker
  Then his loan application status should be DECLINED
