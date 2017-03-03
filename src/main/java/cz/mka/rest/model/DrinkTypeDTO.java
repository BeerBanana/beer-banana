package cz.mka.rest.model;

import com.google.common.base.Objects;

import java.util.List;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class DrinkTypeDTO {

	private Long id;
	private String title;
	private Double volume;
	private Double percentage;
	private List<DrinkerDTO> drinkers; // todo mka

	public DrinkTypeDTO() {
	}

	public DrinkTypeDTO(String title, double volume, double percentage) {
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

	public List<DrinkerDTO> getDrinkers() {
		return drinkers;
	}

	public void setDrinkers(List<DrinkerDTO> drinkers) {
		this.drinkers = drinkers;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DrinkTypeDTO that = (DrinkTypeDTO) o;
		return Objects.equal(id, that.id) &&
				Objects.equal(title, that.title) &&
				Objects.equal(volume, that.volume) &&
				Objects.equal(percentage, that.percentage) &&
				Objects.equal(drinkers, that.drinkers);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, title, volume, percentage, drinkers);
	}
}
