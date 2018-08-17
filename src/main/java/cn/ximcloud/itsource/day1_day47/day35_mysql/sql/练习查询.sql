use itsource;
-- 查询所有
SELECT * FROM product;
-- 查询指定
SELECT productName FROM product;
-- 查询指定
SELECT productName,salePrice FROM product;
-- 消除结果中重复的数据。只对某一列有效
SELECT DISTINCT dir_id AS DIRID FROM product;
-- 查询所有货品的id，名称和批发价(批发价=卖价*折扣)
SELECT id,productName,costPrice*cutoff as 批发价 FROM product;
-- 查询所有货品的id，名称，和各进50个的成本价(成本=costPrice)
SELECT id,productName,costPrice*50 as 成本 FROM product;
-- 查询所有货品的id，名称，各进50个，并且每个运费1元的成本
SELECT id,productName,(costPrice+1)*50 as 算上运费的成本 FROM product;
-- 需求:查询商品的名字和零售价。 格式：xxx商品的零售价为：xxx
SELECT CONCAT(productName,"商品的零售价为：",salePrice) as 一句话 FROM product;
-- 需求:查询货品零售价为119的所有货品信息.
SELECT * FROM product WHERE salePrice=119;
-- 查询货品名为罗技G9X的所有货品信息.
SELECT * FROM product WHERE productName='罗技G9X';
-- 查询货品名 不为 罗技G9X的所有货品信息.
SELECT * FROM product WHERE productName!='罗技G9X';
-- 查询分类编号不等于2的货品信息
SELECT * FROM product WHERE dir_id!=2;
-- 查询货品名称,零售价小于等于200的货品
SELECT * FROM product WHERE salePrice<200;
--  查询id，货品名称，批发价大于350的货品
SELECT * FROM product WHERE salePrice*cutoff>350;
-- 选择id，货品名称，批发价在300-400之间的货品
SELECT id,productName FROM product WHERE salePrice*cutoff>=350&&salePrice*cutoff<=400;
-- 选择id，货品名称，分类编号为2,4的所有货品
SELECT id,productName FROM product WHERE dir_id=2&&dir_id=4;
-- 选择id，货品名词，分类编号不为2的所有商品
SELECT id,productName FROM product WHERE dir_id!=2;
-- 选择id，货品名称，分类编号的货品零售价大于等于250或者是成本大于等于200
SELECT id,productName FROM product WHERE salePrice>=250&&costPrice>=200;
-- 选择id，货品名称，批发价在300-400之间的货品
SELECT id,productName FROM product WHERE salePrice*cutoff BETWEEN 300 AND 400;
-- 选择id，货品名称，批发价不在300-400之间的货品
SELECT id,productName FROM product WHERE salePrice*cutoff NOT BETWEEN 300 AND 400;
-- 选择id，货品名称，分类编号为2,4的所有货品
SELECT id,productName FROM product WHERE dir_id IN (2,4);
-- 选择id，货品名称，分类编号不为2,4的所有货品
SELECT id,productName FROM product WHERE dir_id NOT IN (2,4);
-- 需求:  查询商品名为NULL的所有商品信息。
SELECT * FROM product WHERE productName = NULL;
-- 查询id，货品名称，货品名称匹配'%罗技M9_'
SELECT id,productName FROM product WHERE productName LIKE '%罗技M9_';
-- 查询id，货品名称，分类编号,零售价大于等于20并且货品名称匹配'%罗技M1__'
SELECT id,productName,dir_id,salePrice FROM product WHERE salePrice>=20 AND productName LIKE '%罗技M1__';
-- 选择id，货品名称，分类编号,零售价并且按零售价降序排序
SELECT id,productName,dir_id,salePrice FROM product ORDER BY salePrice DESC;
-- 选择id，货品名称，分类编号,零售价先按分类编号排序,再按零售价排序
SELECT id,productName,dir_id,salePrice FROM product ORDER BY dir_id ASC,salePrice ASC;
-- 查询M系列并按照批发价排序(加上别名)
SELECT *,salePrice*cutoff AS '批发价' FROM product WHERE productName LIKE '%罗技M___' ORDER BY salePrice*cutoff DESC;
-- 查询分类为2并按照批发价排序(加上别名)
SELECT *,salePrice*cutoff AS '批发价' FROM product WHERE dir_id=2 ORDER BY salePrice*cutoff DESC;

SELECT * FROM `product` LIMIT 0, 3;
SELECT * FROM `product` LIMIT 3, 3;
SELECT * FROM `product` LIMIT 6, 3;
-- SELECT * FROM `product` LIMIT (N-1)*3, 3;


-- 查询所有商品平均零售价
SELECT AVG(salePrice) AS '所有商品平均零售价' FROM product;
-- 查询商品总记录数(注意在Java中必须使用long接收)
SELECT COUNT(id) AS '商品总记录数' FROM product;

-- 查询分类为2的商品总数
SELECT COUNT() AS '分类为2的商品总数' FROM product WHERE dir_id=2;
-- 查询商品的最小零售价，最高零售价，以及所有商品零售价总和


