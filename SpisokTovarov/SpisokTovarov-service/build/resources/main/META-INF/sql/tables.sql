create table sapp.spisok_tovarov (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	edinica_izmerenija_id LONG,
	izmenil LONG,
	izvewenie_id LONG,
	klassifikacija_po_okdp VARCHAR(75) null,
	kod_po_okdp VARCHAR(75) null,
	kod_po_spravochniku_naimenovanij LONG,
	kod_strany_proizvoditelja LONG,
	kolichestvo LONG,
	lot_id LONG,
	naimenovanie_tovara VARCHAR(75) null,
	opisanie_tovara VARCHAR(75) null,
	sozdal LONG,
	spisok_tovarov_id LONG not null primary key
);