package Day08;


import Day07.Book;
import Day07.Day07_5_BookAplication;
import Day08.Day08_5_모바일뱅크;

public class Loan {

	//1.필드
	private String lname;	//대출이름
	private int lmoney = 0;	//금액
	private int	plus;		//이자
	private String lid;	
	private boolean l = true;
	
	//2.생성자
	public Loan() {}

	
	public Loan(String lname, int lmoney, int plus) {
		super();
		this.lname = lname;
		this.lmoney = lmoney;
		this.plus = plus;
	}

	
	public Loan(String lname, int lmoney, int plus, String lid, boolean l) {
		this.lname = lname;
		this.lmoney = lmoney;
		this.plus = plus;
		this.lid = lid;
		this.l = l;
	}


	
	
	//3.메소드
	
	void 대출등록() {
		System.out.println("----------------------대출 등록 페이지------------------------");
		System.out.println("대출 상품 이름 :"); String lname = Day08_5_모바일뱅크.scanner.next();
		for(Loan temp : Day08_5_모바일뱅크.loans) {
			if(temp != null && temp.lname.equals(lname)) {
				System.out.println("알림) 현재 사용중인 아이디입니다.");
				return;
			}
		}	
		System.out.println("금액 :"); int lmoney = Day08_5_모바일뱅크.scanner.nextInt();
		System.out.println("이자 :"); int plus = Day08_5_모바일뱅크.scanner.nextInt();

		Loan loan = new Loan(lname, lmoney, plus);

		int i = 0;
		for(Loan temp : Day08_5_모바일뱅크.loans) {
			if(temp == null) {
				Day08_5_모바일뱅크.loans[i] = loan;
				return; // 등록 성공시 메소드 종료
			}
		i++;
		}		
	}
	
	
	void 대출목록(String loginid) {
		System.out.println("----------------------대출 고객 목록 페이지------------------------");
		System.out.println("대출 이름\t대출 금액\t대출 이자\t대출인");
		for(Loan temp : Day08_5_모바일뱅크.loans) {
			if(temp !=null) {
				System.out.println(temp.lname+"\t"+temp.lmoney+"\t"+
					temp.plus+"\t"+temp.lid);
			}
		}
	}
	
	void 대출삭제() {}
	
	void 대출진행(String loginid) {
		System.out.println("--------- 대출 진행 ----------");
		System.out.println("대출 상품 이름 : ");	String lname = Day08_5_모바일뱅크.scanner.next();
		
		int i =0;
		for(Loan temp : Day08_5_모바일뱅크.loans) {
			if(temp != null && temp.lname.equals(lname)) {
				System.out.println("대출하였습니다");
				Day08_5_모바일뱅크.loans[i].setLid(loginid);
				
				int j = 0;
				for(Bank2 temp2 : Day08_5_모바일뱅크.banks) {
					if(temp2.getMid().equals(loginid)) {
						
					}//if end
				}//for end
				l = false;
			}//if end
			
			else {System.out.println("해당 대출 상품이 없습니다");}
		}//for end
	}
	
	void 대출상환(String loginid) {
		System.out.println("--------- 대출 상환 ----------");
		System.out.println("대출 상품 : ");	String lname = Day08_5_모바일뱅크.scanner.next();
		System.out.println("대출 금액 : ");		int lmoney = Day08_5_모바일뱅크.scanner.nextInt();
		
		int i = 0;
		for(Loan temp : Day08_5_모바일뱅크.loans) {
			if(temp != null && temp.lname.equals(lname) && temp.lmoney == (lmoney)) {
				if(temp.lid.equals(loginid)) {
					if(temp.l) {	//대여중이 아니면
						System.out.println("알림)) 현재 대출한 상품이 아닙니다");
					}//대여중인지 아닌지 if end
					
					else {	//대출중이면
						System.out.println("알림)) 상환 완료");
						Day08_5_모바일뱅크.loans[i].l = true;
						Day08_5_모바일뱅크.loans[i].lid = null;
						return;
					}//상환했는지 아닌지 else end
				}//대여도서 맞음 if end
				else {
					System.out.println("알림)) 회원님이 대출한 상품이 아닙니다");
				}//대출상품 아님 else end
			}//대출상품 이름이 일치하다면 if end
			i++;
		}//for end
	}//대출상환 void end
	
	
	
	
	
	
	
	
	
	
	
	public String getRname() {
		return lname;
	}


	public void setRname(String lname) {
		this.lname = lname;
	}


	public int getRmoney() {
		return lmoney;
	}


	public void setRmoney(int lmoney) {
		this.lmoney = lmoney;
	}


	public int getPlus() {
		return plus;
	}


	public void setPlus(int plus) {
		this.plus = plus;
	}


	public String getLid() {
		return lid;
	}


	public void setLid(String lid) {
		this.lid = lid;
	}


	public boolean isL() {
		return l;
	}


	public void setL(boolean l) {
		this.l = l;
	}
	
	
	
}
