CREATE TABLE Passenger(
Passenger_ID int NOT NULL PRIMARY KEY,
First_Name VARCHAR(30) NOT NULL,
Last_Name VARCHAR(30) NOT NULL,
CheckInLocation_ID int NOT NULL,
FOREIGN KEY(CheckInLocation_ID) REFERENCES CheckInLocation(CheckInLocation_ID),
CheckIn_DateTime TIMESTAMP NOT NULL
);