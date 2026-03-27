WITH rent_car as (
    SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE start_date <= '2022-10-16'
        AND end_date >= '2022-10-16'
)

SELECT 
    car_id,
    CASE 
        WHEN car_id in (SELECT car_id FROM rent_car) THEN '대여중'
        ELSE '대여 가능' 
    END as availablity
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY car_id
ORDER BY car_id desc;