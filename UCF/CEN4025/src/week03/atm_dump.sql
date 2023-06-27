-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.26-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for atm
DROP DATABASE IF EXISTS `atm`;
CREATE DATABASE IF NOT EXISTS `atm` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `atm`;

-- Dumping structure for table atm.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pin` int(4) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `last_update` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table atm.user: ~8 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
REPLACE INTO `user` (`id`, `pin`, `first_name`, `last_name`, `last_update`) VALUES
	(1, 1234, 'Scott', 'LaChance', '2015-08-22 11:57:11'),
	(2, 5678, 'John', 'Fisher', '2015-11-03 10:46:11'),
	(3, 1234, 'Jim', 'Thomas', '2015-12-07 00:00:00'),
	(4, 1234, 'James', 'Hale', '2015-12-07 00:00:00'),
	(5, 1234, 'Teresa', 'Holt', '2015-12-07 00:00:00'),
	(6, 1234, 'Geddes', 'James', '2015-12-07 00:00:00'),
	(7, 1234, 'Hardaway', 'Clark', '2015-12-07 00:00:00'),
	(8, 1234, 'Jason', 'Bourne', '2015-12-07 00:00:00');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
