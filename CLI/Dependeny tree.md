#### Once required dependencies are added to `pom.xml` :

```
      >    mvn dependency:tree
```
**NOTE:** On the first run of this cmd, It downloads all the dependencies if not already downloaded.  
          And will have to rerun the cmd.  
            
Output:

```INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< com.example:myproject >------------------------
[INFO] Building myproject 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-dependency-plugin:3.1.2:tree (default-cli) @ myproject ---
[INFO] com.example:myproject:jar:0.0.1-SNAPSHOT
[INFO] \- org.springframework.boot:spring-boot-starter-web:jar:2.3.2.RELEASE:compile
[INFO]    +- org.springframework.boot:spring-boot-starter:jar:2.3.2.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot:jar:2.3.2.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.3.2.RELEASE:compile
[INFO]    |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.3.2.RELEASE:compile
[INFO]    |  |  +- ch.qos.logback:logback-classic:jar:1.2.3:compile
[INFO]    |  |  |  +- ch.qos.logback:logback-core:jar:1.2.3:compile
[INFO]    |  |  |  \- org.slf4j:slf4j-api:jar:1.7.30:compile
[INFO]    |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.13.3:compile
[INFO]    |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.13.3:compile
[INFO]    |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.30:compile
[INFO]    |  +- jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
[INFO]    |  +- org.springframework:spring-core:jar:5.2.8.RELEASE:compile
[INFO]    |  |  \- org.springframework:spring-jcl:jar:5.2.8.RELEASE:compile
[INFO]    |  \- org.yaml:snakeyaml:jar:1.26:compile
[INFO]    +- org.springframework.boot:spring-boot-starter-json:jar:2.3.2.RELEASE:compile
[INFO]    |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.11.1:compile
[INFO]    |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.11.1:compile
[INFO]    |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.11.1:compile
[INFO]    |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.11.1:compile
[INFO]    |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.11.1:compile
[INFO]    |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.11.1:compile
[INFO]    +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.3.2.RELEASE:compile
[INFO]    |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.37:compile
[INFO]    |  +- org.glassfish:jakarta.el:jar:3.0.3:compile
[INFO]    |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.37:compile
[INFO]    +- org.springframework:spring-web:jar:5.2.8.RELEASE:compile
[INFO]    |  \- org.springframework:spring-beans:jar:5.2.8.RELEASE:compile
[INFO]    \- org.springframework:spring-webmvc:jar:5.2.8.RELEASE:compile
[INFO]       +- org.springframework:spring-aop:jar:5.2.8.RELEASE:compile
[INFO]       +- org.springframework:spring-context:jar:5.2.8.RELEASE:compile
[INFO]       \- org.springframework:spring-expression:jar:5.2.8.RELEASE:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.947 s
[INFO] Finished at: 2020-08-01T14:52:27+05:30
[INFO] ------------------------------------------------------------------------

```

