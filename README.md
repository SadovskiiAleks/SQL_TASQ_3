### Ошибка
2023-09-14T23:11:20.255+03:00  INFO 20872 --- [  restartedMain] liquibase.changelog                      : Reading from public.databasechangelog
Running Changeset: db.changelog/migration/schema_1.sql::raw::includeAll
2023-09-14T23:11:20.292+03:00 ERROR 20872 --- [  restartedMain] liquibase.changelog                      : ChangeSet db.changelog/migration/schema_1.sql::raw::includeAll encountered an exception.
2023-09-14T23:11:20.293+03:00  INFO 20872 --- [  restartedMain] liquibase.command                        : Update command encountered an exception.
2023-09-14T23:11:20.295+03:00  INFO 20872 --- [  restartedMain] liquibase.lockservice                    : Successfully released change log lock
2023-09-14T23:11:20.296+03:00  INFO 20872 --- [  restartedMain] liquibase.command                        : Command execution complete
2023-09-14T23:11:20.298+03:00  WARN 20872 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'controller' defined in file [A:\java\HW_netology_SQL\JBDSAPI\target\classes\com\example\jbdsapi\controller\Controller.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'baseConnectRepository': Unsatisfied dependency expressed through field 'namedParameterJdbcTemplate': Error creating bean with name 'liquibase' defined in class path resource [org/springframework/boot/autoconfigure/liquibase/LiquibaseAutoConfiguration$LiquibaseConfiguration.class]: liquibase.exception.LiquibaseException: liquibase.exception.MigrationFailedException: Migration failed for changeset db.changelog/migration/schema_1.sql::raw::includeAll:
Reason: liquibase.exception.DatabaseException: ОШИБКА: схема "hw_netology" не существует
Позиция: 14 [Failed SQL: (0) create table hw_netology.CUSTUMERS (
id SERIAL PRIMARY KEY ,
name varchar(50) not Null,
surname varchar(100) not Null,
age int check (age > 0 and age < 150),
phone_number varchar(11) not Null
);
--rollback drop table hw_netology.CUSTUMERS;]
2023-09-14T23:11:20.298+03:00  INFO 20872 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-09-14T23:11:20.313+03:00  INFO 20872 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2023-09-14T23:11:20.315+03:00  INFO 20872 --- [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-09-14T23:11:20.322+03:00  INFO 20872 --- [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2023-09-14T23:11:20.333+03:00 ERROR 20872 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'controller' defined in file [A:\java\HW_netology_SQL\JBDSAPI\target\classes\com\example\jbdsapi\controller\Controller.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'baseConnectRepository': Unsatisfied dependency expressed through field 'namedParameterJdbcTemplate': Error creating bean with name 'liquibase' defined in class path resource [org/springframework/boot/autoconfigure/liquibase/LiquibaseAutoConfiguration$LiquibaseConfiguration.class]: liquibase.exception.LiquibaseException: liquibase.exception.MigrationFailedException: Migration failed for changeset db.changelog/migration/schema_1.sql::raw::includeAll:
Reason: liquibase.exception.DatabaseException: ОШИБКА: схема "hw_netology" не существует
Позиция: 14 [Failed SQL: (0) create table hw_netology.CUSTUMERS (
id SERIAL PRIMARY KEY ,
name varchar(50) not Null,
s