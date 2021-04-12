
@tag
Feature: Cart Checkout 
  I want to add products to my cart

  @Sanity
  Scenario Outline: Cart Checkout 
    Given Select “Blouses” Subcategory in “Women” Category
    And Select resulted product
    And Select “White” colour and <sizeIndex> size
    And Follow checkout procedure
    When Confirm order by selecting bank wire option
    Then Validate order was placed from order history page.

Examples: 
      | sizeIndex  |
      | 2          | 
