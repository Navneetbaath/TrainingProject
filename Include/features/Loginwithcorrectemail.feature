#Author: your.email@your.domain.com
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
@Loginwithcorrectemail
Feature: Loginwithcorrectemail 
  Test the login functionality having correct email and password

  @tag1
  Scenario: Test login with corrcet email password
    Given I navigate to login page
    When I login with email address "Navneetbaath66@gmail.com" and password "Navneet@62"
    Then I should arrive at products UI  search for TSHIRT add them to cart then delete the one and proceed to payment and invoice should be downloaded

    