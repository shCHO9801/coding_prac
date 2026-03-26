SELECT pt_name, pt_no, gend_cd, age,
CASE WHEN tlno is NULL
then 'NONE' ELSE tlno END as tlno
FROM patient
WHERE age <= 12 and gend_cd = 'W'
ORDER BY age desc, pt_name