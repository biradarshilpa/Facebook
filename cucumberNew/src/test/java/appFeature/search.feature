Feature: Amazon Search


  Scenario: Search product
    Given I have Search a field on Amazon Page
    When I search for product with name "Apple MacBook Pro " and price 1000
    Then Product With name "Apple MacBook pro" should be displayed