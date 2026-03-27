SELECT count(*) as count
FROM (
    SELECT DISTINCT 
        name 
    FROM animal_ins 
    WHERE name is not null
) t;