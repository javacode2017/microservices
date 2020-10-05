# microservices

request:
========
{
    "order":{
    "id": 104,
    "name":"mobile phone",
    "qty":1,
    "price":8000
    },
    "payment":{
        
    }
}


response:
========

{
    "order": {
        "id": 104,
        "name": "mobile phone",
        "qty": 1,
        "price": 8000.0
    },
    "amount": 8000.0,
    "transactionId": "c95eb865-c6da-4f53-878d-62d6fb748434",
    "message": "payment failure"
}



