/*視圖  視圖就是一個查詢語句
僞代碼
Objcet obj = SELECT * From product;
SELECT * FOMR obj WHERE balabala = "balabala";
*/


/*視圖就是將一張表的查詢結果作爲一張表來使用*/
CREATE VIEW viewProduct AS SELECT product.id,product.costPrice FROM product;
SELECT * FROM viewProduct;

INSERT INTO order2015(id,name) values (6,'訂單六');
SELECT * FROM order2015;

-- 視圖的基本操作，視圖的增刪改查
-- 查詢
SELECT * FROM viewProduct;

-- 更新
UPDATE p SET salePrice=998 WHERE id=1
DELETE FROM p WHERE id=20
INSERT INTO p VALUE(100,'雷蛇',119)

-- 反向
UPDATE product SET salePrice=9.8 WHERE id=1

DELETE FROM product WHERE id=100

INSERT INTO product(id,productName,salePrice) VALUE(100,'雷蛇',119)

-- 高级操作


SELECT id,productName,CONCAT(supplier,brand) FROM product
CREATE VIEW p2 AS (SELECT id,productName,CONCAT(supplier,brand) sb FROM product)

视图是多表
SELECT * FROM product p JOIN productdir pd ON p.dir_id=pd.id

CREATE VIEW p3 AS (SELECT p.*,pd.dirName FROM product p JOIN productdir pd ON p.dir_id=pd.id)


DROP VIEW p2

DROP TABLE product

SELECT * FROM p3


-- 实际开发中经常怎么用的


CREATE VIEW p6 AS (SELECT id,productName,salePrice FROM product)

-- 1 从耀文的账户中减少3000元
UPDATE account SET balance=balance-3000 WHERE id=2;

-- 2 包猪婆的账户中增加3000元
UPDATE account SET balance=balance+3000 WHERE id=1;



SET autocommit=0;
-- 1 从耀文的账户中减少3000元
UPDATE account SET balance=balance-3000 WHERE id=2;

-- 2 包猪婆的账户中增加3000元
UPDATE account SET balance=balance+3000 WHERE usernamer='包租婆';

COMMIT;


