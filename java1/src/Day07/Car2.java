package Day07;

public class Car2 {//cs

	//Ŭ���� ����
	
	//1.�ʵ�
	int speed;
	
	//2.������
		//������ ������ �⺻ ������ �߰�
	
	//3.�޼ҵ�
	
	//1. ���� �ʵ尪 = speed���� �˷��ִ� �޼ҵ�
	int getSpeed() { //�μ�x ��ȯo
		return speed;
	}//int end
	
	//2. ��¸޼ҵ�
	void keyTurnOn() {//�μ�x��ȯx
		System.out.println("Ű�� �����ϴ�");	
	}//void end
	
	//3. ���ǵ����� �޼ҵ� [�ִ� 50���� 10�� ���� �ݺ�]
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�(�ü� : " + speed + "km/h)");
		}//for end
	}//void end
	
}//ce
