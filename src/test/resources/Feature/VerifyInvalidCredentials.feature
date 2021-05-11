Feature: Edit My profile

Scenario Outline: Verify my profile 
Given User is on asianpaint homepage
When User click on Profile icon
And  Click on login icon
And Enter the phone number and otp
And Click on profile 
And Click on my profile button
And Click on edit button
And Enters <FirstName> and <LastName> and <MobileNumber> 
And click on update
Then User should not able update it

Examples:
|FirstName    |LastName   |MobileNumber|
|11@..        |g..@       |0000000000000|