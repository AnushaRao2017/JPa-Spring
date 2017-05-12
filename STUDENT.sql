CREATE TABLE STUDENT
(
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
Firstname VARCHAR(255),
Lastname VARCHAR(255),
Age VARCHAR(1024),
CONSTRAINT primary_key PRIMARY KEY (ID)
);



INSERT INTO STUDENT(Firstname, Lastname, Age) 
VALUES('Avinash', 'Rao', '27'),
 ('Anusha', 'Rao', '30'), 
('Karthik', 'Kundapur', '32'),
 ('Radhika', 'Kundapur', '34');