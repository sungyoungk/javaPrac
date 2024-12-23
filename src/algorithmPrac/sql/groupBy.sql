/***
  @식품분류별_가장_비싼_식품의_정보_조회하기
  @URL: https://school.programmers.co.kr/learn/courses/30/lessons/131116
 */
select a.category     AS CATRGORY
     , a.price        AS MAX_PRICE
     , a.product_name AS PRODUCT_NAME
from FOOD_PRODUCT a
where price = (
    select max(price)
    from FOOD_PRODUCT
    where category = a.category
)
  and category in ( '과자', '국', '김치', '식용유')
group by a.category
order by a.price desc

/***
  @자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기
  @URL: https://school.programmers.co.kr/learn/courses/30/lessons/157340
 */
SELECT CAR_ID AS CAR_ID
     , CASE
           WHEN MAX('2022-10-16' BETWEEN START_DATE AND END_DATE) THEN '대여중'
           ELSE '대여 가능' END AS AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by CAR_ID
order by CAR_ID DESC


/**
  대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기
  @URL https://school.programmers.co.kr/learn/courses/30/lessons/151139
 */
with filtered AS (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where 1=1
      and START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
    group by car_id
    having count(car_id) >= 5 )
select MONTH(START_DATE)    AS MONTH
     , CAR_ID               AS CAR_ID
     , COUNT(CAR_ID)        AS RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID IN(select car_id from filtered)
  and START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
group by MONTH(START_DATE), CAR_ID
order by MONTH, CAR_ID desc
