WITH sale_2201 as (
    SELECT
        book_id,
        sum(sales) as total_sales
    FROM book_sales
    WHERE '2022-01-01' <= sales_date
        AND '2022-02-01' > sales_date
    GROUP BY book_id
)

SELECT 
    b.author_id,
    a.author_name,
    b.category,
    sum(b.price * s.total_sales) as total_sales
FROM book b
JOIN AUTHOR a ON b.author_id = a.author_id
JOIN sale_2201 s ON b.book_id = s.book_id
GROUP BY b.author_id, b.category
ORDER BY b.author_id asc, b.category desc;