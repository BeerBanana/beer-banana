package cz.mka.api;

import java.util.Set;

import org.springframework.stereotype.Service;

import cz.mka.rest.model.AlcoholDTO;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 */
@Service
//TODO - refactoring (due to entities and DTO renaming)
// TODO - update interface in accordance to functional specification
public interface AlcoholService {

    /**
     * Saves or updates alcohol object.
     * @param alcohol Alcohol
     * @return Alcohol
     */
    AlcoholDTO save(AlcoholDTO alcohol);

    /**
     * Retrieves all alcohol objects.
     * @return set of alcohols
     */
    Set<AlcoholDTO> findAll();

    /**
     * Retrieves all alcohols by type.
     * @param type AlcoholType type
     * @return set of alcohols
     */

    /**
     * Retrieves all alcohols by title.
     * @param title String title
     * @return set of alcohols
     */
    Set<AlcoholDTO> findAllByTitle(String title);

    /**
     * Retrieves all alcohols by volume.
     * @param volume Double volume amount
     * @return set of alcohols
     */
    Set<AlcoholDTO> findAllByVolume(Double volume);

    /**
     * Retrieves all alcohols by drinker id.
     * @param drinkerId Long id of drinker
     * @return set of alcohols
     */
    Set<AlcoholDTO> findAllByDrinkerId(Long drinkerId);

    /**
     * Retrieves alcohol by id.
     * @param id Long id of alcohol
     * @return Alcohol
     */
    AlcoholDTO findOne(Long id);

    /**
     * Deletes alcohol object.
     * @param id Long id of object
     */
    void delete(Long id);

}
