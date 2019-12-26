package beans;

public class RoomInfo {
	
	String northWall, eastWall, westWall, southWall;
	
	public RoomInfo() {}
	
	public RoomInfo(String northWall, String eastWall, String westWall, String southWall) {
		super(); //returns a RoomInfo object
		this.northWall = northWall;
		this.eastWall = eastWall;
		this.westWall = westWall;
		this.southWall = southWall;
		
		
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
