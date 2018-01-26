package cz.mka.beerbanana.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mka.beerbanana.domain.consumption.DrinkType;

public interface DrinkTypeDao extends JpaRepository<DrinkType, Long> {

}
