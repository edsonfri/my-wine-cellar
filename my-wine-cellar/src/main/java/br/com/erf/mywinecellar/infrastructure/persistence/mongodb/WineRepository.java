package br.com.erf.mywinecellar.infrastructure.persistence.mongodb;

import br.com.erf.mywinecellar.core.domain.entity.Wine;
import br.com.erf.mywinecellar.core.domain.entity.WineRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WineRepository extends MongoRepository<WineRequest, String> {
}
