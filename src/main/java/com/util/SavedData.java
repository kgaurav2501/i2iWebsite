package com.util;

public class SavedData { 
	private String emailID;
	private String password;
	private String panCardNum;
	private String mobileNum;
	
	
	public void setEmail(String email) 
    { 
      this.emailID = email; 
      System.out.println("Set:-"+emailID);
    } 
	
	public String getEmail() {
		return emailID;
	}

public void setpass(String pass) {
		
		this.password=pass;
	}

	public String getPass() {
		return password;
	}
	
	public void setPanNum(String pan) 
    { 
      this.panCardNum = pan; 
    } 
	
	public String getPanNum() {
		
		return panCardNum;
	}
	
	public void setMobileNum(String mobile_no) 
    { 
      this.mobileNum = mobile_no; 
    } 
	
	public String getMobileNum() {
		
		return mobileNum;
	}
	
	
	
}
