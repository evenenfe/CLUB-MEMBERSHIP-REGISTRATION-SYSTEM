-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2019 at 05:00 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `membershipdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE IF NOT EXISTS `membership` (
  `id` int(45) NOT NULL AUTO_INCREMENT,
  `memberid` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `middlename` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `birthdate` varchar(45) NOT NULL,
  `year` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `payment` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`id`, `memberid`, `firstname`, `middlename`, `lastname`, `birthdate`, `year`, `gender`, `mobile`, `payment`) VALUES
(3, '12312', 'asd', 'asd', 'asd', 'asd', '1', 'Male', '9876543214567', '12312'),
(4, '1231', 'arigato', 'wak', 'as', 'asd', '1', 'Male', '987654321', '123123'),
(5, '1231', 'asdas', 'asd', 'asd', 'asdd', '1', 'Male', '1234567890', '123456'),
(6, '123123', 'asda', 'gui', 'asd', 'asd', '1', 'Male', '987654321', '2312'),
(7, '2313', 'asdas', 'asd', 'asd', 'asd', '1', 'Male', '987654321', '12312'),
(8, '28764566', 'asd', 'sda', 'asdsa', 'asdas', '2', 'Male', '2147483647', '123123'),
(9, '12312', 'asdas', 'asdas', 'asdas', 'wew', '1', 'Male', '987654321', '123123'),
(10, '201999', 'thank you', 'uil', 'yeahm', 'shdjk', '1', 'Male', '09876543123', '900'),
(19, '3978669', 'yes', 'the', 'best', 'may 2, 2109', '4', 'Male', '098765467765', '900'),
(20, '20199277', 'Eva', 'Tagaro', 'Delima', 'March 1, 2000', '3', 'Female', '09874563212', '900');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
