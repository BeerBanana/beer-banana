package cz.mka.beerbanana.service;

import java.util.Set;

import cz.mka.beerbanana.domain.to.DrinkTypeDTO;

public interface DrinkTypeService {

    DrinkTypeDTO save(DrinkTypeDTO alcohol);

    Set<DrinkTypeDTO> findAll();

    DrinkTypeDTO findOne(Long id);

    void delete(Long id);

}
