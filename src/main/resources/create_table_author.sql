CREATE TABLE IF NOT EXISTS "author" (
    "id" VARCHAR(255) PRIMARY KEY DEFAULT uuid_generate_v4(),
    "name" VARCHAR(255) NOT NULL,
    "ref" VARCHAR(255) NOT NULL
);

INSERT INTO "author" values ('authorId_1', 'authorName_1', 'authorRef_1');
INSERT INTO "author" values ('authorId_2', 'authorName_2', 'authorRef_2');
INSERT INTO "author" values ('authorId_3', 'authorName_3', 'authorRef_3');
