create table sapp.bid_queue (
	bid_queue_id LONG not null primary key,
	izvewenija_id LONG,
	closing_date DATE null,
	closing_by_minutes LONG
);