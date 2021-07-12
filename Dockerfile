FROM openjdk:11
ADD target/DiscoveryService-0.0.1-SNAPSHOT.jar DiscoveryService.jar
ENTRYPOINT ["java", "-jar", "DiscoveryService.jar"]