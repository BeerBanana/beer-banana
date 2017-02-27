package cz.mka.impl;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import cz.mka.api.AlcoholService;
import cz.mka.impl.dao.DrinkTypeDao;
import cz.mka.impl.jpa.DrinkType;
import cz.mka.impl.utils.AlcoholConverter;
import cz.mka.rest.model.AlcoholDTO;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class AlcoholServiceImpl implements AlcoholService {

    @Autowired
    private DrinkTypeDao dao;

    public AlcoholDTO save(AlcoholDTO alcohol) {
        DrinkType result = dao.save(AlcoholConverter.convertAlcohol(alcohol));
        return AlcoholConverter.convertAlcoholDTO(result);
    }

    public Set<AlcoholDTO> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    

    public Set<AlcoholDTO> findAllByTitle(String title) {
        return dao.findAllByTitle(title).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<AlcoholDTO> findAllByVolume(Double volume) {
        return dao.findAllByVolume(volume).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<AlcoholDTO> findAllByDrinkerId(Long drinkerId) {
        return dao.findAllByDrinkerId(drinkerId).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public AlcoholDTO findOne(Long id) {
        return AlcoholConverter.convertAlcoholDTO(dao.findOne(id));
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
