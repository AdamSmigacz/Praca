import java.sql.*;
import java.lang.Class;

import oracle.jdbc.pool.OracleDataSource;


public class DatabaseConnection {
public static Connection myConection = null;
static Statement statement ;	
	
	public static void DatabaseInitializeConnection()
	{
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			 myConection = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			 myConection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("Blad polczenia z baza danych!");
			e.printStackTrace();
		} catch(Exception e)
		{
			System.out.println("Inny bad niz SQLException");
		}

	}
	/*    does not work
	 
	public static void DatabaseConnectionDataSource() 
	{
		try {
			OracleDataSource myDataSource = new OracleDataSource();
			myDataSource.setServerName("localhost");
			myDataSource.setDatabaseName("xe");
			myDataSource.setDriverType("oci");
			myDataSource.setNetworkProtocol("tcp");
			myDataSource.setPortNumber(1521);
			myDataSource.setUser("system");
			myDataSource.setPassword("system");
			
			Connection myConnection = myDataSource.getConnection();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	*/
	
	public static void selectRegions() throws SQLException
	{
		statement= myConection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM REGIONS");
		while(resultSet.next())
			{
			System.out.println(resultSet.getInt("region_id") + ": " + resultSet.getString("region_name") );
			}
		//resultSet.close();
	}
	
	public static void insertRegionsDB() throws SQLException
	{
		statement= myConection.createStatement();
		int regionId = 6;
		String regionName = "'Grudna'";
		statement.executeUpdate("INSERT INTO regions" + " VALUES " + "( " + regionId + ", " + regionName + " )");
		
	}
	
	
	public static void updateRegionsDB() throws SQLException
	{
		statement= myConection.createStatement();
		int regionId = 6;
		String regionName = "'Grudna Kiepska'";
		statement.executeUpdate("UPDATE regions " + " SET region_name = " + regionName + "  WHERE region_id = " + regionId);
	}
	
	
	public static void deleteRegionsDB() throws SQLException
	{
		statement= myConection.createStatement();
		int regionId = 6;
		String regionName = "'Grudna Kiepska'";
		statement.executeUpdate("DELETE FROM regions " + "  WHERE region_id = " + regionId);
	}
	
	
	public static void InsertPreparedStatement() throws SQLException
	{
		PreparedStatement myPreparedStatement = myConection.prepareStatement(
				"INSERT INTO regions " + "(region_id, region_name) VALUES (" + "?, ?" + " )");
		
		myPreparedStatement.setInt(1, 7);
		myPreparedStatement.setString(2, "'Jamajka'");
		myPreparedStatement.execute();
	
	}
	public static void main(String[] args) throws SQLException {
		
		DatabaseInitializeConnection();
		//selectRegions();
		//insertRegionsDB();
		
		//updateRegionsDB();
		InsertPreparedStatement();
		//deleteRegionsDB();
		myConection.commit();
		
	}

	
	/*
	 pakiet oracle.sql wspomaga obsuge typow takich jak NUMBER, wbudowanych typow oracla 
	 pakiet oracle.jdbc wspomaga dostep do bazy danych
	 */
	 
}
