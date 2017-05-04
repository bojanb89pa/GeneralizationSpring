CREATE DATABASE generalization CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'generalization'@'%' IDENTIFIED BY 'generalization';
GRANT ALL PRIVILEGES ON `generalization`.* TO 'generalization'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;