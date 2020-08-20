package de.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document
public class StackoverflowWebsite {
    @Id
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;
}
