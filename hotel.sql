/*
 Navicat Premium Data Transfer

 Source Server         : keshe
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : hotel

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 16/06/2020 09:42:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for checkin
-- ----------------------------
DROP TABLE IF EXISTS `checkin`;
CREATE TABLE `checkin`  (
  `checkin_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `roomtype_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `standard_price` double(10, 2) NOT NULL,
  `discount_price` double(10, 2) NOT NULL,
  `deposit` double(255, 0) NOT NULL,
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `card_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `card_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `arrivetime` time(0) NOT NULL,
  `leavetime` time(0) NOT NULL,
  `customer_number` int(11) NOT NULL,
  `operator` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_id` int(11) NULL DEFAULT NULL,
  `customer_price` double(10, 2) NULL DEFAULT NULL,
  `breakfast_or_not` binary(255) NULL DEFAULT NULL,
  `remind_or_not` binary(255) NULL DEFAULT NULL,
  PRIMARY KEY (`checkin_id`) USING BTREE,
  INDEX `roomnumber`(`room_number`) USING BTREE,
  INDEX `roomtypename`(`roomtype_name`) USING BTREE,
  INDEX `customerid`(`customer_id`) USING BTREE,
  CONSTRAINT `customerid` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `roomnumber` FOREIGN KEY (`room_number`) REFERENCES `room` (`room_number`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `roomtypename` FOREIGN KEY (`roomtype_name`) REFERENCES `roomtype` (`roomtype_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_tele` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_integral` int(255) NULL DEFAULT NULL,
  `customer_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_last_ctime` datetime(0) NULL DEFAULT NULL COMMENT '最后一次入驻时间',
  `customer_last_rtime` datetime(0) NULL DEFAULT NULL COMMENT '最后一次预定时间',
  `customer_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for floor
-- ----------------------------
DROP TABLE IF EXISTS `floor`;
CREATE TABLE `floor`  (
  `floor_id` int(11) NOT NULL AUTO_INCREMENT,
  `floor_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '一楼、二楼、三楼等',
  `floot_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`floor_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods_type
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type`  (
  `goods_type id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_type_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goods_type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '酒水、饮料、食品',
  `goods_type_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goods_type id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`  (
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `log_id` int(255) NOT NULL AUTO_INCREMENT,
  `log_operation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `log_time_date` datetime(0) NOT NULL,
  `log_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`log_id`) USING BTREE,
  INDEX `user name`(`user_name`) USING BTREE,
  CONSTRAINT `user name` FOREIGN KEY (`user_name`) REFERENCES `user` (`user_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `roomtype_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '双人间、单人间、四人间、钟点房、总统套房',
  `room_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `standard_price` decimal(10, 2) NOT NULL,
  `discount_price` decimal(10, 2) NOT NULL,
  `ncustomer_price` decimal(10, 2) NOT NULL,
  `vcustomer_price` decimal(10, 2) NOT NULL,
  `room_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`room_id`) USING BTREE,
  INDEX `roomtype name`(`roomtype_name`) USING BTREE,
  INDEX `room number`(`room_number`) USING BTREE,
  CONSTRAINT `roomtype name` FOREIGN KEY (`roomtype_name`) REFERENCES `roomtype` (`roomtype_name`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for room_reserve
-- ----------------------------
DROP TABLE IF EXISTS `room_reserve`;
CREATE TABLE `room_reserve`  (
  `room_reserve_id` int(11) NOT NULL AUTO_INCREMENT,
  `reserve_id` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `room_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `roomtype_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `standard_price` double(10, 2) NOT NULL,
  `discount_price` double(10, 2) NULL DEFAULT NULL,
  `deposit` double(10, 2) NULL DEFAULT NULL,
  `customer_price` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`room_reserve_id`) USING BTREE,
  INDEX `number`(`room_number`) USING BTREE,
  INDEX `name`(`roomtype_name`) USING BTREE,
  CONSTRAINT `name` FOREIGN KEY (`roomtype_name`) REFERENCES `roomtype` (`roomtype_name`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `number` FOREIGN KEY (`room_number`) REFERENCES `room` (`room_number`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for roomtype
-- ----------------------------
DROP TABLE IF EXISTS `roomtype`;
CREATE TABLE `roomtype`  (
  `roomtype_id` int(11) NOT NULL AUTO_INCREMENT,
  `roomtype_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '双人间、单人间、四人间、钟点房、总统套房',
  `roomtype_size` int(11) NOT NULL,
  `roomtype_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`roomtype_id`) USING BTREE,
  INDEX `roomtype name`(`roomtype_name`, `roomtype_size`) USING BTREE,
  INDEX `roomtype name_2`(`roomtype_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_permissions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员、经理、前台人员',
  `user_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `user name`(`user_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
