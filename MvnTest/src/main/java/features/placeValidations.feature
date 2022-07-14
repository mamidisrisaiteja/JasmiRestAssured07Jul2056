Feature: Validating Place APIs

Scenario: Verify if place is being successfully added using  AddPlaceAPI
Given Add Place Payload
When user calls "AddPlaceAPI" with Post HTTP request
Then the post API call gets success with status code 200

Scenario: Verify the details of the newly added place
Given Add Place Payload
When user calls "GetPlaceAPI" with Get HTTP request
Then the get API call gets success with status code 200

