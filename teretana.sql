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
values (null,'Ivan','Kunštek','86269030155','0571703'),
       (null,'Ilija','Horvat','92567661297','7755536'),
       (null,'Marija','Babić','11548106701','5025566'),
       (null,'Ana','Kovačević','42131125324','1432262'),
       (null,'Dino','Dvornik','43070969461','0972880'),
       (null,'Matej','Cetinski','46130108640','1480640'),
       (null,'Luka','Tomić','83875861837','8569269'),
       (null,'Fran','Novak','61673765275','7511562'),
       (null,'Patrik','Jurić','89499512964','0152256'),
       (null,'Petar','Kralj','23771378198','6223839'),
       (null,'Sara','Nekić','98309204674','7144668'),
       (null,'Ivan','Ignac','77167252508','6059758'),
       (null,'Martina','Horvat','02645517571','7601566'),
       (null,'Ines','Kovačić','07521786976','5362974'),
       (null,'Borna','Balog','97791836164','7405915'),
       (null,'Grga','Šarić','20270897942','5337281'),
       (null,'Jasna','Nikolić','44345718221','6970105'),
       (null,'August','Šenoa','05487807876','5228014'),
       (null,'Viktoria','Faust','26644209513','9520605'),
       (null,'Petar','Vraz','47396457649','4995425');
       (null,'Janko','Mraz','10782494847','4068389');
       (null,'Marko','Marulić','52973424348','4574198'),
       (null,'Ante','Kovačić','42764608845','2682172'),
       (null,'Milan','Kordić','38773683342','5259559'),
       (null,'Iva','Šimić','31030026351','7991244'),
       (null,'Matija','Stan','84577303889','5206185'),
       (null,'Zlatan','Gjalski','74914165011','7765439'),
       (null,'Stanka','Vuletić','69219012812','8621937'),
       (null,'Davor','Slama','71531128639','1245806'),
       (null,'Tomislav','Ladan','75233717763','1017875');


insert into trening (sifra,naziv,vrijemepocetka,vrijemekraja,cijena)
values (null, 'Judo','17:00','19:00', '150kn/mjesec'),
       (null, 'Judo','17:00','19:00', '150kn/mjesec'),
       (null, 'Judo','17:00','19:00', '150kn/mjesec'),
       (null, 'Judo','17:00','19:00', '150kn/mjesec'),
       (null, 'Judo','17:00','19:00', '150kn/mjesec');


insert into trener (sifra,ime,prezime,oib,iban,placa,brojkartice)
values (null,'Tomislav','Ugrešić','30187507814','HR5023400097991464415','6299.99kn','2398712'),
       (null,'Miroslav','Božić','69819906575','HR7123600008989455662','6357.99kn','5717241'),
       (null,'Andrija','Bošnjak','88083840806','HR1724840088476862635','6154.59kn','8898820'),
       (null,'Jurica','Zadravec','24910333513','HR2025000098888765614','6759.99kn','8054143'),
       (null,'Lidija','Rukavina','10271194602','HR6324840084757352575','6659.49kn','4814385');





