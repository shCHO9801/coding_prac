SELECT
    b.category,
    sum(bs.sales) as total_sales
FROM book b
JOIN book_sales bs ON b.book_id = bs.book_id
WHERE "2022-01-01" <= bs.sales_date
    AND "2022-02-01" > bs.sales_date
GROUP BY b.category
ORDER BY b.category asc;