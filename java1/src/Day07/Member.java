package Day07;

public class Member {
	//클래스 선언
	
	//1.필드
		int mno;		//회원번호 [자동번호, 중복x]
		String id;		//아이디	[중복x]
		String password;//비밀번호
		String name;	//이름
		String phone;	//연락처
	
	//2.생성자 [생성자명 == 클래스명]
		//1. 빈생성자[기본생성자] : 메소드 호출용 객체 생성시
		public Member() {}
		
		//2.모든 필드를 받는 생성자 : 회원가입용 객체 생성시
		public Member(int mno, String id, String password, String name, String phone) {
			this.mno = mno;
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}//public end

		
	//3.메소드
		//1.회원가입 [인수x 반환o : 가입성공true / 가입실패 false]
		boolean 회원가입() {
			System.out.println("---------------- 회원가입 페이지 ---------------");
			
			//1. 입력받기 [id, password, name, phone]
			System.out.println("아이디 : ");		String id = 		Day07_5_BookAplication.scanner.next();
			
			//아이디 중복체크
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp != null && temp.id.equals(id)) {
					//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
					System.out.println("알림)) 현재 사용중인 아이디입니다.");
					return false; //함수 종료 == 아이디가 중복되었기 때문에 false[가입실패]
				}//if end
			}//중복체크 for end
			
			System.out.println("비밀번호 : ");		String password =	Day07_5_BookAplication.scanner.next();
			System.out.println("이름 : ");		String name =		Day07_5_BookAplication.scanner.next();
			System.out.println("연락처 : ");		String phone = 		Day07_5_BookAplication.scanner.next();	
				//scanner 객체가 다른 클래스내  static 선언 되어있음.
				//접근연산자 : 클래스명.필드명.함수명()
				//static 필드, 메소드는 객체 없이 호출가능 [클래스명.필드명/메소드명()]
			
			//회원번호 자동 부여 [가장 최근에 가입한 회원[마지막 회원]의 번호 +1 ]
			int bno = 0;	//회원을 저장하는 변수
			int j = 0;		//반복횟수 [인덱스]
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp == null) {	//null 찾기 [null-1하면 마지막 회원]
					if(j == 0) {	// 첫번째 [0번째]인덱스가 null = 첫회원 = 첫회원번호 = 1부여
						bno = 1;
						break;	//끝내기
					}//if end
						
					else {	//첫번째 회원이 아니면
						bno = Day07_5_BookAplication.members[j-1].mno+1;	//null 앞 [마지막회원]
							//null 앞 [마지막 회원]번호 +1
						break;
					}//else end
				}//if end
				j++;	//인덱스 증가
			}//회원번호 자동주입 for end
			
			//2. 4개변수 = 객체화 = 1개
			Member member = new Member(0, id, password, name, phone); //모든 필드 받는 생성자로 객체 생성
			
			//3. 배열 내 빈 공간을 찾아서 새로운 회원[객체] 넣기
			int i = 0;	//반복횟수 [인덱스 체크]
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp == null) { // 빈공간이면
					Day07_5_BookAplication.members[i] = member; //빈 인덱스에 새로운 회원 대입
					System.out.println("알림)) 회원님의 회원번호 : " + bno);
					return true; // 회원가입 메소드 종료 = 반환 : true
				}//if end 
				i++;	//i 증가
			}//for end 
			//4. 회원가입 메소드 종료 = 반환 : false
			return false;
		}//boolean end
		
//------------------------------------------------------------------------------------------------		
		
		//2.로그인 [인수x 반환o]
			//로그인 성공시 성공한 아이디반환 / 실패시 null 반환
		String 로그인() {
			System.out.println("---------------- 로그인 페이지 ---------------");
			
			//1.입력받기 
			System.out.println("아이디 : ");	String id = Day07_5_BookAplication.scanner.next();
			System.out.println("비밀번호 : ");	String password = Day07_5_BookAplication.scanner.next();
			
			//2.배열내 객체 id와 password가 입력한 값과 동일하면
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp != null && temp.id.equals(id) && temp.password.equals(password)) {
					//공백이 아니면서 id와 password가 동일하면
					return temp.id;	//성공한 id 반환
				}//if end
			}//for end
			//3.성공시 입력한 id 반환 / 실패시 null
			return null;
		}//String end
		
	//-------------------------------------------------------------------------------------------------
		
		//3.아이디찾기 [인수x 반환x] : 이름 연락처
		void 아이디찾기() {
			System.out.println("---------------- 아이디 찾기 페이지 ---------------");
			
			//1.입력받기
			System.out.println("이름 : ");	String name = Day07_5_BookAplication.scanner.next();
			System.out.println("연락처 : ");	String phone = Day07_5_BookAplication.scanner.next();
			
			//2.배열내 객체 name과 phone이 입력한 값과 동일하면
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
					//공백이 아니면서 name과 phone이 동일하면
					System.out.println("회원님의 아이디 : " + temp.id);
					return;	//동일한 값을 찾았으면
				}//if end
			}//아이디찾기 for end
			
			//3. 찾았으면 찾은 id 출력  / 못찾으면 그냥 출력
			System.out.println("알림)) 동일한 회원정보가 없습니다.");
		}//void end
		
	//-----------------------------------------------------------------------------------------	
		
		//4.비밀번호찾기 [인수x 반환x] : 아이디 연락처
		void 비밀번호찾기() {
			System.out.println("---------------- 비밀번호 찾기 페이지 ---------------");
			
			//1.입력받기
			System.out.println("아이디 : ");	String id = Day07_5_BookAplication.scanner.next();
			System.out.println("연락처 : ");	String phone = Day07_5_BookAplication.scanner.next();
			
			//2.배열내 객체 id와 phone이 입력한 값과 동일하면
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
					//공백이 아니면서 id와 phone이 동일하면
					System.out.println(id + "님의 비밀번호 : " + temp.password);
					return;	//동일한 값을 찾았으면
				}//if end
			}//비번찾기 for end
			//3. 찾았으면 찾은 id 출력  / 못찾으면 그냥 출력
			System.out.println("알림)) 동일한 회원정보가 없습니다.");
		}//void end 
	
	//-----------------------------------------------------------------------------------------	
		
		//5.회원탈퇴
		//6.회원수정
	
}
