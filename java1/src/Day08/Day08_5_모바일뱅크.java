package Day08;

import java.util.Scanner;

import Day07.Book;

public class Day08_5_모바일뱅크 {//cs
	
	// 모바일 뱅크 프로그램	[2인 과제]
		//요구사항
		//회원주요기능 : 1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기
		//계좌주요기능 : 1.계좌생성 / 2.입금 / 3.출금 / 4.이체 / 5.대출 / 6.계좌목록
		//설계 : 통장, 대출, 회원
			
			//대출클래스 = 도서클래스
				//필드 : 1.대출이름 2.금액 3.이자 4.대출인[id] 5.상환여부
				//
	
	static Scanner scanner = new Scanner(System.in);
	static Member2[] members = new Member2[1000];
	static Bank2[] banks = new Bank2[1000];
	static Loan[]loans = new Loan[1000];
	
	public static void main(String[] args) {//ms
		
		//회원주요기능 : 1.회원가입 / 2.로그인 / 3.아이디찾기 / 4.비밀번호찾기
		//계좌주요기능 : 1.계좌생성 / 2.입금 / 3.출금 / 4.이체 / 5.대출 / 6.계좌목록
		Day08_5_모바일뱅크 application = new Day08_5_모바일뱅크();
		application.menu();
	}//me
	
	
	
	//초기메뉴
	void menu() {
		Member2 member = new Member2();
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. 회원가입 2 . 로그인 3. 아이디찾기 4. 비밀번호찾기 :");
				int ch = scanner.nextInt();		

				if(ch==1) {
					boolean result = member.회원가입();// 회원가입 메소드 호출
					if(result) System.err.println("회원가입 성공");
					else System.err.println("회원가입 실패");
				}
				
				else if(ch==2) {// 로그인 메소드 호출
					String result = member.로그인();
					if(result == null) {
						System.out.println("동일한 회원정보가 없습니다.");
					}
					
					else if(result.equals("admin")) {
						//2.관리자 메뉴 메소드 호출
						System.out.println("알림)) 안녕하세요!" + result + "님");
						adminmenu(result);	//내부 메소드 호출
					}// 관리자메뉴호출 if end
					
					else {
						System.out.println("안녕하세요."+result+"님"); 
						bankmenu(result);
					}
				}
				else if(ch==3) {member.아이디찾기();}
					// 아이디 찾기 메소드 호출	
				else if(ch==4) {member.비밀번호찾기();}
					// 비밀번호 찾기 메소드 호출
				else {System.err.println("알림) 알수 없는 번호입니다.");}
		}
	}//메뉴 void end
	
	
	//은행메뉴
	void bankmenu(String loginid) {
		while(true) {
			System.out.println("--------------------- 은행 메뉴 ---------------------");
			System.out.println("1.계좌생성    2.입금    3.출금    4.이체   5.대출   6.계좌목록 \n 선택 : ");
			int ch2 = scanner.nextInt();
			
			Bank2 bank = new Bank2();//1~4 {}에서 사용하기 위해 
			
			if(ch2==1) {
				bank.계좌생성(loginid);//1.회원가입 메소드 호출
			}//1.계좌생성 if end
			
	
			
			else if(ch2==2) {
				bank.입금(loginid);//2.입금 메소드
			}//2.입금 if end
			
	
			
			else if(ch2==3) {
				bank.출금(loginid);//3.출금 메소드 호출
				
			}//3.출금 if end
			
			else if(ch2==4) {
				bank.이체(loginid);//4.이체 메소드 호출
				
			}//4.이체 if end
			
			else if(ch2==5) {

				loanmenu(loginid);
				
			}//5.대출 if end
			
			else if(ch2==6) {
				bank.계좌목록(loginid);
				
			}//6.계좌목록 if end
			
			else {
				System.out.println("알림)) 알 수 없는 번호입니다");
			}//else end
			
		}//무한 반복 while end
	
	}//은행메뉴 void end
	
	
	
	void adminmenu(String loginid) {
		while(true) {
			System.out.println("------------- 관리자 메뉴 --------------");
			System.out.println("1.대출등록   2.대출목록   3.대출삭제   4.로그아웃\n 선택 : ");
			
			Loan loan = new Loan();
			int ch3 = scanner.nextInt();
			
			if(ch3==1) {
				loan.대출등록();
			}//ch==1 if end
			
			else if(ch3==2) {
				loan.대출목록(loginid);
			}//ch==2 if end
			
			else if(ch3==3) {
				loan.대출삭제();
			}//ch==3 if end
			
			else if(ch3==4) {
				return;	//관리자메뉴 메소드 종료 [로그아웃]
			}//ch==4 if end
			
			else {
				System.out.println("알림)) 알 수 없는 입력입니다");
				}//else end
			
		}//while end
	}//adminmenu void end
	
	
	
	void loanmenu(String loginid) {
		while(true) {
		System.out.println("-------- 대출 페이지 ---------");
		System.out.println("1.대출진행    2.대출목록    3.대출상환   4.로그아웃 \n 선택 : ");
		
		Loan loan = new Loan();
		int ch4 = scanner.nextInt();
		
		if(ch4==1) {
			loan.대출진행(loginid);
		}//ch==1 if end
		
		else if(ch4==2) {
			loan.대출목록(loginid);
		}//ch==2 if end
		
		else if(ch4==3) {
			loan.대출상환(loginid);
		}//ch==3 if end
		
		else if(ch4==4) {
			return;	//관리자메뉴 메소드 종료 [로그아웃]
		}//ch==4 if end
		
		else {
			System.out.println("알림)) 알 수 없는 입력입니다");
			}//else end
		
		}//while end
	}//
	
}//ce
