-- Part 1: Test it with SQL
--/*CREATE TABLE job (
--    id INT
--    employer VARCHAR
--    name VARCHAR
--    skill VARCHAR
--);
--
---- Part 2: Test it with SQL
--SELECT employer
--FROM job
--WHERE employer = St. Louis City
--
---- Part 3: Test it with SQL
--DROP TABLE job

-- Part 4: Test it with SQL
--SELECT skill
--FROM job
--ORDER BY skill ASC AND job IS NOT NULL;*/


--Part 1
-- id (int, PK), employer(varchar), name(varchar), skills(varchar)

--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill
      LEFT JOIN job_skills ON skill.id = job_skills.skills_id
      WHERE job_skills.jobs_id IS NOT NULL
      ORDER BY name ASC;