package cz.mka.beerbanana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

import cz.mka.beerbanana.converter.AlcoholConverter;
import cz.mka.beerbanana.dao.DrinkTypeDao;
import cz.mka.beerbanana.domain.consumption.DrinkType;
import cz.mka.beerbanana.domain.to.DrinkTypeTO;

@Service
public class DrinkTypeServiceDefault implements DrinkTypeService {

    @Autowired
    private DrinkTypeDao dao;

    public DrinkTypeTO save(DrinkTypeTO alcohol) {
        DrinkType result = dao.save(AlcoholConverter.convertDTOIntoDrinkType(alcohol));
        return AlcoholConverter.convertDrinkTypeIntoDTO(result);
    }

    public Set<DrinkTypeTO> findAll() {
        return dao.findAll().stream()
            .map(AlcoholConverter::convertDrinkTypeIntoDTO).collect(Collectors.toSet());
    }

    public DrinkTypeTO findOne(Long id) {
        return AlcoholConverter.convertDrinkTypeIntoDTO(dao.findOne(id));
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
