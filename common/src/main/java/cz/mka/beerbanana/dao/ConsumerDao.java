package cz.mka.beerbanana.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mka.beerbanana.domain.consumption.Consumer;

public interface ConsumerDao extends JpaRepository<Consumer, Long> {

    Consumer findByEmail(String email);

}
