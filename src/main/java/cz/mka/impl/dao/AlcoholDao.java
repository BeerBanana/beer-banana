package cz.mka.impl.dao;

import cz.mka.impl.jpa.AlcoholDTO;
import cz.mka.rest.model.AlcoholType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface AlcoholDao extends JpaRepository<AlcoholDTO, Long> {

    Set<AlcoholDTO> findAllByType(AlcoholType type);

    Set<AlcoholDTO> findAllByTitle(String title);

    Set<AlcoholDTO> findAllByVolume(Double volume);

    Set<AlcoholDTO> findAllByDrinkerId(Long drinkerId);

}
