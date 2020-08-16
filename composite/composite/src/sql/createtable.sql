SET search_path = cpk, "znu", public; -- For current session only


create table character(
  id serial primary key
  , name text
);

create table skill_set(
  character_id bigint
  , seq int
  , name text
  , description text
  , type text
  , primary key(character_id, seq)
  , foreign key (character_id)
  references character(id)
);

create table user_class(
  id serial primary key
  , name text
);

create table class_talent(
  user_class_id bigint
  , talent_no int
  , name text
  , type text
  , primary key(user_class_id, talent_no)
  , foreign key (user_class_id)
  references user_class(id)

);



select * from character;
select * from skill_set;

select * from user_class;
select * from class_talent;