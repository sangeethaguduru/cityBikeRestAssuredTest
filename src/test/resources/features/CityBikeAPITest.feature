#Author: sangeetha.guduru@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: CityBikeAPITest

  @APITest
   Scenario: Check City Location and fetch latitude and longitude
    Given I am using CityBikeAPI
    When I call retrieve location details
    Then <city> is in <country>
    
    Examples:
      | city       | country   |
      | Frankfurt  | DE        |
      | Paris      | FR        |
      | London     | GB        |        
      