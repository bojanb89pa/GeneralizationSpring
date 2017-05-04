package rs.bojanb89.datamodel.to;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Bojan Bogojevic
 *
 */
public class TruckTO extends VehicleTO {

	@Getter
	@Setter
	private String goodsDescription;
}
