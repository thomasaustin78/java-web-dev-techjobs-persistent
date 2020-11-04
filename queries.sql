## Part 1: Test it with SQL
select column_name, Datatype from INFORMATION_SCHEMA.COLUMNS where tableName='job'

## Part 2: Test it with SQL
select name from employer where location='st. louis'

## Part 3: Test it with SQL
DROP TABLE job

## Part 4: Test it with SQL
select name, description from skill inner join job_skill, on skill.id=job_skill.skill_id order by name