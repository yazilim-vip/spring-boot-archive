create table Person(
  PersonId integer not null AUTO_INCREMENT,
  Name varchar(50),
  Location varchar(100),
  BirthDate timestamp,
  primary key(PersonId)
);
