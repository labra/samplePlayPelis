# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table peli (
  id                        bigint not null,
  titulo                    varchar(255),
  constraint pk_peli primary key (id))
;

create sequence peli_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists peli;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists peli_seq;

