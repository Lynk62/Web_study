package Day07;

public class Day07_2_car {//cs

	public static void main(String[] args) {//ms
		
		//p.223 ~ 224 : ���ϰ��� ���� �޼ҵ�(void)
		
		//1. ��ü ���� [������� = �⺻������]
		Car mycar = new Car();
		
		//2. �޼ҵ�ȣ�� [�μ�1��]
		mycar.setGas(5);
		
		//3. �޼ҵ� ȣ�� [�μ�x ��ȯ = tureȤ�� false]
		if(mycar.isLeftGas()) {
			System.out.println("����մϴ�");
			//4. �޼ҵ�ȣ�� [�μ�x ��ȯx]
			mycar.run();
		}//if end
		
		
		//5. �޼ҵ�ȣ��
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}//if end
		
		else {
			System.out.println("gas�� �����ؾ��մϴ�");
		}// else end
		
	
	}//me
}//ce
