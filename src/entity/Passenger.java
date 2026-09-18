/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author Gokhan
 */
public class Passenger 
{
    private int passengerID;
    private String firstName;
    private String lastName;
    private int checkInLocationID;
    private String checkInDatetime;
    
    public Passenger(int passengerID, String firstName, String lastName, int checkInLocationID, String checkInDatetime)
    {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.checkInLocationID= checkInLocationID;
        this.checkInDatetime = checkInDatetime;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getCheckInLocationID() {
        return checkInLocationID;
    }
    
    public String getCheckInDatetime() {
        return checkInDatetime;
    }

    @Override
    public String toString() {
        return "Passenger{" + "passengerID=" + passengerID + ", firstName=" + firstName + ", lastName=" + lastName 
              + ", checkInLocationID=" + checkInLocationID + ", checkInDatetime=" + checkInDatetime + '}';
    } 
}
