create table sapp.izvewenija (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	izmenil LONG,
	izvewenija_id LONG not null primary key,
	kod_id LONG,
	naimenovanie VARCHAR(75) null,
	organizacija_id LONG,
	sostojanie_id LONG,
	sozdal LONG,
	status_id LONG,
	tip_izvewenija_id LONG,
	vyshestojawaja_organizacija_id LONG
);