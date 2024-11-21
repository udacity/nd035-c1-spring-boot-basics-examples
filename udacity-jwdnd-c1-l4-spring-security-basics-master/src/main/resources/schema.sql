CREATE TABLE IF NOT EXISTS USERS (
  userid serial PRIMARY KEY,
  username VARCHAR(20),
  salt VARCHAR,
  password VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);
