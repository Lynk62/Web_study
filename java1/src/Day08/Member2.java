package Day08;

import Day07.Day07_5_BookAplication;
import Day07.Member;

public class Member2 {

	//1.필드
	private String name;
	private String ssn;
	private String id;
	private String password;
	private String phone;
	
	//2.생성자
		//1.빈생성자
	public Member2() {}

	public Member2(String id, String password) {
		this.id = id;
		this.password = password;
	}

	
	public Member2(String name, String id, String password, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}

	public Member2(String name, String ssn, String id, String password, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}

	
	
	


	//3.메소드
		//1.회원가입
		boolean 회원가입() {
			System.out.println("---------------- 회원가입 페이지 -----------------");
			
			//1.입력받기
			System.out.println("아이디 : ");		String id = 		Day08_5_모바일뱅크.scanner.next();
			
			//아이디 중복체크
			for(Member2 temp : Day08_5_모바일뱅크.members) {
				if(temp != null && temp.id.equals(id)) {
					//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
					System.out.println("알림)) 현재 사용중인 아이디입니다.");
					return false; 
				}//if end
			}//중복체크 for end
			
			System.out.println("비밀번호 : ");		String password =	Day08_5_모바일뱅크.scanner.next();
			System.out.println("이름 : ");		String name =		Day08_5_모바일뱅크.scanner.next();
			System.out.println("연락처 : ");		String phone = 		Day08_5_모바일뱅크.scanner.next();
		
			Member2 member = new Member2(name, id, password, phone); // 객체 생성
			
			//3. 배열 내 빈 공간을 찾아서 새로운 회원[객체] 넣기
			int i = 0;
			for(Member2 temp : Day08_5_모바일뱅크.members) {
				if(temp == null) { // 빈공간이면
					Day08_5_모바일뱅크.members[i] = member;
					System.out.println("회원가입 성공");
					return true; 
				}//if end 
				i++;	//i 증가
			}//for end 
			return false;
		}//회원가입 boolean end
		
	//------------------------------------------------------------------------------------------	
		
	//2.로그인
	String 로그인() {
	System.out.println("---------------- 로그인 페이지 ---------------");
	
	//1.입력받기 
	System.out.println("아이디 : ");	String id = Day08_5_모바일뱅크.scanner.next();
	System.out.println("비밀번호 : ");	String password = Day08_5_모바일뱅크.scanner.next();
	
	//2.배열내 객체 id와 password가 입력한 값과 동일하면
	for(Member2 temp : Day08_5_모바일뱅크.members) {
		if(temp != null && temp.id.equals(id) && temp.password.equals(password)) {
			return temp.id;
		}//if end
	}//for end
	//3.실패시 null
	return null;
	}//String end
	
//------------------------------------------------------------------------------------------	
		
	//3.아이디찾기 [인수x 반환x] : 이름 연락처
			void 아이디찾기() {
				System.out.println("---------------- 아이디 찾기 페이지 ---------------");
				
				//1.입력받기
				System.out.println("이름 : ");	String name = Day08_5_모바일뱅크.scanner.next();
				System.out.println("연락처 : ");	String phone = Day08_5_모바일뱅크.scanner.next();
				
				//2.배열내 객체 name과 phone이 입력한 값과 동일하면
				for(Member2 temp : Day08_5_모바일뱅크.members) {
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
				System.out.println("아이디 : ");	String id = Day08_5_모바일뱅크.scanner.next();
				System.out.println("연락처 : ");	String phone = Day08_5_모바일뱅크.scanner.next();
				
				//2.배열내 객체 id와 phone이 입력한 값과 동일하면
				for(Member2 temp : Day08_5_모바일뱅크.members) {
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
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
