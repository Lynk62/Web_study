package Day07;

public class Car {

	//Ŭ���� ����
	
	//1.�ʵ�
	int gas;	//���� ����
	
	//2.������
		//������ ������ �⺻ ������
	
	//3.�޼ҵ�
	
	//1. gas�� �ܺηκ��� �޾Ƽ� ���� gas�� �����ϴ� �޼ҵ� ����
	void setGas(int gas) {	//�μ�o ��ȯx
//	����x �޼ҵ�� (�μ�1) {���κ��� = �ܺκ���}
		this.gas = gas;
		//���κ����� �ܺκ����� �̸��� ������ �� �����ϴ� ���
			//this.�ʵ�� : ����(��Ŭ��������) ����
	}//void end
	
	
	//2. ���κ��� gas�� ������ Ȯ�� [0=��������][1�̻� = �����ִ�]
	boolean isLeftGas() {	//�μ�x ��ȯo
// ����ȯ	�޼ҵ��() {}
		if(gas == 0 ) {
			System.out.println("gas�� �����ϴ�. false");
			return false;
		}//if end
		
		else {
			System.out.println("gas�� �ֽ��ϴ�. true");
			return true;
		}//else end
	}//boolean end
	
	//3. gas = 0�϶����� �����ϴµ� �����Ҷ����� ���� 1�� ����
	//gas == 0�̸� �Լ� ����
	void run() {//�μ�x��ȯx
		
		while(true) {
			if(gas>0) {
			System.out.println("�޸��ϴ� : " + gas+")");
			gas--; //gas����1�� ����
			}
			
			else {
				System.out.println("����ϴ� (gas�ܷ� : " + gas + ")");
				return; //�Լ� Ż�� [����]
			}
		}//while end
	}//void end
}
