package br.com.erf.mywinecellar.core.domain.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
public class Wine {
    private String name;
    private String type;
    private String grape;
    private String url;
    private String imageName;
    private String rating;
    private String year;
}
