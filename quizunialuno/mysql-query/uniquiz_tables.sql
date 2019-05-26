use db_quizunialuno;
# Tabela de questoes
create table TB_QUESTION (
	ID bigint primary key not null auto_increment,
    DESCRIPTION varchar(3000) not null,
    ACTIVE boolean
);

# Tabela de alternativas
create table TB_ALTERNATIVE (
	ID bigint primary key not null auto_increment,
    DESCRIPTION varchar(3000) not null,
    CORRECT boolean,
    IDQUESTION bigint,
    constraint fk_question foreign key (IDQUESTION) references TB_QUESTION (ID)
);

create table TB_RANK (
	ID bigint primary key not null auto_increment,
    NAMEUSER varchar(100) not null,
    EMAIL varchar(100),
    SCORE int(11)
);