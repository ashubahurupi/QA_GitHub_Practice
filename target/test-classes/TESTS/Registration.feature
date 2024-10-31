Feature: User Registration 


Background: 
User Navigates to the Register account page


@register @mandatoryfields @smoke @regression 
Scenario: Registration With Mandatory details 

When User Enters Below details 
|FirstName         |"Ashish"                 |
|LastName          |"Bahurupi"               |
|EmailAddress      |"abahurupi@yopmail.com"|
|TelephoneNumber   | 1234567890              |
|Password          | 123456                  |
|ConfirmPassword   | 123456                  |

And Click on Continue Button
Then Account should be Successfully Created 

@register @allfields @smoke @regression
Scenario: Register with All FielWhen User Enters Below details 
|FirstName         |"Ashish"                 |
|LastName          |"Bahurupi"               |
|EmailAddress      |"abahurupi1234@yopmail.com"  |
|TelephoneNumber   | 1234567890              |
|Password          | 123456                  |
|ConfirmPassword   | 123456                  |
And Select Yes for NewsLetter
And Click on Continue Button 
Then Account should be Successfully Created 


@register @emptyfields @smoke @regression 
Scenario: Register without providing any Field
When User Dont Filled Any Details 
And Click on Continue Button 
Then Warning Message should be displayed Under All the Mandatory Field


@register @registerwithduplicate @smoke @regression 
Scenario: Register with Duplicate Email Address
When User Enters Below details 
|FirstName         |"Ashish"                 |
|LastName          |"Bahurupi"               |
|EmailAddress      |"abahurupi@yopmail.com"|
|TelephoneNumber   | 1234567890              |
|Password          | 123456                  |
|ConfirmPassword   | 123456                  |

And Select the Privacy Policy Field
And Click on Continue Button 
Then Warning Message Displayed Email Is Already In Use
