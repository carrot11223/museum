-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboots8ut5
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bowuguan`
--

DROP TABLE IF EXISTS `bowuguan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bowuguan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '博物馆名称',
  `bowuguanleibie` varchar(200) DEFAULT NULL COMMENT '博物馆类别',
  `bieming` varchar(200) DEFAULT NULL COMMENT '别名',
  `fuzeren` varchar(200) DEFAULT NULL COMMENT '负责人',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `shifoukaifang` varchar(200) DEFAULT NULL COMMENT '是否开放',
  `kaifangshijian` varchar(200) DEFAULT NULL COMMENT '开放时间',
  `chenglishijian` date DEFAULT NULL COMMENT '成立时间',
  `bowuguanxiangqing` longtext COMMENT '博物馆详情',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971320276 DEFAULT CHARSET=utf8 COMMENT='博物馆';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bowuguan`
--

LOCK TABLES `bowuguan` WRITE;
/*!40000 ALTER TABLE `bowuguan` DISABLE KEYS */;
INSERT INTO `bowuguan` VALUES (21,'2021-04-09 10:09:46','博物馆名称1','博物馆类别1','别名1','负责人1','电话1','地址1','是','开放时间1','2021-04-09','博物馆详情1','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian1.jpg',1,1,'2021-04-09 18:09:46',1),(22,'2021-04-09 10:09:46','博物馆名称2','博物馆类别2','别名2','负责人2','电话2','地址2','是','开放时间2','2021-04-09','博物馆详情2','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian2.jpg',2,2,'2021-04-09 20:31:06',3),(23,'2021-04-09 10:09:46','博物馆名称3','博物馆类别3','别名3','负责人3','电话3','地址3','是','开放时间3','2021-04-09','博物馆详情3','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian3.jpg',3,3,'2021-04-09 18:09:46',3),(24,'2021-04-09 10:09:46','博物馆名称4','博物馆类别4','别名4','负责人4','电话4','地址4','是','开放时间4','2021-04-09','博物馆详情4','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian4.jpg',4,4,'2021-04-09 18:09:46',4),(25,'2021-04-09 10:09:46','博物馆名称5','博物馆类别5','别名5','负责人5','电话5','地址5','是','开放时间5','2021-04-09','博物馆详情5','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian5.jpg',5,5,'2021-04-09 18:09:46',5),(26,'2021-04-09 10:09:46','博物馆名称6','博物馆类别6','别名6','负责人6','电话6','地址6','是','开放时间6','2021-04-09','博物馆详情6','http://localhost:8080/springboots8ut5/upload/bowuguan_tupian6.jpg',6,6,'2021-04-09 18:09:46',6),(1617971320275,'2021-04-09 12:28:39','的想法水电费打算','是的发生的','水电费删掉','水电费删掉','1111122221','水电费删掉删掉发送到','是','第三方删掉水电费删掉发送到删掉','2017-04-06','<p>电风扇发顺丰打算发生过订个蛋糕的人电饭锅鼎折覆餗给跟第三个第三方</p><p><img src=\"http://localhost:8080/springboots8ut5/upload/1617971314719.png\"></p><p><img src=\"http://localhost:8080/springboots8ut5/upload/1617971317699.png\"></p>','http://localhost:8080/springboots8ut5/upload/1617971307444.jpg',1,0,'2021-04-09 20:31:32',11);
/*!40000 ALTER TABLE `bowuguan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/springboots8ut5/upload/1617971425149.png'),(2,'picture2','http://localhost:8080/springboots8ut5/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/springboots8ut5/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussbowuguan`
--

DROP TABLE IF EXISTS `discussbowuguan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussbowuguan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971478354 DEFAULT CHARSET=utf8 COMMENT='博物馆评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussbowuguan`
--

LOCK TABLES `discussbowuguan` WRITE;
/*!40000 ALTER TABLE `discussbowuguan` DISABLE KEYS */;
INSERT INTO `discussbowuguan` VALUES (91,'2021-04-09 10:09:46',1,1,'用户名1','评论内容1','回复内容1'),(92,'2021-04-09 10:09:46',2,2,'用户名2','评论内容2','回复内容2'),(93,'2021-04-09 10:09:46',3,3,'用户名3','评论内容3','回复内容3'),(94,'2021-04-09 10:09:46',4,4,'用户名4','评论内容4','回复内容4'),(95,'2021-04-09 10:09:46',5,5,'用户名5','评论内容5','回复内容5'),(96,'2021-04-09 10:09:46',6,6,'用户名6','评论内容6','回复内容6'),(1617971478353,'2021-04-09 12:31:17',1617971320275,1617971249877,'11','地方是否删掉发送到',NULL);
/*!40000 ALTER TABLE `discussbowuguan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusswenwuxinxi`
--

DROP TABLE IF EXISTS `discusswenwuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusswenwuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='文物信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusswenwuxinxi`
--

LOCK TABLES `discusswenwuxinxi` WRITE;
/*!40000 ALTER TABLE `discusswenwuxinxi` DISABLE KEYS */;
INSERT INTO `discusswenwuxinxi` VALUES (101,'2021-04-09 10:09:46',1,1,'用户名1','评论内容1','回复内容1'),(102,'2021-04-09 10:09:46',2,2,'用户名2','评论内容2','回复内容2'),(103,'2021-04-09 10:09:46',3,3,'用户名3','评论内容3','回复内容3'),(104,'2021-04-09 10:09:46',4,4,'用户名4','评论内容4','回复内容4'),(105,'2021-04-09 10:09:46',5,5,'用户名5','评论内容5','回复内容5'),(106,'2021-04-09 10:09:46',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusswenwuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszhanlanxinxi`
--

DROP TABLE IF EXISTS `discusszhanlanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszhanlanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='展览信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszhanlanxinxi`
--

LOCK TABLES `discusszhanlanxinxi` WRITE;
/*!40000 ALTER TABLE `discusszhanlanxinxi` DISABLE KEYS */;
INSERT INTO `discusszhanlanxinxi` VALUES (111,'2021-04-09 10:09:46',1,1,'用户名1','评论内容1','回复内容1'),(112,'2021-04-09 10:09:46',2,2,'用户名2','评论内容2','回复内容2'),(113,'2021-04-09 10:09:46',3,3,'用户名3','评论内容3','回复内容3'),(114,'2021-04-09 10:09:46',4,4,'用户名4','评论内容4','回复内容4'),(115,'2021-04-09 10:09:46',5,5,'用户名5','评论内容5','回复内容5'),(116,'2021-04-09 10:09:46',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusszhanlanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971503160 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1617971503159,'2021-04-09 12:31:42',1617971249877,1617971360630,'wenwuxinxi','森岛帆高打算','http://localhost:8080/springboots8ut5/upload/1617971351454.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1617971249877,'11','yonghu','用户','iurez8c94qp8d153fx6tzwuvq5pu3udp','2021-04-09 12:27:33','2021-04-09 13:31:12'),(2,1,'abo','users','管理员','utmm0ef3uw9fam8lp8um6iq5aal4r2z9','2021-04-09 12:27:51','2021-04-09 13:32:20');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhigonggao`
--

DROP TABLE IF EXISTS `tongzhigonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhigonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `jianjie` longtext COMMENT '简介',
  `neirong` longtext COMMENT '内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971398789 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhigonggao`
--

LOCK TABLES `tongzhigonggao` WRITE;
/*!40000 ALTER TABLE `tongzhigonggao` DISABLE KEYS */;
INSERT INTO `tongzhigonggao` VALUES (61,'2021-04-09 10:09:46','标题1','简介1','内容1','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian1.jpg','2021-04-09 18:09:46',1),(62,'2021-04-09 10:09:46','标题2','简介2','内容2','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian2.jpg','2021-04-09 18:09:46',2),(63,'2021-04-09 10:09:46','标题3','简介3','内容3','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian3.jpg','2021-04-09 18:09:46',3),(64,'2021-04-09 10:09:46','标题4','简介4','内容4','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian4.jpg','2021-04-09 18:09:46',4),(65,'2021-04-09 10:09:46','标题5','简介5','内容5','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian5.jpg','2021-04-09 18:09:46',5),(66,'2021-04-09 10:09:46','标题6','简介6','内容6','2021-04-09','http://localhost:8080/springboots8ut5/upload/tongzhigonggao_fengmian6.jpg','2021-04-09 18:09:46',6),(1617971398788,'2021-04-09 12:29:58','删掉如发生地方删掉','地方删掉分数f','<p>删掉发送人广电刚发的发的萨删掉删掉给对方给对方g</p><p><img src=\"http://localhost:8080/springboots8ut5/upload/1617971397345.png\"></p>','2021-04-01','http://localhost:8080/springboots8ut5/upload/1617971391017.jpg','2021-04-09 20:30:02',1);
/*!40000 ALTER TABLE `tongzhigonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-04-09 10:09:46');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenwuleibie`
--

DROP TABLE IF EXISTS `wenwuleibie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenwuleibie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenwuleibie` varchar(200) DEFAULT NULL COMMENT '文物类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971342477 DEFAULT CHARSET=utf8 COMMENT='文物类别';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenwuleibie`
--

LOCK TABLES `wenwuleibie` WRITE;
/*!40000 ALTER TABLE `wenwuleibie` DISABLE KEYS */;
INSERT INTO `wenwuleibie` VALUES (51,'2021-04-09 10:09:46','文物类别1'),(52,'2021-04-09 10:09:46','文物类别2'),(53,'2021-04-09 10:09:46','文物类别3'),(54,'2021-04-09 10:09:46','文物类别4'),(55,'2021-04-09 10:09:46','文物类别5'),(56,'2021-04-09 10:09:46','文物类别6'),(1617971337863,'2021-04-09 12:28:57','地方'),(1617971342476,'2021-04-09 12:29:01','规范化');
/*!40000 ALTER TABLE `wenwuleibie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenwutongji`
--

DROP TABLE IF EXISTS `wenwutongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenwutongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tongjibianhao` varchar(200) DEFAULT NULL COMMENT '统计编号',
  `bowuguan` varchar(200) DEFAULT NULL COMMENT '博物馆',
  `wenwushuliang` int(11) DEFAULT NULL COMMENT '文物数量',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tongjibianhao` (`tongjibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971412554 DEFAULT CHARSET=utf8 COMMENT='文物统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenwutongji`
--

LOCK TABLES `wenwutongji` WRITE;
/*!40000 ALTER TABLE `wenwutongji` DISABLE KEYS */;
INSERT INTO `wenwutongji` VALUES (71,'2021-04-09 10:09:46','统计编号1','博物馆1',1,'2021-03-01','备注1'),(72,'2021-04-09 10:09:46','统计编号2','博物馆2',2,'2021-04-09','备注2'),(73,'2021-04-09 10:09:46','统计编号3','博物馆3',3,'2021-03-11','备注3'),(74,'2021-04-09 10:09:46','统计编号4','博物馆4',4,'2021-04-09','备注4'),(75,'2021-04-09 10:09:46','统计编号5','博物馆5',5,'2021-04-09','备注5'),(76,'2021-04-09 10:09:46','统计编号6','博物馆6',6,'2021-04-09','备注6'),(1617971412553,'2021-04-09 12:30:11','1617971358841','博物馆名称2',1500,'2021-04-02','水电费删掉是的方法水电费');
/*!40000 ALTER TABLE `wenwutongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenwuxinxi`
--

DROP TABLE IF EXISTS `wenwuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenwuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguan` varchar(200) DEFAULT NULL COMMENT '博物馆',
  `wenwumingcheng` varchar(200) DEFAULT NULL COMMENT '文物名称',
  `wenwuleibie` varchar(200) DEFAULT NULL COMMENT '文物类别',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `wenwuxiangqing` longtext COMMENT '文物详情',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971360631 DEFAULT CHARSET=utf8 COMMENT='文物信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenwuxinxi`
--

LOCK TABLES `wenwuxinxi` WRITE;
/*!40000 ALTER TABLE `wenwuxinxi` DISABLE KEYS */;
INSERT INTO `wenwuxinxi` VALUES (31,'2021-04-09 10:09:46','博物馆1','文物名称1','文物类别1','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian1.jpg','文物详情1',1,1,'2021-04-09 18:09:46',1),(32,'2021-04-09 10:09:46','博物馆2','文物名称2','文物类别2','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian2.jpg','文物详情2',2,2,'2021-04-09 18:09:46',2),(33,'2021-04-09 10:09:46','博物馆3','文物名称3','文物类别3','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian3.jpg','文物详情3',3,3,'2021-04-09 18:09:46',3),(34,'2021-04-09 10:09:46','博物馆4','文物名称4','文物类别4','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian4.jpg','文物详情4',4,4,'2021-04-09 18:09:46',4),(35,'2021-04-09 10:09:46','博物馆5','文物名称5','文物类别5','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian5.jpg','文物详情5',5,5,'2021-04-09 18:09:46',5),(36,'2021-04-09 10:09:46','博物馆6','文物名称6','文物类别6','http://localhost:8080/springboots8ut5/upload/wenwuxinxi_tupian6.jpg','文物详情6',6,6,'2021-04-09 18:09:46',6),(1617971360630,'2021-04-09 12:29:19','博物馆名称3','森岛帆高打算','地方','http://localhost:8080/springboots8ut5/upload/1617971351454.jpg','<p>水电费是发辅导费删掉分数鬼地方个地方</p><p><img src=\"http://localhost:8080/springboots8ut5/upload/1617971357170.jpg\"></p><p><br></p>',0,0,'2021-04-09 20:32:11',4);
/*!40000 ALTER TABLE `wenwuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971249878 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-04-09 10:09:46','用户1','123456','姓名1','年龄1','男','13823888881','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian1.jpg'),(12,'2021-04-09 10:09:46','用户2','123456','姓名2','年龄2','男','13823888882','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian2.jpg'),(13,'2021-04-09 10:09:46','用户3','123456','姓名3','年龄3','男','13823888883','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian3.jpg'),(14,'2021-04-09 10:09:46','用户4','123456','姓名4','年龄4','男','13823888884','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian4.jpg'),(15,'2021-04-09 10:09:46','用户5','123456','姓名5','年龄5','男','13823888885','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian5.jpg'),(16,'2021-04-09 10:09:46','用户6','123456','姓名6','年龄6','男','13823888886','http://localhost:8080/springboots8ut5/upload/yonghu_zhaopian6.jpg'),(1617971249877,'2021-04-09 12:27:29','11','11','地方','11','男','11111111111','http://localhost:8080/springboots8ut5/upload/1617971262693.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhanlanxinxi`
--

DROP TABLE IF EXISTS `zhanlanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhanlanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguan` varchar(200) DEFAULT NULL COMMENT '博物馆',
  `zhanlanwenwu` varchar(200) DEFAULT NULL COMMENT '展览文物',
  `wenwuleibie` varchar(200) DEFAULT NULL COMMENT '文物类别',
  `kaishishijian` date DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` date DEFAULT NULL COMMENT '结束时间',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `wenwuxiangqing` longtext COMMENT '文物详情',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1617971380745 DEFAULT CHARSET=utf8 COMMENT='展览信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhanlanxinxi`
--

LOCK TABLES `zhanlanxinxi` WRITE;
/*!40000 ALTER TABLE `zhanlanxinxi` DISABLE KEYS */;
INSERT INTO `zhanlanxinxi` VALUES (41,'2021-04-09 10:09:46','博物馆1','展览文物1','文物类别1','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian1.jpg','文物详情1','2021-04-09 18:09:46',1),(42,'2021-04-09 10:09:46','博物馆2','展览文物2','文物类别2','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian2.jpg','文物详情2','2021-04-09 18:09:46',2),(43,'2021-04-09 10:09:46','博物馆3','展览文物3','文物类别3','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian3.jpg','文物详情3','2021-04-09 18:09:46',3),(44,'2021-04-09 10:09:46','博物馆4','展览文物4','文物类别4','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian4.jpg','文物详情4','2021-04-09 18:09:46',4),(45,'2021-04-09 10:09:46','博物馆5','展览文物5','文物类别5','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian5.jpg','文物详情5','2021-04-09 18:09:46',5),(46,'2021-04-09 10:09:46','博物馆6','展览文物6','文物类别6','2021-04-09','2021-04-09','http://localhost:8080/springboots8ut5/upload/zhanlanxinxi_tupian6.jpg','文物详情6','2021-04-09 18:09:46',6),(1617971380744,'2021-04-09 12:29:40','博物馆名称2','宿管电饭锅','文物类别3','2021-04-01','2021-04-15','http://localhost:8080/springboots8ut5/upload/1617971373941.jpg','<p>地方删掉发送到鬼地方个电饭锅地方给对方</p><p><img src=\"http://localhost:8080/springboots8ut5/upload/1617971378796.png\"></p>','2021-04-09 20:32:03',3);
/*!40000 ALTER TABLE `zhanlanxinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-14 18:06:26
