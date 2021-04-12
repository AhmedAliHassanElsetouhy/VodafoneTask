
Feature: Registration 
  I want to register to have an account on the system
@Sanity
  Scenario Outline: User register on the website
    Given I want to create an account
    When I enter valid "<email>" and click on create an account button
    And Enter "<fName>" "<lName>" "<passwd>" "<address>" "<city>" "<postCode>" "<mobilePhone>" <state>
    Then Account created successfuly, Home page should open

    Examples: 
    |email                                 |fName|lName| passwd| address|  city |postCode|mobilePhone|state|
    |ahmed.ali.hassan.elsetouhy@gmail.com  |Ahmed|Ali  | 123456| Giza   |  Giza |12345   |123456     | 2   |
 
