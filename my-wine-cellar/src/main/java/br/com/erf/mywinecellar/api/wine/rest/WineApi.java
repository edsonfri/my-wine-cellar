package br.com.erf.mywinecellar.api.wine.rest;

import br.com.erf.mywinecellar.api.wine.rest.dto.WineDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineRequestDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineResponseDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface WineApi {
    @PostMapping("/wine")
    WineResponseDTO save(@Validated @RequestBody WineRequestDTO wineRequestDTO);

    @GetMapping("/wine")
    List<WineRequestDTO> search();

}
