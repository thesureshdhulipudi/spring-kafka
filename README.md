# spring-kafka
**Run your Apache Zookeeper server by using this command:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\zookeeper-server-start.bat D:\Softwares\kafka\kafka_2.13-3.2.0\config\zookeeper.properties

**Similarly, run your Apache Kafka server by using this command:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\kafka-server-start.bat D:\Softwares\kafka\kafka_2.13-3.2.0\config\server.properties


**Create new topic:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows>kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 -topic order-topic

**Delete topic:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --delete --topic 'order-.*'


**To check the list of topics:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092


**Produce a message:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic order-topic

**Consume a message:**
C:\kafka>D:\Softwares\kafka\kafka_2.13-3.2.0\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic order-topic


**Place order using APIs:**
**Success order:**
![image](https://user-images.githubusercontent.com/56250128/172539445-b69485c7-e64c-4b35-9ba4-1a0fb5780d2c.png)
![image](https://user-images.githubusercontent.com/56250128/172539559-111a60c1-1abb-4c74-82f0-9f099ae1f6bf.png)
**Failure order:**
![image](https://user-images.githubusercontent.com/56250128/172539646-c19784b5-e26e-45ae-9f96-4a11129f8f92.png)
![image](https://user-images.githubusercontent.com/56250128/172539666-b2bbdcff-e843-4f29-bfbf-a22c70530217.png)

