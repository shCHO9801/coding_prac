with base as (
    select user_id, product_id, count(*) as cnt
    from online_sale
    group by 1, 2
    having cnt > 1
)

select user_id, product_id
from base
order by 1, 2 desc;