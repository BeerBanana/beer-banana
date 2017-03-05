package cz.mka.impl.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by martin on 5.3.2017.
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
        return (localDateTime == null ? null : Timestamp.valueOf(localDateTime));
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {
        return (timestamp == null ? null : timestamp.toLocalDateTime());
    }

}
