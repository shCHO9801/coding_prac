SELECT ed.id, COALESCE(cd.child_count, 0) as child_count
FROM ecoli_data ed
LEFT JOIN (
    SELECT parent_id, count(*) as child_count
    FROM ecoli_data
    GROUP BY parent_id
) as cd ON ed.id = cd.parent_id
ORDER BY ed.id;
