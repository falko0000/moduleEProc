create table sapp.orgindex (
	orgindex_id LONG not null primary key,
	organization_id LONG,
	subdivision_index INTEGER,
	sozdal LONG,
	izmenil LONG,
	data_sozdanija DATE null,
	data_izmenenija DATE null,
	name VARCHAR(75) null
);