insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nac geo', '22', 'bbbb', '200', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('politikin zabavnik', '11', 'aaaa', '300', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('vreme', '33', 'cccc', '200', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('politikia', '44', 'dddd', '320', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nin', '55', 'eeee', '500', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nedeljnik', '66', 'ffff', '370', 'RSD');

insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('100', 'rad1', 'autor1', 1);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('200', 'rad2', 'autor2', 1);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('100', 'rad3', 'autor3', 1);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('150', 'rad4', 'autor4', 2);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('70', 'rad5', 'autor5', 2);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('110', 'rad6', 'autor6', 3);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('80', 'rad7', 'autor7', 3);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('100', 'rad8', 'autor8', 3);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('100', 'rad9', 'autor9', 3);
insert into Rad(cena, naziv, naziv_autora, casopis_id) values ('100', 'rad10', 'autor10', 3);

insert into Banka(swift_kod, naziv, port) values ('BANKRS22', 'Banka_1', '9092');
insert into Banka(swift_kod, naziv, port) values ('BKKKRS22', 'Banka_2', '9093');
insert into Banka(swift_kod, naziv, port) values ('BAKKRS22', 'Banka_3', '9094');

insert into Racun(broj_racuna, casopis_id, banka_id) values ('909211111111111111', 1, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222222222222222', 2, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909211011111111111', 3, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222220222222222', 4, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909310111111111111', 5, 2);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222222222220222', 6, 1);

