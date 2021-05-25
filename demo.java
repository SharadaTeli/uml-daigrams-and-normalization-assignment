package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class demo {

	public static void main(String[] args) throws SQLException 
	{
		
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3306/emp";
		 String username = "root";
		 String password = "Root@123";
		 			
			
		 try
		 {
			 Connection conn=DriverManager.getConnection(url, username, password);
					 if(conn!=null)
					 {
						 System.out.println("yoo we get connected");
						 String sql="delete from users where user_id=?";
							PreparedStatement stmt = conn.prepareStatement(sql);
							stmt.setInt(1, 1);
							int rowRemoved = stmt.executeUpdate();
							if (rowRemoved > 0) 
							{
								System.out.println("deleted....");
							}

						} 
					 else 
						{
							System.out.println("db not conneted");
						}
						 
						 /*String sql="update users set user_name=?, password=?,email=? where user_id=1";
						 PreparedStatement stmt = conn.prepareStatement(sql);
							
			                stmt.setString(1, "sharu");
							stmt.setString(2, "sharu76");
							stmt.setString(3, "bestoo@gmail.com");

							int rowInserted = stmt.executeUpdate();
							if (rowInserted > 0) {
								System.out.println("updated....");
							}

						} else {
							System.out.println("db not conneted");
						}*/
				conn.close();

		 }
												 /* String sql="SELECT * from users";
							Statement statement=conn.createStatement();
							ResultSet result=statement.executeQuery(sql);
							int count=0;
							while(result.next()) {
								String name=result.getString(2);
								String pass=result.getString(3);
								String fullname=result.getString("fullname");
								String email=result.getString("email");
								String out="User #%d:%s-%s-%s-%s";
								System.out.println(String.format(out,++count,name,pass,fullname,email));
							}
							conn.close();
							
						}else {
							System.out.println("oof we did not connected !!!!!!!");
						}
						conn.close();
		 } */
						 
						 /* String sql="insert into users(user_id,user_name,password,fullname,email)values(?,?,?,?,?)";

						 PreparedStatement pm = conn.prepareStatement(sql);
						   pm.setString(1,"1");
							pm.setString(2,"sharada");
							pm.setString(3,"s123");
							pm.setString(4,"teli");
							pm.setString(5,"sharada@gmail.com");
							int rowsInserted=pm.executeUpdate();
							if(rowsInserted>0)
							{
								System.out.println("insterted");
							}
							else
							{
								System.out.println("ohh noo");
							}
							conn.close();
							
						 System.out.println("yoo we get connected");
					 }
					 else
					 {
						 System.out.println("oopss not connected");
					 }
			 conn.close();
		 } */
		 
		 catch(SQLException ex)
		 {
			 ex.printStackTrace();
		 }
	

	}

}
