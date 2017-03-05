package cz.mka.impl.dao;

import cz.mka.impl.jpa.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public interface DrinkTypeDao extends JpaRepository<DrinkType, Long> {

}
