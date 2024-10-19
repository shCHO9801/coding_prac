select item_id, item_name, rarity
from item_info
where item_id in (
    select t.item_id
    from item_info i, item_tree t
    where i.rarity = 'rare' and t.parent_item_id = i.item_id
)
order by item_id desc