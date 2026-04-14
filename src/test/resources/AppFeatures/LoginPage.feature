Feature:
Scenario: Login Page Title
Given User is on the Orange HRM Login Page
When User gets title of the page
Then page title should be "OrangeHRM"

Scenario: Forgot password link
Given User is on login page
Then Forgot password link should be displayed

Scenario: Login with correct credentials
Given User is on login page
When User enters username "Admin"
And User enters password "admin123"
And User clicks on login button
Then User gets title of page
And Page title should be "Dashboard"