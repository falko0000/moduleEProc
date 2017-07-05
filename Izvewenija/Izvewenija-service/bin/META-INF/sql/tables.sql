create table sapp.izvewenija (
	modifiedDate DATE null,
	createDate DATE null,
	izmenil LONG,
	izvewenija_id LONG not null primary key,
	kod_id LONG,
	naimenovanie VARCHAR(400) null,
	organizacija_id LONG,
	sostojanie_id LONG,
	sozdal LONG,
	status_id LONG,
	tip_izvewenija_id LONG,
	vyshestojawaja_organizacija_id LONG,
	userId LONG,
	groupId LONG,
	companyId LONG,
	UserName VARCHAR(75) null,
	UserGroupId LONG
);
