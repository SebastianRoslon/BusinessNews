package pl.roslon.BusinessNews.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ArticlesDto {

    private String title;
    private String description;
    private String author;

}
