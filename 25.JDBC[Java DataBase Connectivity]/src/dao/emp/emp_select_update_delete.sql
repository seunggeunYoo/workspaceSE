--select pk
select e.*,d.* from emp e join dept d on e.deptno=d.deptno where empno = 7369;
select e.*,d.* from emp e left outer join dept d on e.deptno=d.deptno where empno = 9004;

--select all
select e.*,d.* from emp e join dept d on e.deptno=d.deptno;