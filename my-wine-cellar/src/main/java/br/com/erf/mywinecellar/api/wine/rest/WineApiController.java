package br.com.erf.mywinecellar.api.wine.rest;

import br.com.erf.mywinecellar.api.wine.rest.dto.WineDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineRequestDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineResponseDTO;
import br.com.erf.mywinecellar.core.port.in.WineUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WineApiController implements WineApi{
    @Autowired
    WineUseCase wineUseCase;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public WineResponseDTO save(WineRequestDTO wineRequestDTO) {

        return wineUseCase.save(wineRequestDTO);
    }

    @Override
    public List<WineRequestDTO> search() {
        System.out.println("Teste");


        return wineUseCase.search();
    }

}
