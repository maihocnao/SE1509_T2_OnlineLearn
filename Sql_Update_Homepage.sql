--update 1 so bang

--slide:
update Slider set image='images/slider1.jpg',title='Title1' where sliderID=1
update Slider set image='images/slider2.jpg',title='Title2' where sliderID=2
--Blog:
update Blog set thumbnail='images/blog1.jpg', title='Tiltle1',updatedDate='Sep 21, 2021',blogDetail='This is' where blogID=1
update Blog set thumbnail='images/blog2.jpg', title='Tiltle2',updatedDate='Sep 21, 2021',blogDetail='Ok is' where blogID=2
--Subject:
update Subject set thumbnail='images/subject1.jpg', name='Subject1' where subjectID=1
update  Subject set thumbnail='images/subject2.jpg', name='Subject2' where subjectID=2
insert into Subject values(3,1,'images/subject3.jpg','Subject3','')
insert into Subject values(4,1,'images/subject4.jpg','Subject4','')
insert into Subject values(5,1,'images/subject5.jpg','Subject5','')
insert into Subject values(6,1,'images/subject6.jpg','Subject6','')
