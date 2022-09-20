Feature: purchase of an item in falabella,
  I as a user need to enter the web page,
  I need to choose an item offered,
  to take it to payment

  Scenario Outline: I as a user enter
    Given pag web falabella
    When user go select on  section
      | category   | product   | region   | city   | neighborhood   | address   | prefix   |
      | <category> | <product> | <region> | <city> | <neighborhood> | <address> | <prefix> |
    Then user views  <message>
    Examples:
      | category        | product                               | region    | city    | neighborhood | address  | prefix | message                |
      | celular samsung | Celular Samsung Galaxy Z FLIP 4 256GB | ANTIOQUIA | COCORNA | COCORNA      | calle123 | 01-201 | Elige tu medio de pago |
