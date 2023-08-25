package GenericUtility;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	import GenericUtility.Iautoconstants;

	public class DataBaseUtility implements Iautoconstants{
		
		public Connection connection;
		public Statement statement;
		public ResultSet values;
		//java doc which is used for get the 
		/**      
		 * 
		 * @param url
		 * @param username
		 * @param password
		 */
		public void connectionToDatabase() 
		{
			try {
				connection=DriverManager.getConnection(JDBC_URL,JDBC_UN,JDBC_PW);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		//public List<String> readingDatafromDataBase(String query,String columnn) {
//			//ResultSet values;
//			Statement statement=null;
//			try {
//				statement=connection.createStatement();
//			} catch (SQLException e) {
	//
//				e.printStackTrace();
//			}
//			ResultSet values=null;
//			{
	//
//				try {
//					values = statement.executeQuery(query);
//				} catch (SQLException e) {
	//
//					e.printStackTrace();
//				}
//				List<String> data=null;
	//
	//
//					try {
//						while (values.next()) {
	//
//							List<String>data1=new ArrayList<>();
//							data1.add(values.getString(columnn));
	//
//						}
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//			
//			}
//			return data1;
//			}
//			
//		/**
//		 * 
//		 * @param query
//		 * @return
//		 */
//		
		/**
		 * thi method used for fetch the sql data
		 * @param query
		 * @return
		 */
		    public List<readdataconstructor> readingDataFromDatabase(String query) {
		        List<readdataconstructor> data = new ArrayList<>();
		        
				try {
					statement = connection.createStatement();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
		             try {
					values = statement.executeQuery(query);
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
		        {
		            
	           try {
				while (values.next()) {
					   String iD=values.getString("id");
					   String stname=values.getString("st_name");
					   String ph=values.getString("phone");
					   readdataconstructor record = new readdataconstructor(iD, stname, ph);
					data.add(record);   
				   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	            }

		        return data;
		    }
		
		public void closetheConnection()
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}



