##Note

BusinessNews is a recruitment task. It takes business news from
https://newsapi.org and save it to file.

Application is using Java 11, Spring Boot, Maven, Lombok.

##Running the service


First step in clone the Git repository:

$ git clone https://github.com/SebastianRoslon/BusinessNews $ cd BusinessNews

Once the clone is done, run below

$ mvn clean install

$ mvn spring-boot:run

Application is available on below localhost with port 8080:/file

News from APIs are saved to BusinessArticlesPoland.txt file
