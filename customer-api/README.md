#  Add Customer


Endpoint:

HTTP Method: POST
URL: http://localhost:8080/api/customers
Description:
This API endpoint allows you to add a new customer to the system.

Request:

Method: POST
URL: http://localhost:8080/api/customers
Headers:
Content-Type: application/json
Body:
Raw (JSON)
json
Copy code
{
  "customerName": "Ayush",
  "email": "developerayush3@gmail.com",
  "mobileNumber": "9753002885",
  "city": "Indore"
}
Response:

Status Code: 201 (Created)
Body:
json
Copy code
{
  "id": "123",
  "customerName": "Ayush",
  "email": "developerayush3@gmail.com",
  "mobileNumber": "9753002885",
  "city": "Indore"
}
