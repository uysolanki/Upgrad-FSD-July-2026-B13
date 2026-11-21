create table category(
cat_id int auto_increment,
cat_name varchar(20),

primary key(cat_id));



create table product(
pro_id int auto_increment,
pro_name varchar(20),
pro_desc varchar(200),
cat_id int,

primary key(pro_id),
foreign key(cat_id) references category(cat_id));


create table supplier(
supp_id int auto_increment,
supp_name varchar(20),
supp_city varchar(20),
supp_phone bigint,

primary key(supp_id));


create table supplier_pricing(
pricing_id int auto_increment,
supp_id varchar(20),
pro_id varchar(20),
supp_price int,

primary key(pricing_id),
foreign key(supp_id) references supplier(supp_id),
foreign key(pro_id) references product(pro_id));

create table customer(
cus_id int auto_increment,
cus_name varchar(20) not null,
cus_phone bigint not null,
cus_city varchar(20) not null,
cus_gender varchar(10) check(gender in('m','f')),
primary key(cus_id));


create table orders(
ord_id int auto_increment,
ord_date date not null,
cus_id int,
pricing_id int,

primary key(ord_id),
foreign key(cus_id) references customer(cus_id),
foreign key(pricing_id) references supplier_pricing(pricing_id));



create table rating(
rat_id int auto_increment,
stars int check(stars >=1 and stars<=5),
ord_id int,

primary key(rat_id),
foreign key(ord_id) references orders(ord_id));
