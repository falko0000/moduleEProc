create table sapp.supplier_criteria (
	supplier_criteria_id LONG not null primary key,
	criteria_id LONG,
	organization_id LONG,
	description VARCHAR(75) null
);