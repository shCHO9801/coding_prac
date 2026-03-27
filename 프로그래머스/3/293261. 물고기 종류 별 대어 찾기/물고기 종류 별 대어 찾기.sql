SELECT 
    fi.id,
    fni.fish_name,
    fi.length
FROM fish_info fi
JOIN (
    SELECT 
        fish_type,
        max(length) as length
    FROM fish_info
    GROUP BY fish_type
) f ON fi.fish_type = f.fish_type
    AND fi.length = f.f.length
JOIN fish_name_info fni ON fi.fish_type = fni.fish_type
ORDER BY fi.id;

