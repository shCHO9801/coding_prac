SELECT
    p.product_code,
    p.price * sum(sales_amount) as sales
FROM offline_sale os
JOIN product p ON os.product_id = p.product_id
GROUP BY p.product_code
ORDER BY sales desc, p.product_code asc;