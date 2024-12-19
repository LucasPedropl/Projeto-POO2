create database if not exists financemate;

use financemate;

create table if not exists conta(
		
        CON_nome varchar(50),
        CON_email varchar(30) not null,
        CON_senha varchar(30) not null unique,
        CON_pref int,
        
        constraint pk_usuario primary key (CON_email)
        
);

/*check table conta;*/
