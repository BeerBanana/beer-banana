package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Entity
@Table(name = "ALCOHOL_DRINKER")
public class AlcoholDrinker {

    private Long alcoholId;
    private Long drinkerId;

    public Long getAlcoholId() {
        return alcoholId;
    }

    public void setAlcoholId(Long alcoholId) {
        this.alcoholId = alcoholId;
    }

    public Long getDrinkerId() {
        return drinkerId;
    }

    public void setDrinkerId(Long drinkerId) {
        this.drinkerId = drinkerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlcoholDrinker that = (AlcoholDrinker) o;
        return Objects.equal(alcoholId, that.alcoholId) &&
                Objects.equal(drinkerId, that.drinkerId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alcoholId, drinkerId);
    }
}
