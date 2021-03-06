package uta.mav.appoint.beans;

import java.io.Serializable;

/******************************************
 * @author John
 * Basic dataset package. If you need to compare values against anything from
 * a sql table, add it as a variable here and use it to compare
 *
 */
public class GetSet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7443811121055816372L;
	private String password;
	private String emailAddress;
	private int studentId;
	private String role;
	private String name;
	private String date;
	private String starttime;
	private String endtime;
	private String securityQuestion1; 
	private String securityQuestion2; 
	private String securityQuestion3; 
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the starttime
	 */
	public String getStarttime() {
		return starttime;
	}
	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	/**
	 * @return the endtime
	 */
	public String getEndtime() {
		return endtime;
	}
	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the userName
	 */
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getsecurityQuestion1() {
		return securityQuestion1;
	}
	
	public void setsecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}
	
	public String getsecurityQuestion2() {
		return securityQuestion2;
	}
	
	public void setsecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}
	
	public String getsecurityQuestion3() {
		return securityQuestion3;
	}
	
	public void setsecurityQuestion3(String securityQuestion3) {
		this.securityQuestion3 = securityQuestion3;
	}
	
}

