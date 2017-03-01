package cz.mka.impl.jpa;

import com.google.common.base.Objects;
import cz.mka.rest.model.DrinkerStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represents a user (a person) who consumes drinks.
 */
@Entity
@Table(name = "DRINKER")
public class Drinker {

	@Id
	@Column(name = "DRINKER_ID")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "NICK_NAME")
	private String nickName;

	@Column(name = "STATUS")
	private DrinkerStatus status;
	
	@Column(name = "DATE_REGISTRATION")
	private LocalDateTime dateRegistration;
	
	@Column(name = "COMMENT")
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public DrinkerStatus getStatus() {
		return status;
	}

	public void setStatus(DrinkerStatus status) {
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
		Drinker drinker = (Drinker) o;
		return Objects.equal(id, drinker.id) &&
				Objects.equal(firstName, drinker.firstName) &&
				Objects.equal(lastName, drinker.lastName) &&
				Objects.equal(nickName, drinker.nickName) &&
				Objects.equal(status, drinker.status) &&
				Objects.equal(dateRegistration, drinker.dateRegistration) &&
				Objects.equal(comment, drinker.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, firstName, lastName, nickName, status, dateRegistration, comment);
	}
}
