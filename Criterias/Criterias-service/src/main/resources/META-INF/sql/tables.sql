create table sapp.criteria (
	criteria_id LONG not null primary key,
	criteria_name VARCHAR(75) null,
	criteria_weight DOUBLE,
	criteria_category_id INTEGER,
	criteria_description VARCHAR(75) null,
	spisok_lotov_id LONG,
	created DATE null,
	updated DATE null,
	createdby LONG,
	updatedby LONG,
	max_weight INTEGER,
	min_weight INTEGER,
	criteria_type_id INTEGER
);

create table sapp.criteria_template (
	criteria_template_id LONG not null primary key,
	criteria_name VARCHAR(75) null,
	criteria_category_id INTEGER,
	created DATE null,
	updated DATE null,
	createdby LONG,
	updatedby LONG
);

create table sapp.criteria_value (
	criteria_value_id LONG not null primary key,
	criteria_id LONG,
	userid LONG,
	value DOUBLE,
	description VARCHAR(75) null,
	created DATE null,
	updated DATE null,
	createdby LONG,
	updatedby LONG
);

create table sapp.criterias_weight (
	criterias_weight_id LONG not null primary key,
	spisok_lotov_id LONG,
	criteria_category_id INTEGER,
	criterias_weight DOUBLE,
	created DATE null,
	updated DATE null,
	createdby LONG,
	updatedby LONG
);