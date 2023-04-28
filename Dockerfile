FROM eclipse-temurin:17-jre-alpine

MAINTAINER ptome@cleartech.com.br

ARG APPLICATION_NAME
ENV APPLICATION_NAME=$APPLICATION_NAME
ARG APPLICATION_PATH
ENV APPLICATION_PATH=$APPLICATION_PATH

ENV TZ=America/Sao_Paulo
ENV JAVA_OPTS_MEMORY_MIN="256m"
ENV JAVA_OPTS_MEMORY_MAX="512m"
ENV JAVA_OPTS_METASPACE_MIN="64m"
ENV JAVA_OPTS_METASPACE_MAX="128m"

ENV JAVA_OPTS_MEMORY="-Xms$JAVA_OPTS_MEMORY_MIN -Xmx$JAVA_OPTS_MEMORY_MAX -XX:MetaspaceSize=$JAVA_OPTS_METASPACE_MIN -XX:MaxMetaspaceSize=$JAVA_OPTS_METASPACE_MAX"
ENV JAVA_OPTS_CONFIG="-Dspring.config.location=file:/appl/config/application.properties"
ENV JAVA_OPTS="$JAVA_OPTS_MEMORY -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions $JAVA_OPTS_CONFIG -Djava.security.egd=file:/dev/./urandom"

WORKDIR /appl

ADD $APPLICATION_PATH/$APPLICATION_NAME $APPLICATION_NAME

VOLUME /appl/config

EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS --enable-preview -jar $APPLICATION_NAME"]


