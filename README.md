# Library management

Simple project for more practice about java 

# Getting Started

- Set up environment variables as follows

```shell
DB_PASSWORD=12345678 #your password 
DB_URL=jdbc:postgresql://localhost:5432/library_management
DB_USERNAME=postgres #your postgresql username
```
- Create the database using the [migration files](src/main/resources). This directory contains SQL files following the naming convention:
  - [create_extension.sql](migrations/create_extension.sql)
  - [create_type_topic.sql](migrations/create_type_topic.sql)
  - [create_table_author.sql](migrations/create_table_author.sql)
  - [create_table_book.sql](migrations/create_table_book.sql)
  - [create_table_subscriber.sql](migrations/create_table_subscriber.sql)

# Build 

Just run the following command in the root directory of the project

```bash
#step 1 : build
javac -cp external/lombok.jar:external/postgresql-42.6.0.jar src/Main.java src/model/*.java src/mock_test/*.java src/repository/*.java -d build 

#step2: creating a jar file
jar cfm library_management.jar Manifest.txt -C build . 

#to run 
java -cp library_management.jar:external/lombok.jar:external/postgresql-42.6.0.jar Main 
```