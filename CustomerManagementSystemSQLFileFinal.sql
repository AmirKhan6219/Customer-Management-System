use customers;

CREATE TABLE CUSTOMER_TBL(
CUSTOMER_ID int NOT NULL AUTO_INCREMENT, 
CUSTOMER_NO int, 
CUSTOMER_NAME VARCHAR(20), 
CUSTOMER_TYPE VARCHAR(20), 
CUSTOMER_PHONE long, 
STREET VARCHAR(100), 
CITY VARCHAR(20), 
STATE VARCHAR(20), 
COUNTRY VARCHAR(20), 
CREATED_BY VARCHAR(20), 
CREATED_ON DATE, 
UPDATED_BY VARCHAR(20), 
UPDATED_ON DATE
);

CREATE TABLE CANADA_STATE_TBL (	
STATE_NO int, 
STATE_NAME VARCHAR(20)
);

CREATE TABLE INDIA_STATE_TBL (	
STATE_NO int, 
STATE_NAME VARCHAR(20)
);

CREATE TABLE USA_STATE_TBL (	
STATE_NO int, 
STATE_NAME VARCHAR(20)
);

CREATE TABLE COUNTRY_TBL (	
COUNTRY_ID int, 
COUNTRY_CODE VARCHAR(20), 
COUNTRY_NAME VARCHAR(20), 
CREATED_BY VARCHAR(20), 
CREATED_ON DATE, 
UPDATED_BY VARCHAR(20), 
UDPATED_ON DATE
);

select * from USA_STATE_TBL;
select * from INDIA_STATE_TBL;
select * from CANADA_STATE_TBL;
select * from COUNTRY_TBL;
select * from customer_tbl;

CREATE UNIQUE INDEX CUSTOMER_PK ON CUSTOMER_TBL (CUSTOMER_ID);

CREATE UNIQUE INDEX SYS_C007960 ON CANADA_STATE_TBL (STATE_NO);

CREATE UNIQUE INDEX SYS_C007958 ON INDIA_STATE_TBL (STATE_NO);

CREATE UNIQUE INDEX SYS_C007959 ON USA_STATE_TBL (STATE_NO);

CREATE UNIQUE INDEX SYS_C007856 ON COUNTRY_TBL (COUNTRY_ID); 

ALTER TABLE CUSTOMER_TBL ADD CONSTRAINT CUSTOMER_PK PRIMARY KEY (CUSTOMER_ID);

ALTER TABLE CANADA_STATE_TBL ADD PRIMARY KEY (STATE_NO);

ALTER TABLE INDIA_STATE_TBL ADD PRIMARY KEY (STATE_NO);

ALTER TABLE USA_STATE_TBL ADD PRIMARY KEY (STATE_NO);

Insert into CANADA_STATE_TBL values (1,'Alberta');
Insert into CANADA_STATE_TBL values (2,'British Columbia');
Insert into CANADA_STATE_TBL values (3,'Manitoba');
Insert into CANADA_STATE_TBL values (4,'New Brunswick');
Insert into CANADA_STATE_TBL values (5,'Nova Scotia');
Insert into CANADA_STATE_TBL values (6,'Nunavut');

Insert into INDIA_STATE_TBL values (1,'Maharashtra');
Insert into INDIA_STATE_TBL values (2,'Tamil Nadu');
Insert into INDIA_STATE_TBL values (3,'Uttar Pradesh');
Insert into INDIA_STATE_TBL values (4,'Bihar');
Insert into INDIA_STATE_TBL values (5,'Andhra Pradesh');
Insert into INDIA_STATE_TBL values (6,'Delhi');
Insert into INDIA_STATE_TBL values (7,'Rahasthan');
Insert into INDIA_STATE_TBL values (8,'Karnataka');

Insert into USA_STATE_TBL values (1,'California');
Insert into USA_STATE_TBL values (2,'Texas');
Insert into USA_STATE_TBL values (3,'Florida');
Insert into USA_STATE_TBL values (4,'Hawaii');
Insert into USA_STATE_TBL values (5,'Virginia');
Insert into USA_STATE_TBL values (6,'Washington');

Insert into COUNTRY_TBL values (1,'a','India','Amir', STR_TO_DATE('12-01-2021', '%m-%d-%Y') ,'Amar',STR_TO_DATE('12-05-2021', '%m-%d-%Y'));
Insert into COUNTRY_TBL values (2,'b','USA','Amir', STR_TO_DATE('12-01-2021', '%m-%d-%Y') ,'Amar',STR_TO_DATE('12-05-2021', '%m-%d-%Y'));
Insert into COUNTRY_TBL values (3,'c','Canada','Amir', STR_TO_DATE('12-01-2021', '%m-%d-%Y') ,'Amar',STR_TO_DATE('12-05-2021', '%m-%d-%Y'));

select * from canada_state_tbl;
select * from india_state_tbl;
select * from usa_state_tbl; 
select * from country_tbl;
select * from customer_tbl;