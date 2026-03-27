WITH base as (
    SELECT
        category,
        max(price) as max_price
    FROM food_product
    WHERE category in ('과자', '국', '김치', '식용유')
    GROUP BY category
)

SELECT
    b.category,
    b.max_price,
    fd.product_name
FROM base b
JOIN food_product fd ON b.category = fd.category
    AND b.max_price = fd.price
ORDER BY max_price desc