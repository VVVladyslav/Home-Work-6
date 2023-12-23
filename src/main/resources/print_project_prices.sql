SELECT p.ID AS PROJECT_ID,
SUM(w.SALARY * DATEDIFF('MONTH', p.START_DATE, p.FINISH_DATE)) AS PROJECT_COST
FROM project p
JOIN project_worker pw ON p.ID = pw.PROJECT_ID
JOIN worker w ON pw.WORKER_ID = w.ID
GROUP BY p.ID
ORDER BY PROJECT_COST DESC;