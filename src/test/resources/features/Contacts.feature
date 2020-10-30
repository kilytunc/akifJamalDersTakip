Feature: Contacts page
  @wip @smoke
  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1

    #homework
  Scenario: login as driver
    Given the user is on the login page
    When the user logged in as "sales_manager"
    Then the user should be able to login
    And the title contains "Dashboard"


  Scenario: Verify Create Calender Event
    Given the user is on the login page
    And  the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendars"


  Scenario: Menu Options
    Given the uer logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options
    Given the uer logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario Outline: : login as a given user <user>
    Given the user is on the login page
    When the user logs in using the following credentials
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login

    Examples:
      | user   | firstName | lastName  |
      | user10 | Brenden   | Schneider |
      | storemanager85  | Stephan    | Haley |



