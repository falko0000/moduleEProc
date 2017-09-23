create table sapp.result_opening (
	result_opening_id LONG not null primary key,
	spisok_lotov_id LONG,
	protocol_opening_id LONG,
	postavwik_id LONG,
	status INTEGER,
	description VARCHAR(75) null
);