CREATE TABLE IF NOT EXISTS "subscriber" (
    "id" VARCHAR(255) PRIMARY KEY DEFAULT uuid_generate_v4(),
    "name" VARCHAR(255) NOT NULL,
    "ref" VARCHAR(255) NOT NULL
);

INSERT INTO "subscriber" values ('subscriberId_1', 'subscriberName_1', 'subscriberRef_1');
INSERT INTO "subscriber" values ('subscriberId_2', 'subscriberName_2', 'subscriberRef_2');
INSERT INTO "subscriber" values ('subscriberId_3', 'subscriberName_3', 'subscriberRef_3');