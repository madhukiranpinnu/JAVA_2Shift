Feature: Just to Test

  Scenario: Login feature for a valid product
    Given On the Testing home page
    When  I had entered userID
    And   I had entered password
    And   I clicked on button
    Then  I check logged in successfully
  Scenario: Login feature for a valid product
    Given On the Testing home page
    When  I had entered userID
    And   I had entered password
    And   I clicked on button
    Then  I check logged in Failed
  Scenario: Login feature for a valid product
    Given On the Testing home page
    When  I had entered userID
    And   I had entered password
    And   I clicked on button
    Then  I check blank page

    Scenario Outline: Logging with multiple attempts
      Given I had on login page
      When  I had enter the userid <UserID>
      And   I had enter the password <Password>
      And   I clicked on button
      Then  I check logged in successfully
      Examples:
      |UserID        |Password   |
      |JKLuio        |madhu12    |
      |LOOKLP        |Kiran31    |
