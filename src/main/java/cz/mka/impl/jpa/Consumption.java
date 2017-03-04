package cz.mka.impl.jpa;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * JPA entity.
 * 
 * Represents a single drink consumption by a consumer.
 * 
 * @author Alexandr Sevrjukov
 *
 */
@Entity
@Table(name = "CONSUMPTION")
public class Consumption {

	@Id
	@Column(name = "CONSUMPTION_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CONSUMER_ID", nullable = false)
	private Consumer consumer;

	@ManyToOne
	@JoinColumn(name = "DRINK_TYPE_ID", nullable = false)
	private DrinkType drinkType;

	@Column(name = "CONSUMPTION_TIME", nullable = false)
//	@Temporal(value = TemporalType.TIMESTAMP)
	private LocalTime consumptionTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
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
