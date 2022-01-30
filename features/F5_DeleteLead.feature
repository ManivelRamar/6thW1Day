Feature: LeafTaps delete functionalities

Scenario Outline: Find and Delete Lead in the testleaf site

When TC4-Click on Leads
When TC4-Click on Find Leads
When TC4-Click on First Name and enter <name>
When TC4-Click on Find Lead Button
When TC4-Save First resulting field data Click it
When TC4-Click on Delete
When TC4-Click again Find Leads
When TC4-Enter the name again <name>
Then Verify there is no records to display




Examples:
|name|
|'ManivelRa'|