/*Find 2nd highest salary*/
select name,max(salary) from employee where salary < (Select max(salary) from employee);

/*Find 2nd highest salary*/
select * from (select salary from employee order by salary desc) t limit 1,1;

/*Find 3rd highest salary*/
 limit 2,1; // LIMIT OFFSET,NO_OF_ROWS  offset 2 thats is leave two rows 
 
 /*
 ORACLE
 
 SELECT fieldA,fieldB 
FROM table 
ORDER BY fieldA 
OFFSET 5 ROWS FETCH NEXT 14 ROWS ONLY;
 
 */

/*Join three tables*/
select e.id,e.name,d.id,d.dept_name,c.id,c.c_name 
from employee e
left join dept d
on e.id=d.id
left join company c
on d.id=c.id; 
