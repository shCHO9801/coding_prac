SELECT count(*) as fish_count
FROM fish_info
WHERE fish_type in (SELECT fish_type FROM fish_name_info WHERE fish_name in ('bass', 'snapper'));