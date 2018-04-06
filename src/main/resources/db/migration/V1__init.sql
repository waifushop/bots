CREATE TABLE bot (
  id               BIGINT       NOT NULL PRIMARY KEY,
  discord_id       BIGINT       NOT NULL,
  name             CHARACTER VARYING NOT NULL,
  description      CHARACTER VARYING NOT NULL CHECK (length(description) > 1),
  long_description CHARACTER VARYING,
  website_url      CHARACTER VARYING,
  invite_url       CHARACTER VARYING NOT NULL CHECK (length(invite_url) > 5),
  server_count     INT CHECK (server_count >= 0),
  prefixes         CHARACTER VARYING[] NOT NULL,
  library          CHARACTER VARYING,
  avatar_hash      CHARACTER VARYING
);

CREATE TABLE owner (
  id  BIGINT  NOT NULL PRIMARY KEY,
  name CHARACTER VARYING NOT NULL
);

CREATE TABLE bots_owners (
  bot_id BIGINT REFERENCES bot(id),
  owner_id BIGINT REFERENCES owner(id),
  PRIMARY KEY (bot_id, owner_id)
);

INSERT INTO owner VALUES (1, 'miata');
INSERT INTO owner VALUES (2, 'is');
INSERT INTO owner VALUES (3, 'always');
INSERT INTO owner VALUES (4, 'the');
INSERT INTO owner VALUES (5, 'answer');