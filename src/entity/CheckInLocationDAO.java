/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import core.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 *
 * @author Gokhan
 */
public class CheckInLocationDAO implements DAO<CheckInLocation>
{   
    public CheckInLocationDAO() {
        
    }
    List<CheckInLocation> checkInLocations;
    /**
     * Get a check-in-location entity as a check-in-location object
     * @param id
     * @return 
     */
    @Override
    public Optional<CheckInLocation> get(int id) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM CheckInLocation WHERE CheckInLocation_ID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            CheckInLocation checkInLocation = null;
            while (rs.next()) {
                checkInLocation = new CheckInLocation(rs.getInt("CheckInLocation_ID"), rs.getString("Station_Name"));
            }
            return Optional.ofNullable(checkInLocation);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all check-in-location entities as a List
     * @return 
     */
    @Override
    public List<CheckInLocation> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        checkInLocations = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CheckInLocation";
            rs = db.executeQuery(sql);
            CheckInLocation checkInLocation = null;
            while (rs.next()) {
                checkInLocation = new CheckInLocation(rs.getInt("CheckInLocation_ID"), rs.getString("Station_Name"));
                checkInLocations.add(checkInLocation);
            }
            return checkInLocations;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert a check-in-location object into check-in-table table
     * @param checkInLocations 
     */
    @Override
    public void insert(CheckInLocation checkInLocations)
    {
        DB db = DB.getInstance();
        try {
            String sql = "INSERT INTO CheckInLocation(CheckInLocation_ID, Station_Name) VALUES (?, ?)";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, checkInLocations.getCheckInLocationID());
            stmt.setString(2, checkInLocations.getStationName());
            //stmt.setString(3, customer.getLastName());
            //stmt.setString(4, customer.getFavoriteMeal());
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new check-in-location was inserted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a check-in-location entity in database if it exists using a check-in-location object
     * @param checkInLocations
     */
    @Override
    public void update(CheckInLocation checkInLocations) {
        DB db = DB.getInstance();
        try {
            String sql = "UPDATE checkInLocation SET Station_Name=? WHERE checkInLocation_ID=?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, checkInLocations.getStationName());
            //stmt.setString(2, checkInLocations.getLastName());
            //stmt.setString(3, checkInLocations.getFavoriteMeal());
            stmt.setInt(2, checkInLocations.getCheckInLocationID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing check-in-location was updated successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a check-in-location from CheckInLocation table if the entity exists
     * @param checkInLocations 
     */
    @Override
    public void delete(CheckInLocation checkInLocations) {
        DB db = DB.getInstance();
        try {
            String sql = "DELETE FROM checkInLocation WHERE checkInLocation_ID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, checkInLocations.getCheckInLocationID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A check-in-location was deleted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Get all column names in a list array
     * @return 
     */
    @Override
    public List<String> getColumnNames() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        List<String> headers = new ArrayList<>();
        try {
            String sql = "SELECT * FROM checkInLocation WHERE checkInLocation_ID = -1";//We just need this sql query to get the column headers
            rs = db.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            //Get number of columns in the result set
            int numberCols = rsmd.getColumnCount();
            for (int i = 1; i <= numberCols; i++) {
                headers.add(rsmd.getColumnLabel(i));//Add column headers to the list
            }
            return headers;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        } 
    }
}
