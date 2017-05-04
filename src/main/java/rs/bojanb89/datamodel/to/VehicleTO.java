package rs.bojanb89.datamodel.to;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.vehicle.VehicleType;

/**
 * @author Bojan Bogojevic
 *
 */
public abstract class VehicleTO {

	@Getter
	@Setter
	protected VehicleType vehicleType;

	@Getter
	@Setter
	private String licensePlateNumber;

}
