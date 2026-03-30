SELECT
        i.name, i.datetime
FROM animal_ins i
LEFT JOIN animal_outs o ON i.animal_id = o.animal_id
WHERE o.datetime is null
order by i.datetime asc
limit 3
