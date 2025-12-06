# Postman: Campaigns API

Import the collection and environment into Postman to test the local Campaigns API.

Steps
- Import collection: `postman/Campaigns.postman_collection.json` (File → Import → Choose Files)
- Import environment: `postman/Campaigns.postman_environment.json`
- Select the `Local Campaigns Environment` in the top-right environments dropdown
- Ensure `baseUrl` is `http://localhost:8080`
- Use the `Campaigns API` collection requests:
  - `Create Campaign` (POST `{{baseUrl}}/api/campaigns`) — Content-Type: `application/json`
  - `Get All Campaigns` (GET `{{baseUrl}}/api/campaigns`)
  - `Get Campaign by ID` (GET `{{baseUrl}}/api/campaigns/:id`)
  - `Delete Campaign by ID` (DELETE `{{baseUrl}}/api/campaigns/:id`)

Example create body
```
{
  "name": "Diwali Mega Sale",
  "clientName": "Walmart",
  "startDate": "2025-10-20",
  "endDate": "2025-11-10",
  "description": "Big sale",
  "budget": 50000
}
```

Notes
- Make sure the application is running locally on port 8080 before sending requests.
- If you changed the server port, update the `baseUrl` variable in the environment.
