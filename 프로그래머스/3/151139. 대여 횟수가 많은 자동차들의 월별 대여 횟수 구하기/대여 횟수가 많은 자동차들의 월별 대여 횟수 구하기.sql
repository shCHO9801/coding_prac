WITH cars as (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE '2022-08-01' <= start_date 
        AND '2022-11-01' > start_date
    GROUP BY car_id
    HAVING count(*) >= 5
)

SELECT
    MONTH(crh.start_date) as month,
    crh.car_id,
    count(*) as records
FROM car_rental_company_rental_history crh
JOIN cars c 
    ON crh.car_id = c.car_id
WHERE '2022-08-01' <= crh.start_date 
        AND '2022-11-01' > crh.start_date
GROUP BY crh.car_id, month
ORDER BY month asc, car_id desc;