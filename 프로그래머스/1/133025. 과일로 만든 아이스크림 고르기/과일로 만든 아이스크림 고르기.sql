SELECT FLAVOR
FROM first_half
WHERE total_order > 3000
AND FLAVOR in (
    SELECT FLAVOR
    FROM icecream_info
    WHERE ingredient_type = 'fruit_based'
)
ORDER BY total_order desc