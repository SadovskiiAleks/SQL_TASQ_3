CREATE SCHEMA IF NOT EXISTS public;
create table public.CUSTUMERS (
                           id SERIAL PRIMARY KEY ,
                           name varchar(50) not Null,
                           surname varchar(100) not Null,
                           age int check (age > 0 and age < 150),
                           phone_number varchar(11) not Null
);
-- rollback drop table hw_netology.CUSTUMERS;