package pl.roslon.BusinessNews.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsDto {

    private ArticlesDto[] articles;

}
