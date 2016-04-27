package uta.mav.appoint.db;

import java.sql.SQLException;
import java.util.ArrayList;

import uta.mav.appoint.TimeSlotComponent;
import uta.mav.appoint.beans.Advisor;
import uta.mav.appoint.beans.AllocateTime;
import uta.mav.appoint.beans.Appointment;
import uta.mav.appoint.beans.AppointmentType;
import uta.mav.appoint.beans.CreateAdvisorBean;
import uta.mav.appoint.beans.GetSet;
import uta.mav.appoint.login.AdminUser;
import uta.mav.appoint.login.AdvisorUser;
import uta.mav.appoint.login.LoginUser;
import uta.mav.appoint.login.StudentUser;

public class DatabaseManager {
	DBImplInterface imp = new RDBImpl();

	// user login checking, check username and password against database
	// then return role if a match is found
	public Boolean createAdvisor(CreateAdvisorBean ca) throws SQLException {
		return imp.createAdvisor(ca);
	}

	public LoginUser checkUser(GetSet set) throws SQLException {
		return imp.checkUser(set);
	}

	public int addUser(GetSet set) throws SQLException {
		return imp.addUser(set);
	}

	public ArrayList<String> getAdvisors() throws SQLException {
		return imp.getAdvisors();
	}

	public ArrayList<TimeSlotComponent> getAdvisorSchedule(String name) throws SQLException {
		return imp.getAdvisorSchedule(name);
	}

	public Boolean createAppointment(Appointment a, String email) throws SQLException {
		return imp.createAppointment(a, email);
	}

	public ArrayList<Object> getAppointments(LoginUser user) throws SQLException {
		if (user instanceof AdvisorUser) {
			return imp.getAppointments((AdvisorUser) user);
		} else if (user instanceof StudentUser) {
			return imp.getAppointments((StudentUser) user);
		} else if (user instanceof AdminUser) {
			return imp.getAppointments((AdminUser) user);
		} else
			return null;
	}

	public Boolean cancelAppointment(int id) throws SQLException {
		return imp.cancelAppointment(id);
	}

	public String addTimeSlot(AllocateTime at) throws SQLException {
		return imp.addTimeSlot(at);
	}

	public ArrayList<AppointmentType> getAppointmentTypes(String pname) throws SQLException {
		return imp.getAppointmentTypes(pname);
	}

	public Boolean updateAppointment(Appointment a) throws SQLException {
		return imp.updateAppointment(a);
	}

	public Boolean deleteTimeSlot(AllocateTime at) throws SQLException {
		return imp.deleteTimeSlot(at);
	}

	public Appointment getAppointment(String date, String time, String email) throws SQLException {
		return imp.getAppointment(date, time, email);
	}

	public String addAppointmentType(AdvisorUser user, AppointmentType at) throws SQLException {
		return imp.addAppointmentType(user, at);
	}

	public String createFeedback(String feedback) throws SQLException {
		return imp.createFeedback(feedback);
	}

	public String createBugReport(String bugreport) throws SQLException {
		return imp.createBugReport(bugreport);
	}

	public int updateStudentPassword(String email, String currentPassword, String newPassword, String validated)
			throws SQLException {
		return imp.updateStudentPassword(email, currentPassword, newPassword, validated);
	}

	public GetSet getUser(String email) {
		return imp.getUser(email);
	}

	public boolean updateUserProfile(String name, String email, int id) {
		return imp.updateUserProfile(name, email, id);
	}

	public String getNotificationStatus(String email) {
		return imp.getNotificationStatus(email);
	}

	public boolean updateNotificationStatus(String email, String notificationStatus) {
		return imp.updateNotificationStatus(email, notificationStatus);
	}

	public ArrayList<Advisor> getAllAdvisors() throws SQLException {
		return imp.getAllAdvisors();
	}

	public boolean updateAdvisor(int originalId, int id, String name, String email, String role) throws SQLException {
		return imp.updateAdvisor(originalId, id, name, email, role);
	}

	public boolean deleteAdvisor(int id) throws SQLException {
		return imp.deleteAdvisor(id);
	}

	public ArrayList<Appointment> getAllAppointments(String todayDate, String tomorrowDate) throws SQLException {
		return imp.getAllAppointments(todayDate, tomorrowDate);
	}

	public ArrayList<Appointment> getAllStudentAppointments(String userId) throws SQLException {
		return imp.getAllStudentAppointments(userId);
	}

	public Advisor searchAdvisor(String query) throws SQLException {
		return imp.searchAdvisor(query);
	}

	public String getSetting(String setting) throws SQLException {
		return imp.getSetting(setting);
	}

	public boolean updateSetting(String setting, String value) throws SQLException {
		return imp.updateSetting(setting, value);
	}

	public String getAppointmentById(String id) throws SQLException {
		return imp.getAppointmentById(id);
	}

	public GetSet getSecurityQuestions(String email) throws SQLException {
		return imp.getSecurityQuestions(email);
	}

	public int changePassword(String email, String newPassword, String validated) throws SQLException {
		return imp.changePassword(email, newPassword, validated);
	}
	public int updateWaitlist(String username,String useremail) throws SQLException {
		return imp.updateWaitlist(username,useremail);
	}
	public ArrayList<Appointment> getAllAppointments() throws SQLException {
		return imp.getAllAppointments();
	}
	public ArrayList<String> getWaitlistUsers() throws SQLException{
		return imp.getWaitlistUsers();
	}
	public int updateDefaulterList(String useremail) throws SQLException {
		return imp.updateDefaulterList(useremail);
	}
}
