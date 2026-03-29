SELECT
    HOUR(datetime) as hour,
    count(*) as count
FROM animal_outs
WHERE '9' <= HOUR(datetime) AND '20' > HOUR(datetime)
GROUP BY HOUR(datetime)
ORDER BY hour asc;