insert into members(member_num,address1,address2,cateogry)values('Riya','Durgapura','Jaipur','F');
insert into members(member_num,address1,address2,cateogry)values('SANS','MalviyaNagar','Jaipur','F');
insert into members(member_num,address1,address2,cateogry)values('SAGAR','RKCOLONY','BHL','S');

insert into authors values(101,'Sudarshan');
insert into authors values(102,'Shaumn');
insert into authors values(103,'Korth');
insert into authors values(104,'HorowitzSahani');


insert into publishers values(1011,'New Moon books');
insert into publishers values(1012,'Heaven havelies');
insert into publishers values(1013,'Riya Publishers');


insert into subjects values(10111,'Economics');
insert into subjects values(10121,'History');
insert into subjects values(10131,'Journalism');
insert into subjects values(10141,'Engineering');
insert into subjects values(10151,'Politics');

insert into titles values('B101','Economics of science',10111,1011);
insert into titles values('B102','Magic of engineering',10141,1013);
insert into titles values('B103','Facts of engineering',10141,1013);
insert into titles values('B104','How to be journlist',10131,1013);
insert into titles values('B105','war of politicians',10151,1012);

insert into title_author values('B101',101);
insert into title_author values('B102',102);
insert into title_author values('B102',103);
insert into title_author values('B103',104);

insert into books values(12343,'B101','2016-01-10',1500,1);
insert into books values(12345,'B101','2016-01-10',500,1);
insert into books values(12347,'B102','2016-01-10',700,1);
insert into books values(12348,'B103','2015-12-09',500,1);
insert into books values(12349,'B104','2015-11-21',600,1);





insert into books values(12343,'B101','2016-02-10',1500,1);


insert into titles values('B101','Economics of science',10111,1011);
insert into titles values('B102','Magic of engineering',10141,1);
insert into titles values('B103','Facts of engineering',10141,1013);
insert into titles values('B104','How to be journlist',10131,1);
insert into titles values('B105','war of politicians',10151,1);

delete from titles where publisher_id=1;



insert into book_issue values(CURDATE(),12347,1,CURDATE()+15);
insert into book_issue values(CURDATE(),12347,2,CURDATE()+15);
insert into book_issue values(CURDATE()-2,12346,2,CURDATE()-2+15);
insert into book_issue values(CURDATE()-3,12348,4,CURDATE()-3+15);
insert into book_issue values(CURDATE()-10,12349,1,CURDATE()-10+15);



insert into book_return values('2016-08-21 00:00:00',12349,1,'2016-08-00 00:00:00');
insert into book_return values('2016-08-24 00:00:00',12346,2,'2016-08-08 00:00:00');
insert into book_return values('2016-08-23 00:00:00',12348,4,'2016-08-07 00:00:00');

//Update
update  members set address2='Jaipur';

update  members set address1='EPIP Sitapura' where cateogry='F';

//Delete for publisher table
alter table book_return
  add constraint issue_dt
  foreign key (issue_dt)
  references book_issue (issue_dt) on delete cascade;

alter table book_issue
  add constraint accesion_no
  foreign key (accession_no)
  references books (accession_no) on delete cascade;

alter table books
  add constraint title_id
  foreign key (title_id)
  references titles (title_id) on delete cascade;

alter table titles
  add constraint subject_id
  foreign key (subject_id)
  references subjects (subject_id) on delete cascade;
  
  alter table titles
  add constraint publisher_id
  foreign key (publisher_id)
  references publishers (publisher_id) on delete cascade;

alter table title_author
  add constraint author_id
  foreign key (author_id)
  references authors (author_id) on delete cascade;
  

delete from publishers;


insert into publishers values(1011,'New Moon books');
insert into publishers values(1012,'Heaven havelies');
insert into publishers values(1013,'Riya Publishers');
insert into publishers values(1,'Maheshwari Publictions');
