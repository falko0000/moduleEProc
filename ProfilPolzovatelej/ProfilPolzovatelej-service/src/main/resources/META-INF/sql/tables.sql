create table sapp.profil_polzovatelej (
	profil_polzovatelej_id LONG not null primary key,
	polzovatel_id LONG,
	inicialy VARCHAR(75) null,
	kontaktnyj_telefon VARCHAR(75) null,
	je_pochta VARCHAR(75) null,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null
);