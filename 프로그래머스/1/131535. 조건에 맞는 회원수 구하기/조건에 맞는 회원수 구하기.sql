select count(*) as users
from (select user_id from user_info where age between 20 and 29 and year(joined) = 2021 group by user_id) as base
;