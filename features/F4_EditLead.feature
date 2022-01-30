Feature: LeafTaps Edit functionalities

Scenario Outline: Find and Edit Lead in the testleaf site

When TC3-Click on Leads
When TC3-Click on Find Leads
When TC3-Click on First Name and enter <fName>
When TC3-Click on Find Lead Button
When TC3-Click on First resulting field
When TC3-Click on Edit
Then TC3-Update Company name as <company>
When TC3-Click on Submit
Then Check the company name get updated


Examples:
|company|fName|
|'TestLeaf'|'Manivel'|