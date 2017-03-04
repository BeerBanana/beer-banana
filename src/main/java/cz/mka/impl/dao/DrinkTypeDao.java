package cz.mka.impl.dao;

import cz.mka.impl.jpa.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface DrinkTypeDao extends JpaRepository<DrinkType, Long> {

    Set<DrinkType> findAllByTitle(String title);

    Set<DrinkType> findAllByPercentage(Double percentage);

    Set<DrinkType> findAllByConsumerId(Long drinkerId);

}
