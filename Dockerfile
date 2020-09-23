FROM openjdk:14-alpine
COPY build/libs/micronaut-start-*-all.jar micronaut-start.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-start.jar"]