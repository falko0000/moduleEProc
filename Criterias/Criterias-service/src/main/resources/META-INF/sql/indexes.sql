create index IX_A3457139 on sapp.criteria (spisok_lotov_id, criteria_category_id);
create index IX_96BC818F on sapp.criteria (uuid_[$COLUMN_LENGTH:75$]);

create index IX_93EFC590 on sapp.criteria_template (criteria_category_id);
create index IX_40529834 on sapp.criteria_template (uuid_[$COLUMN_LENGTH:75$]);

create index IX_ECEA83AE on sapp.criteria_value (criteria_id, userid);
create index IX_55A609D on sapp.criteria_value (uuid_[$COLUMN_LENGTH:75$]);

create index IX_1145A4F5 on sapp.criterias_weight (spisok_lotov_id, criteria_category_id);
create index IX_139AA54B on sapp.criterias_weight (uuid_[$COLUMN_LENGTH:75$]);