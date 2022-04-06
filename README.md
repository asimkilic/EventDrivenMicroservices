Event Driven Microservices 

CQRS  **C**ommand and **Q**uery **R**esponsible **S**egregation



<img src="https://raw.githubusercontent.com/asimkilic/EventDrivenMicroservices/master/assets/image-20220403225523126.png" />



<img src="https://raw.githubusercontent.com/asimkilic/EventDrivenMicroservices/master/assets/image-20220403225712420.png" />

<img src="https://raw.githubusercontent.com/asimkilic/EventDrivenMicroservices/master/assets/image-20220403230211764.png" />



axoniq.io/resources/event-sourcing

to start axon server with docker

```dockerfile
docker run -d \
  --name axonserver \
  -p 8024:8024 \
  -p 8124:8124 \
  axoniq/axonserver
```

or you can [download](https://developer.axoniq.io/download) axon server jar and run the command **java -jar axonserver.jar**

<img src="https://raw.githubusercontent.com/asimkilic/EventDrivenMicroservices/master/assets/image-20220403231758081.png" />

[Spring Dependencies](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.6&packaging=jar&jvmVersion=11&groupId=com.asimkilic&artifactId=ProductService&name=ProductService&description=Spring%20Boot%20Project&packageName=com.asimkilic.productservice&dependencies=web,lombok,data-jpa,h2)

Add axon and google guava dependencies on pom.xml

```xml
<!-- https://mvnrepository.com/artifact/org.axonframework/axon-spring-boot-starter -->
<dependency>
    <groupId>org.axonframework</groupId>
    <artifactId>axon-spring-boot-starter</artifactId>
    <version>4.5.9</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>31.1-jre</version>
</dependency>

```

**What is SAGA?**

The saga design pattern is a way  to manage data consistency across microservices in distributed transaction scenarios

![image-20220404231310732](/home/asimkilic/snap/typora/57/.config/Typora/typora-user-images/image-20220404231310732.png)





**Success and Failure Scenarios**

![image-20220404233011617](/home/asimkilic/snap/typora/57/.config/Typora/typora-user-images/image-20220404233011617.png)





-----------------

com.thoughtworks.xstream.security.ForbiddenClassException  solution:

 https://discuss.axoniq.io/t/getting-xstream-dependency-exception/3634/5

-----



