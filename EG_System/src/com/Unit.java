package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.Part;

public class Unit {

	public Connection connect()
	{ 
		 Connection con = null; 
		 
		 try { 
			 Class.forName("com.mysql.jdbc.Driver"); 
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/electrogrid", "root", "saranga"); 
			 
			 //For testing
			 System.out.print("Successfully connected"); 
		} catch(Exception e){ 
			 e.printStackTrace(); 
		} 
		return con; 
	}
	
	public String addUnitRange(String mnValue, String mxValue, String modifiedDate, String price) {
		String output = ""; 
		try { 
			Connection con = connect(); 
			if (con == null) 
			{ 
				return "Error while connecting to the database"; 
			} 
			// create a prepared statement
			String query = "insert into unit(`unitID`,`mnValue`,`mxValue`,`modifiedDate`,`price`) values (?,?,?,?,?)"; 
			PreparedStatement preparedStmt = con.prepareStatement(query); 
			 
			// binding values
			preparedStmt.setInt(1, 0);
			preparedStmt.setInt(2, Integer.parseInt(mnValue));
			preparedStmt.setInt(3, Integer.parseInt(mxValue));
			preparedStmt.setString(4, modifiedDate);
			preparedStmt.setDouble(5, Double.parseDouble(price));			
			 
			//execute the statement
			 preparedStmt.execute(); 
			 con.close(); 

			 String units = readUnits();
			 output = "{\"status\":\"success\", \"data\": \"" + units + "\"}";
		}catch (Exception e) { 
			 output = "{\"status\":\"error\", \"data\": \"Error while inserting the unit.\"}";
			 System.err.println(e.getMessage()); 
		} 
		return output;
	}
	
	public String readUnits() {
		String output = "";
		try {
			Connection con = connect();
			if(con == null) {
				return "Error while connecting to the database";
			}
			
			output = "<table border='2' class='table table-bordered'>"
					+ "<tr>"
					+ "<th>Min Value</th>"
					+ "<th>Max Value</th>"
					+ "<th>Modified Date</th>"
					+ "<th>Price</th>"
					+ "<th>Update</th>"
					+ "<th>Delete</th>"
					+ "</tr>";
			
			String query = "select * from unit";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			// iterate through the rows in the result set
			while (rs.next()) {
				String unitID = Integer.toString(rs.getInt("unitID"));
				String mnValue = rs.getString("mnValue");
				String mxValue = rs.getString("mxValue");
				Date modifiedDate = rs.getDate("modifiedDate");
				String price = Double.toString(rs.getDouble("price"));
					
				//add a row into html table
				output += "<tr>";
				output += "<td>" + mnValue  + "</td>";
				output += "<td>" + mxValue  + "</td>";
				output += "<td>" + modifiedDate + "</td>";
				output += "<td>" + price  + "</td>";
	
				//buttons
				 output += "<td><input name='btnUpdate' type='button' value='Update' class='btnUpdate btn btn-success' data-unitid='" + unitID + "'></td>"
						 + "<td><input name='btnRemove' type='button' value='Remove' class='btnRemove btn btn-danger' data-unitid='" + unitID + "'></td></tr>";
				
			}
			
			con.close();
			output += "</table>";
			
		}catch(Exception e) {
			output = "Error while reading";
			System.out.println(e.getMessage());
		}
		return output;
	}
/*	
	public String updateUnit(String unitID, String mnValue, String mxValue, String modifiedDate, String price) {
		String output = "";

		try {
			Connection con = connect();

			if (con == null) {
				return "Error while connecting to the database for updating.";
			}

			// create a prepared statement
			String query = "UPDATE unit SET mnValue=?,mxValue=?,modifiedDate=?,price=? WHERE unitID=?";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			// binding values

			preparedStmt.setString(1, mnValue);
			preparedStmt.setString(2, mxValue);
			preparedStmt.setString(3, modifiedDate);
			preparedStmt.setString(4, price);
			preparedStmt.setInt(5, Integer.parseInt(unitID));

			// execute the statement
			preparedStmt.execute();
			con.close();

			String units = readUnits();
			output = "{\"status\":\"success\", \"data\": \"" + units + "\"}";
		} catch (Exception e) {
			output = "{\"status\":\"error\", \"data\": \"Error while updating the unit.\"}";
			System.err.println(e.getMessage());
		}

		return output;
	}

*/
	
	public String updateUnit(String unitID, String mnValue, String mxValue, String modifiedDate, String price) {
		String output = ""; 
		try { 
			Connection con = connect(); 
			if (con == null) 
			{ 
				return "Error while connecting to the database"; 
			} 
			// create a prepared statement
			String query = "UPDATE unit SET mnValue=?,mxValue=?,modifiedDate=?,price=? WHERE unitID=?";
			PreparedStatement preparedStmt = con.prepareStatement(query); 

			// binding values
			preparedStmt.setString(1, mnValue);
			preparedStmt.setString(2, mxValue);
			preparedStmt.setString(3, modifiedDate);
			preparedStmt.setString(4, price);
			preparedStmt.setInt(5, Integer.parseInt(unitID));
			
			// execute the statement
			 preparedStmt.execute();
			 con.close();

			 String units = readUnits();
			 output = "{\"status\":\"success\", \"data\": \"" + units + "\"}";
		}catch (Exception e) { 
			output = "{\"status\":\"error\", \"data\": \"Error while updating the unit.\"}"; 
			 System.err.println(e.getMessage()); 
		} 
		return output;
	}
	
	
	public String deleteUnit(String unitID)
	{ 
		 String output = ""; 
		 try
		 { 
			 Connection con = connect(); 
			 if (con == null) 
			 { 
				 return "Error while connecting to the database for deleting."; 
			 } 
			 // create a prepared statement
			 String query = "delete from unit where unitID=?"; 
			 PreparedStatement preparedStmt = con.prepareStatement(query); 
			 
			 // binding values
			 preparedStmt.setInt(1, Integer.parseInt(unitID));
			 
			 // execute the statement
			 preparedStmt.execute(); 
			 con.close(); 
			 String units = readUnits();
		     output = "{\"status\":\"success\", \"data\": \"" + units + "\"}"; 
		} 
		catch (Exception e) 
		{ 
			output = "{\"status\":\"error\", \"data\": \"Error while deleting the unit.\"}"; 
			System.err.println(e.getMessage()); 
		} 
		return output;
	}

	
}
