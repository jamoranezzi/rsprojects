#!/usr/bin/env bash
# Ejecuta todos los profiles del eureka Server
mvn spring-boot:run -Dspring.profiles.active=primary &
mvn spring-boot:run -Dspring.profiles.active=secondary &
mvn spring-boot:run -Dspring.profiles.active=tertiary