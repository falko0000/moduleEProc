create table sapp.dostup (
	uuid_ VARCHAR(75) null,
	dostup_id LONG not null primary key,
	izvewenije_id LONG,
	user_id LONG,
	createdby LONG,
	created DATE null,
	updatedby LONG,
	updated DATE null
);