create index IX_4B4816F9 on sapp.log_evaluated (spisok_lotov_id, organization_id, userid);
create index IX_DB813852 on sapp.log_evaluated (spisok_lotov_id, userid);
create index IX_C5313104 on sapp.log_evaluated (userid, result_opening_id);