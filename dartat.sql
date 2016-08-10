Members:
CREATE TABLE members(member_id INT NOT NULL auto_increment primary key,member_num VARCHAR(30),address1 VARCHAR(50),address2 VARCHAR(50),cateogry VARCHAR(20))			CREATE TABLE publishers(publisher_id int PRIMARY KEY,publisher_nm VARCHAR(40))	
Authors:
CREATE TABLE authors(author_id int PRIMARY KEY,author_nm VARCHAR(30))	
Subjects:
CREATE TABLE subjects(subject_id int PRIMARY KEY,subject_nm VARCHAR(30))	
Titles:
CREATE TABLE titles(title_id varchar(20) PRIMARY KEY,title_nm VARCHAR(30),subject_id int not null,publisher_id int NOT NULL,FOREIGN KEY(subject_id) REFERENCES subjects(subject_id)
 ,FOREIGN KEY(publisher_id) REFERENCES publishers(publisher_id))		

Books:
CREATE TABLE books(accession_no int  PRIMARY KEY,title_id varchar(20),purchase_dt datetime NOT NULL ,price int,status boolean ,
 FOREIGN KEY(title_id) REFERENCES titles(title_id)
 )	
title_author
CREATE TABLE title_author(title_id varchar(20),author_id int,FOREIGN KEY(title_id) REFERENCES titles(title_id) ,FOREIGN KEY(author_id) REFERENCES authors(author_id),
     PRIMARY KEY(title_id,author_id))	

book_issue
CREATE TABLE book_issue(issue_dt datetime,accession_no int  ,member_id int,due_dt datetime NOT NULL ,
 
  FOREIGN KEY(accession_no) REFERENCES books(accession_no),FOREIGN KEY(member_id) REFERENCES members(member_id),Primary Key(issue_dt,accession_no,member_id))	
book_return
CREATE TABLE book_return(return_dt datetime,accession_no int  ,member_id int,issue_dt datetime ,FOREIGN KEY(accession_no) REFERENCES books(accession_no),FOREIGN KEY(member_id) REFERENCES members(member_id),FOREIGN KEY(issue_dt) REFERENCES book_issue(issue_dt),
 Primary Key(return_dt,accession_no,issue_dt));

//Show all tables
show tables;
//Drop tables for deleting members table
drop table book_return;
drop table book_issue;
drop table members;
//Again create table members,book_issue and book_return
CREATE TABLE members(member_id INT NOT NULL auto_increment primary key,member_num VARCHAR(30),address1 VARCHAR(50),address2 VARCHAR(50),cateogry VARCHAR(20))	

CREATE TABLE book_issue(issue_dt datetime,accession_no int  ,member_id int,due_dt datetime NOT NULL ,
 
 FOREIGN KEY(accession_no) REFERENCES books(accession_no),FOREIGN KEY(member_id) REFERENCES members(member_id),Primary Key(issue_dt,accession_no,member_id))	
CREATE TABLE book_return(return_dt datetime,accession_no int  ,member_id int,issue_dt datetime ,FOREIGN KEY(accession_no) REFERENCES books(accession_no),FOREIGN KEY(member_id) REFERENCES members(member_id),FOREIGN KEY(issue_dt) REFERENCES book_issue(issue_dt),
 Primary Key(return_dt,accession_no,issue_dt));


