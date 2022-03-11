package Day08;

public class Member2 {
	
	//1. �ʵ�
	private String id;
	private String password;
	private String name;
	private String phone;
	
	//2. ������
		// 1. �������
	public Member2() { }
		// 2. 2��
	public Member2(String id, String password) {
		this.id = id;
		this.password = password;
	}
		// 3. Ǯ
	public Member2(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	//3. �޼ҵ�
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 1. ȸ������ �޼ҵ�[���Լ��� true/ ���Խ��� false]
	boolean ȸ������() {
		System.out.println("----------------------ȸ������ ������----------------------");
		
		// 1. �Է¹޴´�[id,pw,name,phone]
		System.out.println("���̵� :"); 		String id = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("��й�ȣ :"); 	String password = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("�̸� :"); 		String name = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("����ó :"); 		String phone = Day08_5_����Ϲ�ũ.scanner.next();
		//* ���̵��ߺ�üũ
		for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("�˸�) ���� ������� ���̵��Դϴ�.");
				return false; // ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
			}
		}		
		
		Member2 member2 = new Member2(id,password,name,phone);// ��� �ʵ� �޴� �����ڷ� ��ü ����
		
		// 3. �迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
		int i = 0;
		for(Member2 temp : Day08_5_����Ϲ�ũ.members) {//fs
			if(temp==null) {
				Day08_5_����Ϲ�ũ.members[i] = member2;
				System.out.println("ȸ�����Կ� �����߽��ϴ�.");
				return true; // ȸ������ �޼ҵ� ���� ~~~~[��ȯ : true]
			}
			i++;
		}
		return false;
	}
	// 2. �α��� �޼ҵ�[�μ�x��ȯo ]
			// �α��� ������ ������ ���̵��ȯ / ���н� NULL ��ȯ
		String �α���() {
		System.out.println("----------------------�α��� ������----------------------");
		// 1. �Է¹ޱ�
		System.out.println("���̵� :"); 		String id = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("��й�ȣ :"); 	String password = Day08_5_����Ϲ�ũ.scanner.next();
		
		//2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
		for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
			if(temp!=null &&temp.id.equals(id) && temp.password.equals(password) ) {
					return temp.id;	
				}				
			}
		return null;
	}
	// 3. ���̵�ã�� �޼ҵ�[�μ�x��ȯx] : �̸�, ����ó
	void ���̵�ã��() {
		System.out.println("----------------------���̵� ã�� ������----------------------");		
		//1. �Է¹ޱ�
		System.out.println("�̸� :"); String name = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("����ó :"); String phone = Day08_5_����Ϲ�ũ.scanner.next();
		// 2. �Է¹��� ���� �迭�� ã��
		for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ���̵�: " + temp.id);
				return;
			}
		}
		// 3. ã������ ã�� id ����ϰ� ��ã������ ���� ���
		System.out.println("�˸� ������ ȸ�������� �����ϴ�.");
	}

	// 4. ��й�ȣ�R�� �޼ҵ�[�μ�x��ȯx] : ���̵�, ����ó
	void ��й�ȣã��() {
		System.out.println("----------------------��й�ȣ ã�� ������----------------------");
		//1. �Է¹ޱ�
		System.out.println("���̵� :"); String id = Day08_5_����Ϲ�ũ.scanner.next();
		System.out.println("����ó :"); String phone = Day08_5_����Ϲ�ũ.scanner.next();
		// 2. �Է¹��� ���� �迭�� ã��
		for(Member2 temp : Day08_5_����Ϲ�ũ.members) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ��й�ȣ: " + temp.password);
				return;
			}
		}
	System.out.println("�˸�) ������ ȸ�������� �����ϴ�.");
	}

}
