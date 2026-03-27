-- 코드를 입력하세요
SELECT 
    ii.ingredient_type,
    SUM(fh.total_order) as 'total_order'
FROM first_half fh
JOIN icecream_info ii ON fh.flavor = ii.flavor
GROUP BY ii.ingredient_type
ORDER BY total_order asc;