# Fetch Customers by City

Endpoint:

HTTP Method: GET

URL: http://localhost:8080/api/customers?city=Indore

Description:

This API endpoint allows you to fetch customers based on the specified city.

Request:

Method: GET
URL: http://localhost:8080/api/customers?city=Indore
Response:

Status Code: 200 (OK)

Body:
json

code
[
  {
  
    "id": "123",
    
    "customerName": "Ayush",
    
    "email": "developerayush3@gmail.com",
    
    "mobileNumber": "9753002885",
    
    "city": "Indore"
    
  },
  // Additional customer objects with the same city
]
