-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30/10/2025 às 01:17
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `jovemprogramadora`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `alunas`
--

CREATE TABLE `alunas` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `idade` int(11) NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  `id_cidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunas`
--

INSERT INTO `alunas` (`id`, `nome`, `idade`, `sexo`, `id_cidade`) VALUES
(1, 'laura leandro gera', 23, 'F', 1),
(2, 'MONIQUE', 23, 'F', NULL),
(3, 'SARA', 17, 'F', NULL),
(5, 'tetse exclusao ', 17, 'F', NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cidades`
--

CREATE TABLE `cidades` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `uf` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cidades`
--

INSERT INTO `cidades` (`id`, `nome`, `uf`) VALUES
(1, 'Colatina', 'ES'),
(2, 'VITÓRIA', 'ES'),
(3, 'SÃO PAULO', 'SP'),
(4, 'BELO HORIZONTE', 'MG'),
(5, 'ARACRUZ', 'ES'),
(6, 'CACHOEIRO DE ITAPEMIRIM', 'ES'),
(7, 'BAUNILHA', 'ES'),
(8, 'SÃO BERNARDO DO CAMPO', 'SP'),
(9, 'BAIXO GUNADU', 'ES'),
(10, 'BAUNEARIO CAMBURIU', 'RS');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alunas`
--
ALTER TABLE `alunas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cidades_alunas` (`id_cidade`);

--
-- Índices de tabela `cidades`
--
ALTER TABLE `cidades`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunas`
--
ALTER TABLE `alunas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cidades`
--
ALTER TABLE `cidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `alunas`
--
ALTER TABLE `alunas`
  ADD CONSTRAINT `fk_cidades_alunas` FOREIGN KEY (`id_cidade`) REFERENCES `cidades` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
