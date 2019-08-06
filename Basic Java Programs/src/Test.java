

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
	
		  Connection con=null;
		  Statement st=null;
		  String query=null;
		  ResultSet rs=null;
		  
		 try {
			 
			 //register drivers
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 //establish Connection
			   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sandip","sandip");
			   
			   if(con!=null) {
				   
				   System.out.println("Connection is Established.....");
				   //prepare stament
			       st=con.createStatement();	   
			   }
			   else{
				   System.out.println("Connection is Established.....");   
			   }
			   
			   //prepare query
			   //SELECT * FROM DEPT
			   query="SELECT * FROM DEPT";
			   
			   //execute query
			   
			    if(st!=null) {
			    	
			    	 rs=st.executeQuery(query);
			    }
			    
			    //process result
			    
			    if(rs!=null) {
			    	
			    	while(rs.next()) {
			    		
			    		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			    	}//while
			    }//if
		 }//try
		 catch(SQLException se) {
			   
			 se.printStackTrace();
		 }
		 catch(ClassNotFoundException cfne) {
			 cfne.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 finally {
			 
			      try{
			    	  if(con!=null)
			    	  {
			    	    con.close();
			             System.out.println("Connection is closed");
			    	  }
			      }
			      catch(SQLException se) {
			    	  se.printStackTrace();
			      }
		 }//finally 
	}//main

}//class
