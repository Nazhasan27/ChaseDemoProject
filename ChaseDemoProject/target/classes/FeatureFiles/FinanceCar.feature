@tag
Feature: Get estimated rates and monthly payments on financing a car

  @tag1
  Scenario: Get rates for a Used Audi
    Given User navigates to Chase website 
    And clicks on right arrow in carousel
    And clicks on auto
    And selects Year 
    And selects Make
    And selects State
    And Selects Estimated credit rating
    And Selects Amount
    Then user can Get info