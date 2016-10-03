#!/usr/bin/env bash
# Ejecuta con mvn todos los profiles configurados (requerido Config Server y EurekaServer)
mvn spring-boot:run -Dspring.profiles.active=subject &
mvn spring-boot:run -Dspring.profiles.active=verb &
mvn spring-boot:run -Dspring.profiles.active=article &
mvn spring-boot:run -Dspring.profiles.active=adjective &
mvn spring-boot:run -Dspring.profiles.active=noun