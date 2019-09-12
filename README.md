# simple-crud-springboot-project
##  Download the API document  using below link
https://github.com/KDVC/api-documents/tree/master/simple-crud-springboot-project

##  Introduction 
This is a sample spring boot project those who are seeking to learn about how to create a simple spring boot crud application. 
This project has implemented all the crud operations in a simple way. You can learn how to do crud operations in spring boot. 

##  Technologies Used 
*  Spring Boot 
*  MySQL 
*  Hibernate

##  IDE used
*  IntelliJ IDEA

##  API Signatures
Here I have run this application in localhost and 8883 port. You can change the port as you wish. 

### localhost:8883/employee/save
This API will save an employee in employee database. (a record will insert to employee table). 

### localhost:8883/employee/getall
This API will give details of all the employees as a List. 

### localhost:8883/employee/getone/{employeeI
This API will give details of the employee, that we send the employee id in the url. 

### localhost:8883/employee/delete/{employeeId
This API will give delete the employee, that we send the employee id in the url.(delete the record of that employee from employee table) 

### localhost:8883/employee/update
This API will update the details of an employee. (update the employee table) 

##  Let’s test the API 

###  Import project to IDE 
First you must clone the project from the GitHub repository and then open the project using IntelliJ as below. 
*  File -> Open -> select your project 
###  Create the Database 
Create a database as _**employee**_ in your MySQL workbench. You can create your own database. it doesn’t have to be the name as _**employee**_ in my case I used the database as _**employee**_. You can create your oen database.  If you are creating your own database, then you must change the database name in property file to the name of your changed database. You can find it in below image, the database name is highlighted.

![](https://github.com/KDVC/images/blob/master/Capture4.PNG)






