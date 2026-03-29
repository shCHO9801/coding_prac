SELECT
    route,
    concat(round(sum(d_between_dist), 1), 'km') as total_distance,
    concat(round(avg(d_between_dist), 2), 'km') as average_distance
FROM subway_distance
GROUP BY route
ORDER BY round(sum(d_between_dist), 1) desc;