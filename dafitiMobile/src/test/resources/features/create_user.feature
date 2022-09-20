Feature: I as a client
  need to create a user,
  to be able to make purchases,
  in the aplication dafitti

  Scenario Outline: create user
    Given open apk
    When create user
      | email   | pasword   | confirmpasword   | documento   | nombre   | apellido   | fechanacimiento   |
      | <email> | <pasword> | <confirmpasword> | <documento> | <nombre> | <apellido> | <fechanacimiento> |
    Then user views he <email>
    Examples:
      | email               | pasword    | confirmpasword | documento  | nombre | apellido | fechanacimiento |
      | pruebas13@gmail.com | julian1999 | julian1999     | 1034499120 | julian | becerra  | 25101999        |