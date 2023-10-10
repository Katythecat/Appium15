Feature: Automate login screen for swaglabs application

  @test
  Scenario: Valid login
    Given User is able to launch apk file in android device
    When User enters username and password
    And User clicks on login button
    Then User should be able to see homepage