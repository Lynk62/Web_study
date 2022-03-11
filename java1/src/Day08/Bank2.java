package Day08;

import Day07.Book;
import Day07.Day07_5_BookAplication;

public class Bank2 {
	//1.필드
	private String bname;
	private String number;
	private String bpassword;
	private String mid;
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
		public Bank2(String bname, String number, String bpassword, String mid, int money) {
			super();
			this.bname = bname;
			this.number = number;
			this.bpassword = bpassword;
			this.mid = mid;
			this.money = money;
		}

		
	
	
	//3.메소드
		void 계좌생성(String loginid) {
			System.out.println("--------------{{ 계좌생성 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("은행명 : ");	String bname = 	 Day08_5_모바일뱅크.scanner.next();
			System.out.println("계좌번호 : ");	String number = 	 Day08_5_모바일뱅크.scanner.next();
			System.out.println("비밀번호 : ");	String bpassword = Day08_5_모바일뱅크.scanner.next();
			
			//ISBN 중복체크
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null && temp.number.equals(number)) {
					System.out.println("알림 )) 이미 생성된 계좌입니다 [등록실패]");
					return;//도서등록 메소드 종료 (등록 실패)
				}//if end
			}//for end
			
			//2. 객체화 [초기값 = 도서대여여부 = true / 대여회원id = null]
			Bank2 bank = new Bank2(bname, number, bpassword, loginid, 0);
			
			//3. 배열대입[넣기]
			int i = 0;
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp == null) {
					Day08_5_모바일뱅크.banks[i] = bank;
					System.out.println("알림)) 계좌생성이 완료되었습니다!");
					return;
				}//if end
				i++;	//인덱스증가
			}//for end
		
		}//계좌 생성void end
		
		
		
		void 입금(String loginid) {
			System.out.println("--------------{{ 입금 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("계좌번호 : ");		String number = Day08_5_모바일뱅크.scanner.next();
			
			int i = 0;
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null && temp.number.equals(number)) {
					System.out.println("입금 금액 : ");	int money = Day08_5_모바일뱅크.scanner.nextInt();
					temp.money += money;
					System.out.println("잔여금액 : " + temp.money);
					temp.mid = loginid;
					return;
				}//if end
				
				else {
					System.out.println("알림)) 틀린 계좌입니다");
					return;
				}
			}//for end
			
		
			
			
		}//입금 void end
		
		void 출금(String loginid) {
			System.out.println("--------------{{ 출금 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("계좌번호 : ");		String number = Day08_5_모바일뱅크.scanner.next();
			System.out.println("비밀번호 : ");		String bpassword = Day08_5_모바일뱅크.scanner.next();
			
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null && temp.number.equals(number) && temp.bpassword.equals(bpassword)) {
					System.out.println("출금 금액 : ");	int money = Day08_5_모바일뱅크.scanner.nextInt();
					if(temp.money<money) {
						System.out.println("알림 )) 잔액이 부족합니다");
						return;
					}//if end
					
					else {
						temp.money -= money;
						System.out.println("잔여금액 : " + temp.money);
						temp.mid = loginid;
					return;
					}
				}//if end
				
				else {
					System.out.println("알림)) 틀린 계좌입니다");
					return;
				}
			}//for end
		}
		
		void 이체(String loginid) {
			System.out.println("--------------{{ 이체 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("계좌번호 : ");		String number = Day08_5_모바일뱅크.scanner.next();
			System.out.println("비밀번호 : ");				String bpassword = Day08_5_모바일뱅크.scanner.next();
			System.out.println("이체할 계좌번호 : ");		String yournumber = Day08_5_모바일뱅크.scanner.next();
			
			
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null && temp.number.equals(number) && !temp.number.equals(yournumber)) {
					System.out.println("이체 금액 : ");	int money = Day08_5_모바일뱅크.scanner.nextInt();
					
					if(temp.money<money) {
						System.out.println("알림)) 잔액이 부족합니다");
					}//if end
					
					else {
						System.out.println("이체가 완료되었습니다");
						System.out.println("잔여금액 : " + temp.money);
						temp.mid = loginid;
						return;
					}//else end
				}//if end
				
				else {System.out.println("동일한 계좌번호가 없습니다");}
			}//for end
		}//이체 void end
		
		
		
		void 계좌목록(String loginid) {
			System.out.println("--------------{{ 계좌 목록 }}-----------------");
			System.out.println("은행명\t계좌번호\t잔여금액\t예금주");
			
			for(Bank2 temp : Day08_5_모바일뱅크.banks) {
				if(temp != null) {
					System.out.println(temp.bname + "\t" + temp.number + "\t" + temp.money+"\t" + temp.mid);
					temp.mid = loginid;
				}//if end
			}//for end
		}//계좌목록 void end

		
		
		
		
		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
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

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
