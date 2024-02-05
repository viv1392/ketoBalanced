

Feature: UserRegistration
  @Men
  Scenario: User regestration for ketobalanced 
    And User goes to Landing page
    Then User navigated to gender page and select men
    Then User choose current body type 
    Then User choose body type he want
    Then User want to achieve
    Then User choose target zone
    Then User choose when he was last happy with his weight
    Then User choose how much he has time for meal prepartaion
    
    
    @Login 
    Scenario: User Login
    Given User launch the browser with web address
    And User goes to Landing page

