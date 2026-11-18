create table actor(
ano int auto_increment,
aname varchar(20) not null,
gender varchar(10),
primary key(ano)) ENGINE=InnoDB;


create table movie(
mno int auto_increment,
mname varchar(20) not null,
ryear int,
primary key(mno)) ENGINE=InnoDB;


create table bollywood(
fkano int,
fkmno int,
primary key(fkano,fkmno),
foreign key(fkano) references actor(ano),
foreign key(fkmno) references movie(mno))ENGINE=InnoDB;


insert into actor(aname,gender)
values
('SRK',61),
('DP',42),
('PC',40),
('AK',58);

insert into movie(mname,ryear)
values
('CE',2010),
('Don',2007),
('Mary Kom',2018);

insert into bollywood(fkano,fkmno)
values
(1,1),
(1,2),
(2,1),
(3,3);