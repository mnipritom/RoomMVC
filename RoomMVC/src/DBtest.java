import java.sql.*;

public class DBtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/roomMVC","mnipritom","1234");
			
			Statement myStatement = myConn.createStatement();
			
			ResultSet myRS = myStatement.executeQuery("SELECT * FROM rooms;");
			
			while(myRS.next()) {
				System.out.println(myRS.getString("northWallName"));
				System.out.println(myRS.getString(2));
				System.out.println(myRS.getString(3));
				System.out.println(myRS.getString("southWallName"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
