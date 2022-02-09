package pl.roslon.BusinessNews.model;

import lombok.*;
import org.springframework.stereotype.Component;
import pl.roslon.BusinessNews.dto.ArticlesDto;

@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Component
//@Data
@Builder
public class NewsModel {

    private ArticlesDto articlesDto;

}
