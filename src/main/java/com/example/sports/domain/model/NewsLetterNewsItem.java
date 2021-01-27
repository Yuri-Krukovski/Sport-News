package com.example.sports.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class NewsLetterNewsItem {

    private String articleUrl;

    private Long newsArticleId;

    private LocalDateTime publishDate;

    private String taxonomies;

    private String teaserText;

    private String thumbNailImageUrl;

    private String title;

    private String optaMatchId;

}
