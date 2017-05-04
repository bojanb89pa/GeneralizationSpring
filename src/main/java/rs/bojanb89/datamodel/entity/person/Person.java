package rs.bojanb89.datamodel.entity.person;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.BaseEntity;
import rs.bojanb89.datamodel.entity.vehicle.Bus;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(Person.DISCRIMINATOR_PERSON)
public class Person extends BaseEntity {

	public static final String DISCRIMINATOR_PERSON = "PERSON";
	public static final String DISCRIMINATOR_DRIVER = "DRIVER";

	@Enumerated(EnumType.STRING)
	@Column(name = "person_type", insertable = false, updatable = false)
	@Getter
	@Setter
	protected PersonType personType;

	@Column(name = "first_name")
	@Getter
	@Setter
	private String firstName;

	@Column(name = "last_name")
	@Getter
	@Setter
	private String lastName;

	@ManyToOne
	@JoinColumn(name = "bus_id")
	@Getter
	@Setter
	private Bus bus;
}
