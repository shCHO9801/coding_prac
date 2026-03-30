WITH cant_use as (
    SELECT DISTINCT
        car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE end_date >= '2022-11-01'
        AND start_date <= '2022-11-30'
)

SELECT  
    c.car_id,
    c.car_type,
    round(c.daily_fee * 30 * (100 - d.discount_rate) / 100) as fee
FROM CAR_RENTAL_COMPANY_CAR c
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN d 
    ON c.car_type = d.car_type
    AND d.duration_type = '30일 이상'
WHERE c.car_id not in (select car_id from cant_use)
    AND c.car_type in ('SUV', '세단')
    AND round(c.daily_fee * 30 * (100 - d.discount_rate) / 100) >= 500000
    AND round(c.daily_fee * 30 * (100 - d.discount_rate) / 100) <= 2000000
ORDER BY fee desc, c.car_type asc, car_id desc;