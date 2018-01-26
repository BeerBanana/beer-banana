package cz.mka.beerbanana.domain.to;

import com.google.common.base.Objects;

import java.time.LocalDateTime;

import cz.mka.beerbanana.domain.enums.ConsumerStatus;

public class ConsumerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private ConsumerStatus status;
    private LocalDateTime dateRegistration;
    private String comment;

    public ConsumerDTO() {
    }

    public ConsumerDTO(Long id, String firstName, String lastName, String nickName, String email, ConsumerStatus status, LocalDateTime dateRegistration, String comment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.email = email;
        this.status = status;
        this.dateRegistration = dateRegistration;
        this.comment = comment;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ConsumerStatus getStatus() {
        return status;
    }

    public void setStatus(ConsumerStatus status) {
        this.status = status;
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
        ConsumerDTO that = (ConsumerDTO) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(firstName, that.firstName) &&
                Objects.equal(lastName, that.lastName) &&
                Objects.equal(nickName, that.nickName) &&
                Objects.equal(email, that.email) &&
                Objects.equal(status, that.status) &&
                Objects.equal(dateRegistration, that.dateRegistration) &&
                Objects.equal(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, nickName, email, status, dateRegistration, comment);
    }
}
