SELECT 
    ugb.title as title,
    ugb.board_id as board_id,
    ugr.reply_id as reply_id,
    ugr.writer_id as writer_id,
    ugr.contents as contents,
    date_format(ugr.created_date, '%Y-%m-%d') as created_date
FROM USED_GOODS_BOARD ugb
    JOIN USED_GOODS_REPLY ugr ON ugb.board_id = ugr.board_id
WHERE ugb.created_date BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY ugr.created_date asc, ugb.title asc