
USE `generalization`;

--
--  Adding data for table `person`
--
LOCK TABLES `person` WRITE;

INSERT INTO `person` VALUES 
('DRIVER', 1, 0, 'Car', 'Driver', '111111111', NULL),
('DRIVER', 2, 0, 'Truck', 'Driver', '222222222', NULL),
('DRIVER', 3, 0, 'Bus', 'Driver', '333333333', NULL);

UNLOCK TABLES;

--
--  Adding data for table `vehicle`
--
LOCK TABLES `vehicle` WRITE;

INSERT INTO `vehicle` VALUES 
('CAR', 1, 0, 'BG-1000-AB', NULL, 'BMW', 'LIMOUSINE', 1),
('TRUCK', 2, 0, 'BG-1000-AB', 'Transport milk', NULL, NULL, 2),
('BUS', 3, 0, 'BG-1000-AB', NULL, NULL, NULL, 3);

UNLOCK TABLES;

--
--  Adding data for table `person` (passengers)
--
LOCK TABLES `person` WRITE;

UPDATE `person`
set `bus_id`=3
where `id`=3;

INSERT INTO `person` VALUES 
('PERSON', 4, 0, 'Bus', 'Passenger', NULL, 3),
('PERSON', 5, 0, 'Bus', 'Passenger', NULL, 3),
('PERSON', 6, 0, 'Bus', 'Passenger', NULL, 3);

UNLOCK TABLES;