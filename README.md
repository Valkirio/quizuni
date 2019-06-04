# Projeto Java
QuizUniAluno 2019

@autores 
Valkirio Andrade, 
Mauricio Lima, 
Raul Mosca, 
Giovani Santos

Projeto desenvolvido em Java 8, Spring MVC, Hibernate com JPA 5 e gerenciamento de dependência com Apache Maven 3.3.9.

Procedimentos para execução do sistema QuizUniAluno:
Passo 1 - Criar database chamado db_quizunialuno no banco de dados mysql.
Passo 2 - Executar script uniquiz_tables.sql na pasta mysql-query para criação das entidades.
Passo 3 - Alterar senha (default senha em branco) e porta caso necessário do mysql na classe JPAConfiguration.
Passo 4 - Installar tomcat8 ou superior (https://tomcat.apache.org/download-80.cgi)
Passo 5 - Fazer deploy dessa aplicação no tomcat
Passo 6 - Acessar endereço http://localhost:8080/quizunialuno
Passo 7 - Cadastrar perguntas e respostas no endereço http://localhost:8080/quizunialuno/question/create
Passo 8 - Para acessar a lista de perguntas cadastradas, basta acessar o MENU Administração > LIsta de Perguntas ou http://localhost:8080/quizunialuno/question/list-all




