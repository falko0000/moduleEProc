create table klassifikatory.fbk (
	fbk_id LONG not null primary key,
	pid INTEGER,
	kod VARCHAR(75) null,
	nazvanie_ru VARCHAR(75) null,
	nazvanie_en VARCHAR(75) null,
	nazvanie_tj VARCHAR(75) null
);