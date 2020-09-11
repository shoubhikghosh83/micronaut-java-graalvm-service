FROM oracle/graalvm-ce:20.1.0-java8 as graalvm
RUN gu install native-image

COPY . /home/app/micronaut-java-graalvm-service
WORKDIR /home/app/micronaut-java-graalvm-service

RUN native-image --no-server --no-fallback -cp target/micronaut-java-graalvm-service-*.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-java-graalvm-service/micronaut-java-graalvm-service /app/micronaut-java-graalvm-service
ENTRYPOINT ["/app/micronaut-java-graalvm-service"]
