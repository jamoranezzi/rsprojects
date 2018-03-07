# rsprojects

##EJECUTAR PASO A PASO DESDE POWER SHELL

cd .\OneDrive\Documentos\Cursos\Microservicios\rsprojects\common\commonconfigserver\
#Ejecutar Config SERVER
mvn spring-boot:run

cd .\OneDrive\Documentos\Cursos\Microservicios\rsprojects\common\commoneurekaserver\
#Subir Eureka SERVER
mvn spring-boot:run '-Dspring.profiles.active=primary' 
mvn spring-boot:run '-Dspring.profiles.active=secondary' 
mvn spring-boot:run '-Dspring.profiles.active=tertiary'

cd .\OneDrive\Documentos\Cursos\Microservicios\rsprojects\lab7\lab7wordserver\
#Subir Word SERVER
mvn spring-boot:run '-Dspring.profiles.active=subject'
mvn spring-boot:run '-Dspring.profiles.active=verb'
mvn spring-boot:run '-Dspring.profiles.active=article'
mvn spring-boot:run '-Dspring.profiles.active=adjective'
mvn spring-boot:run '-Dspring.profiles.active=noun'

cd .\OneDrive\Documentos\Cursos\Microservicios\rsprojects\lab7\lab7setenceservice\
#Subir sentence SERVICE
mvn spring-boot:run -Dspring.profiles.active=sentence
probar: http://laptop-m1abog5v:57228/sentence

cd .\OneDrive\Documentos\Cursos\Microservicios\rsprojects\lab9\lab9gateway\
#SUBIR GATEWAY
mvn spring-boot:run
