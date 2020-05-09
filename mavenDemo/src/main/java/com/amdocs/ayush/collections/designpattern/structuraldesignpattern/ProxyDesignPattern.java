package com.amdocs.ayush.collections.designpattern.structuraldesignpattern;

interface Service{
	String executeQuery(UserDetails user, String query) throws Exception;
}

class ServiceImpl implements Service{

	@Override
	public String executeQuery(UserDetails user, String query) {
		// TODO Auto-generated method stub
		return "Executed Query : "+query+": user creds : "+user;
	}
	
}

class UserDetails{
	String userId;
	String usrPass;
	
	UserDetails(String userId, String pass){
		this.userId=userId;
		this.usrPass=pass;
	}
	
	public String toString(){
		return this.userId+" "+this.usrPass;
	}
}
class ServiceProxy implements Service{
	
	ServiceImpl impl;
	
	public ServiceProxy() {
		impl = new ServiceImpl();
	}
	@Override
	public String executeQuery(UserDetails user, String query) throws Exception {
		if(user.userId.equalsIgnoreCase("Admin")){
			if(user.usrPass.equals("Password")){
				return impl.executeQuery(user, query);
			}
			else{
				throw new Exception("Wrong Password");
			}
		}
		else{
			if(query.equals("get")){
				return impl.executeQuery(user, query);
			}
			else{
				throw new Exception("Invalid user creds");
			}
		}
	}
	
}
public class ProxyDesignPattern {

	public static void main(String[] args) throws Exception{
		Service create = new ServiceProxy();
		String message = create.executeQuery(new UserDetails("Admin", "Password"), "create");
		System.out.println(message);
		
//		String message1 = create.executeQuery(new UserDetails("Admin", "abcxyz"), "create");
//		System.out.println(message1);
		
		String message1 = create.executeQuery(new UserDetails("ayush", "abcxyz"), "get");
		System.out.println(message1);
	}
}
