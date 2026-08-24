SELECT T1.name AS Employee 
FROM Employee T1 
JOIN Employee T2 ON T1.managerId = T2.id
WHERE T1.salary > T2.salary;

