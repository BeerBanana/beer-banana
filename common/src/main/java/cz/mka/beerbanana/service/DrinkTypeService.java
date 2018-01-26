package cz.mka.beerbanana.service;

import java.util.Set;

import cz.mka.beerbanana.domain.to.DrinkTypeTO;

public interface DrinkTypeService {

    DrinkTypeTO save(DrinkTypeTO alcohol);

    Set<DrinkTypeTO> findAll();

    DrinkTypeTO findOne(Long id);

    void delete(Long id);

}
