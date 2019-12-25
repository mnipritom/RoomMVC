package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import beans.RoomInfo;

public class roomTableEntry {
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/roomMVC";
	private static final String jdbcUsername = "root";
	private static final String jdbcPassword = "root";
	
	private static final String INSERT_INTO_ROOMS = "INSERT INTO rooms";
	
		
	Connection newConnection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
	
	private RoomInfo newRoomData = new RoomInfo();
	
	
	
	public void createRoom(RoomInfo newRoomData) {
		
		String roomName = newRoomData.getRoomName();
		
		String northWall = newRoomData.getNorthWall();
		String eastWall = newRoomData.getEastWall();
		String westWall = newRoomData.getWestWall();	
		String southWall = newRoomData.getSouthWall();
		
		//PreparedStatement newPreparedStatement = 
	}

}
