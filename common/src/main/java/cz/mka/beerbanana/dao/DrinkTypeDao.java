package cz.mka.beerbanana.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mka.beerbanana.domain.consumption.DrinkType;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface DrinkTypeDao extends JpaRepository<DrinkType, Long> {

}
