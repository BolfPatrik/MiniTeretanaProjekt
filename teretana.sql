drop database if exists teretana1;
create database teretana1 character set utf8;
use teretana1;

create table polaznik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib varchar(11),
    brojkartice varchar(7)
    
);

create table trening(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrijemepocetka varchar(50),
    vrijemekraja varchar(50),
    cijena decimal(18,2),
    trener int,
    polaznik int
);

create table trener(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib varchar(11),
    iban varchar(50),
    placa varchar(50),
    brojkartice varchar(7)
);

create table trener_polaznik(
    trener int not null,
    polaznik int not null
);  


alter table trening add foreign key (trener) references trener(sifra);
alter table trening add foreign key (polaznik) references polaznik(sifra);

alter table trener_polaznik add foreign key (polaznik) references polaznik(sifra);
alter table trener_polaznik add foreign key (trener) references trener(sifra);

insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703'),
insert into polaznik (sifra,ime,prezime,oib,brojkartice)
values (null,'Ivan','Ivanković','86269030155','0571703');


insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values ('Ivan','Horvat','71134069895','6058036 '),
insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values ('Ivan','Horvat','71134069895','6058036 '),
insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values ('Ivan','Horvat','71134069895','6058036 '),
insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values ('Ivan','Horvat','71134069895','6058036 '),
insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values ('Ivan','Horvat','71134069895','6058036 ');

insert into trening (sifra,naziv,vrijemepocetka,vrijemekraja,cijena)
values (null, 'Judo','17:00','19:00', '150kn/mjesec');




