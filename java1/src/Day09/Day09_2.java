package Day09;

public class Day09_2 {//cs

	public static void main(String[] args) {//ms
		
		/*���
		 *	�θ𿡰� �����޴� ��
		 *	���� : �θ� ===> �ڽļ��� // ���α׷��� : �ڽ� ===> �θ� ����
		 *extends : �����ϴ� [����ϴ�]
		 *����� ���� ���� : ���� ���� [������ �ִ� Ŭ������ �����ؼ� ���ο� Ŭ���� ����]
		 *�θ�Ŭ���� 1�� ���� �ڽ�Ŭ������ ������ ����*/
		
		//p.290
		//1.����Ŭ������ ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//2.����Ŭ������ ������� ��ü�� ����Ŭ������ ��� ����
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		//3. ����Ŭ������ ������� ��ü�� ���� ��� ����
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		//4. ����Ŭ������ ���������� ��ü�� ����Ŭ������ ���[�޼ҵ�] ����
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿 �Դϴ�!");
		dmbCellPhone.sendVoice("�ݰ����ϴ�!");
		dmbCellPhone.hangUp();
		
		//5. ����Ŭ������ ������� ��ü�� ���� ��� ����
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}//me
}//ce
