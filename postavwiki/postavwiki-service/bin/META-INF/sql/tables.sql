create table sapp.postavwiki (
	adres VARCHAR(75) null,
	data_gosudarstvennoj_registracii DATE null,
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	ein VARCHAR(75) null,
	gorod VARCHAR(75) null,
	inn VARCHAR(75) null,
	izmenil LONG,
	kratkoe_naimenovanie VARCHAR(75) null,
	mesto_registracii VARCHAR(75) null,
	oblast_id LONG,
	polnoe_naimenovanie VARCHAR(75) null,
	postavwiki_id LONG not null primary key,
	rajon_id LONG,
	sin VARCHAR(75) null,
	sozdal LONG
);