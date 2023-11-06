import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcServelet
 */
@WebServlet("/JdbcServelet")
public class JdbcServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JdbcServelet() {
       
    	
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = null;
		//String productIdStr = request.getParameter("product_id");
		 //int productId = Integer.parseInt(productIdStr);
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3307/product_database","root","kripa@1999");
				PreparedStatement ps = con.prepareStatement("select * from eproduct where ID='1'");
				//ps.setInt(1, productId);
				ResultSet rs = ps.executeQuery();
				
		while(rs.next()) {
					
					System.out.print("Id---> " + rs.getString("ID") + "\t");
					System.out.print("name--->" + rs.getString("name") + "\t");
					System.out.print("price---> " + rs.getString("price") + "\t");
					System.out.println("date---> " + rs.getString("date_added"));
				}
		
		           con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
