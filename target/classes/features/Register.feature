Feature: Registration funtionality

Scenario: User creates an account only with mandatory fields
Given  User navigates to Register Account page
When   User enters the details into below fields
|firstName		|Hameed               |
|lastName 		|Sayed 								|
|telephone		|9898989898						|
|password 		|12345								|
And   User selects Privacy policy
And   User clicks on Continue button
Then  User account should get created successfully


Scenario: User creates an account with all fields
Given  User navigates to Register Account page
When   User enters the details into below fields
|firstName		|Hameed               |
|lastName 		|Sayed 								|
|telephone		|9898989898						|
|password 		|12345								|
And   User selects Yes for Newsletter
And   User selects Privacy policy
And   User clicks on Continue button
Then  User account should get created successfully


Scenario: User creates an duplicate account
Given  User navigates to Register Account page
When   User enters the details into below fields with duplicate email
|firstName		|Hameed               |
|lastName 		|Sayed					|
|email    		|shohibshaikh369@gmail.com	|
|telephone		|9898989898						|
|password 		|12345								|
And   User selects Yes for Newsletter
And   User selects Privacy policy
And   User clicks on Continue button
Then  User account should get a proper warning about duplicate email


Scenario: User creates an account without filling any details
Given  User navigates to Register Account page
When   User dont enter any details into fields
And   User clicks on Continue button
Then  User should get a proper warning messages for every mandatory fields



