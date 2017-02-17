create table klassifikatory.vbk (
	id_ LONG not null primary key,
	kod VARCHAR(75) null,
	nazvanie_tj VARCHAR(75) null,
	nazvanie_ru VARCHAR(75) null
);

create table sapp.izvewenija (
	izvewenija_id LONG not null primary key,
	sostojanie_id LONG,
	status_id LONG,
	tip_izvewenija_id LONG,
	organizacija_id LONG,
	vyshestojawaja_organizacija_id LONG,
	naimenovanie VARCHAR(75) null,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_id LONG,
	put_a INTEGER,
	put_b INTEGER,
	put_c VARCHAR(75) null,
	kontaktnoe_lico VARCHAR(75) null,
	je_pochta VARCHAR(75) null,
	kontaktnyj_telefon VARCHAR(75) null,
	data_publikacii DATE null,
	data_podvedenija_itogov DATE null,
	po_istecheniju_dnej INTEGER
);

create table sapp.okgz (
	okgz_id LONG not null primary key,
	kod VARCHAR(75) null,
	naimenovanie VARCHAR(75) null
);

create table sapp.rajony (
	rajony_id LONG not null primary key,
	oblast_id LONG,
	nazvanie VARCHAR(75) null,
	kod_vbk LONG
);

create table sapp.vw_izvewenija (
	izvewenija_id LONG not null primary key,
	sostojanie_id LONG,
	status_id LONG,
	tip_izvewenija_id LONG,
	organizacija_id LONG,
	vyshestojawaja_organizacija_id LONG,
	naimenovanie VARCHAR(75) null,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_id LONG,
	put_a INTEGER,
	put_b INTEGER,
	put_c VARCHAR(75) null,
	kontaktnoe_lico VARCHAR(75) null,
	je_pochta VARCHAR(75) null,
	kontaktnyj_telefon VARCHAR(75) null,
	data_publikacii DATE null,
	data_podvedenija_itogov DATE null,
	po_istecheniju_dnej INTEGER
);