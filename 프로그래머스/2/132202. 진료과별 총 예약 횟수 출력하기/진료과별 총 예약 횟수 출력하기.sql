WITH base as (
    SELECT
        mcdp_cd,
        count(*) as count
    FROM appointment
    WHERE '2022-05-01' <= apnt_ymd 
        AND '2022-06-01' > apnt_ymd
    GROUP BY mcdp_cd
)

SELECT 
    mcdp_cd as '진료과코드',
    count as '5월예약건수'
FROM base
ORDER BY count asc, mcdp_cd asc