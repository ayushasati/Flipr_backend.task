# Shipment API Documentation
1. Add Shipment
Endpoint:

HTTP Method: POST
URL: http://localhost:8080/api/shipments
Description:
This API endpoint allows you to add shipping details to the system.

Request:

Method: POST
URL: http://localhost:8080/api/shipments
Headers:
Content-Type: application/json
Body:
Raw (JSON)
json
code
{
  "address": "123 Main St",
  "city": "Indore",
  "pincode": "452001",
  "purchaseOrderId": "456",
  "customerId": "123"
}
Response:

Status Code: 201 (Created)
Body:
json
 code
{
  "shipmentId": "789",
  "address": "123 Main St",
  "city": "Indore",
  "pincode": "452001",
  "purchaseOrderId": "456",
  "customerId": "123"
}
2. Fetch Shipments
Endpoint:

HTTP Method: GET
URL: http://localhost:8080/api/shipments
Description:
This API endpoint allows you to fetch all shipment details.

Request:

Method: GET
URL: http://localhost:8080/api/shipments
Response:

Status Code: 200 (OK)
Body:
json
 code
[
  {
    "shipmentId": "789",
    "address": "123 Main St",
    "city": "Indore",
    "pincode": "452001",
    "purchaseOrderId": "456",
    "customerId": "123"
  },

]
