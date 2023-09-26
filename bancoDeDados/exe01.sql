create database db_rhempresa;

use db_rhempresa;

create table tb_colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
cargo varchar(255) not null,
data_contrato date,
salario decimal(8,2),
primary key (id)
);

insert into tb_colaboradores(nome,cargo,data_contrato,salario) values
("Gabriel","Desenvolvedor júnior","2020-03-24",2300.00),
("Giovanni","Desenvolvedor júnior","2020-01-15",2300.00),
("Raquel","Desenvolvedor pleno","2017-08-02",6250.00),
("Elisa","Desenvolvedor pleno","2016-09-21",6250.00),
("Raphael","Desenvolvedor júnior","2020-04-16",2550.00);

select * from tb_colaboradores where salario > 2000.00;

select * from tb_colaboradores where salario < 2000.00;

update tb_colaboradores set salario = 1670.00 where nome = "Gabriel" and id =1;

