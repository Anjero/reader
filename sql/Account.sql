-- auto Generated on 2017-05-10 16:00:09 
-- DROP TABLE IF EXISTS `account`; 

use reader_db;
CREATE TABLE `account`(
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `avator` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'avator',
    `username` VARCHAR (50) UNIQUE NOT NULL DEFAULT '' COMMENT 'username',
    `password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
    `nickname` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'nickname',
    `in_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'inTime',
    `sex` INT (2) NOT NULL DEFAULT -1 COMMENT 'sex',
    `desc` VARCHAR (1000) NOT NULL DEFAULT '' COMMENT 'desc',
    `type` INT (2) NOT NULL DEFAULT 0 COMMENT 'type',
    INDEX(username),
    INDEX(nickname),
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`account`';
