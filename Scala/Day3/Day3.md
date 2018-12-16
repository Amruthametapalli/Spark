# Day3
## Creating Database 
``` sql
CREATE DATABASE IF NOT EXISTS Day3
```
## Creating Person table
```sql
CREATE TABLE Day3.Persons (
  PersonID int,
  LastName varchar(255),
  FirstName varchar(255),
  Address varchar(255),
  City varchar(255),
  Postal_code String
)
```
//Inserting into Persons table 
INSERT INTO TABLE Day3.Persons
VALUES (1, 'John', 'Franks', '1001 Mission St', 'San Francisco', '94016'),
(2, 'Peter', 'Sonnens', '1002 Mission St', 'San Francisco', '94016'),
(3, 'Leslie', 'Mark', '1042 Mission St', 'San Francisco', '94016'),
(4, 'Mary', 'Frank', '12 Oak St', 'San Francisco', '94417'),
(5, 'Chryssa', 'Lurie', '112 Oak St', 'San Francisco', '94417'),
(6, 'Olympia', 'Sumners', '7807 Compton Ave', 'Los Angeles', '90002'),
(7, 'Stanley', 'Webbs', '9401 Zamora Ave', 'Los Angeles', '90002'),
(8, 'Robert', 'Jennie', '9 Aster Ave', 'Los Angeles', '90001'),
(9, 'Brikks', 'Baker', '23 Boggs St', 'Brimstone', '11200'),
(10, 'Monica', 'Zaneso', '1 Union St', 'Brimstone', '11201'),
(11, 'Barbara', 'Joshua', '1 Colonial St', 'New York', '12541'),
(12, 'Tom', 'William', '1 Reed St', 'New York', '12541'),
(13, 'Emma', 'Brown', '4234 Hawk St', 'New York', '12641'),
(14, 'Emily', 'Davis', '89 Hanes St', 'Poughkeepsie', '12313'),
(15, 'Andrew', 'Wilson', '76 Bakers St', 'Poughkeepsie', '12315')

//Creating Personal_info table
CREATE TABLE IF NOT EXISTS Day3.Personal_info (
  ID INT,
  EMAIL VARCHAR(200)
)

//Inserting into Personal_info table
INSERT INTO TABLE Day3.Personal_info
VALUES(1, 'abc.hdsd@gmail.com'),
(23, 'xyz_dhew@gmail.com'),
(34, 'hello.hi@gmail.com')

//Creating Personal_info table
CREATE TABLE IF NOT EXISTS Day3.Personal_info (
  ID INT,
  EMAIL VARCHAR(200)
)

//Inner Joining two tables
SELECT * FROM Day3.Persons AS P
INNER JOIN Day3.Personal_info as I
ON P.PERSONID = I.ID

//Left Outer Joining two tables
SELECT * FROM Day3.Persons AS P
LEFT OUTER JOIN Day3.Personal_info as I
ON P.PERSONID = I.ID

//Right Outer Joining two tables
SELECT * FROM Day3.Persons AS P
RIGHT OUTER JOIN Day3.Personal_info as I
ON P.PERSONID = I.ID

//Full Outer Joining two tables
SELECT * FROM Day3.Persons AS P
FULL OUTER JOIN Day3.Personal_info as I
ON P.PERSONID = I.ID
