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
<img width="372" alt="h2console" src="https://user-images.githubusercontent.com/63615375/113372143-f4877580-9335-11eb-9ea0-b5308a4da0d1.PNG">

<img width="684" alt="h2" src="https://user-images.githubusercontent.com/63615375/113372155-f94c2980-9335-11eb-81cb-fbf73f8bb209.PNG">



2. Database path configured in applications.properties file


#### Installation using Maven

1. Download the source code
2. run "mvn clean"
3. Build Project
4. Run main file

#### Installation using jar

1. Run the jar file using "java -jar springboot-crud-restful-webservices-0.0.1-SNAPSHOT.jar"
2. Server will start at http://localhost:8080/server/
