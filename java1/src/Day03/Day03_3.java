package Day03;

import java.util.Scanner;

public class Day03_3 {//cs

	public static void main(String[] args) {//ms
		
		Scanner scan = new Scanner(System.in);
		
//		//����6 ���� 1���� �Է¹޾� ������ 90�̻��̸� �հ� �ƴϸ� ���հ�
//		System.out.println("���� 1�� �Է� : ");		int score = scan.nextInt();
//		
//		if(score>=90) System.out.println("�հ�");
//		else System.out.println("���հ�");
//		
//		
//		//����7 ������ �Է¹޾Ƽ� 90�̻� A / 80�� �̻� B / 70���̻� C / �׿� �����
//		System.out.println("���� 1�� �Է� : ");		int ���� = scan.nextInt();
//		
//		if(����>=90) System.out.println("A");
//		else if (����>=80)	System.out.println("B");
//		else if (����>=70)	System.out.println("C");
//		else System.out.println("�����");
		
		
		
		
		//����8 �α���������
		//[�Է�] : ���̵�� ��й�ȣ
		/*[����] : ȸ�����̵� = admin
		 * 		��й�ȣ 1234 �� ��� �α��μ��� / �ƴϸ� �α��� ���� */
		
		System.out.println("���̵� : ");		String id = scan.next();
											// char �ڷ��� [����1�� ����]
											// �ڷ������� ���ڿ��� ������ �� ����
												//1. String Ŭ������ ����ϸ� ���ڿ� ���尡��
												//2. char �迭/����Ʈ ����ϸ� ����
		System.out.println("��й�ȣ");		int pw = scan.nextInt();
		//��ü�� ����Ұ�
			//�ڷ��� ����ϴ� ������ ������ ��밡��
			// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� => �޼ҵ�
				//���ڿ� �񱳽� .equals()
				//���ڿ�1.equals(���ڿ�2) = ���ڿ�1�� ���ڿ�2�� ���� ��
		
		boolean �α��μ��� = false;
		//boolean : 1��Ʈ trueȤ�� false����
		
		if(id.equals("admin")) { //�Է��� id�� admin�̸� /  id�� ��ü�̱� ������ == �Ұ��� // ��ü �񱳽ÿ��� .equals() ���
			
			if(pw == 1234) { // �Է��� pw�� 1234�̸�
				System.out.println("�α��� ����");
				�α��μ��� = true; //id�� pw�� ��� �����ϸ� ������ ����
				}
			else { //�Է��� pw�� 1234rk �ƴϸ�
				System.out.println("[�˸�] ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			
		}
		
		else{ // �Է��� id�� admin�� �ƴϸ�
			System.out.println("[�˸�] ���̵� Ʋ�Ƚ��ϴ�.");
			}
		
		if(�α��μ��� == false) System.out.println("�α��� ����");
		 //�α��μ��� ������ false�̸� ���
		
		
		
		
		/* ����9
		[ �Է� ] : ����,����,���� �Է¹ޱ�
		[ ���� ]
			����� 90�� �̻��̸鼭 
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '���п��' ���
			����� 80�� �̻��̸鼭 
				�������� 90�� �̸� '�������' ���
				�������� 90�� �̸� '��������' ���
				�������� 90�� �̸� '�������' ���
			�׿� ����� 
	 */
		
		System.out.println("���� : ");		int ko = scan.nextInt();
		System.out.println("���� : ");		int en = scan.nextInt();
		System.out.println("���� : ");		int ma = scan.nextInt();
		
		int avg = (ko+en+ma)/3;
		
		if(avg>=90) {
			if(ko==100) 	System.out.println("���� ���");
			if(en==100) 	System.out.println("���� ���");
			if(ma==100)		System.out.println("���� ���");
		}
		
		else if (avg>=80) {
			if(ko>=90) 		System.out.println("���� ���");
			if(en>=80) 		System.out.println("���� ���");
			if(ma>=80) 		System.out.println("���� ���");
		}
		
		else { System.out.println("�����");}
		
	}//me
}//ce
