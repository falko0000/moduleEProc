create table sapp.oplachennye_zakazy (
	oplachennye_zakazy_id LONG not null primary key,
	tranzakcija VARCHAR(75) null,
	izvewenie_id LONG,
	postavwik_id LONG,
	summa DOUBLE,
	oplatil LONG,
	data_oplaty DATE null
);