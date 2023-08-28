select product_name from orders
join custumers ON custumers.id = orders.costumer_id
where lower(custumers.name) = lower(name = :name);