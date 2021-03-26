# Kafka-application

Commands for windows

.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties 

.\bin\windows\kafka-server-start.bat config\server.properties 

.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic 

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic testTopic--from-beginning 

Actuator:
http://localhost:8080/actuator
http://localhost:8080/actuator/health