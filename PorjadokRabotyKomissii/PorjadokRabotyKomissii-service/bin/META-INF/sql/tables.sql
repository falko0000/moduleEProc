create table sapp.porjadok_raboty_komissii (
	data_izmenenija DATE null,
	data_podvedenija_itogov DATE null,
	data_publikacii DATE null,
	data_sozdanija DATE null,
	izmenil LONG,
	izvewenie_id LONG,
	po_istecheniju_dnej LONG,
	porjadok_raboty_komissii_id LONG not null primary key,
	sozdal LONG
);