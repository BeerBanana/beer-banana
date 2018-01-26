package cz.mka.beerbanana.domain.consumption;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cz.mka.beerbanana.converter.LocalDateTimeConverter;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONSUMPTION_ID", columnDefinition = "serial")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CONSUMER_ID", nullable = false)
	private Consumer consumer;

	@ManyToOne
	@JoinColumn(name = "DRINK_TYPE_ID", nullable = false)
	private DrinkType drinkType;

	@Column(name = "CONSUMPTION_TIME", columnDefinition = "timestamp without time zone", nullable = false, updatable = false)
	@Convert(converter = LocalDateTimeConverter.class)
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
