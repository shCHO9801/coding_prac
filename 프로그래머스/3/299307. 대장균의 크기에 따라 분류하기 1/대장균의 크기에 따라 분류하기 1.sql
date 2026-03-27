SELECT
    id,
    CASE 
        WHEN size_of_colony BETWEEN 0 and 100 THEN 'LOW'
        WHEN size_of_colony BETWEEN 101 and 1000 THEN 'MEDIUM'
        ELSE 'HIGH'
    END as size
FROM ecoli_data
ORDER BY id asc;