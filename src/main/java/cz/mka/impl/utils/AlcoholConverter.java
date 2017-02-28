package cz.mka.impl.utils;

import cz.mka.impl.jpa.DrinkType;
import cz.mka.impl.jpa.Drinker;
import cz.mka.rest.model.AlcoholDTO;
import cz.mka.rest.model.DrinkerDTO;

/**
 * Created by Martin Kaspar on 25/02/2017.
 */
public class AlcoholConverter {

    /**
     * todo
     * @param dto
     * @return
     */
    public static AlcoholDTO convertAlcoholDTO(DrinkType dto) {
        AlcoholDTO result = new AlcoholDTO();

        result.setId(dto.getId());
        result.setTitle(dto.getTitle());
        result.setVolume(dto.getVolume());
        result.setCapacity(dto.getCapacity());

        // TODO DRINKERS

        return result;
    }

    /**
     * Converts Alcohol object into AlcoholDTO.
     * @param alcohol Alcohol
     * @return AlcoholDTO
     */
    public static DrinkType convertAlcohol(AlcoholDTO alcohol) {
        DrinkType dto = new DrinkType();

        dto.setId(alcohol.getId());
        dto.setTitle(alcohol.getTitle());
        dto.setVolume(alcohol.getVolume());
        dto.setCapacity(alcohol.getCapacity());

        if (alcohol.getDrinkers() == null || alcohol.getDrinkers().isEmpty()) {
            return dto;
        }

    

        return dto;
    }

    /**
     * todo
     * @param dto
     * @return
     */
    public static DrinkerDTO convertDrinkerDTO(Drinker dto) {
        DrinkerDTO result = new DrinkerDTO();

        result.setId(dto.getId());
        result.setFirstName(dto.getFirstName());
        result.setLastName(dto.getLastName());
        result.setNickname(dto.getNickName());
        result.setDateRegistration(dto.getDateRegistration());
        result.setComment(dto.getComment());

        return result;
    }

    /**
     * todo
     * @param drinker
     * @return
     */
    public static Drinker convertDrinker(DrinkerDTO drinker) {
        Drinker dto = new Drinker();

        dto.setId(drinker.getId());
        dto.setFirstName(drinker.getFirstName());
        dto.setLastName(drinker.getLastName());
        dto.setNickName(drinker.getLastName());
        dto.setDateRegistration(drinker.getDateRegistration());
        dto.setComment(drinker.getComment());

        // TODO SET ALCOHOL DROS

        return dto;
    }
}
