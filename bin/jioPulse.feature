@jioPulse @replica
Feature: Scenarios for beat creation using quick method

#CONFIG=./configs/jioPulseJBP/jioPulseJBP_web_config.properties TAG="@jioPulseJBP" PLATFORM=web ./gradlew run
#CONFIG=./configs/jioPulseJBP/jioPulseJBP_web_config.properties TAG="@jioPulseJBP" PLATFORM=web IS_VISUAL=true ./gradlew run

  @web @beatCreation @quickMethod
  Scenario Outline : Create beat using quick way with manager login
    Given User lands on JioPulse application login screen
    When User enters credentials - "vikramsingh.saini" and "T20$2024" and click on login button
    And User selects project
    And User navigates to JioBeatPlanner web application
    And User click on create beat plan option
    And User enters details to create beat and click on crete button - "<beatRecurrance>", "<trackeeType>", "<trackee>", "<beatName>", "<beatStartTime>", "<beatEndTime>", "<trackingFrequency>", "<timeToSpend>", "<pobType>", "<outletGroup>",
    Then User click Ok button on beat created successfully information popup
    Then User logout from JioBeatPlanner web application
    Then User logout from JioPulse web application
    Then User close the browser

    Examples:
      | beatRecurrance | trackeeType | trackee | beatName | beatStartTime | beatEndTime | trackingFrequency | timeToSpend | pobType | outletGroup |
      | One Time       | Others      | 75031991 | AutomationTestBeat | startTime | endTime | 600            | 1           | Retailer | All        |

