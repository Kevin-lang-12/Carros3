drop database if exists `Venda_de_carros2`;

Create database `Venda_de_carros2`;

use `Venda_de_carros2`;

create table `clientes`(
nome varchar(255),
endereço varchar(255),
cpf varchar(255)
);

create table `carrosv`(
`id` int(11) NOT NULL,
`produto` varchar(255),
`valor` decimal(9,2) NOT NULL
);

INSERT INTO carrosv (id, produto, valor) VALUES 
('1', 'Jeep Renegade Sport 1.8 4x2 Flex 16v Aut', '72900.00'),
('2', 'Chevrolet Onix Hatch Joy 1.0 8v Flex 5p Mec', '56900.00'),
('3', 'Chevrolet Prisma Sed. Lt 1.4 8v Flexpower 4p', '67900.00'),
('4', 'Chevrolet Spin Activ7 1.8 8v Econo.flex 5p Aut', '61900.00'),
('5', 'Volvo S90', '675950.00'),
('6', 'Porsche 911 GT3 RS 992', '1920000.00'),
('7', 'Chevrolet Camaro 6.2 SS', '417900.00'),
('8', 'Fiat Strada 1.4 Cd Hard Working', '7290000.00'),
('9', 'Volkswagen Santana 1.8 Mi', '14900.00'),
('10', 'Fiat Siena 1.0/ex 1.0 Mpi Fire/fire Flex 8v', '27900.00'),
('11', 'Volkswagen Fusca Null', '69900.00'),
('12', 'Toyota Hilux Cd Srx 4x4 2.8 Tdi 16v Diesel Aut', '215900.00'),
('13', 'Ford F-1000 Ss', '69900.00'),
('14', 'Citroën Aircross Live 1.5 Flex 8v 5p Mec.', '55900.00'),
('15', 'Kia Sportage 4x2 Mt Lx 2.0 4p', '67900.00');

create table `carrosc`(
`id` int(11) NOT NULL,
`produto` varchar(255),
`valor` decimal(9,2) NOT NULL
);

create table `motosv`(
`id` int(11) NOT NULL,
`produto` varchar(255),
`valor` decimal(9,2) NOT NULL
);

INSERT INTO motosv (id, produto, valor) VALUES 
('1', 'yamaha v-max', '205700.00'),
('2', 'polaris rzr', '179990.00'),
('3', 'honda gold wing', '174900.00'),
('4', 'bmw s', '155900.00'),
('5', 'Volvo S90', '675950.00'),
('6', 'harley-davidson cvo', '146900.00'),
('7', 'honda cb', '140000.00'),
('8', 'bmw r', '129900.00'),
('9', 'brp can-am', '129000.00'),
('10', 'harley-davidson fat boy', '124900.00'),
('11', 'harley-davidson street', '122990.00'),
('12', 'HARLEY-DAVIDSON BREAKOUT ', '118900.00'),
('13', 'ducati panigale', '118900.00'),
('14', 'harley-davidson softail ', '109990.00'),
('15', 'suzuki hayabusa', '109000.00');

create table `motosc`(
`id` int(11) NOT NULL,
`produto` varchar(255),
`valor` decimal(9,2) NOT NULL
);

create table clientes(
`nome` varchar(255),
`endereço` varchar(255),
`cpf` varchar(255)
);