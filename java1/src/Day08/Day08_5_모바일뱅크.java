package Day08;

import java.util.Scanner;

import Day07.Member;

public class Day08_5_모바일뱅크 {//cs
	
	// 모바일 뱅크 프로그램	[2인 과제]
		//요구사항
		//회원주요기능 : 1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기
		//계좌주요기능 : 1.계좌생성 / 2.입금 / 3.출금 / 4.이체 / 5.대출 / 6.계좌목록
		//설계 : 통장, 대출, 회원
	
	static Scanner scanner = new Scanner(System.in);
	static Member2[] members = new Member2[1000];
	static Bank2[] banks = new Bank2[1000];
	
	public static void main(String[] args) {//ms
		
		//회원주요기능 : 1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기
		//계좌주요기능 : 1.계좌생성 / 2.입금 / 3.출금 / 4.이체 / 5.대출 / 6.계좌목록
		Day08_5_모바일뱅크 application = new Day08_5_모바일뱅크();
		application.menu();
	}//me
	
	
	
	//초기메뉴
	void menu() {
		
		while(true) {
			System.out.println("--------------------- 도서 대여 프로그램 ---------------------");
			System.out.println("1.회원가입    2.로그인    3.아이디찾기    4.비밀번호찾기 \n 선택 : ");
			int ch = scanner.nextInt();
			
			Member2 member = new Member2();//1~4 {}에서 사용하기 위해 
			
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
				
				else {
					//1.일반회원 메뉴 메소드 호출
					System.out.println("알림)) 안녕하세요!" + result + "님");
					bankmenu(result);	//인수1개 [로그인성공한 id] 전달
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
	
	
	//은행메뉴
	void bankmenu(String loginid) {
		while(true) {
			System.out.println("--------------------- 은행 메뉴 ---------------------");
			System.out.println("1.계좌생성    2.입금    3.출금    4.이체   5.대출   6.계좌목록 \n 선택 : ");
			int ch1 = scanner.nextInt();
			
			Bank2 bank = new Bank2();//1~4 {}에서 사용하기 위해 
			
			if(ch1==1) {
				boolean result = bank.계좌생성();//1.회원가입 메소드 호출
				if(result == true) {
					System.out.println("[ 알림 ] 계좌생성 성공");
				}//true if end
				
				else System.out.println("[ 알림 ] 계좌생성 실패");//false else end
			}//1.계좌생성 if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch1==2) {
//				String result = bank.입금();//2.입금 메소드
//				//1. 일반회원 메뉴 메소드 호출
//				if(result == null) {
//					System.out.println("알림)) 이체가 완료되었습니다");
//				}//로그인실행 if end
//				
//				else {
//					//1.일반회원 메뉴 메소드 호출
//					System.out.println("알림)) 안녕하세요!" + result + "님");
//					bankmenu(result);	//인수1개 [로그인성공한 id] 전달
				}//일반메뉴 호출 else end
				
			}//2.입금 if end
			
	//----------------------------------------------------------------------------------		
			
//			else if(ch1==3) {
//				bank.출금();//3.출금 메소드 호출
//				
//			}//3.아이디찾기 if end
//			
//			else if(ch1==4) {
//				bank.이체();//4.이체메소드 호출
//				
//			}//4.비밀번호찾기 if end
//			
//			else {
//				System.out.println("알림)) 알 수 없는 번호입니다");
//			}//else end
			
		}//무한 반복 while end
	//1.계좌생성
	//2.입금
	//출금 / 4.이체 / 5.대출 / 6.계좌목록
//	}//은행메뉴 void end
	
}//ce
