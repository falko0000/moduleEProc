create table sapp.supplier_request_lot (
	supplier_request_lot_id LONG not null primary key,
	organization_id LONG,
	spisok_lotov_id LONG,
	sub_application BOOLEAN,
	withdrawn INTEGER
);