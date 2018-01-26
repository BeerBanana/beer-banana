package cz.mka.beerbanana.converter;

import cz.mka.beerbanana.domain.consumption.Consumer;
import cz.mka.beerbanana.domain.consumption.DrinkType;
import cz.mka.beerbanana.domain.to.ConsumerDTO;
import cz.mka.beerbanana.domain.to.DrinkTypeDTO;

/**
 * Created by Martin Kaspar on 25/02/2017.
 */
public class AlcoholConverter {

    /**
     * Converts DrinkType into DrinkTypeDTO.
     * @param drinkType DrinkType
     * @return DrinkTypeDTO
     */
    public static DrinkTypeDTO convertDrinkTypeIntoDTO(DrinkType drinkType) {
        DrinkTypeDTO dto = new DrinkTypeDTO();

        dto.setId(drinkType.getId());
        dto.setTitle(drinkType.getTitle());
        dto.setCategory(drinkType.getCategory());
        dto.setVolume(drinkType.getVolume());
        dto.setPercentage(drinkType.getPercentage());

        return dto;
    }

    /**
     * Converts DrinkTypeDTO into DrinkType.
     * @param dto DrinkTypeDTO
     * @return DrinkType
     */
    public static DrinkType convertDTOIntoDrinkType(DrinkTypeDTO dto) {
        DrinkType drinkType = new DrinkType();

        drinkType.setId(dto.getId());
        drinkType.setTitle(dto.getTitle());
        drinkType.setCategory(dto.getCategory());
        drinkType.setVolume(dto.getVolume());
        drinkType.setPercentage(dto.getPercentage());

        return drinkType;
    }

    /**
     * Converts Consumer into ConsumerDTO.
     * @param consumer Consumer
     * @return ConsumerDTO
     */
    public static ConsumerDTO convertConsumerIntoDTO(Consumer consumer) {
        ConsumerDTO dto = new ConsumerDTO();

        dto.setId(consumer.getId());
        dto.setFirstName(consumer.getFirstName());
        dto.setLastName(consumer.getLastName());
        dto.setNickName(consumer.getNickName());
        dto.setStatus(consumer.getStatus());
        dto.setEmail(consumer.getEmail());
        dto.setDateRegistration(consumer.getDateRegistration());
        dto.setComment(consumer.getQuote());

        return dto;
    }

    /**
     * Converts ConsumerDTO into Consumer.
     * @param dto ConsumerDTO
     * @return Consumer
     */
    public static Consumer convertDTOIntoConsumer(ConsumerDTO dto) {
        Consumer consumer = new Consumer();

        consumer.setId(dto.getId());
        consumer.setFirstName(dto.getFirstName());
        consumer.setLastName(dto.getLastName());
        consumer.setNickName(dto.getNickName());
        consumer.setStatus(dto.getStatus());
        consumer.setEmail(dto.getEmail());
        consumer.setDateRegistration(dto.getDateRegistration());
        consumer.setQuote(dto.getComment());

        // TODO SET ALCOHOL DROS

        return consumer;
    }
}
