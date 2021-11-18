drop database if exists teretana1;
create database teretana1;
use teretana1;

create table blagajnik(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table polaznik(
    sifra int not null primary key auto_increment,
    osoba int not null,
);

create table osoba(
    ime varchar(50) not null,
    prezime varchar(50) not null,
);

create table kartica(
    sifra int not null primary key auto_increment,
    osoba int not null,
    brojkartice varchar(50),
    adresa varchar(50),
    telefon varchar(50)
);

create table tecaj(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vrijemepocetka varchar(50),
    vrijemekraja varchar(50)
    trener int
);

create table trener(
    sifra int not null primary key auto_increment,
    osoba int,
    iban varchar(50),
    diploma boolean
);


