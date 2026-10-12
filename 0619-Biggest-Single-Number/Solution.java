# Write your MySQL query statement below
select max(sub.num) as num from (select num from MyNumbers group by num having count(*) = 1)  sub;