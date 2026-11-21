-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 21, 2026 at 08:38 AM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `upgradb13db`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cat_id`, `cat_name`) VALUES
(1, 'Books'),
(2, 'Games'),
(3, 'Groceries'),
(4, 'Electronics'),
(5, 'Clothes');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `cus_id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_name` varchar(20) NOT NULL,
  `cus_phone` bigint(20) NOT NULL,
  `cus_city` varchar(20) NOT NULL,
  `cus_gender` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cus_id`, `cus_name`, `cus_phone`, `cus_city`, `cus_gender`) VALUES
(1, 'AAKASH', 9999999999, 'DELHI', 'M'),
(2, 'AMAN', 9785463215, 'NOIDA', 'M'),
(3, 'NEHA', 9999999999, 'MUMBAI', 'F'),
(4, 'MEGHA', 9994562399, 'KOLKATA', 'F'),
(5, 'PULKIT', 7895999999, 'LUCKNOW', 'M');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
  `ord_id` int(11) NOT NULL AUTO_INCREMENT,
  `ord_date` date NOT NULL,
  `cus_id` int(11) DEFAULT NULL,
  `pricing_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ord_id`),
  KEY `cus_id` (`cus_id`),
  KEY `pricing_id` (`pricing_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ord_id`, `ord_date`, `cus_id`, `pricing_id`) VALUES
(1, '2021-10-06', 2, 1),
(2, '2021-10-12', 3, 5),
(3, '2021-09-16', 5, 2),
(4, '2021-10-05', 1, 1),
(5, '2021-08-16', 4, 3),
(6, '2021-08-18', 1, 9),
(7, '2021-09-01', 3, 7),
(8, '2021-09-07', 5, 6),
(9, '2021-10-10', 5, 3),
(10, '2021-09-10', 2, 4),
(11, '2021-09-15', 4, 5),
(12, '2021-09-16', 4, 7),
(13, '2021-09-16', 1, 8),
(14, '2021-09-16', 3, 5),
(15, '2021-09-16', 5, 3),
(16, '2021-09-17', 2, 14);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(20) DEFAULT NULL,
  `pro_desc` varchar(200) DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pro_id`),
  KEY `cat_id` (`cat_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pro_id`, `pro_name`, `pro_desc`, `cat_id`) VALUES
(1, 'GTA V', 'Windows 7 and above with i5 processor and 8GB RAM', 2),
(2, 'TSHIRT', 'SIZE-L with Black, Blue and White variations', 5),
(3, 'ROG LAPTOP', 'Windows 10 with 15inch screen, i7 processor, 1TB SSD', 4),
(4, 'OATS', 'Highly Nutritious from Nestle', 3),
(5, 'HARRY POTTER', 'Best Collection of all time by J.K Rowling', 1),
(6, 'MILK', '1L Toned Milk', 3),
(7, 'Boat Earphones', '1.5Meter long Dolby Atmos', 4),
(8, 'Jeans', 'Stretchable Denim Jeans with various sizes and color', 5),
(9, 'Project IGI', 'Compatible with windows 7 and above', 2),
(10, 'Hoodie', 'Black GUCCI for 13 yrs and above', 5),
(11, 'Rich Dad Poor Dad', 'Written by RObert Kiyosaki', 1),
(12, 'Train Your Brain', 'By Shireen Stephen', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE IF NOT EXISTS `rating` (
  `rat_id` int(11) NOT NULL AUTO_INCREMENT,
  `stars` int(11) DEFAULT NULL,
  `ord_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`rat_id`),
  KEY `ord_id` (`ord_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`rat_id`, `stars`, `ord_id`) VALUES
(1, 4, 1),
(2, 3, 2),
(3, 1, 3),
(4, 2, 4),
(5, 4, 5),
(6, 3, 6),
(7, 4, 7),
(8, 4, 8),
(9, 3, 9),
(10, 5, 10),
(11, 3, 11),
(12, 4, 12),
(13, 2, 13),
(14, 1, 14),
(15, 1, 15),
(16, 5, 16);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE IF NOT EXISTS `supplier` (
  `supp_id` int(11) NOT NULL AUTO_INCREMENT,
  `supp_name` varchar(20) DEFAULT NULL,
  `supp_city` varchar(20) DEFAULT NULL,
  `supp_phone` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`supp_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`supp_id`, `supp_name`, `supp_city`, `supp_phone`) VALUES
(1, 'Rajesh Retails', 'Delhi', 1234567890),
(2, 'Appario Ltd.', 'Mumbai', 2589631470),
(3, 'Knome products', 'Banglore', 9785462315),
(4, 'Bansal Retails', 'Kochi', 8975463285),
(5, 'Mittal Ltd.', 'Lucknow', 7898456532);

-- --------------------------------------------------------

--
-- Table structure for table `supplier_pricing`
--

CREATE TABLE IF NOT EXISTS `supplier_pricing` (
  `pricing_id` int(11) NOT NULL AUTO_INCREMENT,
  `supp_id` varchar(20) DEFAULT NULL,
  `pro_id` varchar(20) DEFAULT NULL,
  `supp_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`pricing_id`),
  KEY `supp_id` (`supp_id`),
  KEY `pro_id` (`pro_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `supplier_pricing`
--

INSERT INTO `supplier_pricing` (`pricing_id`, `supp_id`, `pro_id`, `supp_price`) VALUES
(1, '2', '1', 1500),
(2, '5', '3', 30000),
(3, '1', '5', 3000),
(4, '3', '2', 2500),
(5, '1', '4', 1000),
(6, '2', '12', 780),
(7, '4', '12', 789),
(8, '1', '3', 31000),
(9, '5', '1', 1450),
(10, '2', '4', 999),
(11, '3', '7', 549),
(12, '4', '7', 529),
(13, '2', '6', 105),
(14, '1', '6', 99),
(15, '5', '2', 2999),
(16, '2', '5', 2999);
