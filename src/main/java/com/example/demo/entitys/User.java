package com.example.demo.entitys;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer userId;
	private String userName;
	private String mailId;
    private String password;
	private Long phonNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(Long phonNo) {
		this.phonNo = phonNo;
	}
	public User(String userName, String mailId, String password, Long phonNo) {
		super();
		this.userName = userName;
		this.mailId = mailId;
		this.password = password;
		this.phonNo = phonNo;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", mailId=" + mailId + ", password=" + password + ", phonNo=" + phonNo
				+ "]";
	}

}
