Feature: Book cart Application test

Scenario: Login with correct credentials
Given  User navigates to the Book cart Application
And    User clicks on Login button
And    User enters the valid username
And    User enters the valid password
When   User clicks on Login button
Then   User should be logged in successfully