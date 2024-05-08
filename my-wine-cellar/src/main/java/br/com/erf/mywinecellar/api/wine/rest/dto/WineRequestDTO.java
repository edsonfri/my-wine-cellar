package br.com.erf.mywinecellar.api.wine.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WineRequestDTO {
    @JsonProperty("wine")
    private WineDTO wineDTO;
}
