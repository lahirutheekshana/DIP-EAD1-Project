-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2023 at 02:01 PM
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
-- Database: `clubdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_Fname` varchar(50) DEFAULT NULL,
  `admin_Lname` varchar(50) DEFAULT NULL,
  `admin_email` varchar(150) DEFAULT NULL,
  `admin_password` varchar(50) DEFAULT NULL,
  `admin_age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_Fname`, `admin_Lname`, `admin_email`, `admin_password`, `admin_age`) VALUES
(1, 'admin', 'Account', 'admin@gmail.com', '1234', 23);

-- --------------------------------------------------------

--
-- Table structure for table `admin_mobile`
--

CREATE TABLE `admin_mobile` (
  `admin_id` int(11) DEFAULT NULL,
  `admin_mobile` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_mobile`
--

INSERT INTO `admin_mobile` (`admin_id`, `admin_mobile`) VALUES
(1, '+94775326529');

-- --------------------------------------------------------

--
-- Table structure for table `announcement`
--

CREATE TABLE `announcement` (
  `Ann_id` int(11) NOT NULL,
  `Ann_time` time DEFAULT current_timestamp(),
  `Ann_date` date DEFAULT current_timestamp(),
  `Ann_title` varchar(150) DEFAULT NULL,
  `Ann_description` varchar(1000) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `announcement`
--

INSERT INTO `announcement` (`Ann_id`, `Ann_time`, `Ann_date`, `Ann_title`, `Ann_description`, `admin_id`) VALUES
(12, '00:02:22', '2023-10-24', 'Enter Title Here', 'Enter Announcement Here', 1),
(13, '08:29:50', '2023-10-24', 'Enter Title Here', 'Enter Announcement Here', 1);

-- --------------------------------------------------------

--
-- Table structure for table `hall`
--

CREATE TABLE `hall` (
  `hall_num` int(11) NOT NULL,
  `hall_size` double(50,2) DEFAULT NULL,
  `hall_type` varchar(50) DEFAULT NULL,
  `statuss` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hall`
--

INSERT INTO `hall` (`hall_num`, `hall_size`, `hall_type`, `statuss`) VALUES
(10, 220.00, 'AC', 0),
(18, 120.00, 'NON-AC', 0),
(22, 300.00, 'AC', 0),
(32, 150.00, 'AC', 1),
(45, 400.00, 'NON-AC', 1);

-- --------------------------------------------------------

--
-- Table structure for table `hall_reservation`
--

CREATE TABLE `hall_reservation` (
  `R_id` int(11) NOT NULL,
  `R_dateNow` date DEFAULT current_timestamp(),
  `R_date` date DEFAULT NULL,
  `R_hours` int(11) DEFAULT NULL,
  `R_timeNow` time DEFAULT curtime(),
  `R_time` time DEFAULT NULL,
  `M_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `Hall_num` int(11) DEFAULT NULL,
  `confirmation` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hall_reservation`
--

INSERT INTO `hall_reservation` (`R_id`, `R_dateNow`, `R_date`, `R_hours`, `R_timeNow`, `R_time`, `M_id`, `admin_id`, `Hall_num`, `confirmation`) VALUES
(40, '2023-10-23', '2023-02-04', 5, '08:27:57', '08:00:00', 9, 1, 10, 'APPROVED'),
(42, '2023-10-23', '2023-02-07', 8, '08:28:34', '09:30:00', 9, 1, 22, 'APPROVED');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `M_id` int(11) NOT NULL,
  `M_Fname` varchar(100) DEFAULT NULL,
  `M_Lname` varchar(100) DEFAULT NULL,
  `M_email` varchar(100) DEFAULT NULL,
  `M_password` varchar(100) DEFAULT NULL,
  `M_age` int(11) DEFAULT NULL,
  `M_Mobile` varchar(50) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`M_id`, `M_Fname`, `M_Lname`, `M_email`, `M_password`, `M_age`, `M_Mobile`, `admin_id`) VALUES
(9, 'Asiri', 'Sandaruwan', 'asiri@gmail.com', '1234', 23, '34543534534', 1),
(10, 'Wikrama ', 'thilaka', 'a', 'a', 28, '0775367445', 1);

-- --------------------------------------------------------

--
-- Table structure for table `messages`
--

CREATE TABLE `messages` (
  `Message_id` int(11) NOT NULL,
  `Message` varchar(10000) DEFAULT NULL,
  `Staff_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `messages`
--

INSERT INTO `messages` (`Message_id`, `Message`, `Staff_id`) VALUES
(3, 'awfdsfcasfsfasdfd', 2),
(4, 'weasfasfasf', 2);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `Event_id` int(11) DEFAULT NULL,
  `M_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_num` int(11) NOT NULL,
  `room_size` double(50,2) DEFAULT NULL,
  `room_type` varchar(50) DEFAULT NULL,
  `statuss` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_num`, `room_size`, `room_type`, `statuss`) VALUES
(11, 120.00, 'AC', 1),
(15, 150.00, 'AC', 0),
(16, 100.00, 'NON-AC', 0),
(20, 175.00, 'NON-AC', 1),
(23, 150.00, 'AC', 1);

-- --------------------------------------------------------

--
-- Table structure for table `room_reservation`
--

CREATE TABLE `room_reservation` (
  `R_id` int(11) NOT NULL,
  `R_dateNow` date DEFAULT current_timestamp(),
  `R_date` date DEFAULT NULL,
  `R_hours` int(11) DEFAULT NULL,
  `R_timeNow` time DEFAULT curtime(),
  `R_time` time DEFAULT NULL,
  `M_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `Room_num` int(11) DEFAULT NULL,
  `Confirmation` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_reservation`
--

INSERT INTO `room_reservation` (`R_id`, `R_dateNow`, `R_date`, `R_hours`, `R_timeNow`, `R_time`, `M_id`, `admin_id`, `Room_num`, `Confirmation`) VALUES
(32, '2023-10-23', '2023-02-06', 2, '08:26:03', '09:00:00', 9, 1, 16, 'APPROVED');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `Staff_id` int(11) NOT NULL,
  `Staff_role` varchar(100) DEFAULT NULL,
  `Staff_Fname` varchar(100) DEFAULT NULL,
  `Staff_Lname` varchar(100) DEFAULT NULL,
  `Staff_age` int(11) DEFAULT NULL,
  `Staff_email` varchar(150) DEFAULT NULL,
  `Staff_password` varchar(100) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`Staff_id`, `Staff_role`, `Staff_Fname`, `Staff_Lname`, `Staff_age`, `Staff_email`, `Staff_password`, `admin_id`) VALUES
(2, 'chef', 'Asiri', 'Sandaruwan', 23, 'a', '1234', 1);

-- --------------------------------------------------------

--
-- Table structure for table `works`
--

CREATE TABLE `works` (
  `id` int(11) NOT NULL,
  `working_date` date DEFAULT current_timestamp(),
  `working_hours` int(11) DEFAULT NULL,
  `staff_salary` double(50,2) DEFAULT NULL,
  `staff_ot` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `Staff_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `xevents`
--

CREATE TABLE `xevents` (
  `Event_id` int(11) NOT NULL,
  `Event_title` varchar(100) DEFAULT NULL,
  `Event_date` date DEFAULT NULL,
  `Event_time` time DEFAULT NULL,
  `Event_type` varchar(100) DEFAULT NULL,
  `Event_Description` varchar(100) DEFAULT NULL,
  `post_date` date DEFAULT current_timestamp(),
  `post_time` time DEFAULT current_timestamp(),
  `admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `xevents`
--

INSERT INTO `xevents` (`Event_id`, `Event_title`, `Event_date`, `Event_time`, `Event_type`, `Event_Description`, `post_date`, `post_time`, `admin_id`) VALUES
(6, 'PIzzaMania', '2022-02-03', '09:00:00', 'Party', 'We ALL CAN HAVE FUN COME !!', '2023-10-23', '22:31:16', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `admin_mobile`
--
ALTER TABLE `admin_mobile`
  ADD KEY `admin_id` (`admin_id`);

--
-- Indexes for table `announcement`
--
ALTER TABLE `announcement`
  ADD PRIMARY KEY (`Ann_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- Indexes for table `hall`
--
ALTER TABLE `hall`
  ADD PRIMARY KEY (`hall_num`);

--
-- Indexes for table `hall_reservation`
--
ALTER TABLE `hall_reservation`
  ADD PRIMARY KEY (`R_id`),
  ADD KEY `M_id` (`M_id`),
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `fk_Hall_num` (`Hall_num`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`M_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- Indexes for table `messages`
--
ALTER TABLE `messages`
  ADD PRIMARY KEY (`Message_id`),
  ADD KEY `Staff_id` (`Staff_id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD KEY `Event_id` (`Event_id`),
  ADD KEY `M_id` (`M_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_num`);

--
-- Indexes for table `room_reservation`
--
ALTER TABLE `room_reservation`
  ADD PRIMARY KEY (`R_id`),
  ADD KEY `M_id` (`M_id`),
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `fk_room_num` (`Room_num`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`Staff_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- Indexes for table `works`
--
ALTER TABLE `works`
  ADD PRIMARY KEY (`id`),
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `Staff_id` (`Staff_id`);

--
-- Indexes for table `xevents`
--
ALTER TABLE `xevents`
  ADD PRIMARY KEY (`Event_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `announcement`
--
ALTER TABLE `announcement`
  MODIFY `Ann_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `hall_reservation`
--
ALTER TABLE `hall_reservation`
  MODIFY `R_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `M_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `messages`
--
ALTER TABLE `messages`
  MODIFY `Message_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `room_reservation`
--
ALTER TABLE `room_reservation`
  MODIFY `R_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `Staff_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `works`
--
ALTER TABLE `works`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `xevents`
--
ALTER TABLE `xevents`
  MODIFY `Event_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin_mobile`
--
ALTER TABLE `admin_mobile`
  ADD CONSTRAINT `admin_mobile_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `announcement`
--
ALTER TABLE `announcement`
  ADD CONSTRAINT `announcement_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `hall_reservation`
--
ALTER TABLE `hall_reservation`
  ADD CONSTRAINT `fk_Hall_num` FOREIGN KEY (`Hall_num`) REFERENCES `hall` (`hall_num`),
  ADD CONSTRAINT `hall_reservation_ibfk_1` FOREIGN KEY (`M_id`) REFERENCES `member` (`M_id`),
  ADD CONSTRAINT `hall_reservation_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `member`
--
ALTER TABLE `member`
  ADD CONSTRAINT `member_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `messages`
--
ALTER TABLE `messages`
  ADD CONSTRAINT `messages_ibfk_1` FOREIGN KEY (`Staff_id`) REFERENCES `staff` (`Staff_id`);

--
-- Constraints for table `register`
--
ALTER TABLE `register`
  ADD CONSTRAINT `register_ibfk_1` FOREIGN KEY (`Event_id`) REFERENCES `xevents` (`Event_id`),
  ADD CONSTRAINT `register_ibfk_2` FOREIGN KEY (`M_id`) REFERENCES `member` (`M_id`);

--
-- Constraints for table `room_reservation`
--
ALTER TABLE `room_reservation`
  ADD CONSTRAINT `fk_room_num` FOREIGN KEY (`Room_num`) REFERENCES `room` (`room_num`),
  ADD CONSTRAINT `room_reservation_ibfk_1` FOREIGN KEY (`M_id`) REFERENCES `member` (`M_id`),
  ADD CONSTRAINT `room_reservation_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);

--
-- Constraints for table `works`
--
ALTER TABLE `works`
  ADD CONSTRAINT `works_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`),
  ADD CONSTRAINT `works_ibfk_2` FOREIGN KEY (`Staff_id`) REFERENCES `staff` (`Staff_id`);

--
-- Constraints for table `xevents`
--
ALTER TABLE `xevents`
  ADD CONSTRAINT `xevents_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
