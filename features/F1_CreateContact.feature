Feature: LeafTaps create contact functionalities

Scenario Outline: Create contact in the testleaf site

When Click on Contacts
When Click on Create Contact
When Click on First Name and enter <firstName>
When Click on Last Name and enter <lastName>
When Click on submit
Then Get title and verify the Title contains View Contact




Examples:
|firstName|lastName|
|'Manivel'|'Ramar'|