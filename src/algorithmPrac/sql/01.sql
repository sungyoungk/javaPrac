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


/**
  *@조건에 맞는 수 구하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/131535
 */
SELECT count(*) as USERS
FROM USER_INFO
WHERE year(joined) = 2021
AND age BETWEEN 20 and 29

/**
  *@조건에 맞는 도서 리스트 출력하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/144853
 */
SELECT BOOK_ID
     , DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
from BOOK
where year(PUBLISHED_DATE) = 2021
  and CATEGORY = '인문'
order by PUBLISHED_DATE

/**
  *@12세 이하인 여자 환자 목록 출력하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/132201
 */
SELECT PT_NAME
     , PT_NO
     , GEND_CD
     , AGE
     , COALESCE(TLNO, 'NONE') AS TLNO
from PATIENT
where AGE <= 12
  and GEND_CD ='W'
order by AGE desc, PT_NAME

/**
  *@조건에 부합하는 중고거래 댓글 조회하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/164673
 */
SELECT b.TITLE
     , b.BOARD_ID
     , r.REPLY_ID
     , r.WRITER_ID
     , r.CONTENTS
     , DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
from USED_GOODS_BOARD b
         join USED_GOODS_REPLY r
              on r.BOARD_ID = b.BOARD_ID
where year(b.CREATED_DATE)= 2022 and month (b.CREATED_DATE) = 10
order by r.CREATED_DATE, b.TITLE

/**
  *@조건에 모든 레코드 조회하기
  *@URL: https://school.programmers.co.kr/learn/courses/30/lessons/59034
 */
SELECT ANIMAL_ID
     , ANIMAL_TYPE
     , DATETIME
     , INTAKE_CONDITION
     , NAME
     , SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID