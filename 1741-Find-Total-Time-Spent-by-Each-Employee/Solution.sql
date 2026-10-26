# Write your MySQL query statement below
select e.event_day as day,e.emp_id,sum(e.time) as total_time from (select *,out_time-in_time as time from Employees) e group by e.emp_id,e.event_day;