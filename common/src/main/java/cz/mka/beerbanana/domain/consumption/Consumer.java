package cz.mka.beerbanana.domain.consumption;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import cz.mka.beerbanana.converter.LocalDateTimeConverter;
import cz.mka.beerbanana.domain.enums.ConsumerStatus;

/**
 * JPA entity.
 * 
 * Represents a user (a person) who consumes drinks.
 */
@Entity
@Table(name = "CONSUMER")
public class Consumer {

	private Long id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private ConsumerStatus status;
	private LocalDateTime dateRegistration;
	private String quote;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONSUMER_ID", columnDefinition = "serial")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "FIRST_NAME")
	@Size(max = 30)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME")
	@Size(max = 30)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "NICK_NAME", nullable = false)
	@Size(max = 30)
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "EMAIL", nullable = false, unique = true)
	@Size(max = 30)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "STATUS", nullable = false)
	@Enumerated(value = EnumType.STRING)
	public ConsumerStatus getStatus() {
		return status;
	}

	public void setStatus(ConsumerStatus status) {
		this.status = status;
	}

	@Column(name = "DATE_REGISTRATION", columnDefinition = "timestamp without time zone", nullable = false)
	@Convert(converter = LocalDateTimeConverter.class)
	public LocalDateTime getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(LocalDateTime dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	@Column(name = "QUOTE")
	@Size(max = 300)
	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
