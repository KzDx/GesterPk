-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2022 a las 19:41:17
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gesterpk`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aparcamiento`
--

CREATE TABLE `aparcamiento` (
  `id_aparcamiento` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `planta` varchar(255) NOT NULL,
  `n_estacionamiento` int(11) NOT NULL,
  `disponibilidad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `aparcamiento`
--

INSERT INTO `aparcamiento` (`id_aparcamiento`, `nombre`, `planta`, `n_estacionamiento`, `disponibilidad`) VALUES
(3, 'Phasellus vitae mauris sit amet', 'T', 6, '7:55 AM'),
(4, 'diam vel arcu. Curabitur ut', 'L', 7, '6:50 PM'),
(7, 'erat semper rutrum. Fusce dolor', 'A', 4, '2:27 PM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `doc_identidad` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `observaciones` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `doc_identidad`, `telefono`, `observaciones`) VALUES
(1, 'Lucas', '70543665OA', '', 'justo. Praesent'),
(2, 'hjvhujbj', '45733288H', '', 'semper cursus. Integer mollis. Integer tincidunt aliquam arcu.'),
(3, 'opopop', '57411377W', '', 'Aliquam ultrices iaculis odio. Nam interdum enim non nisi. Aenean'),
(4, 'Ingrid Pollard', '85172688R', '2321312312', 'Nunc ac'),
(5, 'vghjgvuhvhjjh', '3213123123', '32131254353', 'Es un matao'),
(6, 'Valentina', '123456789', '6665553331', 'Es increible'),
(7, 'Brielle Walsh', '44735404I', '', 'nibh. Aliquam ornare, libero at auctor'),
(8, 'Melodie Rivers', '86212058Q', '', 'ante ipsum'),
(9, 'Brian Medina', '81859336H', '', 'hendrerit a, arcu. Sed et'),
(10, 'Deirdre Jensen', '73618841T', '', 'ac libero nec ligula consectetuer'),
(11, 'Ava Pearson', '21275362R', '', 'magnis dis parturient montes, nascetur'),
(12, 'Signe Boyd', '03841444U', '', 'enim. Etiam gravida molestie arcu.'),
(13, 'Scarlett Bird', '58383857O', '', 'nisi magna'),
(14, 'Kirby Adkins', '45619672Y', '', 'Donec nibh. Quisque nonummy ipsum non arcu.'),
(15, 'Gareth Austin', '28766501I', '', 'vitae mauris sit amet'),
(16, 'Ramona Boyd', '25218491S', '', 'urna suscipit nonummy. Fusce fermentum fermentum arcu.'),
(17, 'Baker Carney', '49826651N', '', 'arcu'),
(18, 'Cain Fowler', '46763488V', '', 'a, aliquet vel, vulputate eu, odio. Phasellus'),
(19, 'Igor Howe', '91078565H', '', 'Vivamus euismod urna. Nullam lobortis quam'),
(20, 'Maggy Mendoza', '10323235N', '', 'mi. Duis risus odio, auctor'),
(21, 'Kelsie Hampton', '01516443Q', '', 'Morbi neque tellus, imperdiet non, vestibulum'),
(22, 'Ethan Rivers', '61343774K', '', 'vestibulum, neque sed dictum eleifend, nunc risus varius orci,'),
(23, 'Gay Estes', '57185811U', '', 'lacus.'),
(24, 'Naida Christian', '43574263E', '', 'velit. Aliquam nisl.'),
(25, 'Blossom Peters', '73952152F', '', 'eleifend egestas. Sed pharetra, felis eget varius ultrices, mauris'),
(26, 'Rhea Marshall', '71191752Y', '', 'Pellentesque ut ipsum ac mi eleifend egestas.'),
(27, 'Jaime Cochran', '42456275C', '', 'sed, est. Nunc laoreet lectus quis'),
(28, 'Jade Sweet', '24257923B', '', 'Aliquam adipiscing lobortis'),
(29, 'Felicia Clarke', '81076141S', '', 'Vivamus rhoncus. Donec est.'),
(30, 'Chanda Salas', '65283337H', '', 'ac,'),
(31, 'Francesca Diaz', '48392881L', '', 'Morbi non sapien molestie orci tincidunt adipiscing. Mauris'),
(32, 'Dolan Noble', '81994446K', '', 'vitae, erat. Vivamus nisi. Mauris nulla.'),
(33, 'Hadassah Barton', '51537340C', '', 'Fusce mi'),
(34, 'Tara Santiago', '18423721F', '', 'ipsum non arcu. Vivamus sit amet risus. Donec'),
(35, 'Amir Buchanan', '71645687I', '', 'quis,'),
(36, 'Brynne Carpenter', '10666458O', '', 'dui, semper et, lacinia'),
(37, 'Miriam Nielsen', '13413811B', '', 'ullamcorper, nisl arcu iaculis enim,'),
(38, 'Lydia Taylor', '84778147K', '', 'enim. Nunc ut erat. Sed nunc'),
(39, 'Xantha Nichols', '15973783B', '', 'massa. Suspendisse'),
(40, 'Alma Spence', '96181388M', '', 'egestas. Sed pharetra,'),
(41, 'Valentina Nicolle Marchan Gonzalez', '2115647845', '65262451687', '2nd Try pls'),
(42, 'Jordan', '123456', '3241456', 'God pls'),
(43, 'Valentina uwu', '78654656565', '456546621132', 'Que ilindaaa...'),
(44, 'Matias', '3213141', '2432534', 'Raro'),
(45, 'Luca', '321432', '5432424', 'Buen jugador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientesaparc`
--

CREATE TABLE `clientesaparc` (
  `id_cliente` int(11) NOT NULL,
  `id_aparcamiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `observaciones` varchar(255) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientesaparc`
--

INSERT INTO `clientesaparc` (`id_cliente`, `id_aparcamiento`, `fecha`, `observaciones`, `precio`) VALUES
(41, 4, '2022-06-14', '2nd Try pls', 6.25),
(42, 7, '2022-06-14', 'God pls', 5.25),
(43, 4, '2022-06-14', 'Que ilindaaa...', 11.25),
(44, 4, '2022-06-14', 'Raro', 5.25),
(45, 3, '2022-06-14', 'Buen jugador', 5.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_empleado` int(11) NOT NULL,
  `rol` int(11) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `contraseña` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_empleado`, `rol`, `usuario`, `nombre`, `contraseña`) VALUES
(1, 4, 'KzDx', 'Jordan', '12345'),
(2, 2, 'Katherin', 'Kathy', '2222'),
(7, 3, 'JordanS', 'SKzDx', '123456'),
(8, 3, 'Jordan', 'KzDx', '123456'),
(9, 1, 'Cecilia', 'ceci', '2222'),
(10, 1, 'hg', 'Hugo', '1111');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emprol`
--

CREATE TABLE `emprol` (
  `id_emprol` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `emprol`
--

INSERT INTO `emprol` (`id_emprol`, `id_empleado`, `id_rol`) VALUES
(8, 7, 3),
(9, 8, 3),
(10, 9, 1),
(11, 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parking`
--

CREATE TABLE `parking` (
  `id_parking` int(11) NOT NULL,
  `nombre_parking` varchar(255) NOT NULL,
  `localizacion` varchar(255) NOT NULL,
  `zona` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `parking`
--

INSERT INTO `parking` (`id_parking`, `nombre_parking`, `localizacion`, `zona`) VALUES
(2, 'Valentina', 'UwU', 'Miralbueno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id_rol` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id_rol`, `descripcion`) VALUES
(1, 'limpiador'),
(2, 'seguridad'),
(3, 'gestor'),
(4, 'administrador\r ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aparcamiento`
--
ALTER TABLE `aparcamiento`
  ADD PRIMARY KEY (`id_aparcamiento`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `clientesaparc`
--
ALTER TABLE `clientesaparc`
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_aparc` (`id_aparcamiento`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_empleado`),
  ADD KEY `rol` (`rol`);

--
-- Indices de la tabla `emprol`
--
ALTER TABLE `emprol`
  ADD PRIMARY KEY (`id_emprol`),
  ADD UNIQUE KEY `id_emple` (`id_empleado`,`id_rol`);

--
-- Indices de la tabla `parking`
--
ALTER TABLE `parking`
  ADD PRIMARY KEY (`id_parking`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `emprol`
--
ALTER TABLE `emprol`
  MODIFY `id_emprol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientesaparc`
--
ALTER TABLE `clientesaparc`
  ADD CONSTRAINT `clientesaparc_ibfk_1` FOREIGN KEY (`id_aparcamiento`) REFERENCES `aparcamiento` (`id_aparcamiento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `clientesaparc_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`rol`) REFERENCES `roles` (`id_rol`);

--
-- Filtros para la tabla `emprol`
--
ALTER TABLE `emprol`
  ADD CONSTRAINT `emprol_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id_empleado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
