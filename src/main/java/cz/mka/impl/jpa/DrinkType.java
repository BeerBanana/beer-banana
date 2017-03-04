package cz.mka.impl.jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import cz.mka.rest.model.DrinkCategory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represent a type of drink (such as Vodka, Beer, etc).
 */
@Entity
@Table(name = "DRINK_TYPE")
public class DrinkType {

	@Id
	@Column(name = "DRINK_TYPE_ID")
	private Long id;

	@JsonIgnore
	private Long consumerId;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "CATEGORY")
	private DrinkCategory category;
	
	@Column(name = "VOLUME")
	private Double volume;
	
	@Column(name = "PERCENTAGE")
	private Double percentage;

	public DrinkType() {
	}

	public DrinkType(Long id, Long consumerId, String title, DrinkCategory category, Double volume, Double percentage) {
		this.id = id;
		this.consumerId = consumerId;
		this.title = title;
		this.category = category;
		this.volume = volume;
		this.percentage = percentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DrinkCategory getCategory() {
		return category;
	}

	public void setCategory(DrinkCategory category) {
		this.category = category;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DrinkType drinkType = (DrinkType) o;
		return Objects.equal(id, drinkType.id) &&
				Objects.equal(consumerId, drinkType.consumerId) &&
				Objects.equal(title, drinkType.title) &&
				Objects.equal(category, drinkType.category) &&
				Objects.equal(volume, drinkType.volume) &&
				Objects.equal(percentage, drinkType.percentage);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, consumerId, title, category, volume, percentage);
	}

}
