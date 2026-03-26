WITH seoul_rest AS (
    SELECT
        rest_id,
        rest_name,
        food_type,
        favorites,
        address
    FROM rest_info
    WHERE address LIKE '서울%'
)

SELECT 
    sr.rest_id,
    sr.rest_name,
    sr.food_type,
    sr.favorites,
    sr.address,
    COALESCE(arr.score, 0) as score
FROM seoul_rest sr
    JOIN (SELECT rest_id, round(avg(review_score), 2) as score FROM rest_review GROUP BY rest_id) as arr
    ON sr.rest_id = arr.rest_id
ORDER BY arr.score desc, sr.favorites desc;