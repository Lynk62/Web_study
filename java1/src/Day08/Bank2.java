package Day08;

import Day07.Book;
import Day07.Day07_5_BookAplication;

public class Bank2 {
	//1.�ʵ�
	private String bname;
	private String number;
	private String bpassword;
	private String mid;
	private int money;
	
	//2.������
		//1.�������
		public Bank2() {}
		
		//2.3��
		public Bank2(String bname, String number, String bpassword) {
		this.bname = bname;
		this.number = number;
		this.bpassword = bpassword;
		}

		
		
		//3.Ǯ������
		public Bank2(String bname, String number, String bpassword, String mid, int money) {
			super();
			this.bname = bname;
			this.number = number;
			this.bpassword = bpassword;
			this.mid = mid;
			this.money = money;
		}

		
	
	
	//3.�޼ҵ�
		void ���»���(String loginid) {
			System.out.println("--------------{{ ���»��� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("����� : ");	String bname = 	 Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("���¹�ȣ : ");	String number = 	 Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("��й�ȣ : ");	String bpassword = Day08_5_����Ϲ�ũ.scanner.next();
			
			//ISBN �ߺ�üũ
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null && temp.number.equals(number)) {
					System.out.println("�˸� )) �̹� ������ �����Դϴ� [��Ͻ���]");
					return;//������� �޼ҵ� ���� (��� ����)
				}//if end
			}//for end
			
			//2. ��üȭ [�ʱⰪ = �����뿩���� = true / �뿩ȸ��id = null]
			Bank2 bank = new Bank2(bname, number, bpassword, loginid, 0);
			
			//3. �迭����[�ֱ�]
			int i = 0;
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp == null) {
					Day08_5_����Ϲ�ũ.banks[i] = bank;
					System.out.println("�˸�)) ���»����� �Ϸ�Ǿ����ϴ�!");
					return;
				}//if end
				i++;	//�ε�������
			}//for end
		
		}//���� ����void end
		
		
		
		void �Ա�(String loginid) {
			System.out.println("--------------{{ �Ա� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			
			int i = 0;
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null && temp.number.equals(number)) {
					System.out.println("�Ա� �ݾ� : ");	int money = Day08_5_����Ϲ�ũ.scanner.nextInt();
					temp.money += money;
					System.out.println("�ܿ��ݾ� : " + temp.money);
					temp.mid = loginid;
					return;
				}//if end
				
				else {
					System.out.println("�˸�)) Ʋ�� �����Դϴ�");
					return;
				}
			}//for end
			
		
			
			
		}//�Ա� void end
		
		void ���(String loginid) {
			System.out.println("--------------{{ ��� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("��й�ȣ : ");		String bpassword = Day08_5_����Ϲ�ũ.scanner.next();
			
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null && temp.number.equals(number) && temp.bpassword.equals(bpassword)) {
					System.out.println("��� �ݾ� : ");	int money = Day08_5_����Ϲ�ũ.scanner.nextInt();
					if(temp.money<money) {
						System.out.println("�˸� )) �ܾ��� �����մϴ�");
						return;
					}//if end
					
					else {
						temp.money -= money;
						System.out.println("�ܿ��ݾ� : " + temp.money);
						temp.mid = loginid;
					return;
					}
				}//if end
				
				else {
					System.out.println("�˸�)) Ʋ�� �����Դϴ�");
					return;
				}
			}//for end
		}
		
		void ��ü(String loginid) {
			System.out.println("--------------{{ ��ü ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("��й�ȣ : ");				String bpassword = Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("��ü�� ���¹�ȣ : ");		String yournumber = Day08_5_����Ϲ�ũ.scanner.next();
			
			
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null && temp.number.equals(number) && !temp.number.equals(yournumber)) {
					System.out.println("��ü �ݾ� : ");	int money = Day08_5_����Ϲ�ũ.scanner.nextInt();
					
					if(temp.money<money) {
						System.out.println("�˸�)) �ܾ��� �����մϴ�");
					}//if end
					
					else {
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�");
						System.out.println("�ܿ��ݾ� : " + temp.money);
						temp.mid = loginid;
						return;
					}//else end
				}//if end
				
				else {System.out.println("������ ���¹�ȣ�� �����ϴ�");}
			}//for end
		}//��ü void end
		
		
		
		void ���¸��(String loginid) {
			System.out.println("--------------{{ ���� ��� }}-----------------");
			System.out.println("�����\t���¹�ȣ\t�ܿ��ݾ�\t������");
			
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null) {
					System.out.println(temp.bname + "\t" + temp.number + "\t" + temp.money+"\t" + temp.mid);
					temp.mid = loginid;
				}//if end
			}//for end
		}//���¸�� void end

		
		
		
		
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
