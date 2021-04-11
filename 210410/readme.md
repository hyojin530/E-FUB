21.04.10 세미나 과제
=====

1. MYSQL 과제
--------

```sql
select member_id, name, position_type, members.team_id, team_type, email from members
inner join position on position.position_id = members.position_id
inner join team on team.team_id = members.team_id;
```

2. AWS 과제
--------