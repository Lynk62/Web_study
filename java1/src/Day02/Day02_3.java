package Day02;

import java.util.Scanner;

public class Day02_3 {//cs

	public static void main(String[] args) {//ms
		
		//����1 : �޿� ���
		//[�Է�����]	�⺻��, ����
		//[����]		�Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻��10%]
		//[�������]	�Ǽ��ɾ� ���
		
		//�Է� => ���� => ��� => ���
		//1. �Է°�ü �����. [�ڷ��� = �ҹ��� / Ŭ������ = �빮��]
		Scanner scanner = new Scanner(System.in);
		
		//2. �Է¹��� ���� ������ �����Ѵ� [�Է°�ü�� �Է� ���������� ���� �����Ͱ� �����]
		System.out.println("�⺻�� �Է� :");	int �⺻�� = scanner.nextInt();
		//�Է���ü��.nextInt(); : ������ ��������
		//�Է°�ü��.next(); : ���ڿ� ��������
		System.out.println("���� �Է� : ");	int ���� = scanner.nextInt();
		
		//3. ���� �����Ѵ�
		int ���� = (int)(�⺻��*0.1);	  //int*double �� int������ ��ȯ
		int �Ǽ��ɾ� = �⺻�� + ���� - ����; //100% = 1 / 10% = 0.1
		
		//4. ����Ѵ�
		System.out.println("ȸ������ �Ǽ��ɾ� : " + �Ǽ��ɾ�);
							// ���ڿ� + ������(������ ������ ȣ��)
		

		
	}//me
}//ce
