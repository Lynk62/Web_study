package Day09;

public class KumhoTire extends Tire{
			//����Ŭ���� extends ����Ŭ����
	//1.�ʵ�
	
	
	//2.������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	};
	//����Ŭ������ ������ [�ڵ� ���̱�]
	
	//3.�޼ҵ�
	@Override
	public boolean roll() {	//���� Ŭ������ �޼ҵ带 ������[����]
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ���� : " + (maxRotation-accumulatedRotation));
			return true;
		}//if end
		else {
			System.out.println("***" + location + "��ȣŸ�̾� ��ũ ***");
			return false;
		}//else end
	}//boolean end
}
