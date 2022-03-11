package Day08;

public class Bank2 {
	//1.필드
	private String bname;
	private String number;
	private String bpassword;
	private int money;
	
	//2.생성자
		//1.빈생성자
		public Bank2() {}
		
		//2.3개
		public Bank2(String bname, String number, String bpassword) {
		this.bname = bname;
		this.number = number;
		this.bpassword = bpassword;
		}

		
		
		//3.풀생성자
		public Bank2(String bname, String number, String bpassword, int money) {
			super();
			this.bname = bname;
			this.number = number;
			this.bpassword = bpassword;
			this.money = money;
		}

		
	
	
	//3.메소드
		boolean 계좌생성() {
			System.out.println("---------------- 계좌생성 페이지 -----------------");
			
			//1.입력받기
			System.out.println("은행명 : ");		String bname = 		Day08_5_모바일뱅크.scanner.next();
			System.out.println("계좌번호 : ");		String number = 		Day08_5_모바일뱅크.scanner.next();
			//아이디 중복체크
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null && temp.number.equals(number)) {
					//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
					System.out.println("알림)) 현재 사용중인 계좌번호입니다.");
					return false; 
				}//if end
			}//중복체크 for end
			
			System.out.println("비밀번호 : ");		String bpassword =	Day08_5_모바일뱅크.scanner.next();
		
			Bank2 bank = new Bank2(bname, number, bpassword); // 객체 생성
			
			//3. 배열 내 빈 공간을 찾아서 새로운 회원[객체] 넣기
			int i = 0;
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp == null) { // 빈공간이면
					Day08_5_모바일뱅크.banks[i] = bank;
					System.out.println("계좌생성 성공");
					return true; 
				}//if end 
				i++;	//i 증가
			}//for end 
			return false;
		}//계좌생성 boolean end
		
		
		void 입금() {
			System.out.println("--------------{{ 입금 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("계좌번호 : ");		String number = Day08_5_모바일뱅크.scanner.next();
			System.out.println("입금 금액 : ");	int money = Day08_5_모바일뱅크.scanner.nextInt();
			
		
			
			
		}//입금 void end
		
		void 출금() {}
		
		void 이체() {}
		
		void 대출() {}
		
		void 계좌목록() {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public String getName() {
			return bname;
		}

		public void bname(String bname) {
			this.bname = bname;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getBpassword() {
			return bpassword;
		}

		public void setBpassword(String bpassword) {
			this.bpassword = bpassword;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
	
		
		
		

}
