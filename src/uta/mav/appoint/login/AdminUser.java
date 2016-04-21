package uta.mav.appoint.login;

import java.util.ArrayList;

import uta.mav.appoint.visitor.Visitor;

public class AdminUser extends LoginUser{
	

	public AdminUser(String em, String name){
		super(em, name);
	}
	
	@Override
	public String getHeader(){
		return "admin_header";
	}
	
	@Override
	public void accept(Visitor v){
		v.check(this);
	}
	
	@Override
	public ArrayList<Object> accept(Visitor v, Object o, Object t){//allow javabean to be passed in
		return v.check(this,o,t);
	}
}
