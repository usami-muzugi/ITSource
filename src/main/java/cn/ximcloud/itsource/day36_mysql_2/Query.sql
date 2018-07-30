# 结果是错误的，或导致笛卡儿积，sum = emp.length * dept.length
SELECT *
FROM emp,
     dept;
/*
	上面的结果是错误的，下面的结果才是正确的
	上面的结果会导致迪卡尔积，在日常查询的时候，因该避免全迪卡尔积
*/
SELECT *
FROM emp,
     dept
WHERE emp.dept_id = dept.id;
/*避免笛卡儿积，仅当emp.dept_id = dept.id ,也就是员工的部门id和dept的id相符才返回改行结果*/

/*避免全笛卡尔积*/
-- 查询员工id，姓名，和所属部门 从 emp，dept 里面联合查询，仅当 部门id等于员工id的时候，并且使用员工id的倒叙排序
SELECT emp.id AS 员工ID, emp.`name` AS 员工姓名, dept.`name` AS 部门姓名
FROM emp,
     dept
WHERE emp.dept_id = dept.id
ORDER BY emp.id DESC;

-- 查询货品id，货品名称，货品所属分类名称
SELECT product.id AS ''货品ID'', product.productName AS "货品名称", productdir.dirName AS "货品所属分类名称"
FROM product
       JOIN productdir ON product.dir_id = productdir.id;

SELECT pt.id, pt.productName, pr.dirName
FROM product AS pt
       JOIN productdir AS pr ON pt.dir_id = pr.id;

-- 查询零售价大于200的无线鼠标
SELECT *
FROM product AS pt
       JOIN productdir AS pr ON pt.dir_id = pr.id
WHERE pt.salePrice > 200
  AND pr.dirName = "无线鼠标";

-- 查询零售价大于200的无线鼠标(使用表的别名)
SELECT *
FROM product AS pt
       JOIN productdir AS pr ON pt.dir_id = pr.id
WHERE pt.salePrice > 200
  AND pr.dirName = "无线鼠标";

-- 查询每个货品对应的分类以及对应的库存
SELECT pt.productName, ps.store_num
FROM product AS pt
       JOIN productdir AS pr ON pt.dir_id = pr.id
       JOIN product_stock AS ps ON pt.dir_id = ps.product_id;

-- 如果库存货品都销售完成,按照利润从高到低查询货品名称,零售价,货品分类（三张表）.
SELECT pt.productName, (pt.salePrice - pt.costPrice) * ps.store_num AS 利润
FROM product AS pt
       JOIN productdir AS pr ON pt.dir_id = pr.id
       JOIN product_stock AS ps ON pt.dir_id = ps.product_id
ORDER BY 利润 DESC;

-- 查询零售价比罗技MX1100更高的所有商品信息。
SELECT *
FROM product
WHERE product.salePrice >
      (SELECT salePrice FROM product WHERE productName = "罗技MX1100");

-- 查询分类编号和折扣与罗技M100相同的所有商品信息
SELECT *
FROM product
WHERE product.cutoff =
      (SELECT cutoff FROM product WHERE productName = "罗技MX1100");


/*左连接右连接*/
# 左连接:
SELECT *
FROM product p
       LEFT JOIN productdir pd ON p.dir_id = pd.id;
#     右连接:
SELECT *
FROM product p
       RIGHT JOIN productdir pd ON p.dir_id = pd.id;


/*左连接*/
# 数据的条数仅有左边的表的行数
SELECT pr.id, pr.dirName, pr2.dirName
FROM productdir AS pr
       LEFT join productdir as pr2 on pr.parent_id = pr2.id;


SELECT product.dir_id
FROM product
where productName = "罗技M100";
SELECT product.cutoff
FROM product
where productName = "罗技M100";

SELECT *
FROM product
WHERE product.dir_id = (SELECT product.dir_id FROM product where productName = "罗技M100")
  AND product.cutoff = (SELECT product.cutoff FROM product where productName = "罗技M100");

SELECT *
FROM product
WHERE (product.dir_id, product.cutoff) =
      (SELECT product.dir_id, product.cutoff FROM product where productName = "罗技M100");


/*插入数据*/
INSERT INTO emp (emp.age, emp.dept_id, emp.name)
values (18, 1, "卢思颖");

/*多行插入*/
INSERT INTO emp (emp.age, emp.dept_id, emp.name)
values (20, 1, "彭睿"),
       (20, 2, "邹智愚"),
       (22, 1, "文国印"),
       (30, 3, "耀文");
/*插入查询结果*/
INSERT INTO emp (emp.age, emp.dept_id, emp.name)
SELECT emp.age, emp.dept_id, emp.name
FROM emp
WHERE emp.dept_id = 1;

/*更新数据*/
UPDATE emp
set emp.dept_id = 1
WHERE emp.dept_id <> 1;

/*需求:将零售价大于300的货品零售价上调0.2倍(单表查询)*/
SELECT *
from product
WHERE product.salePrice > 300;
/*更新操作*/
UPDATE product
SET product.salePrice = product.salePrice * 1.2
WHERE product.salePrice > 300;

/*需求:将零售价大于300的有线鼠标的货品零售价上调0.1倍(错误写法)*/
SELECT *
from product,
     productdir
WHERE product.salePrice > 300
  AND productdir.dirName = "有线鼠标";

UPDATE product, productdir
SET product.salePrice = product.salePrice * 1.2
WHERE product.salePrice > 300
  AND productdir.dirName = "有线鼠标";
# 正确写法
SELECT *
FROM product,
     productdir
WHERE product.dir_id = productdir.id
  AND productdir.dirName = "有线鼠标"
  AND product.salePrice > 300;

UPDATE product
SET product.salePrice = product.salePrice * 1.1
WHERE product.dir_id = productdir.id
  AND productdir.dirName = "有线鼠标"
  AND product.salePrice > 300;

# 删除数据

DROP table emp;

# 删库
DROP database it;

