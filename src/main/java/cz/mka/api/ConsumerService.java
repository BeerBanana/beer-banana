package cz.mka.api;

import cz.mka.rest.model.ConsumerDTO;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by martin on 5.3.2017.
 */
@Service
public interface ConsumerService {


    ConsumerDTO save(ConsumerDTO alcohol);


    Set<ConsumerDTO> findAll();


    ConsumerDTO findOne(Long id);


    void delete(Long id);
}
