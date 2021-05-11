
Feature: ViewOrderSignout

Scenario: Verify signout functionality
Given User is on  asianpaints home page
When User Navigate to Profile button 
And Click on login button
And Enter mobile number and otp
And Click on profile button
And Click on my profile icon
And Click on my order icon
And Click on signout
Then User should not see profile details