package cz.mka.impl;

import cz.mka.api.AlcoholService;
import cz.mka.impl.dao.AlcoholDao;
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

    public Set<Alcohol> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertAlcoholDTO).collect(Collectors.toSet());
    }

    public Set<Alcohol> findAllByType(AlcoholType type) {
        return dao.findAllByType(type);
    }

    public Set<Alcohol> findAllByTitle(String title) {
        return dao.findAllByTitle(title);
    }

    public Alcohol findOne(Long id) {
        return AlcoholConverter.convertAlcoholDTO(dao.findOne(id));
    }
}
