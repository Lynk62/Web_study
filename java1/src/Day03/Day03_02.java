package Day03;

import java.util.Scanner;

public class Day03_02 {//cs

	public static void main(String[] args) {//ms
		
		//�Է°�ü = { } �� 1�� ����
		Scanner scanner = new Scanner(System.in);
		
		
//		//���� 1 : 2���� ������ �Է¹޾Ƽ� �� ū �� ���
//		System.out.println("ù��° ���� �Է� : ");	int n1 = scanner.nextInt(); //int�� ���� �����ϰ� �Է¹��� �����͸� ������ �����ͼ� ����
//		System.out.println("�ι�° ���� �Է� : ");	int n2 = scanner.nextInt();
//		
//		//����
//		if(n1>n2) 		System.out.println("�� ū�� : "+n1);
//		//���࿡ �Է¹��� n1������ n2�������� ũ�� ���� / �ƴϸ� ���� ����
//		else if(n1<n2)	System.out.println("�� ū�� : "+n2);
//		//���࿡ �Է¹��� n2������ n1�������� ũ�� ���� / �ƴϸ� ���� ����
//		else			System.out.println("����");
//		//������[�� ��] ����
//		
//		
//		
//		//����2 : 3���� ������ �Է¹޾Ƽ� ���� ū �� ���
//		System.out.println("ù��° ���� �Է� : ");	int n3 = scanner.nextInt(); //������ �ߺ� x
//		System.out.println("�ι�° ���� �Է� : ");	int n4 = scanner.nextInt();
//		System.out.println("����° ���� �Է� : ");	int n5 = scanner.nextInt();
//		
//		int max = n3; // ���� ū ���� �ӽ÷� ����
//			//max�� ù��° �� �־�α�
//		if(max<n4) { max = n4; }	//���࿡ max���� n4�� �� ũ�� max ��ü
//		if(max<n5) { max = n5;}		//���࿡ max���� n5�� �� ũ�� max ��ü
//		System.out.println("���� ū �� : "+max);
//		
//		
//		
//		//����3 : 4���� ������ �Է¹޾� ���� ū�� ���
//		System.out.println("ù��° ���� �Է� : ");	int n6 = scanner.nextInt(); //������ �ߺ� x
//		System.out.println("�ι�° ���� �Է� : ");	int n7 = scanner.nextInt();
//		System.out.println("����° ���� �Է� : ");	int n8 = scanner.nextInt();
//		System.out.println("�׹�° ���� �Է� : ");	int n9 = scanner.nextInt();
//		
//		int max2 = n6;
//		
//		if(max2<n7) { max = n7;}
//		if(max2<n8) { max = n8;}
//		if(max2<n9) { max = n9;}
//		System.out.println("���� ū �� : "+max2);
		
		
		//����4 : 3���� ������ �Է¹޾Ƽ� �������� ���� [���� ����]
		System.out.println("ù��° ���� �Է� : ");	int n1 = scanner.nextInt();
		System.out.println("�ι�° ���� �Է� : ");	int n2 = scanner.nextInt();
		System.out.println("����° ���� �Է� : ");	int n3 = scanner.nextInt();
		
		if(n1>n2){	// > : �������� / < : ��������
			// ��ü [���� = �� �� ������ ������ ��ȯ���]
			int temp = n1;	//�ӽú��� = ����1
			n1 = n2;		//����1 = ����2
			n2 = temp;		//����2 = �ӽú���
		}
		if(n1>n3 ) {int temp = n1;	n1 = n3;	n3 = temp;
		}
		if(n2>n3) {int temp = n2;	n2 = n3;n3 = temp;}
		System.out.println("�Է��� �� �������� : "+n1+" "+n2+" "+n3);
		System.out.printf("�Է��� �� �������� : %d %d %d\n", n1, n2, n3);
		
		
		//����5 : 4���� ������ �Է¹޾Ƽ� �������� ����
		System.out.println("ù��° ���� �Է� : ");	int n4 = scanner.nextInt();
		System.out.println("�ι�° ���� �Է� : ");	int n5 = scanner.nextInt();
		System.out.println("����° ���� �Է� : ");	int n6 = scanner.nextInt();
		System.out.println("�׹�° ���� �Է� : ");	int n7 = scanner.nextInt();
		
		//ù��° �� �������� ��
		if(n4>n5) { int temp2 = n4;		n4 = n5;	n5 = temp2;}
		if(n4>n6) { int temp2 = n4;		n4 = n6;	n6 = temp2;}
		if(n4>n7) { int temp2 = n4;		n4 = n7;	n7 = temp2;}
		
		//�ι�° �� �������� ��
		if(n5>n6) {	int temp2 = n5; 	n5 = n6;	n6 = temp2;}
		if(n5>n7) { int temp2 = n5;		n5 = n7;	n7 = temp2;}
		
		//����° �� �������� ��
		if(n6>n7) { int temp2 = n6;		n6 = n7;	n7 = temp2;}
		//�׹�° �� �������� ��x
		System.out.printf("�Է��� �� �������� : %d %d %d %d", n4, n5, n6, n7);
		
	}//me
}//ce
