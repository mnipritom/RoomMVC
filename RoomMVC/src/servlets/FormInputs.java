package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.roomTableEntry;
import beans.RoomInfo;

/**
 * Servlet implementation class FormInputs
 */
@WebServlet("/FormInputs")
public class FormInputs extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private roomTableEntry roomData;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormInputs() {
        super();
        
    }
    public void init() {
    	roomData = new roomTableEntry();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//RoomInfo newRoomData = new RoomInfo(roomNameString, northWallName, eastWallName, westWallName, southWallName);
	
		//doGet(request, response);
		
		String action = request.getServletPath();
		
		switch (action) {
		
		case "/createARoom":
			try {
				createARoom(request,response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/listAllRooms":
			listAllRooms(request,response);
			break;
		
		default:
			try {
				createARoom(request, response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			break;
		}
		
	}
	/*private void createARoomForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("createRoom.jsp");
		dispatcher.forward(request, response);
		
	}*/
	
	private void createARoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String roomName = request.getParameter("RoomName");
		String northWallName = request.getParameter("NorthWallName");
		String eastWallName = request.getParameter("EastWallName");
		String westWallName = request.getParameter("WestWallName");
		String southWallName = request.getParameter("SouthWallName");
		
		roomData.createRoom(new RoomInfo(roomName,northWallName,eastWallName,westWallName,southWallName));
		
		ArrayList<RoomInfo> CreatedRoom = new ArrayList<RoomInfo>();
		
		CreatedRoom = roomData.showARoom(roomName);
		request.setAttribute("showCreatedRoom", CreatedRoom);
		response.sendRedirect("showCreatedRoom");
		
	}
	
	private void listAllRooms(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<RoomInfo> AllRooms = new ArrayList<RoomInfo>();
		
		AllRooms = roomData.showAllRooms();
		
		request.setAttribute("allAvailableRooms", AllRooms);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("roomList.jsp");
		dispatcher.forward(request, response);
		
		
	}
	

}
