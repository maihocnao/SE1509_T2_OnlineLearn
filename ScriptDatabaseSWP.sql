use master
go  
--drop database SWP
create database SWP
go
Use SWP
go

create table "Role"(
roleID nvarchar(8) primary key,
roleName nvarchar(50),
roleDescription nvarchar(50) ,
);
insert into "Role" values ('01','ADM','Admin')
insert into "Role" values ('02','CUS','Customer')
insert into "Role" values ('03','SAL','Sale')
insert into "Role" values ('04','MKT','Marketing')

create table Setting(
SettingID int primary key,
[order] int,
"type" nvarchar(20),
value float,
"status" bit,
"Description" nvarchar(50),
);

create table "User"(
UserID int primary key,
RoleID nvarchar(8) ,
SettingID int ,
Email nvarchar(50) ,
"Password" nvarchar (20),
Gender nvarchar(20) ,
Fullname nvarchar(50),
Phone nvarchar(50),
foreign key (RoleID) references "Role"(RoleID),
foreign key (SettingID) references Setting(SettingID)
);
insert into "User" values ('01','01','01','','123','Nam','Nguyen van a','0123456789')
insert into "User" values ('02','02','02','','123','Nu','Nguyen van a','0987654321')

create table Category(
categoryID int primary key,
categoryName nvarchar(50),
);
insert dbo.Category ([categoryID],[categoryName]) values ('1','CUONG')
insert dbo.Category ([categoryID],[categoryName]) values ('2','ANH')

create table Registration(
registrationID int primary key,
regisTime date,
"status" int,
validFrom nvarchar(20),
validto nvarchar(20),
totalPrice float ,
UserID int,
UserEmail nvarchar(50),
foreign key (UserID) references "User"(UserID)
);
INSERT INTO Registration (registrationID,regisTime,status, validFrom,validto,totalPrice,UserID,UserEmail)
VALUES (1, '20/9/2021', 1, '25/9/2021','30/11/2021',50.5,1,'email');
INSERT INTO Registration (registrationID,regisTime,status, validFrom,validto,totalPrice,UserID,UserEmail)
VALUES (2, '20/9/2021', 1, '25/9/2021','30/11/2021',40.5,1,'email2');

create table [Subject](
subjectID int primary key,
categoryID int,
thumbnail nvarchar(50) ,
name nvarchar (20),
"Description" nvarchar(50),
Foreign key (categoryID) references Category(categoryID),
);
insert into "Subject" values ('01','01','','','')
insert into "Subject" values ('02','02','','','')


create table  Course(
courseID int primary key,
subjectID int ,
registrationID int ,
title nvarchar(50),
tagline nvarchar(50),
briefInfo nvarchar(50),
status bit ,
foreign key (subjectID) references [Subject](subjectID),
foreign key (registrationID) references [Registration](registrationID)
);
insert into Course values ('01','01','01','','','','')
insert into Course values ('02','02','02','','','','')

create table Lesson(

lessonID int primary key,
subjectID int ,
content nvarchar(MAX),
lessonName nvarchar(50),
courseID int ,
status bit,
Foreign key (courseID) references Course(courseID),
Foreign key (subjectID) references [Subject](subjectID)
);
INSERT INTO Lesson (lessonID,subjectID, content, lessonName,courseID,status)
VALUES (1, 1, 'content1', 'lesson 1',1,1);
INSERT INTO Lesson (lessonID,subjectID, content, lessonName,courseID,status)
VALUES (2, 1, 'content1','lesson 2', 1,1);

create table SubjectDimension(
dimensionID int primary key,
[type] nvarchar(20) ,
name nvarchar(50),
[description] nvarchar(50),
);
INSERT INTO SubjectDimension (dimensionID, [type], name, [description])
VALUES (1, 'Type1', 'IT', 'exclusive ID content');
INSERT INTO SubjectDimension (dimensionID, [type], name, [description])
VALUES (2, 'Type2', 'MKT', 'exclusive marketing content');

create table Quiz(
quizID int primary key,
lessonID int, 
quizName nvarchar(50),
[level] nvarchar(50),
numOfQuestion int,
duration int,
passRate float,
quizType nvarchar(50),
subjectID int,
Foreign key (subjectID) references "Subject"(subjectID),
Foreign key (lessonID) references Lesson(lessonID)
);
insert into Quiz values (1,1,'Capital City','Easy',2,300,75,'Multiple Choices',1)
insert into Quiz values (2,2,'Math','Medium',2,300,80,'Multiple Choices',2)

create table Question (
questionID int primary key,
quizID int,
content nvarchar(50),
"level" nvarchar(50),
lessoniD int,
subjectID int,
dimensionID int,
foreign key (lessoniD) references Lesson(lessoniD),
foreign key (subjectID) references "Subject"(subjectID),
foreign key (dimensionID) references SubjectDimension(dimensionID),
foreign key (quizID) references Quiz(quizID)
);
insert into Question values (1,1,'Capital of Vietnam?','Easy',1,1,1)
insert into Question values (2,1,'Capital of England?','Easy',1,1,1)
insert into Question values (3,2,'1 + 1 = ?','Easy',2,2,2)

create table Answer(
answerID int primary key,
questionID int ,
result int,
content nvarchar(50),
Foreign key (questionID) references Question(questionID)
);
insert into Answer values (1,1,1,'Hanoi')
insert into Answer values (2,1,0,'Tokyo')
insert into Answer values (3,1,0,'Seoul')
insert into Answer values (4,1,0,'Bangkok')
insert into Answer values (5,2,1,'London')
insert into Answer values (6,2,0,'Paris')
insert into Answer values (7,2,0,'Rome')
insert into Answer values (8,2,0,'Madrid')
insert into Answer values (9,3,0,'0')
insert into Answer values (10,3,0,'1')
insert into Answer values (11,3,1,'2')
insert into Answer values (12,3,0,'3')

create table Score(
quizID int ,
score int ,
phone nvarchar(50),
Foreign key (quizID) references Quiz(quizID),
);


create table PricePackage(
pricePackageID int primary key,
name nvarchar(50),
accessDuration int,
"status" bit,
listPrice float,
salePrice float,
"description" nvarchar(50),
subjectID int,
Foreign key (subjectID) references "Subject"(subjectID)
);
insert into PricePackage values ('1','PrP1','30','1','10','12','','')
insert into PricePackage values ('2','PrP2','30','0','11','13','','')





create table Slider(
sliderID int primary key,
title nvarchar(50),
backlink nvarchar(50),
"image" nvarchar(50) ,
);
INSERT INTO Slider (sliderID, title, backlink, image)
VALUES (1, 'Title1', 'link1', 'images1');
INSERT INTO Slider (sliderID, title, backlink, image)
VALUES (2, 'Title2', 'link2', 'images2');




create table Blog (
blogID int primary key,
userID int ,
fullname nvarchar(50),
categoryID int,
thumbnail nvarchar(50),
title nvarchar(50),
updatedDate nvarchar(50),
blogDetail nvarchar(50),
flag bit,
status bit,
Foreign key (categoryID) references Category(categoryID),
Foreign key (userID) references "User"(userID)
);
insert into Blog values (1,1,'BlogNumber1',1,'','title1','','',1,1)
insert into Blog values (2,1,'BlogNumber2',1,'','title2','','',1,1)
