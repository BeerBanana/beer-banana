package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Entity
@Table(name = "alcohol")
public class AlcoholDTO {

    private Long id;
    private String title;
    private String type;
    private Double volume;
    private Double capacity;
    private Set<DrinkerDTO> drinkerDTOs;

    public AlcoholDTO() {
    }

    public AlcoholDTO(String title, String type, Double volume, Double capacity, Set<DrinkerDTO> drinkerDTOs) {
        this.title = title;
        this.type = type;
        this.volume = volume;
        this.capacity = capacity;
        this.drinkerDTOs = drinkerDTOs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToMany(mappedBy = "alcohol")
    public Set<DrinkerDTO> getDrinkerDTOs() {
        return drinkerDTOs;
    }

    public void setDrinkerDTOs(Set<DrinkerDTO> drinkerDTOs) {
        this.drinkerDTOs = drinkerDTOs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlcoholDTO alcoholDTO = (AlcoholDTO) o;
        return Objects.equal(id, alcoholDTO.id) &&
                Objects.equal(title, alcoholDTO.title) &&
                Objects.equal(type, alcoholDTO.type) &&
                Objects.equal(volume, alcoholDTO.volume) &&
                Objects.equal(capacity, alcoholDTO.capacity) &&
                Objects.equal(drinkerDTOs, alcoholDTO.drinkerDTOs);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, type, volume, capacity, drinkerDTOs);
    }
}
