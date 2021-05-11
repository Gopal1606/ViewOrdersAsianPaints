
Feature: View orders

Scenario: Verify ordered items are display
Given User is on home page
When User Navigate to Profile icon
And Click on login
And Enter phone number and otp
And Click on profile icon
And Click on my profile
And Click on my order 
Then User should see the ordered items