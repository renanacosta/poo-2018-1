DROP DATABASE IF EXISTS poo_agenda;
CREATE DATABASE poo_agenda;

\c poo_agenda; -- conectar

DROP TABLE IF EXISTS contatos;

CREATE TABLE contatos (
  codigo    SERIAL      PRIMARY KEY,
  nome      VARCHAR(20) NOT NULL,
  sobrenome VARCHAR(20)     NULL,
  telefone  VARCHAR(20)     NULL
);

INSERT INTO contatos VALUES (
  DEFAULT, 'Marvyn', 'Cruz' ,'988827773'
);

SELECT * FROM contatos; -- Marvyn








