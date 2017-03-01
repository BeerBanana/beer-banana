package cz.mka.impl.utils;

import cz.mka.impl.jpa.DrinkType;
import cz.mka.impl.jpa.Drinker;
import cz.mka.rest.model.DrinkTypeDTO;
import cz.mka.rest.model.DrinkerDTO;

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
        drinkType.setVolume(dto.getVolume());
        drinkType.setPercentage(dto.getPercentage());

        return drinkType;
    }

    /**
     * Converts Drinker into DrinkerDTO.
     * @param drinker Drinker
     * @return DrinkerDTO
     */
    public static DrinkerDTO convertDrinkerIntoDTO(Drinker drinker) {
        DrinkerDTO dto = new DrinkerDTO();

        dto.setId(drinker.getId());
        dto.setFirstName(drinker.getFirstName());
        dto.setLastName(drinker.getLastName());
        dto.setNickname(drinker.getNickName());
        dto.setStatus(drinker.getStatus());
        dto.setDateRegistration(drinker.getDateRegistration());
        dto.setComment(drinker.getComment());

        return dto;
    }

    /**
     * Converts DrinkerDTO into Drinker.
     * @param dto DrinkerDTO
     * @return Drinker
     */
    public static Drinker convertDTOIntoDrinker(DrinkerDTO dto) {
        Drinker drinker = new Drinker();

        drinker.setId(dto.getId());
        drinker.setFirstName(dto.getFirstName());
        drinker.setLastName(dto.getLastName());
        drinker.setNickName(dto.getNickname());
        drinker.setStatus(dto.getStatus());
        drinker.setDateRegistration(dto.getDateRegistration());
        drinker.setComment(dto.getComment());

        // TODO SET ALCOHOL DROS

        return drinker;
    }
}
