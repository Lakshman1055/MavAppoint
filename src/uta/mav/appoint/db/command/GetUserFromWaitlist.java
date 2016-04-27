package uta.mav.appoint.db.command;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class GetUserFromWaitlist extends SQLCmd {
	
	public GetUserFromWaitlist(){
		
	}
	
	@Override
	public void queryDB(){
		try{
			String command = "SELECT * from waitlist";			
			PreparedStatement statement = conn.prepareStatement(command); 
			res = statement.executeQuery();
			}
		catch (Exception e){
			System.out.println(e);	
		}
		
	}
	
	@Override
	public void processResult(){
		ArrayList<String> emails = new ArrayList<String>();
		try {
			while(res.next())
			{
				emails.add(res.getString("useremail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.add(emails);
		
	}	
}
