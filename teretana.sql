drop database if exists teretana1;
create database teretana1 character set utf8;
use teretana1;

create table polaznik(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table kartica(
    sifra int not null primary key auto_increment,
    osoba int not null,
    brojkartice varchar(50),
    adresa varchar(50),
    telefonteretane varchar(50),
    polaznik int,
    trener int,
    blagajnik int
);

create table tecaj(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vrijemepocetka varchar(50),
    vrijemekraja varchar(50),
    cijena decimal(18,2),
    trajanje int not null,
    trener int,
    polaznik int
);

create table trener(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50),
    placa varchar(50),
    kvalificiran boolean
);

alter table blagajnik add foreign key (osoba) references osoba(sifra);

alter table trener add foreign key (osoba) references osoba(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table kartica add foreign key (polaznik) references polaznik(sifra);
alter table kartica add foreign key (trener) references trener(sifra);
alter table kartica add foreign key (blagajnik) references blagajnik(sifra);

alter table tecaj add foreign key (trener) references trener(sifra);
alter table tecaj add foreign key (polaznik) references polaznik(sifra);






