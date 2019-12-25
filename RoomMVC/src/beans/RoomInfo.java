package beans;

public class RoomInfo {
	
	String roomName, northWall, eastWall, westWall, southWall;
	
	public RoomInfo() {}
	
	public RoomInfo(String roomName, String northWall, String eastWall, String westWall, String southWall) {
		this.roomName = roomName;
		this.northWall = northWall;
		this.eastWall = eastWall;
		this.southWall = southWall;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getNorthWall() {
		return northWall;
	}

	public void setNorthWall(String northWall) {
		this.northWall = northWall;
	}

	public String getEastWall() {
		return eastWall;
	}

	public void setEastWall(String eastWall) {
		this.eastWall = eastWall;
	}

	public String getWestWall() {
		return westWall;
	}

	public void setWestWall(String westWall) {
		this.westWall = westWall;
	}

	public String getSouthWall() {
		return southWall;
	}

	public void setSouthWall(String southWall) {
		this.southWall = southWall;
	}
	
	

}
