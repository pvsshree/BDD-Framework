Feature:

Background:
Given User has already logged in to application
|Username      |Password     |
|admin@email.com|admin@123|

Scenario: Navigate to manage course section
Given User is on Cart page
When User hovers to Manage see the dropdown options
And User clicks on Manage Courses
Then User navigates to Manage Courses page
And Page title should be "Manage Courses"
