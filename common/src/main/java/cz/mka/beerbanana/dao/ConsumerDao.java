package cz.mka.beerbanana.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mka.beerbanana.domain.consumption.Consumer;

/**
 * Created by Martin Kaspar on 26/02/2017.
 */
public interface ConsumerDao extends JpaRepository<Consumer, Long> {

    Consumer findByEmail(String email);

}
