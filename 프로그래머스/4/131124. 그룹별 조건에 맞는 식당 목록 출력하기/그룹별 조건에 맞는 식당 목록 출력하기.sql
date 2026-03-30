WITH top_member as (
    SELECT member_id
    FROM rest_review
    GROUP BY member_id
    ORDER BY count(*) desc
)

SELECT
    p.member_name,
    r.review_text,
    date_format(r.review_date, '%Y-%m-%d') as review_date
FROM rest_review r
JOIN member_profile p ON r.member_id = p.member_id
WHERE r.member_id = (select member_id from top_member limit 1)
ORDER BY r.review_date asc, r.review_text asc;