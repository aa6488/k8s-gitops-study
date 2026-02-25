# ---- build stage ----
FROM gradle:9.3-jdk21 AS build
WORKDIR /demo
COPY . .
RUN gradle clean bootJar -x test

# ---- run stage ----
FROM eclipse-temurin:21-jre
WORKDIR /demo
COPY --from=build /demo/build/libs/*.jar demo.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo/demo.jar"]

