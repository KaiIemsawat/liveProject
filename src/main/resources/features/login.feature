Feature: Login page scenarios

  Scenario:  Verify login options with Valid credentials
    Given I navigate to loginPage
    When I input "username" as "kuba@gmail.com"
    And I input "password" as "123456"
    And I click on login button
    Then The display should say Welcome "Kuba" !

  Scenario:  Verify login options with Valid credentials
    Given I navigate to loginPage
    When I input "username" as "kuba@gmail.com"
    And I input "password" as "123456"
    And I click on login button
    Then The the title should be "Student Portal"