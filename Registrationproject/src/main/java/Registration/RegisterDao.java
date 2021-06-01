package Registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbPassword = "admin";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException
	{
		Connection con = null;
		con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		return con;
	}
	
	
	public String insert(Member member) throws SQLException
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into user values(?,?,?,?)";
		
		PreparedStatement ps;
		
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getPhone());
			int res = ps.executeUpdate();	
			//result = res + " Row of data inserted" +  "\n User has been added successfully";
			result = "User has been added successfully";
					
		} catch (SQLException e) {
			//System.out.println("An error has occurred.");
			//System.out.println("See full details below.");
			e.printStackTrace();
			String err1 = e.getMessage();
			result =  "ERROR - " + err1 ;		
		}
		return result;
	}

}