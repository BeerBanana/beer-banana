package cz.mka.beerbanana.converter;

import cz.mka.beerbanana.domain.consumption.Consumer;
import cz.mka.beerbanana.domain.consumption.DrinkType;
import cz.mka.beerbanana.domain.to.ConsumerTO;
import cz.mka.beerbanana.domain.to.DrinkTypeTO;

public class AlcoholConverter {

    /**
     * Converts DrinkType into DrinkTypeTO.
     *
     * @param drinkType DrinkType
     * @return DrinkTypeTO
     */
    public static DrinkTypeTO convertDrinkTypeIntoDTO(DrinkType drinkType) {
        DrinkTypeTO dto = new DrinkTypeTO();

        dto.setId(drinkType.getId());
        dto.setTitle(drinkType.getTitle());
        dto.setCategory(drinkType.getCategory());
        dto.setVolume(drinkType.getVolume());
        dto.setPercentage(drinkType.getPercentage());

        return dto;
    }

    /**
     * Converts DrinkTypeTO into DrinkType.
     *
     * @param dto DrinkTypeTO
     * @return DrinkType
     */
    public static DrinkType convertDTOIntoDrinkType(DrinkTypeTO dto) {
        DrinkType drinkType = new DrinkType();

        drinkType.setId(dto.getId());
        drinkType.setTitle(dto.getTitle());
        drinkType.setCategory(dto.getCategory());
        drinkType.setVolume(dto.getVolume());
        drinkType.setPercentage(dto.getPercentage());

        return drinkType;
    }

    /**
     * Converts Consumer into ConsumerTO.
     *
     * @param consumer Consumer
     * @return ConsumerTO
     */
    public static ConsumerTO convertConsumerIntoDTO(Consumer consumer) {
        ConsumerTO dto = new ConsumerTO();

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
     * Converts ConsumerTO into Consumer.
     *
     * @param dto ConsumerTO
     * @return Consumer
     */
    public static Consumer convertDTOIntoConsumer(ConsumerTO dto) {
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
