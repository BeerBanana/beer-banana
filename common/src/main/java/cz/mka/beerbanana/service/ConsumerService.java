package cz.mka.beerbanana.service;

import java.util.Set;

import cz.mka.beerbanana.domain.to.ConsumerDTO;

public interface ConsumerService {

    ConsumerDTO save(ConsumerDTO alcohol);

    Set<ConsumerDTO> findAll();

    ConsumerDTO findOne(Long id);

    ConsumerDTO findByEmail(String email);

    void delete(Long id);
}
