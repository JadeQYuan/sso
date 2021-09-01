SET
FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cas_user
-- ----------------------------
DROP TABLE IF EXISTS `cas_user`;
CREATE TABLE `cas_user`
(
    `id`       bigint(20) NOT NULL AUTO_INCREMENT,
    `name`     varchar(50) NOT NULL,
    `mobile`   varchar(15) NOT NULL,
    `password` varchar(64) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cas_user
-- ----------------------------
INSERT INTO `cas_user`
VALUES ('1', 'admin', '12345678910', '123456');
