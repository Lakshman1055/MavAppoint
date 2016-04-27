package uta.mav.appoint.db.command;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;

import uta.mav.appoint.beans.AppointmentType;
import uta.mav.appoint.beans.GetSet;

public class ChangePassword extends SQLCmd {
	String email;
	String newPassword;
	String validated;

	int resu;

	public ChangePassword(String email, String newPassword, String validated) {
		this.email = email;
		this.newPassword = newPassword;
		this.validated = validated;
		resu = 0;
	}

	@Override
	public void queryDB() {
		try {
			String command = "UPDATE user SET PASSWORD = ?, VALIDATED = ? WHERE user.EMAIL = ?";
			PreparedStatement statement = conn.prepareStatement(command);
			statement.setString(1, newPassword);
			statement.setString(2, validated);
			statement.setString(3, email);
			statement.executeUpdate();
			resu = 1;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void processResult() {
		result.add(resu);

	}
}
