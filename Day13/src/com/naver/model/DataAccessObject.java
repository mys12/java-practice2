package com.naver.model;

public interface DataAccessObject {

	void select(); //public abstract이 생략된 추상메서드
	void insert(); //자료 저장
	void update(); //자료 수정
	void delete(); //자료 삭제
	
	
	
}
