package cz.mka.api;

import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Service
public interface AlcoholService {

    Set<Alcohol> findAll();

    Set<Alcohol> findAllByType(AlcoholType type);

    Set<Alcohol> findAllByTitle(String title);

    Alcohol findOne(Long id);

}
