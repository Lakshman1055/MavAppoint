CREATE DATABASE  IF NOT EXISTS `mavappoint` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mavappoint`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mavappoint
-- ------------------------------------------------------
-- Server version	5.7.9-log

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `PASSWORD` varchar(32) NOT NULL,
  `ROLE` varchar(32) DEFAULT NULL,
  `VALIDATED` tinyint(4) NOT NULL DEFAULT '0',
  `LASTUPDATED` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`USERID`,`EMAIL`),
  UNIQUE KEY `EMAIL` (`EMAIL`)
) ENGINE=InnoDB AUTO_INCREMENT=1003698522 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Advisor 1','testadvisor@uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','advisor',1,'2016-03-06 07:16:09'),(1001163388,'Lakshman','lakshman.siruvolu@mavs.uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','student',1,'2016-03-08 03:05:01'),(1001234567,'Advisor','advisor@uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','advisor',1,'2016-03-06 00:37:39'),(1001237667,'Krishna Chaitanya Muppaneni','krishna.muppaneni@mavs.uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','student',1,'2016-03-08 03:42:50'),(1001360627,'Mahesh','mahesh.pallapothu@mavs.uta.edu','@yÊ æ²%Ï[\rw¤û','student',0,'2016-03-08 02:44:06'),(1002345678,'Admin','admin@uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','admin',1,'2016-03-06 05:10:43'),(1003698521,'Advisor 2','advisor2@uta.edu','å~ð#ÝÅyµ¯ïÊûª6I','advisor',1,'0000-00-00 00:00:00');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-08 16:21:01
