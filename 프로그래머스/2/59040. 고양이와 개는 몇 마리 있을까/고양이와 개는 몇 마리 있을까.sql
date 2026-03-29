SELECT 
    animal_type,
    count(*) as count
FROM animal_ins
WHERE animal_type in ('CAT', 'DOG')
GROUP BY animal_type
ORDER BY animal_type asc;