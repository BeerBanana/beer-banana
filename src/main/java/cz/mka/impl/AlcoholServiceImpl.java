package cz.mka.impl;

import cz.mka.api.AlcoholService;
import cz.mka.impl.dao.AlcoholDao;
import cz.mka.impl.jpa.AlcoholDTO;
import cz.mka.impl.utils.AlcoholConverter;
import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class AlcoholServiceImpl implements AlcoholService {

    @Autowired
    private AlcoholDao dao;

    public Alcohol save(Alcohol alcohol) {
        AlcoholDTO result = dao.save(AlcoholConverter.convertAlcohol(alcohol));
        return AlcoholConverter.convertAlcoholDTO(result);
    }

    public Set<Alcohol> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<Alcohol> findAllByType(AlcoholType type) {
        return dao.findAllByType(type).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<Alcohol> findAllByTitle(String title) {
        return dao.findAllByTitle(title).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<Alcohol> findAllByVolume(Double volume) {
        return dao.findAllByVolume(volume).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<Alcohol> findAllByDrinkerId(Long drinkerId) {
        return dao.findAllByDrinkerId(drinkerId).stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Alcohol findOne(Long id) {
        return AlcoholConverter.convertAlcoholDTO(dao.findOne(id));
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
