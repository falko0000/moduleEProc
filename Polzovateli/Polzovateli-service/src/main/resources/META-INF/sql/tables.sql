create table sapp.polzovateli (
	polzovateli_id LONG not null primary key,
	organizacija_id LONG,
	tip_organizacii_id INTEGER,
	rol_id INTEGER,
	imja_polzovatelja VARCHAR(75) null,
	parol VARCHAR(75) null,
	aktivnost INTEGER,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	podrazdelenije_id INTEGER
);