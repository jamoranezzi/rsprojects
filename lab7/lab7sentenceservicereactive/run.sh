#!/usr/bin/env bash
# Ejecuta con mvn todos los profiles configurados (requerido Config Server y EurekaServer)
mvn spring-boot:run -Dspring.profiles.active=sentence