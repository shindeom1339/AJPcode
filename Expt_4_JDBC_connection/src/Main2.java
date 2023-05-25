import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main2 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_code", "root", "PforPASC@123");
		Statement st = con.createStatement();
		String s = "select * from tb1";
		ResultSet rs = st.executeQuery(s);
		while(rs.next()) {
			int x = rs.getInt("id");
			String n = rs.getString("name");
			
			System.out.println("Name: " + n + ";" + " ID: " + x);
		}
		con.close();
		System.out.println("Select Query executed successfully!!!");

	}

}
