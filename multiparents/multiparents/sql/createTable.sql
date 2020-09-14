SET search_path = multi_parents, "znu", public; -- For current session only

drop table data_file_relation;

drop table data_description;

drop table file_info;

drop table data_main;





create table data_main(
  data_id serial primary key
  , name varchar(20)
);

create table file_info(
  file_info_id serial primary key
  , file_name varchar(20)
  , binary_data oid
);

create table data_file_relation(
  data_id int
  , file_info_id int
  , foreign key (data_id)
  references data_main(data_id)
  , foreign key (file_info_id)
  references file_info(file_info_id)
);

create table data_description(
  data_description_id serial primary key
  , description varchar(20)
  , data_id int
  , file_info_id int
  , foreign key(data_id)
  references data_main (data_id)
  , foreign key(file_info_id)
  references file_info(file_info_id)
);
