21.04.10 세미나 과제
=====

# 1. MYSQL 과제
> 노트북에서 mysql 로컬 서버가 돌아가지 않는 관계로 기존 aws에 올려놨던 mysql rds를 연결해 실습을 진행했다.
--------
## 1.1. table
### 1.1.1. members
<img src="members.jpeg">

### 1.1.2. position
<img src="position.jpeg">

### 1.1.3. team
<img src="team.jpeg">

## 1.2. SQL code
```sql
select member_id, name, position_type, members.team_id, team_type, email from members
inner join position on position.position_id = members.position_id
inner join team on team.team_id = members.team_id;
```

## 1.3. output
<img src="join_output.jpeg">



# 2. AWS 과제
>https://run.qwiklabs.com/focuses/16506?catalog_rank=%7B%22rank%22%3A1%2C%22num_filters%22%3A0%2C%22has_search%22%3Atrue%7D&parent=catalog&search_id=9966939
--------

## 2.1. original
<img src="HappyFace.jpeg">

## 2.2. resized
<img src="HappyFace_resized.jpeg">