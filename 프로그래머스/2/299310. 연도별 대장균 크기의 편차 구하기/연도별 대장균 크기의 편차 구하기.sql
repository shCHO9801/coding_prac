WITH year_max as(
    SELECT 
        YEAR(differentiation_date) as year, 
        max(size_of_colony) as max_size
    FROM ecoli_data
    GROUP BY YEAR(differentiation_date)
),
ecoli as (
    SELECT 
        YEAR(differentiation_date) as year,
        size_of_colony,
        id
    FROM ecoli_data
)

SELECT 
    e.year,
    (ym.max_size - size_of_colony) as year_dev,
    e.id
FROM ecoli e
JOIN year_max ym ON e.year = ym.year
ORDER BY year asc, year_dev asc;