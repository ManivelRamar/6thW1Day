Feature: Duplicate a Lead in LeafTaps

Scenario Outline: Duplicate an Existing Lead

When Click on leads button
When Click on Find Leads button
When Click on First Name as <firstName>
When Click on Find Lead to get results
Then Click on First result and get FirstName
When Click on Duplicate
When Click Submit to duplicate the lead
Then Check and confirm the Duplicate Lead

Examples:
|firstName|
|'Manivel'|