create table sapp.obwaja_informacija (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	izmenil LONG,
	izvewenie_id LONG,
	je_pochta VARCHAR(75) null,
	kontaktnoe_lico VARCHAR(75) null,
	kontaktnyj_telefon VARCHAR(75) null,
	obwaja_informacija_id LONG not null primary key,
	sozdal LONG
);