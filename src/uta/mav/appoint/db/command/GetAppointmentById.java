package uta.mav.appoint.db.command;

import java.sql.PreparedStatement;

import uta.mav.appoint.beans.Appointment;

public class GetAppointmentById extends SQLCmd{
	String id;	
	
	public GetAppointmentById(String id){
		this.id=id;
	}
	
	public void queryDB(){
		try{
		String command = "SELECT STUDENT_EMAIL FROM appointments a,user u WHERE a.ID=?";
		PreparedStatement statement = conn.prepareStatement(command);
		statement.setString(1,id);
		res = statement.executeQuery();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void processResult(){
		try{
			while (res.next()){
				result.add(res.getString(1));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
