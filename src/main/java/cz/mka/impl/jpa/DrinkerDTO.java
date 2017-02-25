package cz.mka.impl.jpa;

import com.google.common.base.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Entity
@Table(name = "drinker")
public class DrinkerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDateTime dateRegistration;
    private String comment;
    private Set<AlcoholDTO> alcoholDTOs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDateTime dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    @OneToMany(mappedBy = "drinker", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<AlcoholDTO> getAlcoholDTOs() {
        return alcoholDTOs;
    }

    public void setAlcoholDTOs(Set<AlcoholDTO> alcoholDTOs) {
        this.alcoholDTOs = alcoholDTOs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrinkerDTO drinkerDTO = (DrinkerDTO) o;
        return Objects.equal(id, drinkerDTO.id) &&
                Objects.equal(firstName, drinkerDTO.firstName) &&
                Objects.equal(lastName, drinkerDTO.lastName) &&
                Objects.equal(nickName, drinkerDTO.nickName) &&
                Objects.equal(comment, drinkerDTO.comment) &&
                Objects.equal(dateRegistration, drinkerDTO.dateRegistration) &&
                Objects.equal(alcoholDTOs, drinkerDTO.alcoholDTOs);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, nickName, comment, dateRegistration, alcoholDTOs);
    }
}
