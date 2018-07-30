USE homework;
# 练习题：
SELECT *
FROM emp;
# 01.查询每个雇员的编号、姓名、职位。
SELECT emp.empno AS "编号", emp.ename AS "姓名", emp.job AS "职位"
FROM emp;
# 02.查询每个雇员的职位，使用 DISTINCT 消除掉显示的重复行记录。
SELECT DISTINCT emp.job AS "职位"
FROM emp;
# 03.计算每个雇员的编号、姓名、基本年薪。年薪=(工资+奖金)*12，(使用 IFNULL 函数判断 NULL）
SELECT emp.empno AS "编号", emp.ename AS "姓名", emp.sal * 12 AS "年薪"
FROM emp;
# 04.每个雇员每个月公司会补贴饭食 200 元，交通补助 300 元，计算年薪。
SELECT emp.empno AS "编号", emp.ename AS "姓名", (emp.sal + 200 + 300) * 12 AS "年薪(含福利)"
FROM emp;
# 05.查询基本工资高于 2000 的全部雇员信息。
SELECT *
FROM emp
WHERE sal > 2000;
# 06.查询出 smith 的信息。
SELECT *
FROM emp
WHERE emp.ename = "smith";
# 07.查询出所有不是 CLERK 的详细信息。
SELECT *
FROM emp
WHERE emp.ename <> "CLERK";
SELECT *
FROM emp
WHERE emp.ename != "CLERK";
# 08.查询出所有销售人员(SALESMAN)的基本信息，并且要求销售人员的工资高于 1300。
SELECT *
FROM emp
WHERE emp.job = "SALESMAN";
# 09.查询出工资范围在 1500~3000 之间的全部雇员信息（包含 1500 和 3000）。
SELECT *
FROM emp
WHERE emp.sal >= 1500
  AND emp.sal <= 3000;
# 10.查询出所有经理或者是销售人员的信息，并且要求这些人的基本工资高于 1500。
SELECT *
FROM emp
WHERE emp.job IN ("MANAGER", "SALESMAN")
  AND emp.sal > 1500;
# 11.要求查询出所有在 1981 年雇佣的雇员信息。
SELECT *
FROM emp
WHERE emp.hiredate LIKE "1981%";
# 12.查询所有领取奖金的雇员信息（comm 不为空）。
SELECT *
FROM emp
WHERE emp.comm is NOT Null;
# 13.查询所有领取奖金高于 100 的雇员信息。
SELECT *
FROM emp
WHERE emp.comm > 100;
# 14.查询出雇员编号是 7369、7566、9999 的雇员信息。
SELECT *
FROM emp
WHERE emp.empno IN (7369, 7566, 9999);
# 15.查询出所有雇员姓名是以 A 开头的全部雇员信息。
SELECT *
FROM emp
WHERE emp.ename LIKE "A%";
# 16.查询出雇员姓名第二个字母是 M 的全部雇员信息。
SELECT *
FROM emp
WHERE emp.ename LIKE "_A%";
# 17.查询出雇员姓名任意位置上包含字母 A 的全部雇员信息。
SELECT *
FROM emp
WHERE emp.ename LIKE "%A%";
# 18.查询出所有雇员的信息，要求按照工资排序。
SELECT *
FROM emp
order by emp.sal ASC;

SELECT *
FROM emp
order by emp.sal DESC;
# 19.要求查询所有雇员的信息，按照雇佣日期由先后排序。
SELECT *
FROM emp
order by emp.hiredate ASC;
# 20.查询全部雇员信息，按照工资由高到低排序，如果工资相同，则按照雇佣日期由先后排序。
SELECT *
FROM emp
order by emp.sal DESC, emp.hiredate ASC;
# 21.查询部门 30 中的所有员工。
SELECT *
FROM emp
WHERE emp.DEPTNO = 30;
# 22.查询出所有办事员（CLERK）的姓名，编号和部门编号。
SELECT emp.ename, emp.deptno, emp.DEPTNO
FROM emp
WHERE emp.job = "CLERK";
# 23.查询出奖金高于薪金的员工。
SELECT *
FROM emp
WHERE emp.sal < emp.comm;
# 24.查询出奖金高于薪金的 60%的员工。
SELECT *
FROM emp
WHERE emp.sal * 0.6 < emp.comm;
# 25.查询出部门 10 中所有经理（MANAGER）和部门 20 中所有办事员（CLERK）的详细资料。
SELECT emp.ename, emp.deptno, emp.DEPTNO
FROM emp
WHERE (emp.DEPTNO=10 AND emp.job="" )OR( emp.DEPTNO=20,emp.job = "CLERK");
# 26.查询出部门 10 中所有经理，部门 20 中所有办事员，既不是经理又不是办事员但其薪金大于或等于 2000
# 的所有员工的信息。
# 27.查询出收取奖金的员工的不同工作。
# 28.查询出不收取奖金或收取的奖金低于 100 的员工。
# 29.查询出不带有“R”的员工的姓名。
# 30.查询出每个雇员的姓名、职位、领导姓名。
# 31.查询出所有员工的编号、姓名及其直接上级的编号、姓名，显示的结果按领导年工资的降序排列。
# 32.查询出在销售部（SALES）工作的员工姓名、基本工资、雇佣日期、部门名称。（不知道销售部编号）。
# 33.查询出所有员工的姓名、部门名称和工资。
# 34.查询出所有员工的年工资，所在部门名称，按年薪从低到高排序。
# 35.查询出某个员工的上级主管及所在部门名称，并要求出这些主管中的薪水超过 3000。
# 36.查询出公司的最高和最低工资。
# 37.查询出每个部门的人数、平均工资，只显示部门编号。
# 38.查询出每种职位的最高和最低工资。
# 39.查询平均工资高于 2000 的职位信息，以及从事此职位的雇员人数、平均工资。
# 40.查询员工编号大于其领导编号的每个员工的姓名、职位、领导名称。
# 41 查询出至少有一个员工的所有部门编号、名称，并统计出这些部门的平均工资、最低工资、最高工资。
# 42.查询出部门名称和这些部门的员工信息（数量、平均工资），同时列出那些没有员工的部门。
# 43.查询工资比smith 更高的全部员工信息。
# 44.查询工资和职位和smith 相同的所有员工信息。
# 45.查询各部门的部门编号，部门名词，部门地址，员工人数和平均工资。
#