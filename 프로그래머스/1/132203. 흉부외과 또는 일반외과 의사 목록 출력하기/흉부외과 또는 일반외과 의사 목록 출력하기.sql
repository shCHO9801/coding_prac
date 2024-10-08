select dr_name, dr_id, mcdp_cd, substring(hire_ymd,1, 10) as hire_ymd
from doctor
where trim(mcdp_cd) in ('cs', 'gs')
order by 4 desc, 1;