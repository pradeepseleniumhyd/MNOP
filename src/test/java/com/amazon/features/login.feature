Feature: Verify Login Functionality

Scenario: Validate all fields are displayed in login page
Given Open the chrome browser
When User enters the url
Then Amazon HomePage is displayed
And Verify the current URL and title of the page
And Verify all contents in the page

Scenario: Verify FB LoginPage
Given Open the chrome browser
When User enters the url
Then Amazon HomePage is displayed
When user enters username
And enters password
And user clicks on signin