package Day06;

public class Day06_5_korean {//cs

	public static void main(String[] args) {//ms
		//p.207
		
		//1.������ ���� �ʵ忡 �� �ֱ�
		Korean k1 = new Korean();
		k1.name = "���缮";
		k1.ssn = "123123-123123";
		System.out.println("k1 ���� : " + k1.nation);
		System.out.println("k1 �̸� : " + k1.name);
		System.out.println("k1 �ֹε�Ϲ�ȣ : " + k1.ssn);
		
		//2. �ʵ� 2���� ���� �����ڷ� ��ü ����
		Korean k2 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k2 ���� : " + k2.nation);
		System.out.println("k2 �̸� : " + k2.name);
		System.out.println("k2 �ֹε�Ϲ�ȣ : " + k2.ssn);
		
		///////////////////////////////////////////////////////
		
		//1. �� ������
		Korean �ѱ���1 = new Korean();
			//���� = ���ѹα� / �̸�, �ֹε�Ϲ�ȣ = ����
		
		//2. �ʵ� 1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("���缮");
			//���� = ���ѹα� / �̸� = ���缮 / �ֹε�Ϲ�ȣ = ����
		
		//3. �ʵ� 2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("��ȣ��", "1234-1234");
			//���� = ���ѹα� / �̸� = ��ȣ�� / �ֹε�Ϲ�ȣ = 1234-1234
		
		//4. �ʵ� 3�� ������ ��ü ����
		Korean �ѱ���4 = new Korean("�Ϻ�", "�ŵ���", "123456789");
			//���� = �Ϻ����� �ٲ� / �̸� = �ŵ��� / �ֹε�Ϲ�ȣ = 123456789
		
	}//me
}//ce
