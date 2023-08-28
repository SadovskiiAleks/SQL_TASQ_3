--скрипт, который будет возвращать 
--из таблиц поля product_name для пользователей с именем alexey независимо от регистра ввода имени.
select product_name from orders
join custumers ON custumers.id = orders.costumer_id 
where lower(custumers.name)  = 'alexey';