package Day08;

public class Bank2 {
	//1.�ʵ�
	private String bname;
	private String number;
	private String bpassword;
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
		boolean ���»���() {
			System.out.println("---------------- ���»��� ������ -----------------");
			
			//1.�Է¹ޱ�
			System.out.println("����� : ");		String bname = 		Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("���¹�ȣ : ");		String number = 		Day08_5_����Ϲ�ũ.scanner.next();
			//���̵� �ߺ�üũ
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
					return true; 
				}//if end 
				i++;	//i ����
			}//for end 
			return false;
		}//���»��� boolean end
		
		
		void �Ա�() {
			System.out.println("--------------{{ �Ա� ������ }}-----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���¹�ȣ : ");		String number = Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("�Ա� �ݾ� : ");	int money = Day08_5_����Ϲ�ũ.scanner.nextInt();
			
		
			
			
		}//�Ա� void end
		
		void ���() {}
		
		void ��ü() {}
		
		void ����() {}
		
		void ���¸��() {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
