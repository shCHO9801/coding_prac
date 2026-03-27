WITH base as (
    SELECT
        food_type,
        max(favorites) as max_favorites
    FROM rest_info
    GROUP BY food_type
)

SELECT 
    ri.food_type,
    ri.rest_id,
    ri.rest_name,
    ri.favorites
FROM rest_info as ri
JOIN base b
    ON ri.food_type = b.food_type
    AND ri.favorites = b.max_favorites
ORDER BY ri.food_type desc;