package de.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StackoverflowWebsite {
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;
}
