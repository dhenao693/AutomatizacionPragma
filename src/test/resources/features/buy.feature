  #language: en
  Feature: Login


    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added."
      And select car to buy
      And fill user form to pay
        | name   | country  | city  | creditCard  | month  | year  |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
#      Then see the alert of add to car successful with message "Product added."

      Examples:
        | username           | password  | name   | country  | city     | creditCard | month | year |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 |


#    Scenario Outline: Buy product without user logged
#      Given "Daniel" is on Demoblaze page
#      When select first product and buy this
#
##      Then see the correct username
#
#      Examples:
#        | username           | password  |
#        | dhenao@yopmail.com | 123456789 |