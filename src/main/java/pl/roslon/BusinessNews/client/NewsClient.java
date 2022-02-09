package pl.roslon.BusinessNews.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.roslon.BusinessNews.dto.NewsDto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
@Component
public class NewsClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public NewsDto getBuisnessNews() {
        NewsDto newsDto = callGetMethod();
        return NewsDto.builder()
                .articles(newsDto.getArticles())
                .build();
    }

    public String fileWriter() {
        String buisnessNewsToString = String.valueOf(getBuisnessNews());
        String fileName = "test.txt";
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write(buisnessNewsToString);
            writer.newLine();

        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
        return fileName;
    }

    private <T> T callGetMethod(Object... objects) {
        String URL = "https://newsapi.org/v2/top-headlines?country=pl&category=business&apiKey=2426660583354b60bfc17a3b35a1db7d";
        return restTemplate.getForObject(URL, (Class<T>) NewsDto.class, objects);
    }
}
