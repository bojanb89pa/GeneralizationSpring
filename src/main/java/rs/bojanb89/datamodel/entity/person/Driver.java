package rs.bojanb89.datamodel.entity.person;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.vehicle.Vehicle;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@DiscriminatorValue(Person.DISCRIMINATOR_DRIVER)
public class Driver extends Person {

	@OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
	@Getter
	@Setter
	private Vehicle vehicle;

	@Column(name = "licence_number", length = 30)
	@Getter
	@Setter
	private String licenceNumber;
}
