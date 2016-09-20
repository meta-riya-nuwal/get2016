CREATE DATABASE  IF NOT EXISTS `carbecho` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `carbecho`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: carbecho
-- ------------------------------------------------------
-- Server version	5.5.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `CarId` int(11) NOT NULL AUTO_INCREMENT,
  `creator` varchar(45) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `updateBy` varchar(45) DEFAULT NULL,
  `updatedTime` datetime DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `engineCC` decimal(5,0) DEFAULT NULL,
  `fuelCap` decimal(5,0) DEFAULT NULL,
  `milage` decimal(5,0) DEFAULT NULL,
  `price` decimal(7,0) DEFAULT NULL,
  `tax` decimal(5,0) DEFAULT NULL,
  `ac` varchar(10) DEFAULT NULL,
  `powersteer` varchar(20) DEFAULT NULL,
  `accKit` varchar(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CarId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'riya','2016-09-20 00:00:00','riya','2016-09-20 00:00:00','toyato1011',6000,465,800,10000,400,'yes','yes','yes','toyato'),(2,'sagar','2016-09-16 00:00:00','sagar','2016-09-16 00:00:00','bmw10989',6000,435,500,200000,568,'yes','yes','yes','bmw'),(3,'Sagar','2016-09-16 00:00:00','Sagar','2016-09-16 00:00:00','bmw10232',600,123,500,600,767,'yes','yes','yes','BMW'),(4,'sans','2016-09-16 00:00:00','sans','2016-09-16 00:00:00','swift1098',1456,780,600,2000,567,'yes','yes','yes','Swift');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'carbecho'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-20 10:38:51
