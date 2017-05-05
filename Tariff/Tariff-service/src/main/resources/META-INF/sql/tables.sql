create table sapp.tariff (
	tariff_id LONG not null primary key,
	region_id LONG,
	type_tariff INTEGER,
	tariff_value DOUBLE
);