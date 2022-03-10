package Day07;

import java.util.Scanner;

public class Day07_5_BookAplication {//cs
	// BookAplication 클래스 : 입출력 관련코드
	// Book : 도서 관련 코드
	// Member 클래스 : 회원관련 코드
	
	//도서대여 console 프로그램 [클래스 버전]
		//1.클래스 설계
			//1.book
				//필드  : ISBN, 도서명, 작가, 도서대여여부, 대여회원
				//메소드 : 1.도서검색 / 2.도서목록 / 3.도서대여 / 4.도서반납
	
			//2.member
				//필드 : 번호, 아이디, 비밀번호, 이름, 연락처
				//메소드 : 1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기 / 5.로그아웃
				//관리자메소드 : 1.도서등록 / 2.도서삭제
	
		//2.화면설계
			//1.초기메뉴 [1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기]
			//2.일반회원메뉴 [1.도서검색 / 2.도서목록 / 3.도서대여 / 4.도서반납 / 5.로그아웃 ]
			//3.관리자메뉴 [1.도서등록 / 2.도서목록 / 3.도서삭제 / 4.순위(도전) / 5로그아웃]
	
//////////////////////////////////////////////////////////////////////////////////////////	
	
	//main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해서
		//지역변수 : { 변수선언 } 괄호내에서 선언된 변수는 {}밖을 못나감
			// 서로 다른 { } 내에서 사용시 = 전역변수
		//static : 정적변수 / 프로그램 시작시 메모리 할당 / 프로그램 종료시 메모리 초기화
			//권장은 잘 안함 : 프로그램 전반적으로 모든 곳에 사용되는 메모리[변수]
	static Scanner scanner = new Scanner(System.in);	//static : 모든 클래스에서 사용
	static Member[] members = new Member[100]; 			//모든 클래스에서 사용하는 회원 목록
	static Book[] books = new Book[100];
	
	//0. 코드를 읽어주는 시작 메소드 [스레드]
	public static void main(String[] args) {//ms
		
		//메소드 호출
		//1. 내부호출
			// menu(); //내부호출 불가능
			//static : 메모리 우선할당 이기때문에 static 외 메소드, 필드x
			//main 메소드는 static 메소드 이기떄문에 static 메소드만 내부호출 가능
		//2. 외부호출
			//1.객체생성(메모리할당) = 메소드호출
			Day07_5_BookAplication application = new Day07_5_BookAplication();
			application.menu();
	}//me
	
////////////////////////////////////////////////////////////////////////////////////////////////
	
	//1. 초기메뉴 메소드
	void menu() {
		
		while(true) {
			System.out.println("--------------------- 도서 대여 프로그램 ---------------------");
			System.out.println("1.회원가입    2.로그인    3.아이디찾기    4.비밀번호찾기 \n 선택 : ");
			int ch = scanner.nextInt();
			
			Member member = new Member();//1~4 {}에서 사용하기 위해 
			
			if(ch==1) {
				boolean result = member.회원가입();//1.회원가입 메소드 호출
				if(result == true) {
					System.out.println("[ 알림 ] 회원가입 성공!");
				}//true if end
				
				else System.out.println("[ 알림 ] 회원가입 실패");//false else end
			}//1.회원가입 if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch==2) {
				String result = member.로그인();//2.로그인 메소드 호출
				
				//1. 일반회원 메뉴 메소드 호출
				if(result == null) {
					System.out.println("알림)) 로그인 실패! 회원정보가 없습니다");
				}//로그인실행 if end
				
				else if(result.equals("admin")) {
					//2.관리자 메뉴 메소드 호출
					System.out.println("알림)) 안녕하세요!" + result + "님");
					adminmenu();	//내부 메소드 호출
				}// 관리자메뉴호출 if end
				
				else {
					//1.일반회원 메뉴 메소드 호출
					System.out.println("알림)) 안녕하세요!" + result + "님");
					membermenu(result);	//인수1개 [로그인성공한 id] 전달
				}//일반메뉴 호출 else end
				
			}//2.로그인 if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch==3) {
				member.아이디찾기();//3.아이디찾기 메소드 호출
				
			}//3.아이디찾기 if end
			
			else if(ch==4) {
				member.비밀번호찾기();//4.비밀번호찾기 메소드 호출
				
			}//4.비밀번호찾기 if end
			
			else {
				System.out.println("알림)) 알 수 없는 번호입니다");
			}//else end
			
		}//무한 반복 while end
	}//void end
	
////////////////////////////////////////////////////////////////////////////////////////////////
	
	//2. 일반회원 메뉴 메소드
	void membermenu(String loginid) {	// 인수의 변수명은 아무거나 / 자료형은 동일
		while(true) {
			System.out.println("------------- 회원 메뉴 --------------");
			System.out.println("1.도서검색   2.도서목록   3.도서대여   4.도서반납   5.로그아웃\n 선택 : ");
			
			int ch = scanner.nextInt();
			Book book = new Book();	//빈생성자 객체 = 메소드 호출용
			
			if(ch==1) {
				book.도서검색();
			}//ch==1 if end
			
			else if(ch==2) {
				book.도서목록();
			}//ch==2 if end
			
			else if(ch==3) {
				book.도서대여(loginid);
			}//ch==3 if end
			
			else if(ch==4) {
				book.도서반납(loginid);
			}//ch==4 if end
			
			else if(ch==5) {
				return;	//일반회원 메소드 종료 [로그아웃]
			}//ch==5 if end
			
			else {
				System.out.println("알림)) 알 수 없는 입력입니다");
				}//else end
			
		}//while end
	}//membermenu void end
	
//------------------------------------------------------------------------------------------------------
	
	//3. 관리자 메뉴 메소드
	void adminmenu() {
		while(true) {
			System.out.println("------------- 관리자 메뉴 --------------");
			System.out.println("1.도서등록   2.도서목록   3.도서삭제   4.로그아웃\n 선택 : ");
			
			Book book = new Book();
			int ch = scanner.nextInt();
			
			if(ch==1) {
				book.도서등록();
			}//ch==1 if end
			
			else if(ch==2) {
				book.도서목록();
			}//ch==2 if end
			
			else if(ch==3) {
				book.도서삭제();
			}//ch==3 if end
			
			else if(ch==4) {
				return;	//관리자메뉴 메소드 종료 [로그아웃]
			}//ch==4 if end
			
			else {
				System.out.println("알림)) 알 수 없는 입력입니다");
				}//else end
			
		}//while end
	}//adminmenu void end
	
}//ce
