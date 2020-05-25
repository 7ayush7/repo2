Do the following step by step :

1. Start the zookeeper server : C:\kafka\bin\windows>zookeeper-server-start.bat ../../config/zookeeper.properties
2. Start the kafka server : C:\kafka\bin\windows>kafka-server-start.bat ../../config/server.properties
3. Autowire KafkaTemplate in Controller class
4. Assign a topic name
5. call send method and pass the topic name and message
6. Before starting the spring boot app, create the topic
7. Create Topic : kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic Ayush
8. Create a Consumer to read from the topic : kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Ayush --from-beginning
9. Change port of spring boot app and execute the spring boot app
10. Hit the API
11. Check in the console of Consumer that the message is received there

This summarizes the entire functionality of Kafka in a small example, That
Your Spring boot app works as producer and it publishes message into the topic on your locally hosted
Apache Kafka server
