package cz.mka.api;

import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Service
public interface AlcoholService {

    /**
     * Saves or updates alcohol object.
     * @param alcohol Alcohol
     * @return Alcohol
     */
    Alcohol save(Alcohol alcohol);

    /**
     * Retrieves all alcohol objects.
     * @return set of alcohols
     */
    Set<Alcohol> findAll();

    /**
     * Retrieves all alcohols by type.
     * @param type AlcoholType type
     * @return set of alcohols
     */
    Set<Alcohol> findAllByType(AlcoholType type);

    /**
     * Retrieves all alcohols by title.
     * @param title String title
     * @return set of alcohols
     */
    Set<Alcohol> findAllByTitle(String title);

    /**
     * Retrieves all alcohols by volume.
     * @param volume Double volume amount
     * @return set of alcohols
     */
    Set<Alcohol> findAllByVolume(Double volume);

    /**
     * Retrieves all alcohols by drinker id.
     * @param drinkerId Long id of drinker
     * @return set of alcohols
     */
    Set<Alcohol> findAllByDrinkerId(Long drinkerId);

    /**
     * Retrieves alcohol by id.
     * @param id Long id of alcohol
     * @return Alcohol
     */
    Alcohol findOne(Long id);

    /**
     * Deletes alcohol object.
     * @param id Long id of object
     */
    void delete(Long id);

}
