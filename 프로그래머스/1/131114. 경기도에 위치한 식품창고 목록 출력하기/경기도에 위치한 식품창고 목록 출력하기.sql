select warehouse_id, warehouse_name, address, 
case when freezer_yn is null 
    then 'N'
    else freezer_yn 
end as freezer_yn
from food_warehouse
where substring(trim(address),1, 3) = '경기도'
order by 1;