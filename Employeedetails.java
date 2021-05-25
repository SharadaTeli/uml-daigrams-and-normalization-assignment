package jdbc2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class Employeedetails 
{

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/employee";
		 String username = "root";
		 String password = "Root@123";
		 
		 try
		 {
			 Connection conn=DriverManager.getConnection(url, username, password);
					 if(conn!=null)
					 {
						 System.out.println("yoo we get connected");
						 /*String sql="insert into employeee(empid,empname,empdesignation,emppage,empsalary)values(?,?,?,?,?)";

						 PreparedStatement pm = conn.prepareStatement(sql);
						   pm.setString(1,"1");
							pm.setString(2,"sharada");
							pm.setString(3,"dev");
							pm.setString(4,"22");
							pm.setString(5,"30000");
							
							pm.setString(1,"2");
							pm.setString(2,"sushmita");
							pm.setString(3,"testing");
							pm.setString(4,"30");
							pm.setString(5,"40000");
							
														
							pm.setString(1,"6");
							pm.setString(2,"manjya");
							pm.setString(3,"dev");
							pm.setString(4,"28");
							pm.setString(5,"28000");
							
							pm.setString(1,"3");
							pm.setString(2,"kavita");
							pm.setString(3,"manager");
							pm.setString(4,"45");
							pm.setString(5,"70000");
							
							pm.setString(1,"4");
							pm.setString(2,"akhila");
							pm.setString(3,"testing");
							pm.setString(4,"42");
							pm.setString(5,"80000");
							


							
							int rowsInserted=pm.executeUpdate();
							if(rowsInserted>0)
							{
								System.out.println("insterted");
							}*/
						 
						 String sql="update employeee set empname=?, empdesignation=?,empsalary=? where emppage>40";
						 PreparedStatement stmt = conn.prepareStatement(sql);
							
			                stmt.setString(1, "deepu");
							stmt.setString(2, "analyst");
							stmt.setString(3, "35000");

							int rowInserted = stmt.executeUpdate();
							if (rowInserted > 0) 
							{
								System.out.println("updated....");
							}
						} 
					 

         
				else 
						{
							System.out.println("db not conneted");
						}
					 conn.close();


	      }
		 catch(SQLException ex)
		 {
			 ex.printStackTrace();
		 }

	}	 

}
