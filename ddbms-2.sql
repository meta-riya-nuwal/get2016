Assignment1

1.DESCRIBE members;
2.select member_id,member_num,cateogry from members;
3.select member_id,member_num,cateogry from members where cateogry='F';
4.select DISTINCT cateogry from members;
5.select member_num,cateogry from members order by member_nm desc;


6.select title_nm,subject_nm ,publisher_nm from titles INNER JOIN subjects on titles.subject_id=subjects.subject_id INNER JOIN publishers on titles.publisher_id=publishers.publisher_id;

7.select cateogry,count(member_id) from members group by cateogry;

8.select mem1.member_num from members mem1 INNER JOIN members mem2 on mem1.cateogry=mem2.cateogry where mem2.member_num='Keshav';


9.select bi.issue_dt as BookIssuedate,bi.accession_no as BookAssessionNo,bi.member_id ,return_dt as BookReturndate from book_issue as bi LEFT JOIN book_return as br on bi.issue_dt=br.issue_dt and bi.accession_no=br.accession_no and bi.member_id=br.member_id;


Assignment2

select bi.issue_dt as BookIssuedate,bi.accession_no as BookAssessionNo,bi.member_id ,return_dt as BookReturndate  from book_issue as bi LEFT JOIN book_return as br on bi.issue_dt=br.issue_dt 
and bi.accession_no=br.accession_no and bi.member_id=br.member_id INNER JOIN members on bi.member_id=members.member_id order by bi.issue_dt,members.member_num ;
  