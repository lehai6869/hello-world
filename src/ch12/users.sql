use jdbc;
CREATE TABLE users(
	id INT PRIMARY KEY AUTO_INCREMENT;
	name VARCHAR(40);
	password VARCHAR(40);
	email VARCHAR(100);
	birthday DATE;
);
INSERT INTO users(NAME,PASSWORD,email,birthday)
	VALUES('zhang','123456','zs@sina.com','1980-12-04'),
	('lisi','123456','ls@sina.com','1981-12-04'),
	('wangwu','123456','ww@sina.com','1979-12-04');