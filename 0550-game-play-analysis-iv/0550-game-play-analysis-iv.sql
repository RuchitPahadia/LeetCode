SELECT 
    ROUND(
        COUNT(DISTINCT a1.player_id) /
        (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM Activity a1
WHERE EXISTS (
    SELECT 1
    FROM Activity a2
    WHERE a2.player_id = a1.player_id
      AND a2.event_date = (
          SELECT MIN(a3.event_date)
          FROM Activity a3
          WHERE a3.player_id = a1.player_id
      ) + INTERVAL 1 DAY
);