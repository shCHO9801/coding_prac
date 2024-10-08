select flavor
from FIRST_HALF
where total_order > 3000 and flavor in (select flavor from icecream_info where ingredient_type = 'fruit_based')
order by total_order desc;