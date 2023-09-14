create table hw_netology.ORDERS (
    id serial primary key,
    date timestamp with time zone,
    costumer_id int references Custumers (id) on delete set DEFAULT,
    product_name varchar(100),
    amount int check (amount>0)
);
--rollback drop table hw_netology.ORDERS;


