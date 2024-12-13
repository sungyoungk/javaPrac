/***
  @평균 일일 대여 요금 구하기
  @URL : https://school.programmers.co.kr/learn/courses/30/lessons/151136
 */
SELECT ROUND(AVG(daily_fee)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE car_type = 'SUV'

/***
  @과일로 만든 아이스크림 고르기
  @URL : https://school.programmers.co.kr/learn/courses/30/lessons/133025
 */
SELECT h.FLAVOR
from FIRST_HALF h
         join ICECREAM_INFO i
              on h.FLAVOR = i.FLAVOR
where i.INGREDIENT_TYPE = 'fruit_based'
  AND h.TOTAL_ORDER > 3000
order by h.TOTAL_ORDER DESC

/***
  @3월에 태어난 여성 회원 목록 출력하기
  @URL : https://school.programmers.co.kr/learn/courses/30/lessons/131120
 */
SELECT MEMBER_ID,
       MEMBER_NAME,
       GENDER,
       SUBSTR(DATE_OF_BIRTH, 1, 10)
from MEMBER_PROFILE
where TLNO is not null
  AND SUBSTR(DATE_OF_BIRTH, 7, 1) = '3'
  AND GENDER = 'W'
  AND TLNO is not null
order by MEMBER_ID

/***
  @서울에 위치한 식당 목록 출력하기
  @URL : https://school.programmers.co.kr/learn/courses/30/lessons/131118
 */
SELECT i.REST_ID                     as REST_ID
     , i.REST_NAME                   as REST_NAME
     , i.FOOD_TYPE                   as FOOD_TYPE
     , i.FAVORITES                   as FAVORITES
     , i.ADDRESS                     as ADDRESS
     , ROUND(AVG(r.REVIEW_SCORE), 2) as SCORE
from REST_INFO i
         join REST_REVIEW r ON i.REST_ID = r.REST_ID
WHERE ADDRESS like '서울%'
GROUP BY REST_ID
ORDER BY ROUND(AVG(r.REVIEW_SCORE), 2) DESC, MAX(i.FAVORITES) DESC;

/**
  *@흉부외과 또는 일반외과 의사 목록 출력하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/132203
 */
SELECT DR_NAME
     , DR_ID
     , MCDP_CD
     , DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
from DOCTOR
where MCDP_CD in ('CS', 'GS')
order by HIRE_YMD DESC, DR_NAME ASC;


/**
  *@재구매가 일어난 상품과 회원 리스트 구하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/131536
 */
SELECT user_id     AS USER_ID
     , product_id  AS PRODUCT_ID
from ONLINE_SALE
group by user_id, product_id
HAVING COUNT(user_id) > 1 AND COUNT(product_id) > 1
order by user_id, product_id desc


