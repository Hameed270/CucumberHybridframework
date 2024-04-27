Feature:Login funtionality

  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User enters valid email address <username> into email field
    And User enters valid password <password> into password field
    And User cliks on Login button
    Then User should get successfully logged in
    Examples:
    |username 									|password  |
    |shohibshaikh369@gmail.com	|Shobby@270|
    |shohibshaikh361@gmail.com 	|12345     |
    |shohibshaikh362@gmail.com  |12345     |
  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters invalid email address into email field
    And User enters invalid password "123456789" into password field
    And User cliks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with valid email and invalid password
    Given User navigates to login page
    When User enters valid email address "shohibshaikh369@gmail.com" into email field
    And User enters invalid password "123456789" into password field
    And User cliks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with invalid email and valid password
    Given User navigates to login page
    When User enters invalid email address into email field
    And User enters valid password "12345" into password field
    And User cliks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login without providing any credetials
    Given User navigates to login page
    When User dont enter email address into  email field
    And User dont enter password into password field
    And User cliks on Login button
    Then User should get a proper warning message about credentials mismatch
