create index IX_8BD03147 on sapp.zajavki_ot_postavwikov (lot_id, postavwik_id);
create index IX_2C1F996C on sapp.zajavki_ot_postavwikov (tovar_id, postavwik_id);

create index IX_571AD546 on sapp.zajavki_ot_postavwikov_temp (lot_id, postavwik_id);
create index IX_4F5139AB on sapp.zajavki_ot_postavwikov_temp (tovar_id, postavwik_id);

create index IX_A9962802 on zajavki_ot_postavwikov_ZajavkiOtPostavwikov (lot_id, postavwik_id);
create index IX_F042CD67 on zajavki_ot_postavwikov_ZajavkiOtPostavwikov (tovar_id, postavwik_id);

create index IX_8636E176 on zajavki_ot_postavwikov_ZajavkiOtPostavwikovTemp (lot_id, postavwik_id);
create index IX_279AF9DB on zajavki_ot_postavwikov_ZajavkiOtPostavwikovTemp (tovar_id, postavwik_id);