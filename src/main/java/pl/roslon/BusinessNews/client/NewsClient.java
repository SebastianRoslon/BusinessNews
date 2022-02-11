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
    private final String API_KEY = "2426660583354b60bfc17a3b35a1db7d";

    public NewsDto getBusinessNews() {
        NewsDto newsDto = callGetMethod();
        return NewsDto.builder()
                .articles(newsDto.getArticles())
                .build();
    }

    public String fileWriter() {
        String businessNewsToString = String.valueOf(getBusinessNews());
        String[] businessNewsArray = businessNewsToString.split("ArticlesDto");

        String fileName = "BusinessArticlesPoland.txt";
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter)
        ) {
            for (String s : businessNewsArray) {
                writer.write(s);
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("Failed to write file " + fileName);
        }
        return fileName;
    }

    private <T> T callGetMethod() {
        return restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=pl&category=business&apiKey=" + API_KEY, (Class<T>) NewsDto.class);
    }
}
