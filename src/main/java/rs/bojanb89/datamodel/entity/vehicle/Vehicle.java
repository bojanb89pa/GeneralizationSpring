package rs.bojanb89.datamodel.entity.vehicle;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import rs.bojanb89.datamodel.entity.BaseEntity;
import rs.bojanb89.datamodel.entity.person.Driver;

/**
 * @author Bojan Bogojevic
 *
 */
@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Vehicle extends BaseEntity {

	public static final String DISCRIMINATOR_CAR = "CAR";
	public static final String DISCRIMINATOR_BUS = "BUS";
	public static final String DISCRIMINATOR_TRUCK = "TRUCK";

	@Enumerated(EnumType.STRING)
	@Column(name = "vehicle_type", length = 20, insertable = false, updatable = false)
	@Getter
	@Setter
	protected VehicleType vehicleType;

	@Column(name = "license_plate_number", length = 15)
	@Getter
	@Setter
	private String licensePlateNumber;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id")
	@Getter
	@Setter
	private Driver driver;

}
