create table sapp.lot_winner (
	lot_winner_id LONG not null primary key,
	spisok_lotov_id LONG,
	organization_id LONG,
	total_price DOUBLE,
	attribute VARCHAR(75) null,
	serial_number INTEGER,
	point DOUBLE
);