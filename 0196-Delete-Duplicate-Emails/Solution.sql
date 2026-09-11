# Write your MySQL query statement below
delete p2 from Person p1 join Person p2 on p1.email=p2.email where p2.id>p1.id;