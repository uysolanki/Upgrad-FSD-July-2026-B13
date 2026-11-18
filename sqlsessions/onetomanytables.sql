create table dept(
dno int auto_increment,
dname varchar(20) not null,
city varchar(10),
primary key(dno));


create table emp2(
eno int auto_increment,
ename varchar(20) not null,
salary double,
dno int,

primary key(eno),
foreign key(dno) references dept(dno));

insert into dept(dname,city)
values
('IT','Pune'),
('Sales','Delhi'),
('Mark','Noida'),
('HR','Bengaluru');

insert into emp2(ename,salary,dno)
values
('Alice',800.0,1),
('Ben',900.0,1),
('Chris',600.0,2),
('David',500.0,3);
