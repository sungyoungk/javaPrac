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