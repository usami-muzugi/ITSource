/*查询之前创建表*/
create table order2014 (
  id     int,
  `name` varchar(50)
);
insert into order2014 (id, name)
values (1, '订单一');
insert into order2014 (id, name)
values (2, '订单二');
insert into order2014 (id, name)
values (3, '订单三');
insert into order2014 (id, name)
values (4, '订单四');
insert into order2014 (id, name)
values (5, '订单五');

create table order2015 (
  id     int,
  `name` varchar(50)
);
insert into order2015 (id, name)
values (6, '订单六');
insert into order2015 (id, name)
values (7, '订单七');
insert into order2015 (id, name)
values (8, '订单八');
insert into order2015 (id, name)
values (9, '订单九');
insert into order2015 (id, name)
values (4, '订单四');
/*联合查询，会清除内容相同的行(相同行的每个字段的值都是相同的)*/
SELECT *
FROM order2014
union
SELECT *
FROM order2015;

/*联合查询，会显示所有的行（相同的行也会显示）*/
SELECT *
FROM order2014
UNION ALL
SELECT *
FROM order2015;
/*
当联合查询的时候，查询的字段数不相同时，会报错，并提示以下信息
The used SELECT statements have a different number of columns
*/
SELECT order2014.id, order2014.name
FROM order2014
UNION
SELECT order2015.name
FROM order2015;

/*正确写法*/
SELECT order2014.id, order2014.name
FROM order2014
UNION
SELECT order2015.id, order2015.name
FROM order2015;

/*
联合查询不对字段的类型做要求，仅对每个查询的字段的个数严格限制
*/
SELECT order2014.name, order2014.id
FROM order2014
UNION
SELECT order2015.id, order2015.name
FROM order2015;

/*
联合查询并未只能查询两个，可以查询多个
*/
SELECT product.productName, product.salePrice
FROM product
UNION
SELECT product.productName, product.costPrice
FROM product
union
SELECT product.productName, product.salePrice
FROM product
UNION
SELECT product.productName, product.costPrice
FROM product
UNION
SELECT product.productName, product.salePrice
FROM product
UNION
SELECT product.productName, product.costPrice
FROM product;