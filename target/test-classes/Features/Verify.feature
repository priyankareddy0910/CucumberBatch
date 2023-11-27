Feature: Free CRM Login feature

  Scenario Outline: Free Crm Login Test Scenario
    Given user is alaredy on Login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user click on login button
    Then user is on Homepage

    Examples: 
      | username                    | password    |
      | priyankareddy0910@gmail.com | Testing@123 |
      | priyanka                    | hey         |
      
      
      