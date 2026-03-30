
SELECT f.flavor
FROM first_half f
LEFT JOIN july j ON f.flavor = j.flavor
GROUP BY f.flavor
ORDER BY sum(f.total_order) desc
limit 3;