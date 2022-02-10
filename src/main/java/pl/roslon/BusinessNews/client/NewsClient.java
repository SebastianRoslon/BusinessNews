package pl.roslon.BusinessNews.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.roslon.BusinessNews.dto.NewsDto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class NewsClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public NewsDto getBusinessNews() {
        NewsDto newsDto = callGetMethod();
        return NewsDto.builder()
                .articles(newsDto.getArticles())
                .build();
    }

    public String fileWriter() {
        String businessNewsToString = String.valueOf(getBusinessNews());
        String[] businessArray = businessNewsToString.split("ArticlesDto");

        String fileName = "BusinessArticlesPoland.txt";
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
                ) {
            for (String s : businessArray) {
                writer.write(s);
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("Failed to write file " + fileName);
        }
        return fileName;
    }

    private <T> T callGetMethod(Object... objects) {
        String URL = "https://newsapi.org/v2/top-headlines?country=pl&category=business&apiKey=2426660583354b60bfc17a3b35a1db7d";
        return restTemplate.getForObject(URL, (Class<T>) NewsDto.class, objects);
    }
}
