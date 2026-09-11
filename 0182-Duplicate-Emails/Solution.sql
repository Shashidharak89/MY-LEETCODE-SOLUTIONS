# Write your MySQL query statement below
select distinct p.email from Person p where p.email in(select e.email from Person e where e.id!=p.id);