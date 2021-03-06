package uta.mav.appoint.db;

import java.sql.Connection;
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

public interface DBImplInterface {
	public Boolean cancelAppointment(int id) throws SQLException;
	public ArrayList<Object> getAppointments(AdvisorUser user) throws SQLException;
	public ArrayList<Object> getAppointments(StudentUser user) throws SQLException;
	public ArrayList<Object> getAppointments(AdminUser user) throws SQLException;
	public Boolean createAppointment(Appointment a, String email) throws SQLException;
	public ArrayList<TimeSlotComponent> getAdvisorSchedule(String name) throws SQLException;
	public int addUser(GetSet set) throws SQLException;
	public ArrayList<String> getAdvisors() throws SQLException;
	public LoginUser checkUser(GetSet set) throws SQLException;
	public String addTimeSlot(AllocateTime at) throws SQLException;
	public Connection connectDB();
	public ArrayList<AppointmentType> getAppointmentTypes(String pname) throws SQLException;
	public Boolean updateAppointment(Appointment a);
	public Boolean deleteTimeSlot(AllocateTime at) throws SQLException;
	public Appointment getAppointment(String d, String t, String e) throws SQLException;
	public ArrayList<Appointment> getAllAppointments(String todayDate, String tomorrowDate) throws SQLException;
	public ArrayList<Appointment> getAllAppointments() throws SQLException;
	public ArrayList<Appointment> getAllStudentAppointments(String userId) throws SQLException;
	public Boolean createAdvisor(CreateAdvisorBean ca) throws SQLException;	
	public String addAppointmentType(AdvisorUser user, AppointmentType at) throws SQLException;
	public String createFeedback(String feedback) throws SQLException;
	public String createBugReport(String bugreport) throws SQLException;
	public int updateStudentPassword(String email, String currentPassword, String newPassword, String validated) throws SQLException;
	public GetSet getUser(String email);
	public boolean updateUserProfile(String name, String email, int id);
	public String getNotificationStatus(String email);
	public boolean updateNotificationStatus(String email, String notificationStatus);
	public ArrayList<Advisor> getAllAdvisors() throws SQLException;
	public boolean updateAdvisor(int originialId, int id, String name, String email, String role) throws SQLException;
	public boolean deleteAdvisor(int id) throws SQLException;	
	public Advisor searchAdvisor(String query) throws SQLException;
	public String getSetting(String setting) throws SQLException;
	public boolean updateSetting(String setting, String value) throws SQLException;
	public String getAppointmentById(String id) throws SQLException;
	public GetSet getSecurityQuestions(String email) throws SQLException;
	public int changePassword(String email, String newPassword, String validated) throws SQLException;
	public int updateWaitlist(String username, String useremail) throws SQLException;
	public ArrayList<String> getWaitlistUsers() throws SQLException;
	public int updateDefaulterList(String useremail) throws SQLException;
}
