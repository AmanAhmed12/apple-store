-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2023 at 06:32 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apple_istore`
--

-- --------------------------------------------------------

--
-- Table structure for table `product_details`
--

CREATE TABLE `product_details` (
  `product_id` varchar(10) NOT NULL,
  `category` varchar(20) NOT NULL,
  `product_name` varchar(20) NOT NULL,
  `purchase_quantity` int(10) NOT NULL DEFAULT 0,
  `purchase_price` int(100) NOT NULL DEFAULT 0,
  `purchase_total` int(100) NOT NULL DEFAULT 0,
  `remaining_quantity` int(200) NOT NULL,
  `admin_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_details`
--

INSERT INTO `product_details` (`product_id`, `category`, `product_name`, `purchase_quantity`, `purchase_price`, `purchase_total`, `remaining_quantity`, `admin_id`) VALUES
('I001', 'Iphone', '2s', 7, 1000, 7000, 2, 'A001'),
('I002', 'Apple_Watch', 'watch', 6, 2000, 12000, 3, 'A001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product_details`
--
ALTER TABLE `product_details`
  ADD PRIMARY KEY (`product_id`),
  ADD UNIQUE KEY `category` (`category`),
  ADD UNIQUE KEY `product_name_2` (`product_name`),
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `product_name` (`product_name`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product_details`
--
ALTER TABLE `product_details`
  ADD CONSTRAINT `product_details_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `administrator` (`admin_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
