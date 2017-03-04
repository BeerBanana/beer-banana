package cz.mka.impl;

import cz.mka.api.AlcoholService;
import cz.mka.impl.dao.DrinkTypeDao;
import cz.mka.impl.jpa.DrinkType;
import cz.mka.impl.utils.AlcoholConverter;
import cz.mka.rest.model.DrinkTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Component
public class AlcoholServiceImpl implements AlcoholService {

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
