-- 创建数据库

CREATE DATABASE recruitment  CHARACTER SET utf8 COLLATE utf8_general_ci;

use recruitment;

-- 创建普通用户表(求职者)
CREATE TABLE candidate(
 `candidate_id` bigint NOT NULL AUTO_INCREMENT COMMENT '普通用户表id',
 `username`  VARCHAR(20) NOT NULL COMMENT '姓名',
 `password` VARCHAR(50) NOT NULL COMMENT '密码',
 `email` VARCHAR(50) NOT NULL   COMMENT '邮箱',
 PRIMARY KEY (candidate_id),
 KEY idx_username(username)
)DEFAULT CHARSET=utf8 COMMENT='普通用户表';



-- 创建企业用户表
--    公司名 CNAME
--    Id
--    地址  ADDRESS
--    联系方式	 TEL
--    公司基本简介  SYN
--    公司性质  TYPE(int)
CREATE TABLE enterprise(
 `enterprise_id` bigint NOT NULL AUTO_INCREMENT COMMENT '企业用户表id',
 `username`  VARCHAR(20) NOT NULL COMMENT '姓名',
 `passsword` VARCHAR(50) NOT NULL COMMENT '密码',
 `email` VARCHAR(50) NOT NULL   COMMENT '邮箱',
  `address` VARCHAR(50) COMMENT '地址',
  `tel` BIGINT COMMENT '联系方式',
  `syn` TEXT COMMENT  '公司基本简介',
  `type` TINYINT DEFAULT 0 COMMENT '公司性质',
 PRIMARY KEY (enterprise_id)
)DEFAULT CHARSET=utf8 COMMENT='企业用户表';



-- 普通用户个人简历表
--  普通用户id：candidate_id(对应属性 candidateId);
--  姓名    name
--  性别		sex
--  出生日期  DATE
--  手机   TEL
--  居住地	ADD
--  学历  EDU
--  毕业学校   SCH
--  毕业年份   YEAR
--  专业	   major
--  工作经验描述  DES
CREATE TABLE resume(
  `candidate_id` bigint NOT NULL  COMMENT '主外键普通用户表id',
  `name`  VARCHAR(20) NOT NULL COMMENT '姓名',
  `sex` TINYINT NOT NULL COMMENT '性别(0:男,1:女)',
  `date` DATE NOT NULL  COMMENT '出生日期',
  `add` VARCHAR(50) NOT NULL COMMENT '居住地',
  `edu` TINYINT NOT NULL COMMENT '学历',
  `tel` BIGINT  NOT NULL COMMENT '手机',
  `sch` TEXT  NOT NULL COMMENT '毕业学校',
  `year` DATE NOT NULL COMMENT '毕业年份',
  `major` VARCHAR(20) NOT NULL COMMENT '专业',
  `des` TEXT NOT NULL COMMENT  '工作经验描述',
  PRIMARY KEY (candidate_id)
)DEFAULT CHARSET=utf8 COMMENT='普通用户个人简历表';


-- 企业用户发布招聘信息表(job)
--  Id
--  工作经验要求   EXP
--  学历  EDU
--  待招人数 NUM
--  发布时间  DATE
--  薪资  SAL
--  福利	WEL
--  职位  POSITION
--  职位描述  DES
--  工作地点  ADD
CREATE TABLE job(
  `job_id` bigint NOT NULL AUTO_INCREMENT COMMENT '招聘信息表id',
  `enterprise_id` bigint NOT NULL COMMENT '关联企业用户表id',
  `exp`  VARCHAR(100) NOT NULL COMMENT '工作经验要求',
  `edu` TINYINT NOT NULL COMMENT '学历要求',
  `num` INT NOT NULL  COMMENT '待招人数',
  `date` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `sal` DOUBLE  NOT NULL COMMENT '薪资',
  `wel` TEXT  COMMENT '福利',
  `position` VARCHAR(20) NOT NULL COMMENT '职位',
  `des` TEXT NOT NULL COMMENT  '职位描述',
  `add` VARCHAR(50) NOT NULL COMMENT '工作地点',
  PRIMARY KEY (job_id)
)DEFAULT CHARSET=utf8 COMMENT='招聘信息表';




-- 企业招聘 candidate_job
--  招聘信息id
--  用户id
--  状态(0:未检阅,1:已检阅,2:录用)
CREATE TABLE candidate_job(
  `job_id` bigint NOT NULL  COMMENT '招聘信息表id',
  `candidate_id` bigint NOT NULL  COMMENT '普通用户表id',
  `state` TINYINT DEFAULT 0 COMMENT '状态',
  PRIMARY KEY (job_id,candidate_id)
)DEFAULT CHARSET=utf8 COMMENT='招聘表';


-- 用户浏览收藏表
--  用户id
--  收藏的招聘信息id
--  状态(0:我看过的简历,1:收藏,2:我投递的简历)
CREATE TABLE collection(
  `candidate_id` bigint NOT NULL  COMMENT '普通用户id',
  `job_id` bigint NOT NULL  COMMENT '用户收藏的招聘信息表id',
  `state` TINYINT  COMMENT '状态',
  PRIMARY KEY (candidate_id,job_id)
)DEFAULT CHARSET=utf8 COMMENT='浏览收藏表';

/*-- 普通用户发布求职信息表
--  用户id
--  投递简历的招聘信息id
CREATE TABLE candidate_job(
  `candidate_id` bigint NOT NULL  COMMENT '普通用户id',
  `job_id` bigint NOT NULL  COMMENT '投递简历的招聘信息表id',
  PRIMARY KEY (candidate_id,job_id)
)DEFAULT CHARSET=utf8 COMMENT='普通用户发布求职信息表';*/













