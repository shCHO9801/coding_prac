SELECT
    t.item_id,
    i.item_name
FROM item_tree t
JOIN item_info i ON t.item_id = i.item_id
WHERE t.parent_item_id is null
ORDER BY t.item_id asc