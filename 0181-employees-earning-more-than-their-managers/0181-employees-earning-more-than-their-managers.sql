select e.name AS Employee from Employee e JOIN Employee m
ON m.id = e.managerId where e.salary>m.salary;