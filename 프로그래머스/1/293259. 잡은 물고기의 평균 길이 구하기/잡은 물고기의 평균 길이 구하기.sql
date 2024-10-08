select round(avg(length), 2) as average_length
from (
    select
        case when length is null
            then 10 else length end as length
    from fish_info
) as base