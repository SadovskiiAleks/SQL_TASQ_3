create table CUSTUMERS (
    id SERIAL PRIMARY KEY ,
    name varchar(50) not Null,
    surname varchar(100) not Null,
    age int check (age > 0 and age < 150),
    phone_number varchar(11) not Null
);

create table ORDERS (
    id serial primary key,
    date timestamp with time zone,
    costumer_id int references Custumers (id) on delete set DEFAULT,
    product_name varchar(100),
    amount int check (amount>0)
);



