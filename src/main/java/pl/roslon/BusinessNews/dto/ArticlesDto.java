package pl.roslon.BusinessNews.dto;

import lombok.Data;
import lombok.Getter;

@Getter
public class ArticlesDto {

    private String title;
    private String description;
    private String author;

    @Override
    public String toString() {
        return "ArticlesDto{" +
                "title: " + title + '\'' +
                ", description: " + description + '\'' +
                ", author" + author + '\'' +
                '}';
    }
}
