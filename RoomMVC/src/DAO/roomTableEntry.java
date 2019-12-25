package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.MysqlDataSource;

import beans.RoomInfo;

public class roomTableEntry {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/roomMVC";
	private static final String jdbcUsername = "mnipritom"; //machine specific
	private static final String jdbcPassword = "1234";		//machine specific
	
	//private static final String CreatejdbcUserAndPass = "CREATE USER '?'@'localhost' IDENTIFIED BY '?';"; //identified by password
	//private static final String GrantPermission = "GRANT ALL PRIVILEGES ON * . * TO '?'@'localhost';"; 
	//private static final String FLUSH_PRIVILEGES = "FLUSH PRIVILEGES;";
	
	private static final String CREATE_A_ROOM = "INSERT INTO rooms" + " (roomName,northWallName,eastWallName,westWallName,southWallName) VALUES " 
	+ " (?, ?, ?, ?);";
	//private static final String DELETE_A_ROOM = "DELETE FROM rooms WHERE roomName = ?;";
	private static final String SHOW_A_ROOM = "SELECT * FROM rooms WHERE roomName=?;";
	private static final String SHOW_ALL_ROOMS = "SELECT * FROM rooms;";
	
	//MysqlDataSource ds = new MysqlDataSource();
	//ds.setUser("mnipritom");
	//ds.setPassword("1234");
	//ds.setServerName("")
	protected Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(connection);
		return connection;
	}
	
	public void createRoom(RoomInfo newRoomData) throws SQLException{
		
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CREATE_A_ROOM);) {
			preparedStatement.setString(1, newRoomData.getRoomName());
			preparedStatement.setString(2, newRoomData.getNorthWall());
			preparedStatement.setString(3, newRoomData.getEastWall());
			preparedStatement.setString(4, newRoomData.getWestWall());
			preparedStatement.setString(5, newRoomData.getSouthWall());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public ArrayList<RoomInfo> showARoom(String roomName) {
		
		ArrayList<RoomInfo> fetchedRoom = new ArrayList<RoomInfo>();
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SHOW_A_ROOM);){
			preparedStatement.setString(1, roomName);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String rs_roomName = rs.getString("roomName");
				String rs_northWall = rs.getString("northWallName");
				String rs_eastWall = rs.getString("eastWallName");
				String rs_westWall = rs.getString("westWallName");
				String rs_southWall = rs.getString("southWallName");
				
				fetchedRoom.add(new RoomInfo(rs_roomName,rs_northWall,rs_eastWall,rs_westWall,rs_southWall));
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
					String rs_roomName = rs.getString("roomName");
					String rs_northWall = rs.getString("northWallName");
					String rs_eastWall = rs.getString("eastWallName");
					String rs_westWall = rs.getString("westWallName");
					String rs_southWall = rs.getString("southWallName");
					
					allRooms.add(new RoomInfo(rs_roomName,rs_northWall,rs_eastWall,rs_westWall,rs_southWall));
					
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allRooms;
	}

}
