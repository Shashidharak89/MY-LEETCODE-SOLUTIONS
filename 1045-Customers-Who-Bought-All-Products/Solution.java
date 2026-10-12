# Write your MySQL query statement below
select customer_id from (select distinct customer_id,product_key from Customer) c group by customer_id having count(*) >= (select count(*) from Product);