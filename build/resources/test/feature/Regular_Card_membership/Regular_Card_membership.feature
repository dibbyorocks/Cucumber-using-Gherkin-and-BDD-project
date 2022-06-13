Feature: Drink Shop Regular Card Membership

Background:
  Given : the following are the drinks available:
  | Drinks | Price|Quantity|
  | Blueberry|120  |1 |
  |Cranberry |80|1|
  |Strawberry-cherry Mocktail     |140|1|
Scenario Outline: Getting  total price when purchasing drinks
Given Customer is a part of regular card program
When Customer purchases <Drinks> of <Quantity> drinks
Then they should get <Price> cost
  Examples:
| Drinks  | Quantity  | Price|
| Blueberry | 2   | 240      |
|Cranberry  | 3    |240      |
|Strawberry-cherry mocktail|1|140|
