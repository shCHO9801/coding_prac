WITH base as (
    SELECT 
        writer_id,
        sum(price) as total_sales
    FROM used_goods_board
    WHERE status = "done"
    GROUP BY writer_id
    HAVING total_sales >= 700000
)

SELECT
    uu.user_id,
    uu.nickname,
    b.total_sales
FROM base b
JOIN used_goods_user uu ON b.writer_id = uu.user_id
ORDER BY b.total_sales asc;

