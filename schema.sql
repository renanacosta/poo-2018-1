CREATE TABLE medicos (
crm INTEGER NOT NULL, PRIMARY KEY.
nome VARCHAR (50) NOT NULL,
cpf VARCHAR (11) NOT NULL
);


CREATE TABLE pacientes (
id SERIAL NOT NULL PRIMARY KEY,
nome VARCHAR (50) NOT NULL,
cpf VARCHAR (11) NOT NULL UNIQUE,
genero SMALLINT,
tipo_sanguineo SMALLINT,
data_nascimento DATE

);


CREATE TABLE consultas (
id SERIAL NOT NULL PRIMARY KEY,
data_hora TIMESTAMP,
situacao SMALLINT,
crm INTEGER NOT NULL
	REFERENCES medicos (crm),
id_paciente INTEGER NOT NULL
	REFERENCES pacientes (id),
diagnostico TEXT NULL,
prescricao TEXT NUL
);

CREATE TABLE cancelamento (
id INTEGER NOT NULL PRIMARY KEY
	REFERENCES consultas (id)
	ON DELETE  CASCADE,



);

