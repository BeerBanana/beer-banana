package cz.mka.impl.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mka.impl.jpa.DrinkType;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface DrinkTypeDao extends JpaRepository<DrinkType, Long> {


    Set<DrinkType> findAllByTitle(String title);

    Set<DrinkType> findAllByVolume(Double volume);

    Set<DrinkType> findAllByDrinkerId(Long drinkerId);

}
