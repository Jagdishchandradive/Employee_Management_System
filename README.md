...(Read in Code View)..

# Employee_Management_System
Employee Management System: Java-Spring Boot 2.7 backend, MySQL database. HTML, Thymeleaf, Bootstrap frontend.
3-layer architecture: Controller, Service, Repository. Clear data flow, modular design,
and efficient use of Spring technologies for seamless user interaction. #Java #SpringBoot #MySQL #Thymeleaf #Bootstrap

1.Technology Stack:

Frontend: HTML, Thymeleaf, Bootstrap
Backend: Java with Spring Boot 2.7
Database: MySQL
****************************************************************************************************
2.Application flow :-
     Browser<->EmployeeController<->EmployeeService<->EmployeeRepository<->MySQL
       <1>            <2>                       <3>              <4>          <5>
i> When user hit Browser(Browser-side Validations provided),the httpRequest will 1st come to the <EmployeeController> 
   This is basically Spring MVC controller,which will handle httpRequest like GET,POST.
ii> and request will move from <EmployeeService> to <EmployeeRepository>and it finally hit to the database.
iii> so,EmployeeRepo will retrive data from MySQL goes to ->EmployeeRepository->EmployeeController.
    and finally,EmployeeController will return a view,i.e.Thymleaf-Html-Template to Browser 
    for Rendering.
******************************************************************************************************   
3.Application Architecture:-
  3 Layer Architecture used-> EmployeeController(SpringMVC used),EmployeeService(Service-Layer),EmployeeRepository(DAO-Layer). 
  *EmployeeController:->SpringMVC used which handle httpRequest
  *EmployeeServiceLayer :->We keep our business Logic,Transaction related info here.
  *EmployeeRepository :->We are going to develop a JPA repositories using Spring-dataJPA to interact with Database. 
                                using Spring-dataJPA to basically reduce BoilerPlate code that is required for
                                developing code operations for Database.
