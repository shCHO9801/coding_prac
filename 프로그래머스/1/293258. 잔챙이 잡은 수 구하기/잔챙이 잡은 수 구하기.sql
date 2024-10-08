select count(*) as fish_count
from (select id from fish_info where length is null) as base