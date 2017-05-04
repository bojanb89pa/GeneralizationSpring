package rs.bojanb89.datamodel.entity.vehicle;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.person.Person;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@DiscriminatorValue(Vehicle.DISCRIMINATOR_BUS)
public class Bus extends Vehicle {

	@OneToMany(mappedBy = "bus", cascade = CascadeType.ALL)
	@Getter
	@Setter
	private List<Person> passengers;
}
