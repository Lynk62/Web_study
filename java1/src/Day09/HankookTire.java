package Day09;

public class HankookTire extends Tire{//cs
			//����Ŭ���� extends ����Ŭ����
	//1.�ʵ�
	
	
	//2.������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		//super(�μ�1, �μ�2) // ���� Ŭ������ �μ�2��¥�� ������ ȣ��
	}
	
	//3.�޼ҵ�
		//ctrl + space
	@Override
	public boolean roll() {	//���� Ŭ������ �޼ҵ带 ������[����]
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾� ���� : " + (maxRotation-accumulatedRotation));
			return true;
		}//if end
		else {
			System.out.println("***" + location + "�ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}//else end
	}//boolean end
	
}//ce
