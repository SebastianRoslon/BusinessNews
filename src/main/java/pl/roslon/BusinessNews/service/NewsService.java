package pl.roslon.BusinessNews.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.roslon.BusinessNews.client.NewsClient;
import pl.roslon.BusinessNews.dto.NewsDto;

@AllArgsConstructor
@Service
@Slf4j
public class NewsService {

    private final NewsClient newsClient;

    public NewsDto getNews(){
        return newsClient.getBuisnessNews();
    }


}
