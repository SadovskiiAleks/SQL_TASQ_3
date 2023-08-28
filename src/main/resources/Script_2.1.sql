
create table CUSTUMERS (
 id SERIAL PRIMARY KEY ,
 name varchar(50) not Null,
 surname varchar(100) not Null,
 age int check (age > 0 and age < 150),
 phone_number varchar(11) not Null
);




insert into CUSTUMERS 
values
(1,'Oleg','Olegov',25,89942201345),
(2,'ALeXey','olegov',30,89962201545),
(3,'Nastya','olegov',10,89222002590),
(4,'Vania','olegov',45,89972202225),
(5,'Kolia','olegov',33,89962202333)
;

drop table custumers ;




