package cz.mka.beerbanana.service;

import java.util.Set;

import cz.mka.beerbanana.domain.to.ConsumerTO;

public interface ConsumerService {

    ConsumerTO save(ConsumerTO alcohol);

    Set<ConsumerTO> findAll();

    ConsumerTO findOne(Long id);

    ConsumerTO findByEmail(String email);

    void delete(Long id);
}
