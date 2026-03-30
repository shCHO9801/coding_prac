SELECT
    p.product_id,
    p.product_name,
    sum(o.amount) * p.price as total_sales
FROM food_order o
JOIN food_product p ON o.product_id = p.product_id
WHERE o.produce_date >= "2022-05-01" AND o.produce_date < "2022-06-01"
GROUP BY p.product_id
ORDER BY total_sales desc, p.product_id asc;