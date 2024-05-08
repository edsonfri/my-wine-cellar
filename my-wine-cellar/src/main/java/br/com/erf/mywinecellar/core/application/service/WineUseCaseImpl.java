package br.com.erf.mywinecellar.core.application.service;

import br.com.erf.mywinecellar.api.wine.rest.dto.WineDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineRequestDTO;
import br.com.erf.mywinecellar.api.wine.rest.dto.WineResponseDTO;
import br.com.erf.mywinecellar.core.domain.entity.Wine;
import br.com.erf.mywinecellar.core.domain.entity.WineRequest;
import br.com.erf.mywinecellar.core.port.in.WineUseCase;
import br.com.erf.mywinecellar.infrastructure.persistence.mongodb.WineRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class WineUseCaseImpl implements WineUseCase {
    @Autowired
    private WineRepository wineRepository;

    private final List<WineDTO> wineList = new ArrayList<>();

    @Override
    public WineResponseDTO save(WineRequestDTO wineRequest) {
        var mapper = new ModelMapper();
        var wine = mapper.map(wineRequest, WineRequest.class);

        return mapper.map(wineRepository.save(wine), WineResponseDTO.class);

    }

    @Override
    public List<WineRequestDTO> search() {
        var mapper = new ModelMapper();

        return mapper.map(wineRepository.findAll(), List.class);
    }
}
