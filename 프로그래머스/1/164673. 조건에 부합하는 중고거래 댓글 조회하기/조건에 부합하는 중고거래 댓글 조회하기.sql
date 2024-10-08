select b.title, b.board_id, r.reply_id, r.writer_id, r.contents, 
date_format(r.created_date, '%Y-%m-%d') as created_date
from (
    select board_id, title, writer_id
    from used_goods_board
    where created_date like '2022-10%'
) b left join used_goods_reply r
on b.board_id = r.board_id
where r.reply_id is not null
order by created_date, title
