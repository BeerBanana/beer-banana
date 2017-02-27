package cz.mka.impl.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Objects;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represent a type of drink (such as Vodka, Beer, etc).
 */
@Entity
@Table(name = "DRINK_TYPE")
public class DrinkType {

	//TODO: explicitly specify DB column names
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DRINK_TYPE_ID")
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private Double volume;
	
	@Column
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

	public Double getCapacity() {
		return percentage;
	}

	public void setCapacity(Double capacity) {
		this.percentage = capacity;
	}

	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		DrinkType alcoholDTO = (DrinkType) o;
		return Objects.equal(id, alcoholDTO.id) && Objects.equal(title, alcoholDTO.title)
				&& Objects.equal(volume, alcoholDTO.volume) && Objects.equal(percentage, alcoholDTO.percentage);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, title, volume, percentage);
	}
}
