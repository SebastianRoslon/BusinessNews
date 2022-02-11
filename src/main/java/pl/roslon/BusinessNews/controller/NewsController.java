package pl.roslon.BusinessNews.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.roslon.BusinessNews.client.NewsClient;

@AllArgsConstructor
@RestController
public class NewsController {

    private final NewsClient newsClient;

    @GetMapping("/file")
    public String file() {
        return newsClient.fileWriter();
    }

}
