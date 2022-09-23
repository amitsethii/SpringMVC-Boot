# SpringMVC-Boot

New implimentations

{

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


}
