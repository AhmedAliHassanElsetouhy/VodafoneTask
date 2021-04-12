@reg
Feature: Registration 
  I want to register to have an account on the system

  @reg
  Scenario Outline: User register on the website
    Given I want to create an account
    When I enter valid "<email>" and click on create an account button
    And Enter "<fName>" "<lName>" "<passwd>" "<address>" "<city>" "<postCode>" <state>
    Then Account created successfuly, Home page should open

    Examples: 
     |fName|lName| passwd| email                                | address|  city |postCode|state|
     |Ahmed|Ali  | 123456 |ahmed.ali.hassan.elsetouhy@gmail.com  | Giza   |  Giza |12345   |2|
 
