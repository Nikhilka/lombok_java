# Lombok java Library

POC for lombok library
#### STEPS 
* Clone the project
* Build project
* Run application
* Hit end point 
   -> http://localhost:8080/employee/save
 
### SAMPLE PAYLOAD 
-------------------------------

```
{
    "employeeId": "001",
    "firstname": "Nikhil",
    "lastname": "K A",
    "company": "xyz",
    "emailId": "employee001@xtz.com",
    "mobile": "xxxxxx",
    "address": "xxxxxx",
    "gender": "M",
    "age": 28
}

```


### NOTE: 
** For lombok mdoel examples please check com.lombok.LombokPoC.domain packages and check how  those files handling getters ,setters,toString,hsahcode and equals methods **


### LOMBOK PLUGIN ISSUE IN STS REFERENCE 
---------------------------------------
->  https://stackoverflow.com/questions/11803948/lombok-is-not-generating-getter-and-setter/11807022
