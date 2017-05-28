create table System_config_SystemConfig (
	system_config_id_ LONG not null primary key,
	key_ VARCHAR(75) null,
	description VARCHAR(75) null,
	value VARCHAR(75) null,
	type_ VARCHAR(75) null
);

create table System_config_Test (
	system_config_id_ LONG not null primary key,
	key_ VARCHAR(75) null,
	description VARCHAR(75) null,
	value VARCHAR(75) null,
	type_ VARCHAR(75) null
);

create table sapp.system_config (
	system_config_id_ LONG not null primary key,
	key_ VARCHAR(75) null,
	description VARCHAR(75) null,
	value VARCHAR(75) null,
	type_ VARCHAR(75) null
);