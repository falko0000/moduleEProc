create table sapp.protocol_contracts (
	protocol_contracts_id LONG not null primary key,
	izvewenie_id LONG,
	created DATE null,
	updated DATE null
);

create table sapp.protocol_evaluate (
	protocol_evaluate_id LONG not null primary key,
	izvewenie_id LONG,
	created DATE null,
	updated DATE null,
	userid LONG
);

create table sapp.protocol_opening (
	protocol_opening_id LONG not null primary key,
	izvewenie_id LONG,
	created DATE null,
	updated DATE null
);