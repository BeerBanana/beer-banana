package cz.mka.impl.dao;

import cz.mka.impl.jpa.AlcoholDTO;
import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface AlcoholDao extends JpaRepository<AlcoholDTO, Long> {

    Set<Alcohol> findAllByType(AlcoholType type);

    Set<Alcohol> findAllByTitle(String title);


}
