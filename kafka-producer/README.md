#Kafka Producer with string message

#WSL COMMANDS

#Kafka topics creation
./kafka-topics --create --zookeeperr localhost:2181 --replication-factor 1 --partition 1 --topic topicName

#Describe kafka topics
./kafka-topics --describe --zookeeper localhos:2181 --topic topicName

#Read data from kafka topics
./kafka-console-conumer --bootstrap-server localhost:9092 --from-beginning --topic topicName
