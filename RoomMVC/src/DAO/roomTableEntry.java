package DAO;


import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

import beans.RoomInfo;

public class roomTableEntry {
	private static final String DBDRIVER = "com.mysql.cj.jdbc.Driver"; 
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/roomMVC";
	private static final String jdbcUsername = "mnipritom"; //machine specific
	private static final String jdbcPassword = "1234";		//machine specific
	
	//private static final String CreatejdbcUserAndPass = "CREATE USER '?'@'localhost' IDENTIFIED BY '?';"; //identified by password
	//private static final String GrantPermission = "GRANT ALL PRIVILEGES ON * . * TO '?'@'localhost';"; 
	//private static final String FLUSH_PRIVILEGES = "FLUSH PRIVILEGES;";
	
	//private static final String CREATE_A_ROOM = "INSERT INTO rooms" + " (northWallName,eastWallName,westWallName,southWallName) VALUES " 
	//+ " (?, ?, ?, ?);";
	//private static final String DELETE_A_ROOM = "DELETE FROM rooms WHERE roomName = ?;";
	//private static final String SHOW_A_ROOM = "SELECT * FROM rooms WHERE northWallName=?;";
	//private static final String SHOW_ALL_ROOMS = "SELECT * FROM rooms;";
	
	//MysqlDataSource ds = new MysqlDataSource();
	//ds.setUser("mnipritom");
	//ds.setPassword("1234");
	//ds.setServerName("")
	/*protected Connection getConnection() {
		Connection myConn = null;
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/roomMVC","mnipritom","1234");
			
			Statement myStatement = myConn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myConn;
	}*/
	
	public void createRoom(RoomInfo newRoomData){
		
		try {
			
			Connection myConn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			
			Statement myStatement = myConn.createStatement();
			
			String sql = "INSERT INTO rooms " +"("+newRoomData.getNorthWall()+", "+newRoomData.getEastWall()+", "+newRoomData.getWestWall()+", "+newRoomData.getSouthWall()+");";
			
			myStatement.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	/*public ArrayList<RoomInfo> showARoom(String northWallName) {
		
		ArrayList<RoomInfo> fetchedRoom = new ArrayList<RoomInfo>();
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SHOW_A_ROOM);){
			preparedStatement.setString(1, northWallName);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String rs_northWall = rs.getString("northWallName");
				String rs_eastWall = rs.getString("eastWallName");
				String rs_westWall = rs.getString("westWallName");
				String rs_southWall = rs.getString("southWallName");
				
				fetchedRoom.add(new RoomInfo(rs_northWall,rs_eastWall,rs_westWall,rs_southWall));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fetchedRoom;
	}
	public ArrayList<RoomInfo> showAllRooms(){
		
		ArrayList<RoomInfo> allRooms = new ArrayList<RoomInfo>();
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SHOW_ALL_ROOMS);){
				
				ResultSet rs = preparedStatement.executeQuery();
				
				while(rs.next()) {
					String rs_northWall = rs.getString("northWallName");
					String rs_eastWall = rs.getString("eastWallName");
					String rs_westWall = rs.getString("westWallName");
					String rs_southWall = rs.getString("southWallName");
					
					allRooms.add(new RoomInfo(rs_northWall,rs_eastWall,rs_westWall,rs_southWall));
					
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allRooms;
	}*/

}
