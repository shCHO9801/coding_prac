# select *
# from hr_employees e 
with base as(
    select g.emp_no, 
    (
        case when avg(g.score) >= 96 then 'S'
        when avg(g.score) >= 90 then 'A'
        when avg(g.score) >= 80 then 'B'
        else 'C' end
    ) as grade
    from hr_grade g
    group by g.emp_no
)

select b.emp_no, e.emp_name, b.grade,
(
    case when b.grade = 'S' then e.sal * 0.2
    when b.grade = 'A' then e.sal * 0.15
    when b.grade = 'B' then e.sal * 0.1
    else 0 end
) as bonus
from base b
join hr_employees e on b.emp_no = e.emp_no
