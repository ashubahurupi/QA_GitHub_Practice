Feature:Seach Functionality 
Background:
user Navigates to Login page


@search @all @searchvalidproduct @smoke @regression
Scenario: Search Functionality 
Given Search for a valid Product 
When User Opens The Application 
And User Entered The Valid Product Into Search field
And User Clicked on Search button 
Then Valid Product Should Get Displayed

@search @all @searchwithinvalidproduct @regression
Scenario: Search a Non valid Product 
Given Search for a valid Product 
When User Opens The Application 
And User Clicked on Search button
Then Proper Text Informming to User that is no Product maching should be display

@search @all @emptyproductname @regression
Scenario: Search the Product without Provding Product Name
Given User Open the Application 
When User Dont Enter Any Product Name 
And User Clicked on Search Button 
Then Proper Text Informming to User that is no Product maching should be display