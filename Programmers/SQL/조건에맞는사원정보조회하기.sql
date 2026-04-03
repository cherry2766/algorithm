WITH SCORE_SUM AS (
    SELECT
        EMP_NO,
        SUM(SCORE) AS SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
    ORDER BY SCORE DESC
    LIMIT 1
    )

SELECT
    S.SCORE,
    S.EMP_NO,
    E.EMP_NAME,
    E.POSITION,
    E.EMAIL
FROM HR_EMPLOYEES E
         JOIN SCORE_SUM S
              ON E.EMP_NO = S.EMP_NO;

-- --------------------------------------------------------

WITH SCORE_RANK AS (
    SELECT
        EMP_NO,
        SUM(SCORE) AS TOTAL_SCORE,
        ROW_NUMBER() OVER (ORDER BY SUM(SCORE) DESC) AS RN
    FROM HR_GRADE
    GROUP BY EMP_NO
)

SELECT
    S.TOTAL_SCORE,
    E.EMP_NO,
    E.EMP_NAME,
    E.POSITION,
    E.EMAIL
FROM SCORE_RANK S
         JOIN HR_EMPLOYEES E
              ON S.EMP_NO = E.EMP_NO
WHERE S.RN = 1;