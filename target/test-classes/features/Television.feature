Feature: Web automation Amazon app


  Scenario: As an end user I should glance at TV prices without sign in
    Given user is on the home page
    When user click on hamburger menu
    Then user Click on the TV, Appliances and Electronics link
    Then click on Televisions under Tv, Audio & Cameras sub section
    Then Scroll down and filter the results by brand Samsung
    Then user click on sort by:featured dropbox button
    Then user click on High to Low prices from the dropbox menu
    And user should see all Samsung televisions price descending order
    Then user click on the second highest price TV
    And user should be the second highest price TV's window






