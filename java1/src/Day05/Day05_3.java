package Day05;

import java.util.Scanner;

public class Day05_3 {//cs

	public static void main(String[] args) {//ms
		
		//p.181
//		//����7)
//		int max = 0;				//�ִ� �����ϴ� ����
//		int [] array = {1,5,3,8,2};	//����+�ʱⰪ ����
//		
//		for(int i=0; i<array.length; i++) {
//			//i�� 0���� �迭�� ����(5)���� 1�� ���� ���� �ݺ� ó��
//			if(max<array[i]) {
//				max = array[i];
//			}//if end
//			//���࿡ max���� i��° �ε����� ���� �� ũ�� max�� i��° �� ����
//		}//for end
//		System.out.println("max : " + max);
		
		
//		//����8)
//		int[][] array2 = {
//				{95,86},			//1��
//				{83,92,96},			//2��
//				{78,83,93,87,88}	//3��
//		};
//		
//		int sum = 0;		//�հ�
//		double avg = 0.0;	//���
//		int count = 0;
//		
//		//2���� �迭�� ��� ������ ȣ��
//		//Ǯ��
//		for(int �� = 0; ��<array2.length; ��++) {
//			//���� 0���� �迭�� �����[3]�̸����� 1�� ����
//			for(int �� = 0; ��<array2[��].length; ��++) {
//				//���� 0��Ÿ ������ ������ [2,3,5]�̸����� 1�� ����
//				sum+=array2[��][��];
//			}//��for end
//			count += array2[��].length;	//�������� �����հ�
//			
//		}//�� for end
//		
//		avg = (double)sum/count;
//		
//		System.out.println("�հ� : " + sum);
//		System.out.println("��� : " + avg);
		
		
		
		//����9)
		boolean run = true;	// while�� ����ġ ����
		
		int studentNum = 0;	// �л��� ����
		int[] scores = null;	// ���� �迭 / �޸� �Ҵ�x
		
		Scanner scan = new Scanner(System.in);	//�Է°�ü
		
		while(run) {	//���ѷ��� [5���Է½� ����]
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.println(">> ���� : ");		int selectNo = scan.nextInt();
			
			if(selectNo==1) {	//�л� ��
				System.out.println("�л� �� >> : ");	studentNum = scan.nextInt();
				//�Է¹��� �л� ����ŭ �迭 ���� ����
				scores = new int[studentNum];
			}//selectNo==1 if end
			
			else if(selectNo==2) {	//�л� ���� �Է��ϱ�
				for(int i=0; i<scores.length; i++) {	//�迭�� ��� �ε��� ��ŭ �ݺ� ó��
					System.out.printf("scores[%d] : \n", i);
					scores[i] = scan.nextInt();	//�Է¹޾� i��° �ε����� ����
				}//for end
			}//selectNo==2 if end
			
			else if(selectNo==3) {	//�л� ���� ����ϱ�
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);	//i��° �ε��� ���
				}//for end
			}//selectNo==3 if end
			
			else if(selectNo==4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0; i<scores.length; i++) {
					
					//�ְ����� ���ϱ�
					if(max<scores[i]) {
						max = scores[i];	//i��° �ε����� ������ ����
					}//if end
					
					//�����հ�
					sum += scores[i];
				}//for end
				
				//������� ���ϱ�
				avg = (double)sum / scores.length;
				
				System.out.println("�ְ����� : " + max);
				System.out.println("������� : " + avg);
			}//selectNo==4 if end
			
			else if(selectNo==5) {
				run = false;	//break;
			}//selectNo==5 if end
		}//while end
		
		System.out.println("���α׷� ����");
		
	}//me
}//ce
