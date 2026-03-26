SELECT 
    date_format(sales_date, '%Y-%m-%d') as SALES_DATE,
    product_id,
    user_id,
    sales_amount
FROM online_sale
WHERE '2022-03-01' <= SALES_DATE AND SALES_DATE < '2022-04-01'

UNION ALL

SELECT 
    date_format(sales_date, '%Y-%m-%d') as SALES_DATE,
    product_id,
    NULL as user_id,
    sales_amount
FROM offline_sale
WHERE '2022-03-01' <= SALES_DATE AND SALES_DATE < '2022-04-01'
ORDER BY SALES_DATE asc, product_id asc, user_id asc