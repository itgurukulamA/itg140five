package ExceptionEx;

import java.sql.*;

public class SqlException {
	public static void main(String args[]) throws Exception
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriram","root","admin123");
		java.sql.PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		pst.setInt(1,8);
		pst.setString(2,"laxman");
		pst.setInt(3,34765);
		int i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("data inserted failed");
		}
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}