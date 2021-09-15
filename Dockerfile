FROM openjdk:11
MAINTAINER Matthew.Crowell@Smoothstack.com
RUN adduser --system --group discoveryservice
USER discoveryservice:discoveryservice
COPY target/DiscoveryService-0.0.1-SNAPSHOT.jar DiscoveryService.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "DiscoveryService.jar"]