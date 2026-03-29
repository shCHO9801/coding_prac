WITH max_score as (
    SELECT
        emp_no,
        year,
        sum(score) as total_score
    FROM hr_grade
    WHERE year = 2022
    GROUP BY emp_no
    ORDER BY total_score desc
    limit 1
)

SELECT 
    m.total_score as score,
    e.emp_no,
    e.emp_name,
    e.position,
    e.email
FROM max_score m
JOIN hr_employees e ON m.emp_no = e.emp_no