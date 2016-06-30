-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30-Jun-2016 às 16:24
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `transpack`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarclientefisico`
--

CREATE TABLE IF NOT EXISTS `cadastrarclientefisico` (
  `id_cf` int(20) NOT NULL AUTO_INCREMENT,
  `nomecf` varchar(20) NOT NULL,
  `rgcf` varchar(20) NOT NULL,
  `cpfcf` varchar(20) NOT NULL,
  `endcf` varchar(50) NOT NULL,
  `telrescf` varchar(20) NOT NULL,
  `telcelcf` varchar(20) NOT NULL,
  `emailcf` varchar(20) NOT NULL,
  PRIMARY KEY (`id_cf`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarclientejuridico`
--

CREATE TABLE IF NOT EXISTS `cadastrarclientejuridico` (
  `id_cj` int(5) NOT NULL AUTO_INCREMENT,
  `nomefantasia` text NOT NULL,
  `nomecontato` text NOT NULL,
  `cnpj` text NOT NULL,
  `ramal` text NOT NULL,
  `tel` text NOT NULL,
  `email` text NOT NULL,
  `tiposerviço` text NOT NULL,
  PRIMARY KEY (`id_cj`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarequipamento`
--

CREATE TABLE IF NOT EXISTS `cadastrarequipamento` (
  `id_equipamento` int(2) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  `n_serie` varchar(20) NOT NULL,
  `area_pertence` text NOT NULL,
  `descricao` text NOT NULL,
  PRIMARY KEY (`id_equipamento`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarfuncionario`
--

CREATE TABLE IF NOT EXISTS `cadastrarfuncionario` (
  `id_cadastro` int(11) NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `cargo` text NOT NULL,
  `inicioContrato` text NOT NULL,
  `fimContrato` text NOT NULL,
  `cel` text NOT NULL,
  `tel` text NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `rg` varchar(9) NOT NULL,
  PRIMARY KEY (`id_cadastro`,`cpf`,`rg`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarfuncionario2`
--

CREATE TABLE IF NOT EXISTS `cadastrarfuncionario2` (
  `nome` text NOT NULL,
  `datanascimento` text NOT NULL,
  `dataadm` text NOT NULL,
  `rg` int(11) NOT NULL,
  `tel` text NOT NULL,
  `end` text NOT NULL,
  `email` text NOT NULL,
  `cargo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarusuario`
--

CREATE TABLE IF NOT EXISTS `cadastrarusuario` (
  `nome` varchar(20) DEFAULT NULL COMMENT 'nome usuario',
  `rg` varchar(20) DEFAULT NULL COMMENT 'rg usuario',
  `cpf` varchar(20) NOT NULL DEFAULT '' COMMENT 'cpf usuario',
  `cargo` varchar(20) DEFAULT NULL COMMENT 'cargo usuario',
  `senha` varchar(20) DEFAULT NULL COMMENT 'senha usuario',
  `inicio_contrato` varchar(10) DEFAULT NULL COMMENT 'data inicio contrato',
  `fim_contrato` varchar(10) DEFAULT NULL COMMENT 'data fim contrato',
  `cel` varchar(20) DEFAULT NULL COMMENT '.cel usuario',
  `tel` varchar(20) DEFAULT NULL COMMENT 'tel usuario',
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendaseservicos`
--

CREATE TABLE IF NOT EXISTS `vendaseservicos` (
  `cliente1` text NOT NULL,
  `reg_vendaseservicos` text NOT NULL,
  `tipo` text NOT NULL,
  `destino` text NOT NULL,
  `remetente` text NOT NULL,
  `valor` text NOT NULL,
  `volumes` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendaseservicos`
--

INSERT INTO `vendaseservicos` (`cliente1`, `reg_vendaseservicos`, `tipo`, `destino`, `remetente`, `valor`, `volumes`) VALUES
('sfsfs', 'fefsfe', 'Ex: Frágil', 'fesfes', 'fefsefe', 'fesfesf', 'fsfefse'),
('eee', 'eee', 'Ex: Frágil', 'eee', 'eee', 'eee', 'eee');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
