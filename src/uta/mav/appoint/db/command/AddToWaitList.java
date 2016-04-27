package uta.mav.appoint.db.command;

import java.sql.PreparedStatement;
import java.util.Calendar;

public class AddToWaitList extends SQLCmd {
	String username;
	String useremail;
	String resu;
	
	public AddToWaitList(String username,String useremail){
		this.username= username;
		this.useremail= useremail;
		resu = "";
	}
	
	@Override
	public void queryDB(){
		try{
			String command = "INSERT INTO waitlist (username, useremail)"
					+ " values(?,?)";
			PreparedStatement statement = conn.prepareStatement(command); 
			statement.setString(1,username);
			statement.setString(2,useremail);
			statement.executeUpdate();
			resu = "Feedback created.";
			}
		catch (Exception e){
			System.out.println(e);	
		}
		
	}
	
	@Override
	public void processResult(){
		result.add(resu);
		
	}	
}
