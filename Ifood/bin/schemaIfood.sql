/* ifoodLógico_1: */

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR (100) UNIQUE NOT NULL,
    email VARCHAR (100) UNIQUE NOT NULL
);

select * from usuario


CREATE TABLE localizacao (
	id SERIAL PRIMARY KEY,    
	endereco VARCHAR (100) NOT NULL,
	cidade VARCHAR (100) NOT NULL,
	cep VARCHAR (8) NOT NULL,
        complemento VARCHAR(30)
 );

select * from localizacao

CREATE TABLE estabelecimento (
	id SERIAL PRIMARY KEY UNIQUE NOT NULL,    
	nome VARCHAR (100) NOT NULL,
	descricao VARCHAR(100)

);

select * from estabelecimento

CREATE TABLE Cardapio (
    tipos VARCHAR (50) PRIMARY KEY
    
);

select * from cardapio

CREATE TABLE produto (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    nome VARCHAR (100),
    preco DECIMAL(5,2),
    CONSTRAINT idFK  FOREIGN KEY (id) 
		REFERENCES usuario (id)
		ON DELETE CASCADE
);

select * from produto

CREATE TABLE compra (
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    total DECIMAL(5,2),
   CONSTRAINT idFK FOREIGN KEY (id) 
		REFERENCES usuario(id)
		ON DELETE CASCADE
);

select * from compra

