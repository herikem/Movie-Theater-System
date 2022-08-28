-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 19-Nov-2021 às 11:59
-- Versão do servidor: 5.7.31
-- versão do PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbcinema`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bilhete`
--

DROP TABLE IF EXISTS `bilhete`;
CREATE TABLE IF NOT EXISTS `bilhete` (
  `idNota` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `idFuncionario` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `tipoPagamento` varchar(10) DEFAULT NULL,
  `qtdIngressos` int(20) DEFAULT NULL,
  PRIMARY KEY (`idNota`),
  KEY `idBilheteNota` (`idFuncionario`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadeira`
--

DROP TABLE IF EXISTS `cadeira`;
CREATE TABLE IF NOT EXISTS `cadeira` (
  `idCadeira` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `idSala` int(11) NOT NULL,
  `numero` varchar(3) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idCadeira`),
  KEY `idSala` (`idSala`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=268 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cadeira`
--

INSERT INTO `cadeira` (`idCadeira`, `idSala`, `numero`, `estado`) VALUES
(2, 1, 'A1', 'livre'),
(3, 1, 'A2', 'livre'),
(4, 1, 'A3', 'livre'),
(5, 1, 'A4', 'livre'),
(6, 1, 'B1', 'livre'),
(7, 1, 'B2', 'livre'),
(8, 1, 'B3', 'livre'),
(9, 1, 'B4', 'livre'),
(10, 1, 'C1', 'livre'),
(11, 1, 'C2', 'livre'),
(12, 1, 'C3', 'livre'),
(13, 1, 'C4', 'livre'),
(14, 1, 'D1', 'livre'),
(15, 1, 'D2', 'livre'),
(16, 1, 'D3', 'livre'),
(17, 1, 'D4', 'livre'),
(18, 1, 'E1', 'livre'),
(19, 1, 'E2', 'livre'),
(20, 1, 'E3', 'livre'),
(21, 1, 'E4', 'livre'),
(22, 1, 'F4', 'livre'),
(23, 1, 'F3', 'livre'),
(24, 1, 'F2', 'livre'),
(25, 1, 'F1', 'livre'),
(26, 1, 'G1', 'livre'),
(27, 1, 'G2', 'livre'),
(28, 1, 'G3', 'livre'),
(29, 1, 'G4', 'livre'),
(30, 1, 'H4', 'livre'),
(31, 1, 'H3', 'livre'),
(32, 1, 'H2', 'livre'),
(33, 1, 'H1', 'livre'),
(34, 1, 'A5', 'livre'),
(35, 1, 'A6', 'livre'),
(36, 1, 'A7', 'livre'),
(37, 1, 'A8', 'livre'),
(38, 1, 'B5', 'livre'),
(39, 1, 'B6', 'livre'),
(40, 1, 'B7', 'livre'),
(41, 1, 'B8', 'livre'),
(42, 1, 'C5', 'livre'),
(43, 1, 'C6', 'livre'),
(44, 1, 'C7', 'livre'),
(45, 1, 'C8', 'livre'),
(46, 1, 'D5', 'livre'),
(47, 1, 'D6', 'livre'),
(48, 1, 'D7', 'livre'),
(49, 1, 'D8', 'livre'),
(50, 1, 'E5', 'livre'),
(51, 1, 'E6', 'livre'),
(52, 1, 'E7', 'livre'),
(53, 1, 'E8', 'livre'),
(54, 1, 'F5', 'livre'),
(55, 1, 'F6', 'livre'),
(56, 1, 'F7', 'livre'),
(57, 1, 'F8', 'livre'),
(58, 1, 'G5', 'livre'),
(59, 1, 'G6', 'livre'),
(60, 1, 'G7', 'livre'),
(61, 1, 'G8', 'livre'),
(62, 1, 'H8', 'livre'),
(63, 1, 'H7', 'livre'),
(64, 1, 'H6', 'livre'),
(65, 1, 'H5', 'livre'),
(66, 2, 'A1', 'livre'),
(67, 2, 'A2', 'livre'),
(68, 2, 'A3', 'livre'),
(69, 2, 'A4', 'livre'),
(70, 2, 'B1', 'livre'),
(71, 2, 'B2', 'livre'),
(72, 2, 'B3', 'livre'),
(73, 2, 'B4', 'livre'),
(74, 2, 'C1', 'livre'),
(75, 2, 'C2', 'livre'),
(76, 2, 'C3', 'livre'),
(77, 2, 'C4', 'livre'),
(78, 2, 'D1', 'livre'),
(79, 2, 'D2', 'livre'),
(80, 2, 'D3', 'livre'),
(81, 2, 'D4', 'livre'),
(82, 2, 'E1', 'livre'),
(83, 2, 'E2', 'livre'),
(84, 2, 'E3', 'livre'),
(85, 2, 'E4', 'livre'),
(86, 2, 'F4', 'livre'),
(87, 2, 'F3', 'livre'),
(88, 2, 'F2', 'livre'),
(89, 2, 'F1', 'livre'),
(90, 2, 'G1', 'livre'),
(91, 2, 'G2', 'livre'),
(92, 2, 'G3', 'livre'),
(93, 2, 'G4', 'livre'),
(94, 2, 'H4', 'livre'),
(95, 2, 'H3', 'livre'),
(96, 2, 'H2', 'livre'),
(97, 2, 'H1', 'livre'),
(98, 2, 'A5', 'livre'),
(99, 2, 'A6', 'livre'),
(100, 2, 'A7', 'livre'),
(101, 2, 'A8', 'livre'),
(102, 2, 'B5', 'livre'),
(103, 2, 'B6', 'livre'),
(104, 2, 'B7', 'livre'),
(105, 2, 'B8', 'livre'),
(106, 2, 'C5', 'livre'),
(107, 2, 'C6', 'livre'),
(108, 2, 'C7', 'livre'),
(109, 2, 'C8', 'livre'),
(110, 2, 'D5', 'livre'),
(111, 2, 'D6', 'livre'),
(112, 2, 'D7', 'livre'),
(113, 2, 'D8', 'livre'),
(114, 2, 'E5', 'livre'),
(115, 2, 'E6', 'livre'),
(116, 2, 'E7', 'livre'),
(117, 2, 'E8', 'livre'),
(118, 2, 'F5', 'livre'),
(119, 2, 'F6', 'livre'),
(120, 2, 'F7', 'livre'),
(121, 2, 'F8', 'livre'),
(122, 2, 'G5', 'livre'),
(123, 2, 'G6', 'livre'),
(124, 2, 'G7', 'livre'),
(125, 2, 'G8', 'livre'),
(126, 2, 'H8', 'livre'),
(127, 2, 'H7', 'livre'),
(128, 2, 'H6', 'livre'),
(129, 2, 'H5', 'livre'),
(130, 3, 'A1', 'livre'),
(131, 3, 'A2', 'livre'),
(132, 3, 'A3', 'livre'),
(133, 3, 'A4', 'livre'),
(134, 3, 'B1', 'livre'),
(135, 3, 'B2', 'livre'),
(136, 3, 'B3', 'livre'),
(137, 3, 'B4', 'livre'),
(138, 3, 'C1', 'livre'),
(139, 3, 'C2', 'livre'),
(140, 3, 'C3', 'livre'),
(141, 3, 'C4', 'livre'),
(142, 3, 'D1', 'livre'),
(143, 3, 'D2', 'livre'),
(144, 3, 'D3', 'livre'),
(145, 3, 'D4', 'livre'),
(146, 3, 'E1', 'livre'),
(147, 3, 'E2', 'livre'),
(148, 3, 'E3', 'livre'),
(149, 3, 'E4', 'livre'),
(150, 3, 'F4', 'livre'),
(151, 3, 'F3', 'livre'),
(152, 3, 'F2', 'livre'),
(153, 3, 'F1', 'livre'),
(154, 3, 'G1', 'livre'),
(155, 3, 'G2', 'livre'),
(156, 3, 'G3', 'livre'),
(157, 3, 'G4', 'livre'),
(158, 3, 'H4', 'livre'),
(159, 3, 'H3', 'livre'),
(160, 3, 'H2', 'livre'),
(161, 3, 'H1', 'livre'),
(162, 3, 'A5', 'livre'),
(163, 3, 'A6', 'livre'),
(164, 3, 'A7', 'livre'),
(165, 3, 'A8', 'livre'),
(166, 3, 'B5', 'livre'),
(167, 3, 'B6', 'livre'),
(168, 3, 'B7', 'livre'),
(169, 3, 'B8', 'livre'),
(170, 3, 'C5', 'livre'),
(171, 3, 'C6', 'livre'),
(172, 3, 'C7', 'livre'),
(173, 3, 'C8', 'livre'),
(174, 3, 'D5', 'livre'),
(175, 3, 'D6', 'livre'),
(176, 3, 'D7', 'livre'),
(177, 3, 'D8', 'livre'),
(178, 3, 'E5', 'livre'),
(179, 3, 'E6', 'livre'),
(180, 3, 'E7', 'livre'),
(181, 3, 'E8', 'livre'),
(182, 3, 'F5', 'livre'),
(183, 3, 'F6', 'livre'),
(184, 3, 'F7', 'livre'),
(185, 3, 'F8', 'livre'),
(186, 3, 'G5', 'livre'),
(187, 3, 'G6', 'livre'),
(188, 3, 'G7', 'livre'),
(189, 3, 'G8', 'livre'),
(190, 3, 'H8', 'livre'),
(191, 3, 'H7', 'livre'),
(192, 3, 'H6', 'livre'),
(193, 3, 'H5', 'livre'),
(194, 4, 'A1', 'livre'),
(195, 4, 'A2', 'livre'),
(196, 4, 'A3', 'livre'),
(197, 4, 'A4', 'livre'),
(198, 4, 'B1', 'livre'),
(199, 4, 'B2', 'livre'),
(200, 4, 'B3', 'livre'),
(201, 4, 'B4', 'livre'),
(202, 4, 'C1', 'livre'),
(203, 4, 'C2', 'livre'),
(204, 4, 'C3', 'livre'),
(205, 4, 'C4', 'livre'),
(206, 4, 'D1', 'livre'),
(207, 4, 'D2', 'livre'),
(208, 4, 'D3', 'livre'),
(209, 4, 'D4', 'livre'),
(210, 4, 'E1', 'livre'),
(211, 4, 'E2', 'livre'),
(212, 4, 'E3', 'livre'),
(213, 4, 'E4', 'livre'),
(214, 4, 'F4', 'livre'),
(215, 4, 'F3', 'livre'),
(216, 4, 'F2', 'livre'),
(217, 4, 'F1', 'livre'),
(218, 4, 'G1', 'livre'),
(219, 4, 'G2', 'livre'),
(220, 4, 'G3', 'livre'),
(221, 4, 'G4', 'livre'),
(222, 4, 'H4', 'livre'),
(223, 4, 'H3', 'livre'),
(224, 4, 'H2', 'livre'),
(225, 4, 'H1', 'livre'),
(226, 4, 'A5', 'livre'),
(227, 4, 'A6', 'livre'),
(228, 4, 'A7', 'livre'),
(229, 4, 'A8', 'livre'),
(230, 4, 'B5', 'livre'),
(231, 4, 'B6', 'livre'),
(232, 4, 'B7', 'livre'),
(233, 4, 'B8', 'livre'),
(234, 4, 'C5', 'livre'),
(235, 4, 'C6', 'livre'),
(236, 4, 'C7', 'livre'),
(237, 4, 'C8', 'livre'),
(238, 4, 'D5', 'livre'),
(239, 4, 'D6', 'livre'),
(240, 4, 'D7', 'livre'),
(241, 4, 'D8', 'livre'),
(242, 4, 'E5', 'livre'),
(243, 4, 'E6', 'livre'),
(244, 4, 'E7', 'livre'),
(245, 4, 'E8', 'livre'),
(246, 4, 'F5', 'livre'),
(247, 4, 'F6', 'livre'),
(248, 4, 'F7', 'livre'),
(249, 4, 'F8', 'livre'),
(250, 4, 'G5', 'livre'),
(251, 4, 'G6', 'livre'),
(252, 4, 'G7', 'livre'),
(253, 4, 'G8', 'livre'),
(254, 4, 'H8', 'livre'),
(255, 4, 'H7', 'livre'),
(256, 4, 'H6', 'livre'),
(257, 4, 'H5', 'livre');

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme`
--

DROP TABLE IF EXISTS `filme`;
CREATE TABLE IF NOT EXISTS `filme` (
  `idFilme` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `duracao` varchar(10) DEFAULT NULL,
  `genero` varchar(40) DEFAULT NULL,
  `diretor` varchar(40) DEFAULT NULL,
  `nomeFilme` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idFilme`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `filme`
--

INSERT INTO `filme` (`idFilme`, `duracao`, `genero`, `diretor`, `nomeFilme`) VALUES
(1, '02:10', 'Terror', 'Herik Lindovsky', 'O Ataque da Cobra Cega'),
(2, '01:30', 'Romance', 'Thiaguinho', 'As tranças do careca');

-- --------------------------------------------------------

--
-- Estrutura da tabela `filme_sala`
--

DROP TABLE IF EXISTS `filme_sala`;
CREATE TABLE IF NOT EXISTS `filme_sala` (
  `idFilmeSala` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `idSala` varchar(20) DEFAULT NULL,
  `idFilme` int(11) NOT NULL,
  `nomeFilme` varchar(60) DEFAULT NULL,
  `horario` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idFilmeSala`),
  KEY `idFilme` (`idFilme`),
  KEY `nomeFilme` (`nomeFilme`),
  KEY `idSala` (`idSala`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `filme_sala`
--

INSERT INTO `filme_sala` (`idFilmeSala`, `idSala`, `idFilme`, `nomeFilme`, `horario`) VALUES
(3, '1', 1, 'O Ataque da Cobra Cega', '08:00-10:10'),
(4, '2', 1, 'O Ataque da Cobra Cega', '10:10-12:20'),
(5, '3', 2, 'As tranças do careca', '08:00-09:30'),
(6, '4', 1, 'O Ataque da Cobra Cega', '08:00-09:30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `idFuncionario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idFuncionario`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idFuncionario`, `nome`, `cpf`, `telefone`, `login`, `senha`, `tipo`) VALUES
(5, 'atendente qualquer', '324.342.342-43', '(43) 24324-3232', 'ashua', '123', 'atendente'),
(1, 'Default', '123.456.789-10', '(99)9999-999', 'admin', 'admin', 'gerente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_bilhete`
--

DROP TABLE IF EXISTS `item_bilhete`;
CREATE TABLE IF NOT EXISTS `item_bilhete` (
  `idBilhete` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `preco` varchar(20) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `idNota` int(11) NOT NULL,
  `idCadeira` int(11) NOT NULL,
  `idFilmeSala` int(11) NOT NULL,
  PRIMARY KEY (`idBilhete`),
  KEY `idNota` (`idNota`),
  KEY `idCadeira` (`idCadeira`),
  KEY `idFilmeSala` (`idFilmeSala`)
) ENGINE=MyISAM AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sala`
--

DROP TABLE IF EXISTS `sala`;
CREATE TABLE IF NOT EXISTS `sala` (
  `idSala` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `qtd_cadeiras` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idSala`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `sala`
--

INSERT INTO `sala` (`idSala`, `qtd_cadeiras`) VALUES
(1, '64'),
(2, '64'),
(3, '64'),
(4, '64');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
