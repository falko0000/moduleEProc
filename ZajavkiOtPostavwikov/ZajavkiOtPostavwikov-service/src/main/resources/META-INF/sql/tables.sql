create table sapp.zajavki_ot_postavwikov (
	zajavki_ot_postavwikov_id LONG not null primary key,
	izvewenie_id LONG,
	lot_id LONG,
	tovar_id LONG,
	postavwik_id LONG,
	kolichestvo INTEGER,
	summa_za_edinicu_tovara DOUBLE,
	itogo_za_tovar DOUBLE,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_po_obshhemu_klassifikatoru LONG,
	kod_strany_proizvoditelja LONG,
	opisanie_tovara VARCHAR(75) null,
	predlozhenie_postavwika VARCHAR(75) null
);

create table sapp.zajavki_ot_postavwikov_temp (
	zajavki_ot_postavwikov_temp_id LONG not null primary key,
	izvewenie_id LONG,
	lot_id LONG,
	tovar_id LONG,
	postavwik_id LONG,
	kolichestvo INTEGER,
	summa_za_edinicu_tovara DOUBLE,
	itogo_za_tovar DOUBLE,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_po_obshhemu_klassifikatoru LONG,
	kod_strany_proizvoditelja LONG,
	opisanie_tovara VARCHAR(75) null,
	predlozhenie_postavwika VARCHAR(75) null
);

create table zajavki_ot_postavwikov_ZajavkiOtPostavwikov (
	zajavki_ot_postavwikov_id LONG not null primary key,
	izvewenie_id LONG,
	lot_id LONG,
	tovar_id LONG,
	postavwik_id LONG,
	kolichestvo INTEGER,
	summa_za_edinicu_tovara DOUBLE,
	itogo_za_tovar DOUBLE,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_po_obshhemu_klassifikatoru LONG,
	kod_strany_proizvoditelja LONG,
	opisanie_tovara VARCHAR(75) null,
	predlozhenie_postavwika VARCHAR(75) null
);

create table zajavki_ot_postavwikov_ZajavkiOtPostavwikovTemp (
	zajavki_ot_postavwikov_temp_id LONG not null primary key,
	izvewenie_id LONG,
	lot_id LONG,
	tovar_id LONG,
	postavwik_id LONG,
	kolichestvo INTEGER,
	summa_za_edinicu_tovara DOUBLE,
	itogo_za_tovar DOUBLE,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	kod_po_obshhemu_klassifikatoru LONG,
	kod_strany_proizvoditelja LONG,
	opisanie_tovara VARCHAR(75) null,
	predlozhenie_postavwika VARCHAR(75) null
);