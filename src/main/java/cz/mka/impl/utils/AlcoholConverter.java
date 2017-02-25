package cz.mka.impl.utils;

import cz.mka.impl.jpa.AlcoholDTO;
import cz.mka.impl.jpa.DrinkerDTO;
import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.Drinker;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Martin Kaspar on 25/02/2017.
 */
public class AlcoholConverter {

    public static Alcohol convertAlcoholDTO(AlcoholDTO dto) {
        Alcohol result = new Alcohol();

        result.setId(dto.getId());
        result.setTitle(dto.getTitle());
        result.setType(dto.getType());
        result.setVolume(dto.getVolume());
        result.setCapacity(dto.getCapacity());

        // TODO DRINKERS

        return result;
    }

    public static AlcoholDTO convertAlcohol(Alcohol alcohol) {
        AlcoholDTO dto = new AlcoholDTO();

        dto.setId(alcohol.getId());
        dto.setTitle(alcohol.getTitle());
        dto.setType(alcohol.getType());
        dto.setVolume(alcohol.getVolume());
        dto.setCapacity(alcohol.getCapacity());

        Set<DrinkerDTO> drinkerDTOs =
                alcohol.getDrinkers().stream().map(AlcoholConverter::convertDrinker)
                        .collect(Collectors.toSet());

        dto.setDrinkerDTOs(drinkerDTOs);

        return dto;
    }

    public static Drinker convertDrinkerDTO(DrinkerDTO dto) {
        Drinker result = new Drinker();

        result.setId(dto.getId());
        result.setFirstName(dto.getFirstName());
        result.setLastName(dto.getLastName());
        result.setNickname(dto.getNickName());
        result.setDateRegistration(dto.getDateRegistration());
        result.setComment(dto.getComment());

        return result;
    }

    public static DrinkerDTO convertDrinker(Drinker drinker) {
        DrinkerDTO dto = new DrinkerDTO();

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
