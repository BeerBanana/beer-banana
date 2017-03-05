package cz.mka.api;

import cz.mka.rest.model.DrinkTypeDTO;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 */

//TODO - refactoring (due to entities and DTO renaming)
// TODO - update interface in accordance to functional specification

@Service
public interface DrinkTypeService {


    DrinkTypeDTO save(DrinkTypeDTO alcohol);


    Set<DrinkTypeDTO> findAll();


    DrinkTypeDTO findOne(Long id);


    void delete(Long id);

}
