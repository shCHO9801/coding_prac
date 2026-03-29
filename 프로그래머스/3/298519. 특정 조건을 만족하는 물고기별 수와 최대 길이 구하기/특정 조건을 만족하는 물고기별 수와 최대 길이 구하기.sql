SELECT
    count(*) fish_count,
    max(i.length) max_length,
    t.fish_type
FROM fish_info i
JOIN (
    SELECT fish_type, avg(IFNULL(length, 10)) as avg_length
    FROM fish_info
    GROUP BY fish_type
) t ON i.fish_type = t.fish_type
WHERE t.avg_length >= 33
GROUP BY t.fish_type
ORDER BY t.fish_type asc;