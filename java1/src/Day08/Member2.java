package Day08;

import Day07.Day07_5_BookAplication;
import Day07.Member;

public class Member2 {

	//1.�ʵ�
	private String name;
	private String ssn;
	private String id;
	private String password;
	private String phone;
	
	//2.������
		//1.�������
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

	
	
	


	//3.�޼ҵ�
		//1.ȸ������
		boolean ȸ������() {
			System.out.println("---------------- ȸ������ ������ -----------------");
			
			//1.�Է¹ޱ�
			System.out.println("���̵� : ");		String id = 		Day08_5_����Ϲ�ũ.scanner.next();
			
			//���̵� �ߺ�üũ
			for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
				if(temp != null && temp.id.equals(id)) {
					//���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
					System.out.println("�˸�)) ���� ������� ���̵��Դϴ�.");
					return false; 
				}//if end
			}//�ߺ�üũ for end
			
			System.out.println("��й�ȣ : ");		String password =	Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("�̸� : ");		String name =		Day08_5_����Ϲ�ũ.scanner.next();
			System.out.println("����ó : ");		String phone = 		Day08_5_����Ϲ�ũ.scanner.next();
		
			Member2 member = new Member2(name, id, password, phone); // ��ü ����
			
			//3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
			int i = 0;
			for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
				if(temp == null) { // ������̸�
					Day08_5_����Ϲ�ũ.members[i] = member;
					System.out.println("ȸ������ ����");
					return true; 
				}//if end 
				i++;	//i ����
			}//for end 
			return false;
		}//ȸ������ boolean end
		
	//------------------------------------------------------------------------------------------	
		
	//2.�α���
	String �α���() {
	System.out.println("---------------- �α��� ������ ---------------");
	
	//1.�Է¹ޱ� 
	System.out.println("���̵� : ");	String id = Day08_5_����Ϲ�ũ.scanner.next();
	System.out.println("��й�ȣ : ");	String password = Day08_5_����Ϲ�ũ.scanner.next();
	
	//2.�迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
	for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
		if(temp != null && temp.id.equals(id) && temp.password.equals(password)) {
			return temp.id;
		}//if end
	}//for end
	//3.���н� null
	return null;
	}//String end
	
//------------------------------------------------------------------------------------------	
		
	//3.���̵�ã�� [�μ�x ��ȯx] : �̸� ����ó
			void ���̵�ã��() {
				System.out.println("---------------- ���̵� ã�� ������ ---------------");
				
				//1.�Է¹ޱ�
				System.out.println("�̸� : ");	String name = Day08_5_����Ϲ�ũ.scanner.next();
				System.out.println("����ó : ");	String phone = Day08_5_����Ϲ�ũ.scanner.next();
				
				//2.�迭�� ��ü name�� phone�� �Է��� ���� �����ϸ�
				for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
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
				System.out.println("���̵� : ");	String id = Day08_5_����Ϲ�ũ.scanner.next();
				System.out.println("����ó : ");	String phone = Day08_5_����Ϲ�ũ.scanner.next();
				
				//2.�迭�� ��ü id�� phone�� �Է��� ���� �����ϸ�
				for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
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
