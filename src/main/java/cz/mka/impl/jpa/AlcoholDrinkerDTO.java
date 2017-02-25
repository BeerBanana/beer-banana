package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Entity
@Table(name = "alcohol_drinker")
public class AlcoholDrinkerDTO implements Serializable {

    private Long alcoholId;
    private Long drinkerId;

    @Id
    @ManyToOne
    @JoinColumn(name = "alcohol_id")
    public Long getAlcoholId() {
        return alcoholId;
    }

    public void setAlcoholId(Long alcoholId) {
        this.alcoholId = alcoholId;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "drinker_id")
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
        AlcoholDrinkerDTO that = (AlcoholDrinkerDTO) o;
        return Objects.equal(alcoholId, that.alcoholId) &&
                Objects.equal(drinkerId, that.drinkerId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alcoholId, drinkerId);
    }
}
