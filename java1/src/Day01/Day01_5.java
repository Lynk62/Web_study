package Day01;

import java.util.Scanner;

public class Day01_5 {//cs
	public static void main(String[] args) {
	//����1 : ȸ������ ǥ �ۼ�
		// 1. ���̵�, ��й�ȣ, ����, �̸��� �Է¹޾� ����
		// 2. ����ϱ�

		//1. �Է°�ü ����
		Scanner �Է°�ü = new Scanner(System.in);
		//2. �Է¹��� ������ �ȳ�				3. �Է¹޾� ����
		System.out.println("���̵� : ");	String ���̵� = �Է°�ü.next();
		System.out.println("��й�ȣ : ");	String ��й�ȣ = �Է°�ü.next();
		System.out.println("���� : ");	String ���� = �Է°�ü.next();
		System.out.println("�̸��� : ");	String �̸��� = �Է°�ü.next();
		
		//4. ���
		System.out.println("");
		System.out.println(">>>>>>>>>>ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ���>>>>>>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
		
		
		
		
	}

}//ce
