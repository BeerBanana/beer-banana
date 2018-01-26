package cz.mka.beerbanana.domain.consumption;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import cz.mka.beerbanana.domain.enums.DrinkCategory;

/**
 * JPA entity.
 *
 * Represent a type of drink (such as Vodka, Beer, etc).
 */
@Entity
@Table(name = "DRINK_TYPE")
public class DrinkType {

	private Long id;
	private String title;
	private DrinkCategory category;
	private Double volume;
	private Double percentage;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DRINK_TYPE_ID", columnDefinition = "serial")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TITLE")
	@Size(max = 30)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "CATEGORY")
	@Size(max = 30)
	public DrinkCategory getCategory() {
		return category;
	}

	public void setCategory(DrinkCategory category) {
		this.category = category;
	}

	@Column(name = "VOLUME")
	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name = "PERCENTAGE")
	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
