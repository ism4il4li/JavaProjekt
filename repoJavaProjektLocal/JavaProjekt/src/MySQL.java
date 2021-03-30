import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQL{
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet resultSet = null;
	private PreparedStatement preparedStatement = null;

	
	/**
	 * Nur zum Testen
	 * 
	 */
	public static void main(String[] args) {
		//------------------------------------------------------------------------


		MySQL db = new MySQL();
		
		try {
		    db.conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=root&password=");
		    if(db.conn !=null)System.out.println("verbunden");
		    db.stmt = db.conn.createStatement();
		    
		    db.resultSet = db.stmt.executeQuery("select * from testTable");
		    
		    ResultSet rs =db.resultSet;
		      while (rs.next())
		      {
		        int id = rs.getInt("id");
		        String firstName = rs.getString("vorname");
		        String lastName = rs.getString("nachname");

		        System.out.format("%s, %s, %s\n", id, firstName, lastName);
		      }
	
		} catch (SQLException ex) {
		    
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		//------------------------------------------------------------------------
	}
	
}
