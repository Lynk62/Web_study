package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {//cs

	public static void main(String[] args) {//ms
		
		/*�ζ��Ǻ���
		 * 1. ����� 6�� �� �Է¹ޱ� => �迭����
		 * 		- 1 ~ 45 ���� ���� �Է¹ޱ� �ƴϸ� ���Է�
		 * 		- �ߺ�x ���Է�
		 * 2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� => �迭����
		 * 		- 1 ~ 45 ����
		 * 		- �ߺ� x
		 * 3. ����� ��÷��ȣ�� ��ǻ�� ��÷��ȣ ���� ���� ����
		 */
		
		//�غ� ����
		int[] num = new int[6]; //����� ���� ��ȣ
		int[] ��÷ = new int[6]; // ��ǻ�� ���� ��ȣ
		Scanner scan = new Scanner(System.in);
		
		//1. ����ڿ��� �Է¹ޱ�
		for(int i=0; i<6; i++) {
			//i�� 1���� 6���� 1�� ���� �ݺ� = 6ȸ �ݺ�
			System.out.printf("1���� 45���� �Է� : ");
			int ��ȣ = scan.nextInt();
			boolean pass = true; //����Ǵ� ���� ����
			
			//����1 : ��ȿ�� �˻�
			if(��ȣ<1 || ��ȣ>45) {
				System.err.println("�˸�)) ������ �� ���� ��ȣ�Դϴ�. [���Է�]");
				//1���� �۰ų� 45���� ũ�� ������ �� ���� ��ȣ �Է½� ���Է�
				i--; // ���� i�� �����Է�x
				pass = false;
			}//�Է¹ޱ� ����1 for end
			
			//����2 : �ߺ�üũ
				//1. �迭�� ��� �ε��� ȣ��
				//2. �Է¹��� ���� ������ ��
				
			for(int j=0; j<6; j++) {
				if(��ȣ==num[j]) {
					//2. �Է¹��� ���� j��° �ε������� ������ ��
					System.err.println("�̹� �Է��� ��ȣ �Դϴ� [���Է�]");
					i--; //���� i�� �����Է�x = ���� ī��Ʈ ����
					pass = false;
				}//if end
			}//�Է¹ޱ� ����2 for end
			
			//�����Է��̸� �迭�� �����ϱ�
			if(pass==true) num[i] = ��ȣ;
			
		}//�Է¹ޱ� for end
		
		System.out.println("����ڰ� ������ ��ȣ : ");
		//����� �迭�� ��� �ε��� ���
		for(int temp : num) {
			System.out.printf(temp+"\t");
		}
		
		System.out.println("\n");
		
		//2. ��ǻ�� ���� ����
		for(int i=0; i<6; i++) {
			
			Random random = new Random();		//1. ������ü
			int ���� = random.nextInt(45)+1;		//2. ������ int������ ��������
									//random.nextInt(); : +-20�� ������ ���� �߻�
									//random.nextInt(��) : 0 ~ �� ������ ���� �߻�
			//����1 : �ߺ�üũ
			boolean ��� = true;
			for(int temp : ��÷) {
				if(����==temp) {
					i--;		// �ߺ��� ���� ��� ���� i����
					��� = false;
				}//if end
			}//����1 for end
			if(���) ��÷[i] = ����;
		}//�������� for end
		
		System.out.println("��÷��ȣ : ");
		//����� �迭�� ��� �ε��� ���
		for(int temp : ��÷) {
			System.out.printf(temp+"\t");
		}
		
		
		//3. �� = �� �迭�� ������ �� ã��
		
		//���1
		int ���� = 0;
//		for(int i=0; i<num.length; i++) {
//			//i �� ������
//			for(int j=0; j<��÷.length; j++) {
//				//j �� ���
//				if(num[i] == ��÷[j]) {
//					//����� �迭 �� i��° �ε�����
//					//��ǻ�� �迭 �� j��° �ε����� ���� �����ϸ�
//					����++;
//				}//if end
//			}// j for end
//		}//i for end
		
		//���2
		for(int ���� : num) {
			//num �迭 �� �ϳ��� ���ؿ� ����
			for(int �� : ��÷) {
				//��÷ �迭 �� �ϳ��� �񱳿� ����
				if(���� == ��) {
					����++;
				}
			}
		}
		
		System.out.println("������ �� : " + ����);
		
	}//me
}//ce
