package br.com.erf.mywinecellar.core.port.in;

import br.com.erf.mywinecellar.api.wine.rest.dto.WineDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineRequestDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface WineUseCase {
    WineResponseDTO save(WineRequestDTO wineRequestDTO);
    List<WineRequestDTO> search();
}
