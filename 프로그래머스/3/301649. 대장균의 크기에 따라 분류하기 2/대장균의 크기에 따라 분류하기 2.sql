SELECT
    e.id,
    CASE 
        WHEN (t.rn * 100 / t.total) <= 25 THEN 'CRITICAL'
        WHEN (t.rn * 100 / t.total) <= 50 THEN 'HIGH'
        WHEN (t.rn * 100 / t.total) <= 75 THEN 'MEDIUM'
        ELSE 'LOW'
    END as colony_name
FROM ecoli_data e
JOIN (
    SELECT 
    id,
    size_of_colony,
    ROW_NUMBER() OVER(ORDER BY size_of_colony desc) as rn,
    count(*) OVER() as total
    FROM ecoli_data
) t ON e.id = t.id
ORDER BY e.id
