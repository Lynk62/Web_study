package Day08;


import Day07.Book;
import Day07.Day07_5_BookAplication;
import Day08.Day08_5_����Ϲ�ũ;

public class Loan {

	//1.�ʵ�
	private String lname;	//�����̸�
	private int lmoney = 0;	//�ݾ�
	private int	plus;		//����
	private String lid;	
	private boolean l = true;
	
	//2.������
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


	
	
	//3.�޼ҵ�
	
	void ������() {
		System.out.println("----------------------���� ��� ������------------------------");
		System.out.println("���� ��ǰ �̸� :"); String lname = Day08_5_����Ϲ�ũ.scanner.next();
		for(Loan temp : Day08_5_����Ϲ�ũ.loans) {
			if(temp != null && temp.lname.equals(lname)) {
				System.out.println("�˸�) ���� ������� ���̵��Դϴ�.");
				return;
			}
		}	
		System.out.println("�ݾ� :"); int lmoney = Day08_5_����Ϲ�ũ.scanner.nextInt();
		System.out.println("���� :"); int plus = Day08_5_����Ϲ�ũ.scanner.nextInt();

		Loan loan = new Loan(lname, lmoney, plus);

		int i = 0;
		for(Loan temp : Day08_5_����Ϲ�ũ.loans) {
			if(temp == null) {
				Day08_5_����Ϲ�ũ.loans[i] = loan;
				return; // ��� ������ �޼ҵ� ����
			}
		i++;
		}		
	}
	
	
	void ������(String loginid) {
		System.out.println("----------------------���� �� ��� ������------------------------");
		System.out.println("���� �̸�\t���� �ݾ�\t���� ����\t������");
		for(Loan temp : Day08_5_����Ϲ�ũ.loans) {
			if(temp !=null) {
				System.out.println(temp.lname+"\t"+temp.lmoney+"\t"+
					temp.plus+"\t"+temp.lid);
			}
		}
	}
	
	void �������() {}
	
	void ��������(String loginid) {
		System.out.println("--------- ���� ���� ----------");
		System.out.println("���� ��ǰ �̸� : ");	String lname = Day08_5_����Ϲ�ũ.scanner.next();
		
		int i =0;
		for(Loan temp : Day08_5_����Ϲ�ũ.loans) {
			if(temp != null && temp.lname.equals(lname)) {
				System.out.println("�����Ͽ����ϴ�");
				Day08_5_����Ϲ�ũ.loans[i].setLid(loginid);
				
				int j = 0;
				for(Bank2 temp2 : Day08_5_����Ϲ�ũ.banks) {
					if(temp2.getMid().equals(loginid)) {
						
					}//if end
				}//for end
				l = false;
			}//if end
			
			else {System.out.println("�ش� ���� ��ǰ�� �����ϴ�");}
		}//for end
	}
	
	void �����ȯ(String loginid) {
		System.out.println("--------- ���� ��ȯ ----------");
		System.out.println("���� ��ǰ : ");	String lname = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("���� �ݾ� : ");		int lmoney = Day08_5_����Ϲ�ũ.scanner.nextInt();
		
		int i = 0;
		for(Loan temp : Day08_5_����Ϲ�ũ.loans) {
			if(temp != null && temp.lname.equals(lname) && temp.lmoney == (lmoney)) {
				if(temp.lid.equals(loginid)) {
					if(temp.l) {	//�뿩���� �ƴϸ�
						System.out.println("�˸�)) ���� ������ ��ǰ�� �ƴմϴ�");
					}//�뿩������ �ƴ��� if end
					
					else {	//�������̸�
						System.out.println("�˸�)) ��ȯ �Ϸ�");
						Day08_5_����Ϲ�ũ.loans[i].l = true;
						Day08_5_����Ϲ�ũ.loans[i].lid = null;
						return;
					}//��ȯ�ߴ��� �ƴ��� else end
				}//�뿩���� ���� if end
				else {
					System.out.println("�˸�)) ȸ������ ������ ��ǰ�� �ƴմϴ�");
				}//�����ǰ �ƴ� else end
			}//�����ǰ �̸��� ��ġ�ϴٸ� if end
			i++;
		}//for end
	}//�����ȯ void end
	
	
	
	
	
	
	
	
	
	
	
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
