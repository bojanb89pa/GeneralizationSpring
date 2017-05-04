
USE `generalization`;

--
-- Table structure for table `vehicle`
--
CREATE TABLE `vehicle` (
  `vehicle_type` varchar(20) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT NULL,
  `license_plate_number` varchar(15) NOT NULL,
  `goods_description` varchar(256) DEFAULT NULL,
  `car_model` varchar(30) DEFAULT NULL,
  `car_body` varchar(30) DEFAULT NULL,
  `driver_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB 
DEFAULT CHARSET=utf8;

--
-- Table structure for table `person`
--
CREATE TABLE `person` (
  `person_type` varchar(30) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `licence_number` varchar(30) DEFAULT NULL,
  `bus_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `bus_person_cs`
    FOREIGN KEY (`bus_id`)
    REFERENCES `vehicle` (`id`))
ENGINE=InnoDB 
DEFAULT CHARSET=utf8;

ALTER TABLE `vehicle` 
ADD CONSTRAINT `driver_vehicle_cs` 
		FOREIGN KEY (`driver_id`)
		REFERENCES `person` (`id`);
