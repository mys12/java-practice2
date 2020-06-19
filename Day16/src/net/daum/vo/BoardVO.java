package net.daum.vo;

public class BoardVO { //웹사이트 개발에서 네트워크 간 데이터 이동시 중간에 자료 저장하는 역할
	private String title;//게시판 제목
	private String content;//게시판 내용
	
	/*
	 * 문제) 생성자 오버로딩을 통해서 각 멤버변수 초기코드를 완성하고, 이클립스 메뉴로 getter()메서드만 정의한다.
	 */
	
	public BoardVO(String title, String content) {
		this.title=title;
		this.content=content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
}
