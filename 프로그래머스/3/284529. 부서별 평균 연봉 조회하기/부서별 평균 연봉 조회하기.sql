SELECT
    d.dept_id,
    d.dept_name_en,
    round(avg(e.sal)) as avg_sal
FROM hr_department d
JOIN hr_employees e ON d.dept_id = e.dept_id
GROUP BY d.dept_id
ORDER BY avg_sal desc;