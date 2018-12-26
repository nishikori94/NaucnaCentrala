insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nac geo', '22', 'bbbb', '200', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('politikin zabavnik', '11', 'aaaa', '300', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('vreme', '33', 'cccc', '200', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('politikia', '44', 'dddd', '320', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nin', '55', 'eeee', '500', 'RSD');
insert into Casopis(naziv, merchant_id, merchant_password, cena, valuta) values ('nedeljnik', '66', 'ffff', '370', 'RSD');

insert into Banka(swift_kod, naziv, port) values ('BANKRS22', 'Banka_1', '9092');
insert into Banka(swift_kod, naziv, port) values ('BKKKRS22', 'Banka_2', '9093');
insert into Banka(swift_kod, naziv, port) values ('BAKKRS22', 'Banka_3', '9094');

insert into Racun(broj_racuna, casopis_id, banka_id) values ('909211111111111111', 1, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222222222222222', 2, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909211011111111111', 3, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222220222222222', 4, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909310111111111111', 5, 1);
insert into Racun(broj_racuna, casopis_id, banka_id) values ('909222222222220222', 6, 1);