package Day06;

public class Board {

	//Board 클래스 선언
		//main메소드x
	
	//1.필드
	String title;
	String content;
	String writer;
	String password;
	
	
	//2.생성자
		//자동 : 오른쪽 마우스 클릭 source
	
		//1. 빈생성자
	Board(){}
	
		//2. 1개 필드 받는 생성자
	Board(String title){
		this.title = title;
		//this.필드명 = 내부변수
		//외부로부터 들어온 제목을 내부변수에 저장
	}
	
		//3. 2개 필드 받는 생성자
	Board(String title, String content){
		this.title = title;
		this.content = content;
	}
	
		//4. 3개 필드 받는 생성자
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		
		//5. 4개 필드 받는 생성자
	Board(String title, String content, String writer, String password){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	
	//3.메소드
}
