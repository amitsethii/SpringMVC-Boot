JPA HIBERNATE MYSQL

**********************************************************************************************************************************
https://www.youtube.com/watch?v=xRH_YtzErhU&t=556s   mysql (jpa mysql web)

mysqlDtabase   https://www.youtube.com/watch?v=V2p5rVIBT5M&t=1902s

////////////////////inside mysql work bench:  ///////////
create database empdb;
use empdb;
show tables;
drop table students;
select * from students;
////////////////////////

//////// inside app.properties ////////////
                                       *port num* *dtabase*
spring.datasource.url=jdbc:mysql://localhost:3306/empdb?useSSL=false

spring.datasource.username=root  
 
spring.datasource.password=Abc@2022

spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
*************************************************************************************************************************************
![image](https://user-images.githubusercontent.com/49728020/192089172-71093433-9c8e-4dd9-b8bd-a6b1cff057fe.png)


![image](https://user-images.githubusercontent.com/49728020/192089190-9738b7d1-96e7-41cc-b2fa-fa1167c7e675.png)
