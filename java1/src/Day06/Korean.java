package Day06;

public class Korean {
	//Korean Ŭ���� ����
	
	//1.�ʵ�
	String nation = "���ѹα�";  //���������� �̸� ���ѹα� ����
	String name; 	//�̸� �������� �ʱ�ȭx = null
	String ssn;		//�ֹε�Ϲ�ȣ �������� �ʱ�ȭx = null
	
	//�߿��� ���� [��, ��������]
	
	//2.������
		//����1:�������̸� == Ŭ�����̸� ����
		//����2:�ܺηκ��� ������ �Ű���[�μ�]����
		//����3:������ ������ �̸� ���� �� ����
			//�����ε� : ������ �̸���  ��� ������
		//1. �������
		Korean(){/*�� ������ ���빰 ����*/}
	
		//2. �ʵ� 1�� ���� ������
		Korean(String name){
			this.name = name;
		}
		
		//3. �ʵ� 2�� ���� ������
		Korean(String name, String ssn){
			this.name = name;
			this.ssn = ssn;
		}
		
		//4. �ʵ� 3�� ���� ������
		Korean(String nation, String name, String ssn){
			this.nation = nation;
			this.name = name;
			this.ssn = ssn;
			//���κ���(���� Ŭ������ ����)
			//�Ű�����(�ܺηκ��� ���� ����)
			//���κ��� == �Ű����� �̸��� �����ϸ� �浹
			//���κ��� ǥ�� ���
				//this.�ʵ�� : ���� Ŭ���� �� �ʵ� ȣ��
			
		}
		
		
	//3.�޼ҵ�
}
