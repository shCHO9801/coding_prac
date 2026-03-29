SELECT 
    truncate(price, -4) as product_group,
    count(*) as products
FROM product
GROUP BY product_group
ORDER BY product_group asc