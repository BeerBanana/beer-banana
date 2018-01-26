package cz.mka.beerbanana.service;

import org.springframework.stereotype.Service;

import java.util.Set;

import cz.mka.beerbanana.domain.to.ConsumerDTO;

/**
 * Created by martin on 5.3.2017.
 */
@Service
public interface ConsumerService {


    ConsumerDTO save(ConsumerDTO alcohol);


    Set<ConsumerDTO> findAll();


    ConsumerDTO findOne(Long id);


    ConsumerDTO findByEmail(String email);


    void delete(Long id);
}
