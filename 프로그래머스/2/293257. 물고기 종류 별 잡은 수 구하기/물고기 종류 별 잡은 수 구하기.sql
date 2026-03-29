SELECT
    count(*) as fish_count,
    n.fish_name
FROM fish_name_info n
JOIN fish_info i ON n.fish_type = i.fish_type
GROUP BY n.fish_name
ORDER BY fish_count desc;