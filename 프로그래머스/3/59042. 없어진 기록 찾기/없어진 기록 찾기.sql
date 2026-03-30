SELECT
    o.animal_id,
    o.name
FROM animal_outs o
LEFT JOIN animal_ins i ON i.animal_id = o.animal_id
WHERE i.animal_id is null
ORDER BY o.animal_id asc, o.name;