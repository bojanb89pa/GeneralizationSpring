package rs.bojanb89.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.bojanb89.Const;
import rs.bojanb89.datamodel.to.VehicleTO;
import rs.bojanb89.service.VehicleService;

/**
 * @author Bojan Bogojevic
 *
 */
@RestController
@RequestMapping(Const.API_PREFIX + Const.V1_URL_PREFIX + "/vehicles")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<VehicleTO> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}

}
