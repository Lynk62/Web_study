package Day08;

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
		public Bank2(String bname, String number, String bpassword, int money) {
			super();
			this.bname = bname;
			this.number = number;
			this.bpassword = bpassword;
			this.money = money;
		}

		
	
	
	//3.�޼ҵ�
		boolean ���»���(String loginid) {
			System.out.println("---------------- ���»��� ������ -----------------");
			
			//1.�Է¹ޱ�
			System.out.println("����� : ");		String bname = 		Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("���¹�ȣ : ");		String number = 		Day08_5_����Ϲ�ũ.scanner.next();
			//���¹�ȣ �ߺ�üũ
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp != null && temp.number.equals(number)) {
					//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
					System.out.println("�˸�)) ���� ������� ���¹�ȣ�Դϴ�.");
					return false; 
				}//if end
			}//�ߺ�üũ for end
			
			System.out.println("��й�ȣ : ");		String bpassword =	Day08_5_����Ϲ�ũ.scanner.next();
		
			Bank2 bank = new Bank2(bname, number, bpassword); // ��ü ����
			
			//3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
			int i = 0;
			for(Bank2 temp : Day08_5_����Ϲ�ũ.banks) {
				if(temp == null) { // ������̸�
					Day08_5_����Ϲ�ũ.banks[i] = bank;
					System.out.println("���»��� ����");
					temp.mid = loginid;
					return true; 
				}//if end 
				i++;	//i ����
			}//for end 
			return false;
		}//���»��� boolean end
		
		
		
		void �Ա�(String loginid) {
			System.out.println("--------------{{ �Ա� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			
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
					temp.money -= money;
					System.out.println("�ܿ��ݾ� : " + temp.money);
					temp.mid = loginid;
					return;
				}//if end
				
				else {
					System.out.println("�˸�)) Ʋ�� �����Դϴ�");
					return;
				}
			}//for end
		}
		
		void ��ü() {
			System.out.println("--------------{{ ��ü ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("��ü�� ���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("��й�ȣ : ");				String bpassword = Day08_5_����Ϲ�ũ.scanner.next();
			
		}
		
		void ����() {
			System.out.println("--------------{{ ���� ������ }}-----------------");
		}
		
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
