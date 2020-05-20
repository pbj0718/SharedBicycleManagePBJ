/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 50631
 Source Host           : localhost:3306
 Source Schema         : sharedbicyclemanagepbj

 Target Server Type    : MySQL
 Target Server Version : 50631
 File Encoding         : 65001

 Date: 19/05/2020 18:53:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bike_info
-- ----------------------------
DROP TABLE IF EXISTS `bike_info`;
CREATE TABLE `bike_info`  (
  `bike_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bike_type` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bike_supplier` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bike_cate` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bike_status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`bike_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bike_info
-- ----------------------------
INSERT INTO `bike_info` VALUES ('02ccd8102f8944a2b4d587c4bca77e4b', 'A86', '凤凰', '山地自行车', 1);
INSERT INTO `bike_info` VALUES ('03e82d0479604daabe9b1c18e608a831', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('04ade5327dc54eeba99f59fc64618ac0', 'A50', '美利达', '公路自行车', 0);
INSERT INTO `bike_info` VALUES ('063772cfe36f4ef38e64680ae5ab2f45', 'A50', '美利达', '公路自行车', 0);
INSERT INTO `bike_info` VALUES ('0b08ffc8f9324288a7de2e49971dfcb5', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('0d95a37c42e04fb8b671a0df42754e4c', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('13c63772917540b982f0532725d7681b', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('1a9907a2f06a415c96982507dc90dc6b', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('1f265466b39141258d3b1b6eda6e8ed2', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('2311af373fad48c3aa5d3fa598773538', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('267eae6dd1324f7d99ed583990f99717', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('2d0dc05d70b741319666d4de25bf123d', 'A86', '凤凰', '山地自行车', 1);
INSERT INTO `bike_info` VALUES ('33c6b1ee9af54224902e4a0a398adc76', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('389b5175daf24333839beeba28362570', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('3d3be982bb444e0c9ecf007824b5a003', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('49bb60ef2d104576bf68d1476583a79d', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('4c99c33bdb864f78a3b99e9874636374', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('58ab99d39cd04a3c82914522817a4e63', 'A86', '凤凰', '山地自行车', 1);
INSERT INTO `bike_info` VALUES ('5b2b86515a08445a8f6ccbd3655bebe2', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('5fcdb8b65caa4b5c97f1e7bc823fb188', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('66b803a1c92849089da7c1be24d20787', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('70b32e8ac5b241c7bb3a7c2e0aeae0a6', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('76edd4c9da7f4af9830d8e541114e53c', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('82a88d90b21d4d4d833b59a010cfedb7', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('82e5f03232dd4763b2b791e27e855bcf', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('842a11d050b34e29a3ffb40d635312ad', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('84ad0cc051cb4cb390559fd6bbb5350d', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('87cc6ea0fb0941f28edca2b57835e738', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('8eb7dbbd6f38404ebd1966957d35709a', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('911295606ec849f789bfe8308c5171f4', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('91504d3791934f4eb7fe7ee351eefc8f', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('9826e7a826574893aece4707bccfe882', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('9b843d9fcc1b470aa05d5f776dfb7154', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('a521ab0ecf424b49a07203c44ec46bb0', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('a5571a8d71f4468eb9267183f4f23be2', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('aa2317b752764ac7baeb6071d6d4e45b', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('b16b55b9542c4524bae4854f55fec78d', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('b322cc34683448cb9ae78566fc1d9954', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('b4dd4ccc56504330a48c0e46704d1cca', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('bbfd8a06edcf4f5bbc6384ad0f12a923', 'A86', '凤凰', '山地自行车', 1);
INSERT INTO `bike_info` VALUES ('bdc285a367194e9f90c67b12ef32a1a0', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('c00e0e80f8824ebf9bd96b791cdabdd1', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('c1f2db9dbde04be080a9ce2ac3572ba0', 'A86', '凤凰', '山地自行车', 1);
INSERT INTO `bike_info` VALUES ('c21c0f0d47444d638991e4343bb908cc', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('c69259b1603940898f9a5df478c84f20', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('ce240070dd724b4e9f2d17f908196054', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('d266776db6a94b9887434e4f850575df', 'AE86', '捷达', '折叠自行车', 1);
INSERT INTO `bike_info` VALUES ('e6428baf01fa445294f0879014a68108', 'A50', '美利达', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('e8447e9e90bd479e8cf43d2e1a676010', '熔岩5', '捷安特', '公路自行车', 1);
INSERT INTO `bike_info` VALUES ('eb590ffad5ce48e6a4038f9fb239d642', 'AE86', '捷达', '折叠自行车', 1);

SET FOREIGN_KEY_CHECKS = 1;
