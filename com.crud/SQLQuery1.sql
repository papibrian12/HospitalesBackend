create database hospital ;
go

use hospital;

create table hospitales(
	id int not null identity(1,1) primary key,
	nombre varchar(50) not null,
	direccion varchar(200) not null,
	insumo varchar(50) not null
);

