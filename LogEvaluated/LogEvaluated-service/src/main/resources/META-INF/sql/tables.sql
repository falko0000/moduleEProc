create table sapp.log_evaluated (
	log_evaluated_id LONG not null primary key,
	spisok_lotov_id LONG,
	organization_id LONG,
	userid LONG,
	status INTEGER,
	evaluated_des VARCHAR(75) null,
	opening_status INTEGER,
	opening_des VARCHAR(75) null,
	result_opening_id LONG
);