-- 코드를 입력하세요
SELECT dr_name, dr_id,mcdp_cd, DATE_FORMAT(hire_ymd,'%Y-%m-%d')as hire_ymd
From doctor
where mcdp_cd in ('cs','gs')
order by 4 desc, dr_name