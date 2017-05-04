package rs.bojanb89.datamodel.entity.vehicle;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@DiscriminatorValue(Vehicle.DISCRIMINATOR_CAR)
public class Car extends Vehicle {

	@Enumerated(EnumType.STRING)
	@Column(name = "car_model")
	@Getter
	@Setter
	private CarModel carModel;

	@Enumerated(EnumType.STRING)
	@Column(name = "car_body")
	@Getter
	@Setter
	private CarBody carBody;
}
