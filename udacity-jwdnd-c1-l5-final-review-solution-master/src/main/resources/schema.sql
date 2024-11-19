CREATE TABLE IF NOT EXISTS USERS (
  userid serial PRIMARY KEY,
  username VARCHAR(20),
  salt VARCHAR,
  password VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS MESSAGES (
  messageid serial PRIMARY KEY,
  username VARCHAR NOT NULL,
  messagetext VARCHAR NOT NULL
);
