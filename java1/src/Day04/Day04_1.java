package Day04;

import java.util.Scanner;

public class Day04_1 {//cs

	public static void main(String[] args) {//ms
		
		//��� : if, switch
		//�ݺ��� : for, while[���ѷ���]
			//1.�ʱⰪ  2.���ǽ�  3.������[�ȳ����� ���ѷ���]  4.���๮[true�̸� ����]
			//whilw���� ����
			//		1.�ʱⰪ;
			//		while(2.���ǽ�) {
			//			4.���๮;
			//			3.������;
			//		}
		
		
		//for ����1)
		for(int i=1; i<=10; i++) {
			//i�� 1���� 10���ϱ��� 1�������ϸ鼭 ���๮ �ݺ� = �� 10�� ����
			System.out.print(i+" ");
		}//for end
		
		System.out.println("");
		
		
		//while ����1)
		int i = 1;//1.�ʱⰪ
		
		while(i<=10) {//2. ���ǽ� 
			System.out.print(i+" "); //4. ���๮
			i++;//3. ������
		}//while end
		
		System.out.println("");
		
		
		//for ����2) 1 ~ 100���� ������
		int sum=0;
		for(int j=1; j<=100; j++) {
			sum+=j;
		}//for end
		
		System.out.println("1���� 100���� ������ : "+sum);
		
		
		//while ����2) 1 ~ 100���� ������
		int j = 1;		//1. �ʱⰪ
		int sum2 = 0;
		
		while(j<=100) {	//2. ���ǽ�[true�̸� ���� / �ƴϸ� �������]
			sum2+=j;	//4. ���๮
			j++;		//3.������
		}//while end
		
		System.out.println("1���� 100���� ������ : "+sum2);
		
		
		// while ����3) ���ѷ���
		while(true) {	//���ǽ��� true�̸� ��� = ���ѷ���
			System.out.println("���ѷ���");
			Scanner scan = new Scanner(System.in);
			int exit = scan.nextInt();
			
			if(exit==3)
				break; 	// break���� ���� ����� �ݺ��� Ż��
		}
		
	}//me
}//ce
