SELECT
    item_id,
    item_name,
    rarity
FROM item_info
WHERE item_id not in (SELECT parent_item_id
    FROM item_tree
    WHERE parent_item_id is not null
    GROUP BY parent_item_id)
ORDER BY item_id desc;