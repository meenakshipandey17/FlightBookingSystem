@BookFlight

Feature: Test cases for booking flights

  Scenario Outline: Book flights between given dates
    Given I navigate to homePage
    And I login and click on flights link
    When Search for flights from "<fromPort>" to "<toPort>"
    And Select the dates between "<fromDate>" to "<toDate>" for month "<month>"
    Then Select the flight from results
    And Book the selected flight
    And User is presented with flight confirmation page

    Examples:
      | fromPort | toPort   | fromDate | toDate | month |
      | London   | Paris    | 20       | 30     | April |
      | Sydney   | Portland | 22       | 30     | May   |

