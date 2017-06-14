create index IX_19E66D4D on sapp.criteria (spisok_lotov_id, criteria_category_id, criteria_type_id);

create index IX_C10AF9E4 on sapp.criteria_template (criteria_category_id, criteria_type_id);
create index IX_7D7EF9D4 on sapp.criteria_template (criteria_type_id);

create index IX_10A2529 on sapp.criteria_value (criteria_id, userid, organization_id);

create index IX_1145A4F5 on sapp.criterias_weight (spisok_lotov_id, criteria_category_id);