-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-08-2023 a las 04:48:17
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `obradorej4`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(58) NOT NULL,
  `nombre` varchar(58) NOT NULL,
  `acceso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `dni`, `apellido`, `nombre`, `acceso`, `estado`) VALUES
(1, 12345678, 'Gómez', 'Juan', 1, 1),
(2, 98765432, 'Martínez', 'María', 1, 1),
(8, 875432, 'Gómez', 'María', 2, 1),
(9, 54321678, 'López', 'Carlos', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `herramienta`
--

CREATE TABLE `herramienta` (
  `idHerramienta` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `herramienta`
--

INSERT INTO `herramienta` (`idHerramienta`, `nombre`, `descripcion`, `stock`, `estado`) VALUES
(1, 'destornillador', 'ajustar tornillos', 10, 1),
(2, 'Martillo', 'Herramienta para golpear', 5, 1),
(4, 'Martillo', 'Herramienta manual para golpear.', 15, 1),
(5, 'Destornillador Phillips', 'Herramienta para apretar tornillos Phillips.', 25, 1),
(6, 'Sierra Circular', 'Herramienta eléctrica para cortes precisos en madera.', 8, 1),
(7, 'Llave Ajustable', 'Herramienta para ajustar tuercas y tornillos.', 18, 1),
(8, 'Taladro Inalámbrico', 'Herramienta para perforar superficies.', 12, 1),
(9, 'Cinta Métrica', 'Herramienta para medir longitudes.', 30, 1),
(10, 'Pala', 'Herramienta para cavar y mover tierra.', 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `idMovimiento` int(11) NOT NULL,
  `idEmpleado` int(11) NOT NULL,
  `idHerramienta` int(11) NOT NULL,
  `fechap` date NOT NULL,
  `fechad` date NOT NULL,
  `cantidadret` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `movimiento`
--

INSERT INTO `movimiento` (`idMovimiento`, `idEmpleado`, `idHerramienta`, `fechap`, `fechad`, `cantidadret`) VALUES
(4, 1, 8, '2023-08-24', '2023-08-25', 2),
(5, 2, 4, '2023-08-24', '2023-08-26', 5),
(6, 8, 7, '2023-08-23', '2023-08-25', 5),
(7, 8, 6, '2023-08-22', '2023-08-24', 7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `herramienta`
--
ALTER TABLE `herramienta`
  ADD PRIMARY KEY (`idHerramienta`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`idMovimiento`),
  ADD KEY `mov-empleado` (`idEmpleado`),
  ADD KEY `idHerramienta` (`idHerramienta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `herramienta`
--
ALTER TABLE `herramienta`
  MODIFY `idHerramienta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  MODIFY `idMovimiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD CONSTRAINT `mov-empleado` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE CASCADE,
  ADD CONSTRAINT `movimiento_ibfk_1` FOREIGN KEY (`idHerramienta`) REFERENCES `herramienta` (`idHerramienta`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
