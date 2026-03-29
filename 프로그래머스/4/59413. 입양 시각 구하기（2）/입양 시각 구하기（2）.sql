WITH RECURSIVE h as (
    SELECT 0 as hour
    UNION ALL
    SELECT hour + 1
    FROM h
    WHERE hour < 23
)

SELECT
    h.hour,
    IFNULL(count(ao.animal_id), 0) as count
FROM h
LEFT JOIN animal_outs ao ON h.hour = HOUR(ao.datetime)
GROUP BY h.hour
ORDER BY h.hour asc;