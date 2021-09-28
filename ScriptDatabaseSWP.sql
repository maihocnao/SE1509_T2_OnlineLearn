use master
go  
--drop database SWP
create database SWP
go
Use SWP
go

create table "Role"(
roleID int IDENTITY(1,1) primary key,
roleName nvarchar(50),
roleDescription nvarchar(50) ,
);

insert into "Role" values ('Customer','view Subject, study Courses')
insert into "Role" values ('Sale','View and Control Order')
insert into "Role" values ('Marketing','View Dashboard, Post, Order')
insert into "Role" values ('Expert','Control Subject, Courses, Lesson')
insert into "Role" values ('Admin','Manage all website')

--bang nay se setting cac order/registration
create table Setting(
SettingID int IDENTITY(1,1) primary key,
[order] int,--registrationID
"type" nvarchar(20),
value float,
"status" nvarchar(20),
"Description" nvarchar(100),
);

insert into Setting values (1,'Type1',43,'Pending','Customer want to do something')
insert into Setting values (2,'Type1',43,'Done','Everything is okay')
insert into Setting values (2,'Type1',66,'Done','Everything is okay')

--tam thoi bo settingid vi khong hieu no co tac dung gi
create table [User](
UserID int IDENTITY(1,1) primary key,
RoleID int ,
Email nvarchar(50) ,
"Password" nvarchar (20),
Gender nvarchar(20) ,
Fullname nvarchar(50),
Phone nvarchar(50),
status nvarchar(10),
foreign key (RoleID) references "Role"(RoleID),

);
--insert customer
insert into [User] values (1,'ngvCustomer@2mail.com','123','Nam','Nguyen van Customer','Active','1234')
insert into [User] values (1,'trtCustomer@2mail.com','123','Nu','Tran Thi Customer','Active','1235')
insert into [User] values (1,'ltCustomer@2mail.com','123','Nu','Le Thi Customer','Active','1236')
insert into [User] values (1,'hvCustomer@2mail.com','123','Nam','Hoang Van Customer','Active','1237')
-- insert sale
insert into [User] values (2,'aSale@2mail.com','123','Nam','Nguyen van a','Active','2345')
insert into [User] values (2,'bSale@2mail.com','123','Nam','Nguyen van b','Active','2346')
insert into [User] values (2,'cSale@2mail.com','123','Nu','Nguyen thi c','Active','2367')
insert into [User] values (2,'dSale@2mail.com','123','Nu','Vuong thi d','Active','2347')
-- insert marketing
insert into [User] values (3,'aMarketing@2mail.com','123','Nam','Nguyen van a','Active','3456')
insert into [User] values (3,'bMarketing@2mail.com','123','Nam','Nguyen van b','Active','3457')
insert into [User] values (3,'cMarketing@2mail.com','123','Nu','Nguyen thi c','Active','3458')
insert into [User] values (3,'dMarketing@2mail.com','123','Nu','Vuong thi d','Active','3459')
-- insert expert
insert into [User] values (4,'aExpert@2mail.com','123','Nam','Nguyen van a','Active','4567')
insert into [User] values (4,'bExpert@2mail.com','123','Nam','Nguyen van b','Active','4568')
insert into [User] values (4,'cExpert@2mail.com','123','Nu','Nguyen thi c','Active','4569')
insert into [User] values (4,'dExpert@2mail.com','123','Nu','Vuong thi d','Active','4560')
-- insert admin
insert into [User] values (5,'aAdmin@2mail.com','123','Nam','Nguyen van a','Active','5678')
insert into [User] values (5,'bAdmin@2mail.com','123','Nam','Nguyen van b','Active','5679')
insert into [User] values (5,'cAdmin@2mail.com','123','Nu','Nguyen thi c','Active','5670')
insert into [User] values (5,'dAdmin@2mail.com','123','Nu','Vuong thi d','Active','5671')

create table Category(
categoryID int IDENTITY(1,1) primary key,
[type] nvarchar(36) ,
categoryName nvarchar(50));
insert dbo.Category  values ('Domain','Art and Design')
insert dbo.Category  values ('Domain','Business')
insert dbo.Category  values ('Domain','Computer Science')
insert dbo.Category  values ('Group','Math and Logic')
insert dbo.Category  values ('Group','Languages')
insert dbo.Category  values ('Group','Music')

-- has email so do they need userID?, add courseID



--them status, them featured subject ?
create table [Subject](
subjectID nvarchar(20) primary key,
categoryID int,
thumbnail nvarchar(100) ,
name nvarchar (200),
"Description" nvarchar(600),
status nvarchar (20),
featured nvarchar (200), --khoa hoc noi bat ?
Foreign key (categoryID) references Category(categoryID),
);
insert into "Subject" values ('SDE101',1,'images/subject1.jpg','Subject Design','This subject is create for','Active','Yes')
insert into "Subject" values ('ITE302c',3,'images/subject2.jpg','Ethics in IT','This subject is create for','Active','Yes')
insert into "Subject" values ('SWE201',3,'images/subject3.jpg','Software Development Lifecycle' ,'This subject is create for','Active','Yes')
insert into "Subject" values ('WED102',3,'images/subject4.jpg','Web Design for Everybody: Basics of Web Development & Coding ','This subject is create for','Active','No')
insert into "Subject" values ('ASSL',3,'images/subject5.jpg','Academic Skills for University Success ','This subject is create for','Active','Yes')
insert into "Subject" values ('SSL',1,'images/subject6.jpg','Softskill','This subject is create for','Active','Yes')


---course: thay lai status, length of briefInfo, delete registrationID
--create table  Course(
/*courseID int IDENTITY(1,1) primary key,
subjectID nvarchar(20) ,
title nvarchar(100),
tagline nvarchar(50),
briefInfo nvarchar(300),
status nvarchar(20) ,
foreign key (subjectID) references [Subject](subjectID));
insert into Course values ('ITE302c', 'Part I ITE302c','#ethics','This course is about Introduction','Active')
insert into Course values ('ITE302c', 'Part II ITE302c','#ethics','This course is about Big problem','Active')
insert into Course values ('ITE302c', 'Part III ITE302c','#ethics','This course is about Closing','Active')
insert into Course values ('WED102', 'Part I HTML - HTML5','#web','This course is about HTML','Active')
insert into Course values ('WED102', 'Part II - CSS','#web','This course is about css','Active')
insert into Course values ('WED102', 'Part III - Javascript','#web','This course is about Javascript','Active')
*/

create table Registration(
registrationID int IDENTITY(1,1) primary key,
regisTime nvarchar(20),
status nvarchar(20),
validFrom nvarchar(20),
validto nvarchar(20),
totalPrice float ,
UserID int,
UserEmail nvarchar(50),
subjectID nvarchar(20) ,
foreign key (subjectID) references [Subject](subjectID),
foreign key (UserID) references "User"(UserID),
);

INSERT INTO Registration VALUES ('20/9/2021', 'Done', '25/9/2021','30/11/2021',56.5,1,'trtCustomer@2mail.com','ITE302c');
INSERT INTO Registration VALUES ('20/9/2021', 'Cancel', '25/9/2021','30/11/2021',76.5,2,'trtCustomer@2mail.com','WED102');
INSERT INTO Registration VALUES ('20/9/2021', 'Done', '25/9/2021','30/11/2021',44.5,3,'trtCustomer@2mail.com','ITE302c');
INSERT INTO Registration VALUES ('20/9/2021', 'Pending', '25/9/2021','30/11/2021',40.5,1,'ngvCustomer@2mail.com','WED102');
INSERT INTO Registration VALUES ( '20/9/2021', 'Pending', '25/9/2021','30/11/2021',55,2,'ngvCustomer@2mail.com','ITE302c');


--khoa, them lessontype(video, html, or quiz)
create table Lesson(
lessonID int IDENTITY(1,1) primary key,
lessonType nvarchar(20),
lessonName nvarchar(100),
youtubeLink  nvarchar(1000),
content nvarchar(4000),
status nvarchar(20),
subjectID nvarchar(20) ,
foreign key (subjectID) references [Subject](subjectID));
INSERT INTO Lesson VALUES ( 'Youtube','HTML5 introduction','https://www.youtube.com/watch?v=PY2RLgTmiZY','HTML 5 introduces elements and attributes that reflect typical usage on modern websites. Some of them are semantic replacements for common uses of generic block (<div>) and inline (<span>) elements, for example <nav> (website navigation block), <footer> (usually referring to bottom of web page or to last lines of HTML code), or <audio> and <video> instead of <object>.[80][81][82] Some deprecated elements from HTML 4.01 have been dropped, including purely presentational elements such as <font> and <center>, whose effects have long been superseded by the more capable Cascading Style Sheets.[83] There is also a renewed emphasis on the importance of client-side JavaScript used to create dynamic web pages.[citation needed]

The HTML 5 syntax is no longer based on SGML[84][85] despite the similarity of its markup. It has, however, been designed to be backward-compatible with common parsing of older versions of HTML. It comes with a new introductory line that looks like an SGML document type declaration, <!DOCTYPE html>, which triggers the standards-compliant rendering mode.[86] Since 5 January 2009, HTML 5 also includes Web Forms 2.0, a previously separate WHATWG specification.[87][88]', 'Active','WED102');
INSERT INTO Lesson VALUES ( 'Quiz','HTML5 Quiz 1','','fist quiz to get to know better' , 'Active','WED102');


/* vi co category roi nen khong can subjectdimension
create table SubjectDimension(
dimensionID int IDENTITY(1,1) primary key,
[type] nvarchar(36) ,
name nvarchar(50),
[description] nvarchar(700),
);
INSERT INTO SubjectDimension ( [type], name, [description])
VALUES ('Domain', 'Computer Science', 'exclusive ID content');
INSERT INTO SubjectDimension ( [type], name, [description])
VALUES ('Group', 'History', 'exclusive marketing content');*/

--chi can khoa ngoai lesson ID la dc
create table Quiz(
quizID  int IDENTITY(1,1) primary key,
lessonID int, 
quizName nvarchar(50),
[level] nvarchar(50),
numOfQuestion int,
duration int,--minute
passRate float,
quizType nvarchar(50),
Foreign key (lessonID) references Lesson(lessonID));
insert into Quiz values (2,'HTML Quiz','Easy',5,2,75,'Multiple Choices')

--co quizID so dont need lessonID
create table Question (
questionID int IDENTITY(1,1) primary key,
quizID int,
content nvarchar(1000),
"level" nvarchar(50),
foreign key (quizID) references Quiz(quizID));
insert into Question values (1,' Which of the following feature is a part of HTML 5?','Easy')



create table Answer(
answerID int IDENTITY(1,1) primary key,
questionID int ,
result bit,--is this true
content nvarchar(50),
Foreign key (questionID) references Question(questionID)
);
insert into Answer values (1,0,'Canvas')
insert into Answer values (1,0,'Audio & Video')
insert into Answer values (1,0,'Geolocation')
insert into Answer values (1,1,'All of the above.')--this is true


--add UserID to Score
create table Score(
scoreID int IDENTITY(1,1) primary key, 
quizID int ,
score float ,
userID int,
Foreign key (quizID) references Quiz(quizID),
foreign key (UserID) references "User"(UserID)
);
insert into Score values (1,7.5,1)
insert into Score values (1,8,2)

create table PricePackage(
pricePackageID int IDENTITY(1,1) primary key,
name nvarchar(50),
accessDuration int,
"status" nvarchar(20),
listPrice float,
salePrice float,
"description" nvarchar(500),
subjectID nvarchar(20) ,
foreign key (subjectID) references [Subject](subjectID)
);
insert into PricePackage values ('PrP1',60,'Active',100,90,'this package is full','WED102')
insert into PricePackage values ('PrP1',90,'Active',100,90,'this package is full','WED102')
insert into PricePackage values ('PrP1',120,'Active',100,90,'this package is full','WED102')






create table Slider(
sliderID int IDENTITY(1,1) primary key,
title nvarchar(50),
backlink nvarchar(50),
"image" nvarchar(50) ,
);
INSERT INTO Slider (title, backlink, image)
VALUES ( 'Title1', 'link1', 'images1');
INSERT INTO Slider ( title, backlink, image)
VALUES ( 'Title2', 'link2', 'images2');




create table Blog (
blogID int IDENTITY(1,1) primary key,
userID int ,
categoryID int,
thumbnail nvarchar(50),
title nvarchar(300),
updatedDate nvarchar(50),
blogContent nvarchar(3000),
flag bit,--co noi bat khong
status nvarchar(20),
Foreign key (categoryID) references Category(categoryID),
Foreign key (userID) references "User"(userID)
);
insert into Blog values (9,3,'images/','Bitcoin','Sept 21,2021','Bitcoin is the biggest cryptocurrency by market value and, for now, continues to dwarf its competitors. But the rise of crypto rivals with far more real-life applications means it will be dethroned sooner rather than later, according to financial TikTok influencer Mason Versluis.',1,'Active')
insert into Blog values (10,3,'images/','title2','Sept 21,2021','content',1,'Active')
