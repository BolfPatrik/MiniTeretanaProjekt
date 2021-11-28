drop database if exists teretana1;
create database teretana1 character set utf8;
use teretana1;

create table polaznik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11),
    brojkartice varchar(50)
    
);

create table trening(
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
    ime varchar(50),
    prezime varchar(50),
    oib varchar(11),
    iban varchar(50),
    placa varchar(50),
    brojkartice varchar(50)
);

create table clan(
    polaznik int not null,
    trener int not null
);  


alter table trening add foreign key (trener) references trener(sifra);
alter table trening add foreign key (polaznik) references polaznik(sifra);

alter table clan add foreign key (polaznik) references polaznik(sifra);
alter table clan add foreign key (trener) references trener(sifra);





