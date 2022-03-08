package Day06;

import java.util.Scanner;

public class Day06_3_회원제프로그램클래스 {//cs
	public static void main(String[] args) {//ms
		/*회원제 프로그램 [클래스버전]
		 * 0. 회원 설계 = 회원 클래스 만들기
		 * 		1. 필드
		 * 			= 아이디, 비밀번호, 이름, 전화번호
		 * 1. 초기메뉴 [1.회원가입 / 2.로그인 / 3.아이디 찾기 / 4.비밀번호 찾기]
		 * 		1. 회원가입시 입력받아 저장
		 * 		2. 로그인시 아이디와 비밀번호가 동일하면 로그인
		 * 		3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
		 * 		4. 비밀번호 찾기는 아이디와 전화번호가 동일하면 비밀번호 알려주기
		 */
		
		//위에 선언하는 이유 : main 메소드 모든 곳에서 사용하기 위해서
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		//Member 클래스로 만들어진 객체 (id, password, name, phone) 100개 저장할 수 있는 배열 선언 = 400개
		//만약에 클래스가 없었을 경우에는
			//String[][] memberlist = new Member[100][4];
		
		
		while(true) {  // 프로그램 실행 무한루프 [종료조건 x]
			System.out.println("---------------[[ 회원제 (클래스버전) ]]--------------");
			System.out.println("1.회원가입    2.로그인    3.아이디 찾기    4.비밀번호 찾기");
			System.out.println("선택 : ");		int ch = scanner.nextInt();
			
			if(ch==1) {	//회원가입
				//1. id, password, name, phone 입력받기 = 변수4개
				System.out.println("--------------------------------------------");
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("비밀번호 : ");		String password = scanner.next();
				System.out.println("이름 : ");		String name = scanner.next();
				System.out.println("연락처 : ");		String phone = scanner.next();
				
				//2. 객체 생성
				Member member = new Member();
							
				//3. 입력받은 변수 4개 객체 내 필드에 저장
					//객체 내 필드 = 입력받은 값
				member.id 		= id;
				member.password = password;
				member.name 	= name;
				member.phone 	= phone;
				
				//아이디 중복체크
					//1. 배열 내 객체 중 입력한 아이디와 동일한 아이디 찾기
				boolean idcheck = false;
				
				for(Member temp : memberlist) {
					// memberlist 배열 내 객체들을 하나씩 temp에 대입
					if(temp!=null && temp.id.equals(id)) {
						//만약에 해당 객체 내 id가 입력받은 id가 같으면
						System.out.println("알림 )) 사용중인 아이디 입니다.");
						idcheck = true;
						break;
					}//if end
				}//아이디 중복체크 for end
				
				//아이디가 중복이 없을 경우 저장
				if(idcheck==false) {
				//4. 여러개 객체를 저장하는 배열에 저장
					//1. 공백을 인덱스 찾기 [ 공백 아니면 기존회원이 존재 ]
					int i=0;//인덱스 위치 변수
					for(Member temp : memberlist) {	//배열/리스트 내 모든 객체 호출
						//memberlist 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
						
						//2. 공백 인덱스에에 객체 저장
						if(temp==null) { //만약에 해당 객체가 공백이면
							memberlist[i] = member; //해당 인덱스에 새로 만들어진 객체 저장
							System.out.println("알림)) 회원가입 성공!");
							break;	//for 나가기 [안 나가면 모든 공백에 동일한 객체 저장되기 때문]
						}//공백찾기 if end
						i++;//인덱스 증가
					}//공백찾기 for end
				}//아이디 중복 없을 경우 if end
			}//ch==1 회원가입 if end
			
			else if(ch==2) {  //로그인
				//1.입력받기
				System.out.println("------------ 로그인 페이지 ---------------");
				System.out.println("아이디 : ");		String loginid = scanner.next();
				System.out.println("비밀번호 : ");		String loginpassword = scanner.next();
				
				//2.기존 배열[회원리스트] 내 입력받은 값과 비교
				boolean logincheck = false;		//true : 로그인 성공 / false : 로그인 실패시 사용 목적
				
				for(Member temp : memberlist) {
					//memberlist내 0번 인덱스부터 끝 인덱스까지 하나씩 temp에 대입
					
					if(temp!=null && temp.id.equals(loginid) && temp.password.equals(loginpassword)) {
						//객체가 null일때는 equals불가 
						System.out.println(" 알림)) 로그인 성공!");
						logincheck = true;
					}//로그인성공 if end
				}//아이디 비번 비교 for end
				
				//3.로그인 오류
				if(logincheck==false) {
					System.out.println("알림)) 동일한 회원정보가 없습니다.");
				}//로그인오류 if end
			}//ch==2 로그인 if end
			
			else if(ch==3) {  //아이디찾기
				System.out.println("--------- 아이디 찾기 ---------");
				//1.이름과 연락처 입력 받음
				System.out.println("이름 : ");		String name = scanner.next();
				System.out.println("연락처 : ");		String phone = scanner.next();
				
				//2.배열 내 동일한 이름과 연락처가 있는지 확인
				boolean findcheck = false;
				
				for(Member temp : memberlist) {
					if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
						//3.동일한 객체가 있으면 해당 아이디 출력
						System.out.println("아이디 찾기 성공!");
						System.out.println("회원님의 아이디 : " + temp.id);
						findcheck = true;
						break;
					}//if end
					
				}//동일 이름연락처 확인 for end
				
				//4.없으면 없다고 출력
				if(findcheck==false) {
					System.out.println("알림)) 회원정보가 없습니다");
				}//if end
			}//c1==3 if end
			
			else if(ch==4) {  //비밀번호 찾기
				System.out.println("아이디 : ");		String id = scanner.next();
				System.out.println("연락처 : ");		String phone = scanner.next();
				
				boolean findcheck = false;
				
				for(Member temp : memberlist) {
					if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.out.println("알림 )) 비밀번호 찾기 성공");
						System.out.println("회원 비밀번호 : " + temp.password);
						findcheck = true;
						break;
					}
				}
				
				if(findcheck == false) {
					System.out.println("알림)) 동일한 회원정보가 없습니다");
				}
				
			}//ch==4 if end
			
			else {System.out.println("알림)) 알 수 없는 번호입니다");}//알수없음 else end
			
		}//프로그램 실행 while end
		
	}//me
}//ce
