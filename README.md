# Employee-REST-Server

## REST server to store Employee Details, perform GET, POST, PUT and DELETE API calls

### Follwing operations can be performed using this REST Server

1. GET all Active Employees using: /server/employees
2. GET an Active Employee providing its id using: /server/employees/{1}
3. Update an existing employee details using POST method: /server/employees/{1} / Pass employee details in Request Body
4. Create a new employee using POST method: /server/employees - // Pass employee details in Request Body
5. Delete an existing employee using DELETE method: /server/employees/{1}
6. GET all active and inactive Employees using: /server/employees-all

#### Dependencies and FrameWork
1. Maven
2. SpringBoot

#### Database

1. H2 - Data is stored in memory, on startup Repository is populated with 2 active and one inactive employee details
##### Configuration:

1. H2 database can be accessed through "http://localhost:8080/h2-console/"
![h2console](h2console.png)
