package cz.mka.beerbanana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

import cz.mka.beerbanana.converter.AlcoholConverter;
import cz.mka.beerbanana.dao.ConsumerDao;
import cz.mka.beerbanana.domain.consumption.Consumer;
import cz.mka.beerbanana.domain.to.ConsumerTO;
import cz.mka.beerbanana.exception.DataConflictException;
import cz.mka.beerbanana.exception.ItemNotFoundException;

@Service
public class ConsumerServiceDefault implements ConsumerService {

    @Autowired
    private ConsumerDao dao;

    public ConsumerTO save(ConsumerTO dto) {
        dto.setEmail(dto.getEmail().trim().toLowerCase());

        Consumer currentConsumer = dao.findByEmail(dto.getEmail());

        if (dto.getId() == null && currentConsumer != null) {
            throw new DataConflictException();
        }

        Consumer result = dao.save(AlcoholConverter.convertDTOIntoConsumer(dto));
        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public Set<ConsumerTO> findAll() {
        return dao.findAll().stream()
            .map(AlcoholConverter::convertConsumerIntoDTO).collect(Collectors.toSet());
    }

    public ConsumerTO findOne(Long id) {

        Consumer result = dao.findOne(id);

        if (result == null) {
            throw new ItemNotFoundException();
        }
        return AlcoholConverter.convertConsumerIntoDTO(result);
    }

    public ConsumerTO findByEmail(String email) {
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
