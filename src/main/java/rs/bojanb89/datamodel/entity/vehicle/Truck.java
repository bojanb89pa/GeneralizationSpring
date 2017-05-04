package rs.bojanb89.datamodel.entity.vehicle;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@DiscriminatorValue(Vehicle.DISCRIMINATOR_TRUCK)
public class Truck extends Vehicle {

	@Column(name = "goods_description", length = 256)
	@Getter
	@Setter
	private String goodsDescription;
}
