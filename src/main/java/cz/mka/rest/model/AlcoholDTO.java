package cz.mka.rest.model;

import com.google.common.base.Objects;

import java.util.List;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class AlcoholDTO {

	private Long id;
	private String title;
	private Double volume;
	private Double capacity;
	private List<DrinkerDTO> drinkers;

	public AlcoholDTO() {
	}

	public AlcoholDTO(String title, double volume, double capacity) {
		this.title = title;
		this.volume = volume;
		this.capacity = capacity;
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
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public List<DrinkerDTO> getDrinkers() {
		return drinkers;
	}

	public void setDrinkers(List<DrinkerDTO> drinkers) {
		this.drinkers = drinkers;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		AlcoholDTO alcohol = (AlcoholDTO) o;
		return Objects.equal(id, alcohol.id) && Objects.equal(title, alcohol.title)
				&& Objects.equal(volume, alcohol.volume) && Objects.equal(capacity, alcohol.capacity)
				&& Objects.equal(drinkers, alcohol.drinkers);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, title, volume, capacity, drinkers);
	}
}
