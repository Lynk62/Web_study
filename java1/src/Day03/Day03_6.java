package Day03;

import java.util.Scanner;

public class Day03_6 {//cs

	public static void main(String[] args) {//ms
		Scanner scan = new Scanner(System.in);
		
//		//������1 : �Է¹��� �� ��ŭ * ���
//		System.out.println("����1) ������ : ");		int s1 = scan.nextInt();
//		for(int i=1; i<=s1; i++) {
//			//i�� 1���� �Է¹��� ������ i�� 1������
//			System.out.print("*");
//		}
//		
//		
//		//������2 : �Է¹��� �� ��ŭ * ��� [5������ �ٹٲ�]
//		System.out.println("\n����2) ������ : ");		int s2 = scan.nextInt();
//		for(int i=1; i<=s2; i++) {
//			//i�� 1���� �Է¹��� ������ 1�������ϸ鼭 ���๮ �ݺ�
//			System.out.print("*");
//			//5������ �ٹٲ� = 5������� = ���ã��
//			if(i%5==0) System.out.println(); //�ٹٲ� ó��
//		}
		
		
//		//������3 : �Է¹��� �� ��ŭ ���
//		System.out.println("����3) �� ���� : ");		int line1 = scan.nextInt();
//		for(int i=1; i<=line1; i++) {
//			//i�� 1���� �Է¹��� �� �� ���� 1�� ����
//			//1. �����
//			for(int s=1; s<=i; s++) {
//				System.out.print("*");
//			}
//			//2. �ٹٲ�
//			System.out.println("");
//		}
		//������
			//����ڰ� 3�� �Է����� ��
			//i=1	i<=3 [true]
				//s=1	s<=i [true]	 *��� s++
				//s=2	s<=i [false] �ݺ��� ����
			//�ٹٲ�
			//i=2 i<=3 [true]
				//s=1	s<=i [true]	 *��� s++
				//s=2	s<=i [true]	 *��� s++
				//s=3	s<=i [false] �ݺ��� ����
			//�ٹٲ�
			//i=3 i<=3 [true]
				//s=1	s<=i [true]	 *��� s++
				//s=2	s<=i [true]	 *��� s++
				//s=3	s<=i [true]	 *��� s++
				//s=4	s<=i [false] �ݺ��� ����
			//�ٹٲ�
			//i=4 i<=3 [false] �ݺ��� ����
		
		
		
//		//������4 : �Է¹��� �� ��ŭ ��� [������]
//		System.out.println("����4) �� ���� �Է�: ");		int line = scan.nextInt();
//		
//		for(int i=1; i<=line; i++) {
//		//1. �����
//			for(int s=1; s<=(line-i+1); s++){
//				System.out.printf("*");
//			}
//			
//			//2. �ٹٲ�
//			System.out.println("");
//		}
		
		
//		//������5 : �Է¹��� �� ��ŭ ���
//		System.out.println("����5) �� ���� �Է� : ");	int line = scan.nextInt();
//		
//		for(int i=1; i<=line; i++) {
//			//1. �������
//				for(int b=1; b<=(line-i); b++) {
//					System.out.print(" ");
//					}
//				//2.�����
//				for(int s=1; s<=i; s++) {
//					System.out.printf("*");
//				}
//				//3. �ٹٲ�
//				System.out.println("");
//		}
//		
//	
//		//������6 : �Է¹��� �� ��ŭ ���
//		System.out.println("����6) �� ���� �Է� : ");	int line2 = scan.nextInt();
//		
//		for(int i=1; i<=line2; i++) {
//			//1. �������
//			for(int b2=1; b2<=i-1; b2++) {
//				System.out.print(" ");
//			}
//			//2. �����
//			for(int s2=1; s2<=(line2-i+1);s2++) {
//				System.out.print("*");
//			}
//			//3. �ٹٲ�
//			System.out.println("");
//		}
		
		
		//������7 : �Է¹��� �� ��ŭ ���
		System.out.println("����7) �� ���� �Է� : ");	int line3 = scan.nextInt();
		
		for(int i=1; i<=line3; i++) {
			//1. �������
			for(int b=1; b<=(line3-i); b++) {
				System.out.print(" ");
			}
			
			//2. �����
			for(int s=1; s<=(i*2)-1; s++) {
				System.out.print("*");
			}
			
			//3. �ٹٲ�
			System.out.println("");
		}
		
		
		//������8 : �Է¹��� �ٸ�ŭ ���
		System.out.println("����8) �� ���� �Է� : ");	int line4 = scan.nextInt();
		
		for(int i=1; i<=line4; i++) {
			//1. �������
			for(int b=1; b<=(line4-i); b++) {
				System.out.print(" ");
			}
			
			//2. �������
			for(int n=1; n<=(i*2)-1; n++) {
				System.out.print(i);
			}
			
			//3. �ٹٲ�
			System.out.println("");
		}
		
		
		
		//������9 : �Է¹��� �ٸ�ŭ ���
		System.out.println("����9) �� ���� �Է� : ");	int line5 = scan.nextInt();
		
		for(int i=1; i<=line5; i++) {
			//1. �������
			for(int b=1; b<=(line5-i); b++) {
				System.out.printf(" ");
			}
			
			//2. �����
			for(int s=1; s<=(line5*2)-i; s++) {
				System.out.print("*");
			}
			//3. �ٹٲ�
			System.out.println("");
		}
		
		
	}//me
}//ce
