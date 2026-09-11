# Write your MySQL query statement below
select
case
    when id%2=0 and id != (select count(*) from Seat) then id-1
    when id%2=1 and id != (select count(*) from Seat) then id+1
    when id = (select count(*) from Seat) and id%2=1 then id
    else id-1
end as id, student
from  Seat order by id;