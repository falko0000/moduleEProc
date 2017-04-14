create table sapp.informacija_o_razmewenii (
	cena_postavki VARCHAR(75) null,
	cena_postavki_dlja_zakaza DOUBLE,
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	informacija_o_razmewenii_id LONG not null primary key,
	izmenil LONG,
	izvewenie_id LONG,
	mesto_postavki VARCHAR(75) null,
	mesto_postavki_dlja_zakaza LONG,
	obespechenie_ispolnenija LONG,
	obespechenie_ispolnenija_dlja_zakaza LONG,
	obespechenie_ispolnenija_v_procentah DOUBLE,
	obespechenie_v_procentah DOUBLE,
	obespechenie_zajavki LONG,
	obespechenie_zajavki_dlja_zakaza LONG,
	oplata VARCHAR(75) null,
	oplata_dlja_zakaza LONG,
	soputstvujuwie_uslovija VARCHAR(75) null,
	soputstvujuwie_uslovija_dlja_zakaza LONG,
	sozdal LONG,
	srok_dejstvija VARCHAR(75) null,
	srok_dejstvija_dlja_zakaza LONG,
	srok_ispolnenija_zajavki VARCHAR(75) null,
	srok_obespechenija_zajavki VARCHAR(75) null,
	srok_postavki VARCHAR(75) null,
	srok_postavki_dlja_zakaza LONG
);