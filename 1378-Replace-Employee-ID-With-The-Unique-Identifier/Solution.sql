# Write your MySQL query statement below
select e.unique_id,r.name from Employees r left join EmployeeUNI e on r.id=e.id;