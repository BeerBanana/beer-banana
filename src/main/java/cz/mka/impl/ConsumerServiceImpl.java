package cz.mka.impl;

import cz.mka.api.ConsumerService;
import cz.mka.impl.dao.ConsumerDao;
import cz.mka.impl.exceptions.DataConflictException;
import cz.mka.impl.exceptions.ItemNotFoundException;
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
        dto.setEmail(dto.getEmail().trim().toLowerCase());

        Consumer currentConsumer = dao.findByEmail(dto.getEmail());

        if (dto.getId() == null && currentConsumer != null) {
            throw new DataConflictException();
        }

        Consumer result = dao.save(AlcoholConverter.convertDTOIntoConsumer(dto));
        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public Set<ConsumerDTO> findAll() {
        return dao.findAll().stream()
                .map(AlcoholConverter::convertConsumerIntoDTO).collect(Collectors.toSet());
    }

    public ConsumerDTO findOne(Long id) {

        Consumer result = dao.findOne(id);

        if (result == null) {
            throw new ItemNotFoundException();
        }
        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public ConsumerDTO findByEmail(String email) {
        Consumer result = dao.findByEmail(email.trim().toLowerCase());
        if (result == null) {
            throw new ItemNotFoundException();
        }

        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
