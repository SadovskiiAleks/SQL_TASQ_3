### Ошибка
2023-09-07T21:55:51.733+03:00 ERROR 15712 --- [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : postgres - Exception during pool initialization.

org.postgresql.util.PSQLException: �����: ������������ "Aleks" �� ������ �������� ����������� (�� ������)
at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:693) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.v3.ConnectionFactoryImpl.tryConnect(ConnectionFactoryImpl.java:203) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:258) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:54) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:263) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.Driver.makeConnection(Driver.java:443) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.Driver.connect(Driver.java:297) ~[postgresql-42.6.0.jar:42.6.0]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:121) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar:na]
at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:332) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.data.jdbc.repository.config.DialectResolver$DefaultDialectProvider.getDialect(DialectResolver.java:108) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.data.jdbc.repository.config.DialectResolver.lambda$getDialect$0(DialectResolver.java:78) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602) ~[na:na]
at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
at java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
at java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647) ~[na:na]
at org.springframework.data.jdbc.repository.config.DialectResolver.getDialect(DialectResolver.java:80) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration.jdbcDialect(AbstractJdbcConfiguration.java:223) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.jdbcDialect(JdbcRepositoriesAutoConfiguration.java:144) ~[spring-boot-autoconfigure-3.1.2.jar:3.1.2]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:655) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:647) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:225) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1310) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1271) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:484) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:339) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1173) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration.jdbcCustomConversions(AbstractJdbcConfiguration.java:154) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.jdbcCustomConversions(JdbcRepositoriesAutoConfiguration.java:121) ~[spring-boot-autoconfigure-3.1.2.jar:3.1.2]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:655) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:493) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:888) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:550) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:942) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.2.jar:3.1.2]
at com.example.jbdsapi.JbdsapiApplication.main(JbdsapiApplication.java:10) ~[classes/:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.1.2.jar:3.1.2]

2023-09-07T21:55:51.747+03:00  WARN 15712 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'jdbcMappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Unsatisfied dependency expressed through method 'jdbcMappingContext' parameter 1: Error creating bean with name 'jdbcCustomConversions' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.jdbc.core.convert.JdbcCustomConversions]: Factory method 'jdbcCustomConversions' threw exception with message: Error creating bean with name 'jdbcDialect' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
2023-09-07T21:55:51.752+03:00  INFO 15712 --- [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-09-07T21:55:51.771+03:00  INFO 15712 --- [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2023-09-07T21:55:51.795+03:00 ERROR 15712 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'jdbcMappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Unsatisfied dependency expressed through method 'jdbcMappingContext' parameter 1: Error creating bean with name 'jdbcCustomConversions' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.jdbc.core.convert.JdbcCustomConversions]: Factory method 'jdbcCustomConversions' threw exception with message: Error creating bean with name 'jdbcDialect' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:550) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:942) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:436) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.2.jar:3.1.2]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.2.jar:3.1.2]
at com.example.jbdsapi.JbdsapiApplication.main(JbdsapiApplication.java:10) ~[classes/:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.1.2.jar:3.1.2]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jdbcCustomConversions' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.jdbc.core.convert.JdbcCustomConversions]: Factory method 'jdbcCustomConversions' threw exception with message: Error creating bean with name 'jdbcDialect' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:659) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:493) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:888) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.0.11.jar:6.0.11]
... 24 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.jdbc.core.convert.JdbcCustomConversions]: Factory method 'jdbcCustomConversions' threw exception with message: Error creating bean with name 'jdbcDialect' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:655) ~[spring-beans-6.0.11.jar:6.0.11]
... 38 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jdbcDialect' defined in class path resource [org/springframework/boot/autoconfigure/data/jdbc/JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.class]: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:659) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:647) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:225) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1310) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1271) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:484) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:339) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:332) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1173) ~[spring-context-6.0.11.jar:6.0.11]
at org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration.jdbcCustomConversions(AbstractJdbcConfiguration.java:154) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.jdbcCustomConversions(JdbcRepositoriesAutoConfiguration.java:121) ~[spring-boot-autoconfigure-3.1.2.jar:3.1.2]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.11.jar:6.0.11]
... 39 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.relational.core.dialect.Dialect]: Factory method 'jdbcDialect' threw exception with message: Failed to obtain JDBC Connection
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.0.11.jar:6.0.11]
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:655) ~[spring-beans-6.0.11.jar:6.0.11]
... 61 common frames omitted
Caused by: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection
at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:84) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:332) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.data.jdbc.repository.config.DialectResolver$DefaultDialectProvider.getDialect(DialectResolver.java:108) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.data.jdbc.repository.config.DialectResolver.lambda$getDialect$0(DialectResolver.java:78) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602) ~[na:na]
at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
at java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150) ~[na:na]
at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
at java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647) ~[na:na]
at org.springframework.data.jdbc.repository.config.DialectResolver.getDialect(DialectResolver.java:80) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration.jdbcDialect(AbstractJdbcConfiguration.java:223) ~[spring-data-jdbc-3.1.2.jar:3.1.2]
at org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration$SpringBootJdbcConfiguration.jdbcDialect(JdbcRepositoriesAutoConfiguration.java:144) ~[spring-boot-autoconfigure-3.1.2.jar:3.1.2]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.11.jar:6.0.11]
... 62 common frames omitted
Caused by: org.postgresql.util.PSQLException: �����: ������������ "Aleks" �� ������ �������� ����������� (�� ������)
at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:693) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.v3.ConnectionFactoryImpl.tryConnect(ConnectionFactoryImpl.java:203) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:258) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:54) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:263) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.Driver.makeConnection(Driver.java:443) ~[postgresql-42.6.0.jar:42.6.0]
at org.postgresql.Driver.connect(Driver.java:297) ~[postgresql-42.6.0.jar:42.6.0]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:121) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar:na]
at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-6.0.11.jar:6.0.11]
at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-6.0.11.jar:6.0.11]
... 82 common frames omitted