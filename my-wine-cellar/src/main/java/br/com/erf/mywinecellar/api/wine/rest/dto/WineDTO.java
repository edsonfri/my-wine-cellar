package br.com.erf.mywinecellar.api.wine.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class WineDTO {
    @NonNull
    private String name;
    @NonNull
    private String type;
    @NonNull
    private String grape;
    @NonNull
    private String url;
    @NonNull
    private String imageName;
    @NonNull
    private String rating;
    @NonNull
    private String year;
}
