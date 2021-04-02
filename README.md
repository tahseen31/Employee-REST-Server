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

1. H2 - Data is stored in memory, on startup Repository is populated with 3 employees
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
5. To create Jar file, run: "mvn package" and a jar file will be created in "target" folder

#### Installation using jar

1. Run the jar file using "java -jar springboot-crud-restful-webservices-0.0.1-SNAPSHOT.jar"
2. Server will start at http://localhost:8080/server/

Screenshots:
1. GET Request<img width="841" alt="get" src="https://user-images.githubusercontent.com/63615375/113372260-3d3f2e80-9336-11eb-9635-97c9c04a40bf.PNG">
2. GET by Employee id<img width="832" alt="getById" src="https://user-images.githubusercontent.com/63615375/113372302-5942d000-9336-11eb-90bd-a19e363abc82.PNG">
3. Create an employee <img width="823" alt="create" src="https://user-images.githubusercontent.com/63615375/113373016-e9354980-9337-11eb-9933-ad32168ec97c.PNG">
4. Update Employee details <img width="823" alt="update" src="https://user-images.githubusercontent.com/63615375/113373082-1255da00-9338-11eb-853a-1a7ae156c0d3.PNG">
5. Delete an Employee <img width="480" alt="delete1" src="https://user-images.githubusercontent.com/63615375/113373302-8b553180-9338-11eb-8e88-753df9994698.PNG">
6. <img width="564" alt="delete2" src="https://user-images.githubusercontent.com/63615375/113373313-9019e580-9338-11eb-9ed6-8b21e31bfada.PNG">






