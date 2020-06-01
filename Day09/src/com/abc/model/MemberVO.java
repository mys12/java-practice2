package com.abc.model;

public class MemberVO { //데이터 저장 빈 클래스

	private String id;//회원 아이디
	private String name;//회원 이름
	private String phone;//폰번호
	private String email;
	
	//기본 생성자 생략 -> 컴파일러가 묵시적 제공
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
