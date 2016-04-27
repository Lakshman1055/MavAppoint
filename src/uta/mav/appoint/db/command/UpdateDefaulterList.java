package uta.mav.appoint.db.command;

import java.sql.PreparedStatement;
import java.util.Calendar;

public class UpdateDefaulterList extends SQLCmd{
	String userEmail;
	
	public UpdateDefaulterList(String useremail){
		userEmail=useremail;
	}

	@Override
	public void queryDB() {
		
		try{
			String command = "UPDATE appointments SET DEFAULTER_LIST=? where STUDENT_EMAIL=?";
			PreparedStatement statement = conn.prepareStatement(command); 
			statement.setString(1,"Yes");
			statement.setString(2,userEmail);
			statement.executeUpdate();
			String resu = "Added to the defaulter list";
			}
		catch (Exception e){
			System.out.println(e);	
		}
		
		
	}

	@Override
	public void processResult() {
		
		
	}

}
