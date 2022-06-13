Feature: Drinks shop

  Scenario:Customer has come to the shop
    Given Customer is a part of regular card
    When he orders  1 drink of price 30
    Then it should return the total amount 30

  Scenario: Customer has come to the shop
    Given Customer is a part of regular card
    When he order 2 drinks of each price 30
    Then  the total amount is 30

