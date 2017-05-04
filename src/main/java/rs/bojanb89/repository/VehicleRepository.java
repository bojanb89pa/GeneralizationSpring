package rs.bojanb89.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.bojanb89.datamodel.entity.vehicle.Vehicle;

/**
 * @author Bojan Bogojevic
 *
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
