package cz.mka.beerbanana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

import cz.mka.beerbanana.converter.AlcoholConverter;
import cz.mka.beerbanana.dao.DrinkTypeDao;
import cz.mka.beerbanana.domain.consumption.DrinkType;
import cz.mka.beerbanana.domain.to.DrinkTypeDTO;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Component
public class DrinkTypeServiceImpl implements DrinkTypeService {

    @Autowired
    private DrinkTypeDao dao;

    public DrinkTypeDTO save(DrinkTypeDTO alcohol) {
        DrinkType result = dao.save(AlcoholConverter.convertDTOIntoDrinkType(alcohol));
        return AlcoholConverter.convertDrinkTypeIntoDTO(result);
    }

    public Set<DrinkTypeDTO> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertDrinkTypeIntoDTO).collect(Collectors.toSet());
    }

    public DrinkTypeDTO findOne(Long id) {
        return AlcoholConverter.convertDrinkTypeIntoDTO(dao.findOne(id));
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
