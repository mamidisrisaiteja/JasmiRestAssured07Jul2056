Feature: Validating Place APIs

Scenario: Verify if place is being successfully added using  AddPlaceAPI
Given Add Place Payload
When user calls "AddPlaceAPI" with Post HTTP request
Then the API call gets success with status code 200


