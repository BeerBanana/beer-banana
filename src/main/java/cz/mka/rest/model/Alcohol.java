package cz.mka.rest.model;

import com.google.common.base.Objects;

import java.util.List;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class Alcohol {

    private Long id;
    private String title;
    private String type;
    private Double volume;
    private Double capacity;
    private List<Drinker> drinkers;

    public Alcohol() {
    }

    public Alcohol(String title, String type, double volume, double capacity) {
        this.title = title;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public List<Drinker> getDrinkers() {
        return drinkers;
    }

    public void setDrinkers(List<Drinker> drinkers) {
        this.drinkers = drinkers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alcohol alcohol = (Alcohol) o;
        return Objects.equal(id, alcohol.id) &&
                Objects.equal(title, alcohol.title) &&
                Objects.equal(type, alcohol.type) &&
                Objects.equal(volume, alcohol.volume) &&
                Objects.equal(capacity, alcohol.capacity) &&
                Objects.equal(drinkers, alcohol.drinkers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, type, volume, capacity, drinkers);
    }
}
