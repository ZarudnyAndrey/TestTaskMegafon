1) Использовать скрипт create_db_and_schema.sql из папки scripts
2) Cделать апдейт базы через liquibase: mvn -DskipTests=true liquibase:update -f pom.xml
3) По желанию закинуть в базу персонажей из upload_person_in_db.sql