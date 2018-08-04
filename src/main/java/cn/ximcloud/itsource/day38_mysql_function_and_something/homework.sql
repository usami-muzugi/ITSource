/*函数*/

/*基本函数*/
SELECT count(*)
FROM product;

SELECT avg(product.salePrice)
FROM product;
SELECT min(product.salePrice)
FROM product;
SELECT max(product.salePrice)
FROM product;


/*自定义函数*/

/*自定义函数可以使用可视化工具来创建*/

/*也可以使用命令的形式来创建*/
/*自定义函数的创建 （使用命令）*/
/*CREATE FUNCTION 函数名([字段名在先,类型在后[长度]])
  RETURNS 返回值类型
  BEGIN
    [函数主体]
    RETURN 返回值;
  END;


*/
CREATE function mySun(`a` INT, `b` INT)
  RETURNS INT
  BEGIN
    return a + b;
  end;

/*自定义函数的使用*/
SELECT mySun(123, 555) AS "sum";


/*存储过程*/

DELIMITER //
create procedure test(in var varchar(30))
  begin
    set var = var * 30;
    SELECT * FROM product WHERE product.salePrice > var;
  end //

DELIMITER //
create procedure test(out var varchar(30))
  begin
    set var = var * 30;
    SELECT * FROM product WHERE product.salePrice > var;
  end //

DELIMITER //
create procedure test(INOUT var varchar(30))
  begin
    set var = var * 30;
    SELECT * FROM product WHERE product.salePrice > var;
  end //

DELIMITER //
create procedure out_param(out p_out int)
  begin
    select p_out;
    set p_out = 2;
    select p_out;
  end //

set @p_out = 1;
call out_param(@p_out);
select @p_out;


SELECT 30;