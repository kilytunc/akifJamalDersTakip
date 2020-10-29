@dashboardTest

Feature:ales managers should be able to navigate to pages

  @fleet
  Scenario: Navigate Fleet—> Vehicles
    Given User is loged to the system in any page
    When User hover to ° Fleet ° Menu
    And press to Vehicles selection
    Then The new pages title should be    Vehicles  <--

  @marketing @database
  Scenario: Marketing—> Campaigns
    Given User is loged to the system in any page
    When User hover to ** Marketing ** Menu
    And press to Campaigns selection
    Then The new pages title should be    Campaigns  <--

  @activities
  Scenario: Activities—> Calendar Events
    Given User is loged to the system in any page
    When User hover to ** Activities ** Menu  ANNNDD press to Calendar Events...
    Then The new pages title should be    Calendars  <--




