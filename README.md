## BusinessNews

BusinessNews is a recruitment task. It takes business news from
https://newsapi.org and save it to file.

Application is using Java 14, Spring Boot, Maven, Lombok.

Example file view: 

![exampleView](https://user-images.githubusercontent.com/61514770/153668599-68689e56-6574-45ed-b7a7-01094a828d04.png)

## Installation
In the beggining of instalation you need to install java 14 and maven

[Maven](https://maven.apache.org/download.cgi)

[Java 14](https://adoptopenjdk.net/)

## Running the service

First step is clone the Git repository:

$ git clone https://github.com/SebastianRoslon/BusinessNews $ cd BusinessNews

Once the clone is done, run below

$ mvn clean install

$ mvn spring-boot:run

Application is available on below localhost with port 8080:/file

News from API are saved to BusinessArticlesPoland.txt file

