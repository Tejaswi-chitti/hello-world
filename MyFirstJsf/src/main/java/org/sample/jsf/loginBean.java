package org.sample.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="login")
public class loginBean {

	private String userName;
	private String password;
	private String creditCard;
	
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}
	public void actionOpen(){
		
       System.out.println(userName);
       System.out.println(password);
	}
	public void actionClear(){
		setUserName(null);
		setPassword(null);
	}
}
