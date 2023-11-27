Feature: Test the login

  Scenario: vaidate login
    Given user is on login page
    When user enters credentials using Datatable
      | admin | admin123 |
    Then user should land on Home page
    