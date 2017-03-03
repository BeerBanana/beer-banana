package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.*;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represent a type of drink (such as Vodka, Beer, etc).
 */
@Entity
@Table(name = "DRINK_TYPE")
public class DrinkType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DRINK_TYPE_ID")
	private Long id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "VOLUME")
	private Double volume;
	
	@Column(name = "PERCENTAGE")
	private Double percentage;

	public DrinkType() {
	}

	
	public DrinkType(String title, Double volume, Double percentage) {
		this.title = title;
		this.volume = volume;
		this.percentage = percentage;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
				Objects.equal(title, drinkType.title) &&
				Objects.equal(volume, drinkType.volume) &&
				Objects.equal(percentage, drinkType.percentage);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, title, volume, percentage);
	}

}
