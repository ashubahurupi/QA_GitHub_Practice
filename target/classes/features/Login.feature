Feature: User Login
Registered User Should be able to Login to access account details 


#Below statement belongs to gherkins Keyword
Background:
user Navigates to Login page 


@login @validcredentials @all @smoke @regression 
Scenario Outline: Login with valid Credentials 
Given user Navigates to Login page 
When User enters the valid email Address <email>
And Enter the valid Password <password>
And Click on Login Button 
Then User Should Login Successfully 
Examples:

|email                     |password|
|abahurupi5@yopmail.com    |12345   |
|abahurupi6@yopmail.com    |12346   |
|abahurupi7@yopmail.com    |12347   |
|abahurupi8@yopmail.com    |12348   |

@login @invalidCredentials @smoke @regression 
Scenario: Login with Invalid Credentails 
When User enters the Invalid email Address "Abahurupitest@yopmail.com"
And Enter the Invalid Password "123456345"
And Click on Login Button 
Then User Should get the warning message

@login @validemailandinvalidpassword @smoke @regression 
Scenario: Login with valid Email and InValid Password
When User enters the valid email Address "Abahurupi@yopmail.com"
And Enter the Invalid Password "12345634"
And Click on Login Button 
Then User Should get the warning message

@login @invalidemailandvalidpassword @smoke @regression
Scenario: Login with Invalid Email and Valid Password 
When User enters the Invalid email Address "Abahurupitest@yopmail.com"
And Enter the valid Password "12345"
And Click on Login Button 
Then User Should get the warning message

@login @nocredentials 
Scenario: Login without Entering Credentials 
When User Dont enters any Credentials
And Click on Login Button 
Then User Should get the warning message 