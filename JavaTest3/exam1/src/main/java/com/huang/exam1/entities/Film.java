package com.huang.exam1.entities;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "film")
public class Film {
    int film_id;
    String title;
    String description;
}
