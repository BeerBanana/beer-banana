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
public interface AlcoholService {

    /**
     * Saves or updates alcohol object.
     * @param alcohol Alcohol
     * @return Alcohol
     */
    DrinkTypeDTO save(DrinkTypeDTO alcohol);

    /**
     * Retrieves all alcohol objects.
     * @return set of alcohols
     */
    Set<DrinkTypeDTO> findAll();

/*    *//**
     * Retrieves all alcohols by title.
     * @param title String title
     * @return set of alcohols
     *//*
    Set<DrinkTypeDTO> findAllByTitle(String title);

    *//**
     * Retrieves all alcohols by percentage.
     * @param percentage Double alcohol percentage
     * @return set of alcohols
     *//*
    Set<DrinkTypeDTO> findAllByPercentage(Double percentage);

    *//**
     * Retrieves all alcohols by drinker id.
     * @param drinkerId Long id of drinker
     * @return set of alcohols
     *//*
    Set<DrinkTypeDTO> findAllByConsumerId(Long drinkerId);*/

    /**
     * Retrieves alcohol by id.
     * @param id Long id of alcohol
     * @return Alcohol
     */
    DrinkTypeDTO findOne(Long id);

    /**
     * Deletes alcohol object.
     * @param id Long id of object
     */
    void delete(Long id);

}
