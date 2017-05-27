create table Dokumenty_postavwika_DokumentyPostavwika (
	dokumenty_postavwika_id LONG not null primary key,
	postavwik_id LONG,
	tip_dokumenta INTEGER,
	nazvanie_dokumenta VARCHAR(75) null,
	imja_fajla VARCHAR(75) null,
	zagruzil LONG,
	data_zagruzki DATE null
);