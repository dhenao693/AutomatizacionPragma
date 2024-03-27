  #language: en
  Feature: Login

    @login @userNotLogged @happyPath
    Scenario Outline: Login successfull
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      Then see the correct username

      Examples:
        | username           | password  |
        | dhenao@yopmail.com | 123456789 |