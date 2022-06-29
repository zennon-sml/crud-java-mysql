CREATE TABLE if not EXISTS endereco (
  	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  	rua varchar(50),
  	numero varchar(5),
  	cidade varchar(30),
  	cep varchar(10),
  	estado varchar(40));

create table  if not EXISTS curso(
  	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	codigo int,
	nome varchar(100),
    descricao text,
    num_periodo int);

create table  if not EXISTS disciplina(
  	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	codigo int unique,
    descricao text,
    carga_horaria time,
    num_credito int);

create table  if not EXISTS aluno(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    matricula varchar(20) unique,
    nome varchar(100),
    telefone varchar(15),
    nasc date,
    sexo char,
    fk_endereco int,
    FOREIGN KEY(fk_endereco) REFERENCES endereco(id) on DELETE CASCADE,
    fk_curso int,
    FOREIGN KEY(fk_curso) REFERENCES curso(id));

create table  if not EXISTS professor(
  	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	registro int unique,
	nome varchar(100),
    telefone varchar(15),
    especialidade varchar(50),
    titulacao varchar(50),
  	fk_endereco int NOT NULL,
  	FOREIGN KEY(fk_endereco) REFERENCES endereco(id) on DELETE CASCADE);

create table  if not EXISTS professor_disciplina(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  	fk_professor int,
  	fk_disciplina int,
  	FOREIGN key(fk_professor) REFERENCES professor(id),
  	FOREIGN key(fk_disciplina) REFERENCES disciplina(id));

create table  if not EXISTS turma(
  	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	codigo int unique,
    	sala varchar(20),
    	horario time,
	fk_professor_disciplina int,
  	FOREIGN key(fk_professor_disciplina) REFERENCES professor_disciplina(id));

create table  if not EXISTS aluno_professor(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  	fk_professor int,
  	fk_aluno int,
  	FOREIGN key(fk_professor) REFERENCES professor(id),
  	FOREIGN key(fk_aluno) REFERENCES aluno(id));

create table  if not EXISTS turma_aluno(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  	fk_turma int,
  	fk_aluno int,
  	FOREIGN key(fk_turma) REFERENCES turma(id),
  	FOREIGN key(fk_aluno) REFERENCES aluno(id));

INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Rua Santa Clara','64','Juazeiro do Norte','61902-145','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Rua Manoel Monteiro','187','Potengi','63160-000','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Rua Maria de Fatima','99','Crato','63100-170','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Castelo Branco','312','Juazeiro do Norte','61902-145','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Herculino Marrocos','26','Nova-Olinda','63165-000','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Rua Padre Xavier','100','Crato','63100-170','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('Rua Santa Rita','01','Barbalha','63180-000','CEARÁ');
INSERT into endereco (rua,numero,cidade,cep,estado)
VALUES ('PIO XX','201','Juazeiro do Norte','61902-145','CEARÁ');

INSERT into curso(codigo,nome,descricao,num_periodo)
VALUES(433,'sistemas de informação','graduação',8);

insert into disciplina(codigo,descricao,carga_horaria,num_credito)
VALUES (4,'algoritumos e estruturas de dados','80:00:00',8);
insert into disciplina(codigo,descricao,carga_horaria,num_credito)
VALUES (8,'banco de dados','80:00:00',8);
insert into disciplina(codigo,descricao,carga_horaria,num_credito)
VALUES (12,'linguagem e paradgimas de programaxao','80:00:00',8);

INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
VALUES('546','Michael Alexandrino Freire','88994132076','1997-01-01','M',1,1);
INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
VALUES('112','Gabriel Lopes Ferreira Silva','88981851678','2001-09-23','M',2,1);

INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
VALUES('928','Antonia Priscilla Rodrigues de Amorim','88996581133','1998-05-11','F',3,1);
INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
VALUES('113','Carlos Adriano de Sousa','88994187615','2000-08-20','M',4,1);
INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
VALUES('989','Micael Leite da Silva de Oliveira','88981786523','1999-12-19','M',5,1);

INSERT into professor(registro,nome,telefone,especialidade,titulacao,fk_endereco)
VALUES('123','Robson','889900','AD','doutor',6);
INSERT into professor(registro,nome,telefone,especialidade,titulacao,fk_endereco)
VALUES('124','Bonny','889901','BD','doutor',7);
INSERT into professor(registro,nome,telefone,especialidade,titulacao,fk_endereco)
VALUES('125','Alexandre','889902','LLP','doutor',8);

insert into professor_disciplina(fk_professor,fk_disciplina)
values (1,1);
insert into professor_disciplina(fk_professor,fk_disciplina)
values (2,2);
insert into professor_disciplina(fk_professor,fk_disciplina)
values (3,3);

INSERT into turma(codigo,sala,horario,fk_professor_disciplina)
VALUES(4,'LAB 1','18:30:00',1);
INSERT into turma(codigo,sala,horario,fk_professor_disciplina)
VALUES(8,'LAB 2','20:30:00',2);
INSERT into turma(codigo,sala,horario,fk_professor_disciplina)
VALUES(12,'LAB 3','20:30:00',3);

insert into aluno_professor(fk_professor,fk_aluno)
values(1,1);
insert into aluno_professor(fk_professor,fk_aluno)
values(2,2);
insert into aluno_professor(fk_professor,fk_aluno)
values(3,3);

insert into turma_aluno(fk_turma,fk_aluno)
values(1,1);
insert into turma_aluno(fk_turma,fk_aluno)
values(1,2);
insert into turma_aluno(fk_turma,fk_aluno)
values(2,3);
insert into turma_aluno(fk_turma,fk_aluno)
values(2,4);
insert into turma_aluno(fk_turma,fk_aluno)
values(2,5);
insert into turma_aluno(fk_turma,fk_aluno)
values(3,5);
