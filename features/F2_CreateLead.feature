Feature: LeafTaps functionalities

Scenario Outline: Create Lead in the testleaf site

Given Click on leads
Given Click on Create Lead
Given Click on Company name and enter <company>
Given Click on First name and enter <fName>
Given Click on Last name and enter <lName>
When Click on create lead button
Then View Lead page shoud be displayed

Examples:
|company|fName|lName|
|'Tech Mahindra'|'Krrishnaa'|'R'|

