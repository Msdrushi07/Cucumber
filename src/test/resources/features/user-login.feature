Feature: user login

  Scenario: user is trying to login with valid credential
    Given user should be on login page
    When user try to login with username "rushi123" and password "password123"
    Then display as logged in successfully

  Scenario: user is trying to login with invalid credential
    Given user should be on login page
    When user try to login with username "rushi3" and password "password123"
    Then display as invalid credentials

 
 Scenario Outline: user is trying to login with valid credential
    Given user should be on login page
    When user try to login with username "<Username>" and password "<Password>"
    Then display as logged in successfully

    Examples: 
      | Username  | Password     |
      | rushi123  | password123  | 
      | rushi123  | password123  | 