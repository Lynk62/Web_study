package Day03;

import java.util.Scanner;

public class Day03_7 {//cs

	public static void main(String[] args) {//ms
		
		boolean run = true; // ���� ���� ����  / true = ���� false = ����
		
		int balance = 0; //���ݾ�[����ȿ� �ִ� �ݾ�] ����
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {//while(���ǽ�( { }:���ѷ���
			System.out.println("-----------------------------");
			System.out.println("1. ����  2. ���  3. �ܰ�  4. ����");
			System.out.println("------------------------------");
			System.out.println("����>");
			int ���� = scan.nextInt();
			if(����==1) {//���࿡ �Է°��� 1�̸�
				System.out.println("���ݾ� : ");	int ���� = scan.nextInt();
				//�Է¹��� ���ݾ��� ���忡 �ֱ�
				balance += ����;
			}
			
			else if(����==2){//���࿡ �Է°��� 2�̸�
				System.out.println("��ݾ� : ");	int ��� = scan.nextInt();
				//�Է¹��� ��ݾ��� ���忡�� ����
				//���࿡ ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺���
				//�ƴϸ� �ܾ� ��� ����
				if(���>balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else { balance -= ���; }
			}
			else if(����==3){//���࿡ �Է°��� 3�̸�
				System.out.println("�ܰ�: "+balance);
			}
			else if(����==4){//���࿡ �Է°��� 4�̸�
				break;//while Ż�� [���ѷ��� Ż��]
				
			}
			else {//�׿�
				System.out.println("�˸�) �� �� ���� ��ȣ�Դϴ�.");
			}
		}
		
	}//me
}//ce
