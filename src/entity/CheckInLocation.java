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
public class CheckInLocation 
{
    private int checkInLocationID;
    private String stationName;
  
    
    public CheckInLocation(int checkInLocationID, String stationName)
    {
        this.checkInLocationID = checkInLocationID;
        this.stationName = stationName;
    
    }

    public int getCheckInLocationID() {
        return checkInLocationID;
    }

    public String getStationName() {
        return stationName;
    }


    @Override
    public String toString() {
        return "CheckInLocation{" + "checkInLocationID=" + checkInLocationID + ", stationName=" + stationName + '}';
    }
}
