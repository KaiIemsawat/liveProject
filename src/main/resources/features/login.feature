Feature: Login page scenarios

  Scenario:  Verify login options with Valid credentials
    Given I navigate to loginPage
    When I input "username" as "kaiiem@kubathegreat.com"
    And I input "password" as "102938"
    And I click on login button
    Then The display should say Welcome "Kai" !