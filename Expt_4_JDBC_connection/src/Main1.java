import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Main1 {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_code", "root", "PforPASC@123");
		Statement st = con.createStatement();
		String s = "insert into tb1 values (1, 'ABC'), (2, 'XYZ');";
		st.execute(s);
		con.close();
		System.out.println("Query executed successfully!!!");
	}
}
