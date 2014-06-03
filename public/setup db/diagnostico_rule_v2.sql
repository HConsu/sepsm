/*
Navicat MySQL Data Transfer

Source Server         : Xampp's MySQL
Source Server Version : 50532
Source Host           : 127.0.0.1:3306
Source Database       : diagnostico_rule

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2014-06-03 17:23:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `pacientes`
-- ----------------------------
DROP TABLE IF EXISTS `pacientes`;
CREATE TABLE `pacientes` (
  `idpaciente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `peso` float(5,0) DEFAULT NULL,
  `talla` float(5,0) DEFAULT NULL,
  PRIMARY KEY (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pacientes
-- ----------------------------
INSERT INTO `pacientes` VALUES ('1', 'pedro', '20', 'masculino', '50', '10');
INSERT INTO `pacientes` VALUES ('2', 'juan', '30', 'masculino', '20', '10');
INSERT INTO `pacientes` VALUES ('3', 'luis', '40', 'masculino', '30', '10');

-- ----------------------------
-- Table structure for `prediagnostico`
-- ----------------------------
DROP TABLE IF EXISTS `prediagnostico`;
CREATE TABLE `prediagnostico` (
  `idprediagnostico` int(10) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `resultado` varchar(50) DEFAULT NULL,
  `idpacientes` int(11) NOT NULL,
  `idusuario` int(11) NOT NULL,
  PRIMARY KEY (`idprediagnostico`),
  KEY `idpacientes` (`idpacientes`),
  KEY `idusuario` (`idusuario`),
  CONSTRAINT `idusuario` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idpacientes` FOREIGN KEY (`idpacientes`) REFERENCES `pacientes` (`idpaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prediagnostico
-- ----------------------------
INSERT INTO `prediagnostico` VALUES ('1', '2014-06-03 17:20:55', 'hipertensión', '1', '1');
INSERT INTO `prediagnostico` VALUES ('2', '2014-06-03 17:21:55', 'obesidad', '2', '2');
INSERT INTO `prediagnostico` VALUES ('3', '2014-06-03 17:22:30', 'diabetes', '3', '1');

-- ----------------------------
-- Table structure for `usuarios`
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) DEFAULT NULL,
  `password` varchar(38) DEFAULT NULL,
  `cedula_prof` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
INSERT INTO `usuarios` VALUES ('1', 'david@sepsm', 'david', '1925421');
INSERT INTO `usuarios` VALUES ('2', 'adal@sepsm', 'adal', '1925422');
INSERT INTO `usuarios` VALUES ('3', 'dev@sepsm', 'dev', '1925423');
