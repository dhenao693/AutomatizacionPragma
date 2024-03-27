  #language: en
  Feature: Login


    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added."
#      Then see the alert of add to car successful with message "Product added."

      Examples:
        | username           | password  |
        | dhenao@yopmail.com | 123456789 |


#    Scenario Outline: Buy product without user logged
#      Given "Daniel" is on Demoblaze page
#      When select first product and buy this
#
##      Then see the correct username
#
#      Examples:
#        | username           | password  |
#        | dhenao@yopmail.com | 123456789 |