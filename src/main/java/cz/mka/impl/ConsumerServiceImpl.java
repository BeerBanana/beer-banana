package cz.mka.impl;

import cz.mka.api.ConsumerService;
import cz.mka.impl.dao.ConsumerDao;
import cz.mka.impl.jpa.Consumer;
import cz.mka.impl.utils.AlcoholConverter;
import cz.mka.rest.model.ConsumerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by martin on 5.3.2017.
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerDao dao;

    public ConsumerDTO save(ConsumerDTO dto) {
        Consumer result = dao.save(AlcoholConverter.convertDTOIntoConsumer(dto));
        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public Set<ConsumerDTO> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertConsumerIntoDTO).collect(Collectors.toSet());
    }

    public ConsumerDTO findOne(Long id) {
        return AlcoholConverter.convertConsumerIntoDTO(dao.findOne(id));
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
