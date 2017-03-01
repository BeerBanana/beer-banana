package cz.mka.impl.jpa;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * JPA entity.
 * 
 * Represents a single drink consumption by a drinker.
 * 
 * @author Alexandr Sevrjukov
 *
 */
@Entity
@Table(name = "CONSUMPTION")
public class Consumption {

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name = "DRINKER_ID", nullable = false)
	private Drinker drinker;

	@ManyToOne
	@JoinColumn(name = "DRINK_TYPE_ID", nullable = false)
	private DrinkType drinkType;

	@Column(name = "CONSUMPTION_TIME")
	@Temporal(value = TemporalType.TIMESTAMP)
	private LocalTime consumptionTime;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Drinker getDrinker() {
		return drinker;
	}

	public void setDrinker(Drinker drinker) {
		this.drinker = drinker;
	}

	public DrinkType getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(DrinkType drinkType) {
		this.drinkType = drinkType;
	}

	public LocalTime getConsumptionTime() {
		return consumptionTime;
	}

	public void setConsumptionTime(LocalTime consumptionTime) {
		this.consumptionTime = consumptionTime;
	}

}
