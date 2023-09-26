create database db_regestudantes;

use db_regestudantes;

create table tb_estudantes(
id_estudante bigint auto_increment primary key,
nome varchar(255) not null,
dataNascimento varchar(255) not null,
sala varchar(255),
notaGeral decimal(9,2)
);

insert into tb_estudantes(nome,dataNascimento,sala,notaGeral) 
values
('Gabriel de Assis', '2001-09-23', 'Sala A', 6.75),
('Maria Souza', '1998-09-20', 'Sala B', 9.50),
('Carlos Pereira', '2000-03-10', 'Sala A', 7.80),
('Ana Oliveira', '1999-11-28', 'Sala C', 9.20),
('Rafael Santos', '2001-07-03', 'Sala B', 6.90),
('Mariana Costa', '1997-12-12', 'Sala A', 8.40),
('Pedro Alves', '2002-02-18', 'Sala C', 7.60),
('Camila Rodrigues', '1996-08-25', 'Sala B', 9.75);

select * from tb_estudantes where notaGeral > 7.00;

select * from tb_estudantes where notaGeral < 7.00;

update tb_estudantes set dataNascimento = '2003-08-25' where id_estudante =8;

