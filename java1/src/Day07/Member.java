package Day07;

public class Member {
	//Ŭ���� ����
	
	//1.�ʵ�
		int mno;		//ȸ����ȣ [�ڵ���ȣ, �ߺ�x]
		String id;		//���̵�	[�ߺ�x]
		String password;//��й�ȣ
		String name;	//�̸�
		String phone;	//����ó
	
	//2.������ [�����ڸ� == Ŭ������]
		//1. �������[�⺻������] : �޼ҵ� ȣ��� ��ü ������
		public Member() {}
		
		//2.��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü ������
		public Member(int mno, String id, String password, String name, String phone) {
			this.mno = mno;
			this.id = id;
			this.password = password;
			this.name = name;
			this.phone = phone;
		}//public end

		
	//3.�޼ҵ�
		//1.ȸ������ [�μ�x ��ȯo : ���Լ���true / ���Խ��� false]
		boolean ȸ������() {
			System.out.println("---------------- ȸ������ ������ ---------------");
			
			//1. �Է¹ޱ� [id, password, name, phone]
			System.out.println("���̵� : ");		String id = 		Day07_5_BookAplication.scanner.next();
			
			//���̵� �ߺ�üũ
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp != null && temp.id.equals(id)) {
					//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
					System.out.println("�˸�)) ���� ������� ���̵��Դϴ�.");
					return false; //�Լ� ���� == ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
				}//if end
			}//�ߺ�üũ for end
			
			System.out.println("��й�ȣ : ");		String password =	Day07_5_BookAplication.scanner.next();
			System.out.println("�̸� : ");		String name =		Day07_5_BookAplication.scanner.next();
			System.out.println("����ó : ");		String phone = 		Day07_5_BookAplication.scanner.next();	
				//scanner ��ü�� �ٸ� Ŭ������  static ���� �Ǿ�����.
				//���ٿ����� : Ŭ������.�ʵ��.�Լ���()
				//static �ʵ�, �޼ҵ�� ��ü ���� ȣ�Ⱑ�� [Ŭ������.�ʵ��/�޼ҵ��()]
			
			//ȸ����ȣ �ڵ� �ο� [���� �ֱٿ� ������ ȸ��[������ ȸ��]�� ��ȣ +1 ]
			int bno = 0;	//ȸ���� �����ϴ� ����
			int j = 0;		//�ݺ�Ƚ�� [�ε���]
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp == null) {	//null ã�� [null-1�ϸ� ������ ȸ��]
					if(j == 0) {	// ù��° [0��°]�ε����� null = ùȸ�� = ùȸ����ȣ = 1�ο�
						bno = 1;
						break;	//������
					}//if end
						
					else {	//ù��° ȸ���� �ƴϸ�
						bno = Day07_5_BookAplication.members[j-1].mno+1;	//null �� [������ȸ��]
							//null �� [������ ȸ��]��ȣ +1
						break;
					}//else end
				}//if end
				j++;	//�ε��� ����
			}//ȸ����ȣ �ڵ����� for end
			
			//2. 4������ = ��üȭ = 1��
			Member member = new Member(0, id, password, name, phone); //��� �ʵ� �޴� �����ڷ� ��ü ����
			
			//3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
			int i = 0;	//�ݺ�Ƚ�� [�ε��� üũ]
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp == null) { // ������̸�
					Day07_5_BookAplication.members[i] = member; //�� �ε����� ���ο� ȸ�� ����
					System.out.println("�˸�)) ȸ������ ȸ����ȣ : " + bno);
					return true; // ȸ������ �޼ҵ� ���� = ��ȯ : true
				}//if end 
				i++;	//i ����
			}//for end 
			//4. ȸ������ �޼ҵ� ���� = ��ȯ : false
			return false;
		}//boolean end
		
//------------------------------------------------------------------------------------------------		
		
		//2.�α��� [�μ�x ��ȯo]
			//�α��� ������ ������ ���̵��ȯ / ���н� null ��ȯ
		String �α���() {
			System.out.println("---------------- �α��� ������ ---------------");
			
			//1.�Է¹ޱ� 
			System.out.println("���̵� : ");	String id = Day07_5_BookAplication.scanner.next();
			System.out.println("��й�ȣ : ");	String password = Day07_5_BookAplication.scanner.next();
			
			//2.�迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp != null && temp.id.equals(id) && temp.password.equals(password)) {
					//������ �ƴϸ鼭 id�� password�� �����ϸ�
					return temp.id;	//������ id ��ȯ
				}//if end
			}//for end
			//3.������ �Է��� id ��ȯ / ���н� null
			return null;
		}//String end
		
	//-------------------------------------------------------------------------------------------------
		
		//3.���̵�ã�� [�μ�x ��ȯx] : �̸� ����ó
		void ���̵�ã��() {
			System.out.println("---------------- ���̵� ã�� ������ ---------------");
			
			//1.�Է¹ޱ�
			System.out.println("�̸� : ");	String name = Day07_5_BookAplication.scanner.next();
			System.out.println("����ó : ");	String phone = Day07_5_BookAplication.scanner.next();
			
			//2.�迭�� ��ü name�� phone�� �Է��� ���� �����ϸ�
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
					//������ �ƴϸ鼭 name�� phone�� �����ϸ�
					System.out.println("ȸ������ ���̵� : " + temp.id);
					return;	//������ ���� ã������
				}//if end
			}//���̵�ã�� for end
			
			//3. ã������ ã�� id ���  / ��ã���� �׳� ���
			System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
		}//void end
		
	//-----------------------------------------------------------------------------------------	
		
		//4.��й�ȣã�� [�μ�x ��ȯx] : ���̵� ����ó
		void ��й�ȣã��() {
			System.out.println("---------------- ��й�ȣ ã�� ������ ---------------");
			
			//1.�Է¹ޱ�
			System.out.println("���̵� : ");	String id = Day07_5_BookAplication.scanner.next();
			System.out.println("����ó : ");	String phone = Day07_5_BookAplication.scanner.next();
			
			//2.�迭�� ��ü id�� phone�� �Է��� ���� �����ϸ�
			for(Member temp : Day07_5_BookAplication.members) {
				if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
					//������ �ƴϸ鼭 id�� phone�� �����ϸ�
					System.out.println(id + "���� ��й�ȣ : " + temp.password);
					return;	//������ ���� ã������
				}//if end
			}//���ã�� for end
			//3. ã������ ã�� id ���  / ��ã���� �׳� ���
			System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
		}//void end 
	
	//-----------------------------------------------------------------------------------------	
		
		//5.ȸ��Ż��
		//6.ȸ������
	
}
