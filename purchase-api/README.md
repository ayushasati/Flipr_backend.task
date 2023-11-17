# Purchase API Documentation

1. Add Purchase

Endpoint:

HTTP Method: POST

URL: http://localhost:8080/api/purchases
Description:
This API endpoint allows you to add a new purchase order to the system.

Request:


Method: POST
URL: http://localhost:8080/api/purchases
Headers:
Content-Type: application/json
Body:
Raw (JSON)
json
 code
{

  "productName": "ProductA",
  "quantity": 5,
  "pricing": 50.00,
  "mrp": 60.00,
  "customerId": "123"
  
}
Response:


Status Code: 201 (Created)
Body:
json
code

{
  "purchaseOrderId": "456",
  "productName": "ProductA",
  "quantity": 5,
  "pricing": 50.00,
  "mrp": 60.00,
  "customerId": "123"
}
2. Fetch Purchases
Endpoint:

HTTP Method: GET
URL: http://localhost:8080/api/purchases
Description:
This API endpoint allows you to fetch all purchase orders.

Request:

Method: GET
URL: http://localhost:8080/api/purchases
Response:

Status Code: 200 (OK)
Body:
json
Copy code
[
  {
  
    "purchaseOrderId": "456",
    "productName": "ProductA",
    "quantity": 5,
    "pricing": 50.00,
    "mrp": 60.00,
    "customerId": "123"
    
  },

]
