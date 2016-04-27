package uta.mav.appoint.db.command;

import java.sql.PreparedStatement;

import uta.mav.appoint.beans.Appointment;
import uta.mav.appoint.beans.GetSet;

public class GetSecurityQuestions extends SQLCmd{
		String email;
	
	public GetSecurityQuestions( String email){
		
		this.email=email;
	}
	
	public void queryDB(){
		try{
		String command = "SELECT securityquestion1,securityquestion2,securityquestion3 FROM user u WHERE email=?";
		PreparedStatement statement = conn.prepareStatement(command);
		statement.setString(1,email);
		res = statement.executeQuery();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void processResult(){
		GetSet set = new GetSet();
		try{
			if (res.next()){
				set.setsecurityQuestion1(res.getString(1));
				set.setsecurityQuestion2(res.getString(2));
				set.setsecurityQuestion3(res.getString(3));
				result.add(set);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
