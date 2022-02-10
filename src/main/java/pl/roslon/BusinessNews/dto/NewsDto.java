package pl.roslon.BusinessNews.dto;

import lombok.*;
import java.util.Arrays;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewsDto {

    private ArticlesDto[] articles;

    @Override
    public String toString() {
        return "NewsDto{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }
}
