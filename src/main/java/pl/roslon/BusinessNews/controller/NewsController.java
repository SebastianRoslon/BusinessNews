package pl.roslon.BusinessNews.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.roslon.BusinessNews.client.NewsClient;
import pl.roslon.BusinessNews.dto.NewsDto;

@AllArgsConstructor
@RestController
public class NewsController {

    private final NewsClient newsClient;

    @GetMapping("/news")
    public NewsDto getNews(){
        return newsClient.getBusinessNews();
    }

    @GetMapping("/file")
    public String file(){
        return newsClient.fileWriter();
    }

}
