-- phpMyAdmin SQL Dump
-- version 2.11.6
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 29, 2019 at 11:11 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `companydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL auto_increment,
  `Emp_id` int(5) NOT NULL,
  `Employee_Name` varchar(100) default NULL,
  `Designation` varchar(50) default NULL,
  `Department` varchar(50) default NULL,
  `Salary` int(9) default NULL,
  `Address` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `Emp_id` (`Emp_id`),
  KEY `dep_index` (`Department`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `Emp_id`, `Employee_Name`, `Designation`, `Department`, `Salary`, `Address`) VALUES
(1, 10181, 'Sachin Wardha', 'QA Engineer', 'Testing', 35000, 'Pune'),
(2, 10182, 'Sachin Pune', 'Automation_Engineer', 'Computer', 80000, 'Wardha'),
(3, 10183, 'pallavi lungare', 'BDO', 'EXTC', 90000, 'Ndd'),
(4, 10184, 'shivani cnx', 'Operation backEnd', 'Computer', 60000, 'MP'),
(5, 10185, 'sayali rgh', 'Test Engineer', 'IT', 50000, 'Ndd'),
(6, 10186, 'tom cruz', 'Superhero', 'Film', 250000, 'US'),
(7, 10187, 'Sachin Bhagat', 'Software Engineer', 'Computer', 80000, 'World');
