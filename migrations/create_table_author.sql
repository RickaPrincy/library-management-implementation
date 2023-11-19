CREATE TABLE IF NOT EXISTS "author" (
    "id" VARCHAR(255) PRIMARY KEY DEFAULT uuid_generate_v4(),
    "name" VARCHAR(255) NOT NULL,
    "sex" CHAR(1) CHECK (sex IN ('M', 'F')) NOT NULL
);

INSERT INTO "author" values ('authorId_1', 'authorName_1', 'M');
INSERT INTO "author" values ('authorId_2', 'authorName_2', 'F');
INSERT INTO "author" values ('authorId_3', 'authorName_3', 'M');
