create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id_produto bigint auto_increment,
nome_produto varchar(255) not null,
categoria varchar(255),
quantidade int not null,
preco decimal(8,2) not null,
primary key(id_produto)
);

insert into tb_produtos (nome_produto, categoria, quantidade, preco)
values
    ('Camiseta', 'Vestuário', 55, 49.99),
    ('Tênis de skate', 'Calçados', 34, 299.99),
    ('Fones AirPods', 'Eletrônicos', 100, 650.00),
    ('Bolsa de couro', 'Acessórios', 15, 400.50),
    ('Mouse', 'Eletrônicos', 40, 159.99),
    ('Livro "Sherlock Holmes"', 'Livros', 60, 79.99),
    ('Mesa de escritório', 'Móveis',30, 800.00),
    ('Laptop Dell', 'Eletrônicos', 15, 2500.00);
    
select * from tb_produtos where preco > 500.00;

select * from tb_produtos where preco < 500.00;

update tb_produtos set preco = 150.00 where id_produto = 6;