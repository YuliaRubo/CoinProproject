
create table coin(
id int PRIMARY KEY,
symbol  varchar(100) not null,
price_usd int
);

--create table person(
--id int  AUTO_INCREMENT PRIMARY KEY,
--username varchar(255) not nul,
--coinId int,
--FOREIGN KEY (coinId) REFERENCES coin(id)
--);


--create table person(
--id int  AUTO_INCREMENT PRIMARY KEY,
--username varchar(20) not null,
--coinId int,
--FOREIGN KEY(coinId) REFERENCES coin(id)
--);
