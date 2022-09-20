Feature: I as a user need,
  perform api consumption,
  to create,delete,query and update

  Background:
    Given user preparation the service

  @create
  Scenario: create user

    When he create user
      | name   | worked |
      | julian | leader |

    Then he could views the code 201

  @update
  Scenario: update user

    When he update user
      | name | worked       | id |
      | juan | especialista | 2  |

    Then he could views the code 200

  @search
  Scenario: search user
    When he search user
    Then he could views the code 200

  @delete
  Scenario: delete user
    When he delete user
    Then he could views the code 204