Feature: As end user I want to login the app to make a purchase

  Scenario: 1 login using valid credentials
    Given a client wants to purchase some products
    When client login the app
    Then client must be able to see the product list

  Scenario: 2 login using valid credentials
    Given a client wants to purchase some products
    When client login the app