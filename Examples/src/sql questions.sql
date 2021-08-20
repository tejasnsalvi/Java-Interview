/*Find 2nd highest salary*/
select name,max(salary) from employee where salary < (Select max(salary) from employee);

/*Find 2nd highest salary*/
select * from (select salary from employee order by salary desc) t limit 1,1;

/*Join three tables*/
select e.id,e.name,d.id,d.dept_name,c.id,c.c_name 
from employee e
left join dept d
on e.id=d.id
left join company c
on d.id=c.id; 