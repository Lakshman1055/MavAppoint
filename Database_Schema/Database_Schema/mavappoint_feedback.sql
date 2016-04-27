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
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feedback` (
  `feedbackID` int(11) NOT NULL AUTO_INCREMENT,
  `feedback` varchar(45) DEFAULT NULL,
  `dateTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`feedbackID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,'Test','0000-00-00 00:00:00'),(2,'Test','2016-02-24 00:26:46'),(3,'Last last','2016-02-24 00:55:20'),(4,'last','2016-02-24 00:55:34'),(5,'l','2016-02-24 00:57:10'),(6,'l','2016-02-24 00:58:08'),(7,'test last likely','2016-02-24 01:04:22'),(8,'hhh','2016-02-24 01:05:18'),(9,'hhh','2016-02-24 01:05:42'),(10,'last test okay?','2016-02-24 01:08:22'),(11,'okay?','2016-02-24 01:08:30'),(12,'okay','2016-02-24 01:10:14'),(13,'okay','2016-02-24 01:10:17'),(14,'Test','2016-02-24 01:22:07'),(15,'Test','2016-02-24 01:22:21'),(16,'Test','2016-02-24 01:22:47'),(17,'Test','2016-02-24 01:24:07'),(18,'Test\r\n','2016-02-24 01:24:25'),(19,'Test','2016-02-24 01:26:41'),(20,'Test','2016-03-02 22:10:07'),(21,'Test','2016-03-02 22:11:41'),(22,'Okay','2016-03-02 22:11:46'),(23,'Testy','2016-03-02 22:12:22'),(24,'','2016-03-02 22:12:25'),(25,'','2016-03-02 22:12:25'),(26,'','2016-03-02 22:12:26'),(27,'','2016-03-02 22:12:26'),(28,'','2016-03-02 22:12:27'),(29,'','2016-03-02 22:17:18'),(30,'','2016-03-02 22:17:53'),(31,'','2016-03-02 22:19:55'),(32,'Okay ','2016-03-02 22:20:02'),(33,'Okay ','2016-03-02 22:20:09'),(34,'','2016-03-02 22:21:52'),(35,'Test','2016-03-02 22:22:00'),(36,'Test','2016-03-02 22:22:02'),(37,'Test','2016-03-02 22:22:02'),(38,'Bug','2016-03-02 22:57:03'),(39,'Feedback last test','2016-03-02 22:57:13'),(40,NULL,'2016-03-07 21:50:47');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-08 16:21:00
