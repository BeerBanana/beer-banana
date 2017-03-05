package cz.mka.impl.jpa;

import com.google.common.base.Objects;
import cz.mka.impl.utils.LocalDateTimeConverter;
import cz.mka.rest.model.ConsumerStatus;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * Created by Martin Kaspar on 24/02/2017.
 * 
 * Represents a user (a person) who consumes drinks.
 */
@Entity
@Table(name = "CONSUMER")
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONSUMER_ID", columnDefinition = "serial")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	@Size(max = 30)
	private String firstName;
	
	@Column(name = "LAST_NAME")
	@Size(max = 30)
	private String lastName;
	
	@Column(name = "NICK_NAME", nullable = false)
	@Size(max = 30)
	private String nickName;

	@Column(name = "EMAIL", nullable = false)
	@Size(max = 30)
	private String email;

	@Column(name = "STATUS", nullable = false)
	@Size(max = 30)
	private ConsumerStatus status;
	
	@Column(name = "DATE_REGISTRATION", columnDefinition = "timestamp without time zone", nullable = false)
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime dateRegistration;
	
	@Column(name = "QUOTE")
	@Size(max = 300)
	private String quote;

	public Consumer() {
	}

	public Consumer(Long id, String firstName, String lastName, String nickName, String email, ConsumerStatus status, LocalDateTime dateRegistration, String quote) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.status = status;
		this.dateRegistration = dateRegistration;
		this.quote = quote;
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

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Consumer consumer = (Consumer) o;
		return Objects.equal(id, consumer.id) &&
				Objects.equal(firstName, consumer.firstName) &&
				Objects.equal(lastName, consumer.lastName) &&
				Objects.equal(nickName, consumer.nickName) &&
				Objects.equal(email, consumer.email) &&
				Objects.equal(status, consumer.status) &&
				Objects.equal(dateRegistration, consumer.dateRegistration) &&
				Objects.equal(quote, consumer.quote);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, firstName, lastName, nickName, email, status, dateRegistration, quote);
	}
}
