package cz.mka.rest.model;

import com.google.common.base.Objects;

import java.time.LocalDateTime;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
public class Drinker {

    private Long id;
    private String firstName;
    private String lastName;
    private String nickname;
    private LocalDateTime dateRegistration;
    private String comment;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDateTime getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDateTime dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinker drinker = (Drinker) o;
        return Objects.equal(id, drinker.id) &&
                Objects.equal(firstName, drinker.firstName) &&
                Objects.equal(lastName, drinker.lastName) &&
                Objects.equal(nickname, drinker.nickname) &&
                Objects.equal(dateRegistration, drinker.dateRegistration) &&
                Objects.equal(comment, drinker.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, nickname, dateRegistration, comment);
    }
}
