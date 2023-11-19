CREATE TABLE IF NOT EXISTS "book"(
     "id" VARCHAR(255) PRIMARY KEY DEFAULT uuid_generate_v4(),
     "book_name" VARCHAR(255) NOT NULL,
     "page_numbers" INT CHECK("page_numbers" > 0) NOT NULL,
     "release_date" DATE NOT NULL,
     "topics" "topic"[],
     "id_author" UUID REFERENCES "author"("id")
);

INSERT INTO "book" VALUES ( 'bookId_1', 'bookName_1', 200, '2023-01-01', ARRAY['COMEDY'::"topic"], 'authorId_1' );
INSERT INTO "book" VALUES ( 'bookId_2', 'bookName_2', 300, '2023-02-01', ARRAY['ROMANCE'::"topic", 'OTHER'::"topic"], 'authorId_2');
INSERT INTO "book" VALUES ( 'bookId_3', 'bookName_3', 250, '2023-03-01', ARRAY['OTHER'::"topic"], 'authorId_3');