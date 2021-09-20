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

create table SubjectDimension(
dimensionID int primary key,
[type] nvarchar(20) ,
name nvarchar(50),
[description] nvarchar(50),
);



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
create table Answer(
answerID int primary key,
questionID int ,
result int,
content nvarchar(50),
Foreign key (questionID) references Question(questionID)
);

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






create table Slider(
sliderID int primary key,
title nvarchar(50),
backlink nvarchar(50),
"image" nvarchar(50) ,
);



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


