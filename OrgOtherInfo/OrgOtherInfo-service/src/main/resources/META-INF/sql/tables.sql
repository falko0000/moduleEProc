create table sapp.org_otherinfo (
	organization_id LONG not null primary key,
	mesto_registracii VARCHAR(75) null,
	kratkoe_naimenovanie VARCHAR(75) null,
	vbk_id LONG,
	fbk_id LONG,
	istochnik_finansirovanija_id INTEGER,
	kvalificirovannaja_organizacija BOOLEAN,
	data_gosudarstvennoj_registracii DATE null,
	rajon_id LONG,
	inn VARCHAR(75) null,
	ein VARCHAR(75) null,
	sin VARCHAR(75) null,
	sozdal LONG,
	data_sozdanija DATE null,
	izmenil LONG,
	data_izmenenija DATE null
);