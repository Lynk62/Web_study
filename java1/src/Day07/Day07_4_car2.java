package Day07;

public class Day07_4_car2 {//cs

	public static void main(String[] args) {//ms
		
		//p.229 : �ܺ�ȣ��
		
		//1.��ü ����
		Car2 myCar = new Car2();
		
		//2.�ڵ��� �õ�
		myCar.keyTurnOn();//�μ�x ��ȯx
		
		//3.�ڵ��� ���� �޼ҵ� ȣ��
		myCar.run();
		
		//4.���� ���ǵ� Ȯ�� �޼ҵ� ȣ��
		int speed = myCar.getSpeed();	//�μ�x��ȯo
		System.out.println("����ӵ� : " + speed + "km.h");
	}//me
}//ce