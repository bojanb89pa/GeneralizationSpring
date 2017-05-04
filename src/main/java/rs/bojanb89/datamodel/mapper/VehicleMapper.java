package rs.bojanb89.datamodel.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import rs.bojanb89.datamodel.entity.vehicle.Vehicle;
import rs.bojanb89.datamodel.to.BusTO;
import rs.bojanb89.datamodel.to.CarTO;
import rs.bojanb89.datamodel.to.TruckTO;
import rs.bojanb89.datamodel.to.VehicleTO;

/**
 * @author Bojan Bogojevic
 *
 */
@Component
public class VehicleMapper extends ModelMapper {

	public VehicleTO map(Vehicle vehicle) {
		switch (vehicle.getVehicleType()) {
		case CAR:
			return map(vehicle, CarTO.class);
		case TRUCK:
			return map(vehicle, TruckTO.class);
		case BUS:
			return map(vehicle, BusTO.class);
		}
		return null;
	}

}
