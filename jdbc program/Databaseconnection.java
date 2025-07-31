package jdbcdemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Databaseconnection {
	

		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/Wipro";
			String username = "root"; // your MySQL username
			String password = "Likhitha@123"; // your MySQL password
	 
			try {
				// Load JDBC Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded...");
	 
				// Connect to DB
				Connection conn = DriverManager.getConnection(url, username, password);
				System.out.println("Connected to Database...");
	 
				// Execute Query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
	 
				// Display Results
				System.out.println("ID\tName\tAge\tCourse\tMarks");
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String course = rs.getString("course");
					int marks = rs.getInt("marks");
	 
					System.out.println(id + "\t" + name + "\t" + age + "\t" + course + "\t" + marks);
				}
	 
				// Cleanup
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

