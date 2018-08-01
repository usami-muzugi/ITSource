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