package rs.bojanb89.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.bojanb89.datamodel.entity.vehicle.Vehicle;
import rs.bojanb89.datamodel.mapper.VehicleMapper;
import rs.bojanb89.datamodel.to.VehicleTO;
import rs.bojanb89.repository.VehicleRepository;

/**
 * @author Bojan Bogojevic
 *
 */
@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	@Autowired
	private VehicleMapper mapper;

	public List<VehicleTO> getAllVehicles() {
		List<Vehicle> vehicles = vehicleRepository.findAll();

		return toFromVehicles(vehicles);
	}

	/**
	 * @param vehicles
	 * @return
	 */
	private List<VehicleTO> toFromVehicles(List<Vehicle> vehicles) {
		if (vehicles != null) {
			List<VehicleTO> vehicleTOs = new ArrayList<>();
			for (Vehicle vehicle : vehicles) {
				VehicleTO vehicleTO = null;

				vehicleTO = mapper.map(vehicle);

				if (vehicleTO != null) {
					vehicleTOs.add(vehicleTO);
				}
			}
			return vehicleTOs;
		}
		return null;
	}
}
