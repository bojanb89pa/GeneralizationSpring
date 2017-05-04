package rs.bojanb89.datamodel.to;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.vehicle.CarBody;
import rs.bojanb89.datamodel.entity.vehicle.CarModel;

/**
 * @author Bojan Bogojevic
 *
 */
public class CarTO extends VehicleTO {

	@Getter
	@Setter
	private CarModel carModel;

	@Getter
	@Setter
	private CarBody carBody;
}
