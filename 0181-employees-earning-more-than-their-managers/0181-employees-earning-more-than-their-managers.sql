select E.name AS Employee
from Employee E 
join Employee M
ON E.managerId = M.id
where E.salary > M.salary;
