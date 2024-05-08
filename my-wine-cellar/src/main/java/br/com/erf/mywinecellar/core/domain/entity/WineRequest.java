package br.com.erf.mywinecellar.core.domain.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "wine")
public class WineRequest {
    @Id 
    private String id;
    private Wine wine;
}
