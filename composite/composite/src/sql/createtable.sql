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

select * from character;
select * from skill_set;
