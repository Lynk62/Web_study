package Day08;

import java.util.Scanner;

import Day07.Member;

public class Day08_5_����Ϲ�ũ {//cs
	
	// ����� ��ũ ���α׷�	[2�� ����]
		//�䱸����
		//ȸ���ֿ��� : 1.ȸ������ / 2.�α��� / 3.���̵�ã�� / 4.��й�ȣã��
		//�����ֿ��� : 1.���»��� / 2.�Ա� / 3.��� / 4.��ü / 5.���� / 6.���¸��
		//���� : ����, ����, ȸ��
	
	static Scanner scanner = new Scanner(System.in);
	static Member2[] members = new Member2[1000];
	static Bank2[] banks = new Bank2[1000];
	
	public static void main(String[] args) {//ms
		
		//ȸ���ֿ��� : 1.ȸ������ / 2.�α��� / 3.���̵�ã�� / 4.��й�ȣã��
		//�����ֿ��� : 1.���»��� / 2.�Ա� / 3.��� / 4.��ü / 5.���� / 6.���¸��
		Day08_5_����Ϲ�ũ application = new Day08_5_����Ϲ�ũ();
		application.menu();
	}//me
	
	
	
	//�ʱ�޴�
	void menu() {
		Member2 member = new Member2();
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. ȸ������ 2 . �α��� 3. ���̵�ã�� 4. ��й�ȣã�� :");
				int ch = scanner.nextInt();		

				if(ch==1) {
					boolean result = member.ȸ������();// ȸ������ �޼ҵ� ȣ��
					if(result) System.err.println("ȸ������ ����");
					else System.err.println("ȸ������ ����");
				}
				
				else if(ch==2) {// �α��� �޼ҵ� ȣ��
					String result = member.�α���();
					if(result == null) {
						System.out.println("������ ȸ�������� �����ϴ�.");
					}
					else {
						System.out.println("�ȳ��ϼ���."+result+"��"); 
					}
				}
				else if(ch==3) {member.���̵�ã��();}
					// ���̵� ã�� �޼ҵ� ȣ��	
				else if(ch==4) {member.��й�ȣã��();}
					// ��й�ȣ ã�� �޼ҵ� ȣ��
				else {System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");}
		}
	}//�޴� void end
	
	
	//����޴�
	void bankmenu(String loginid) {
		while(true) {
			System.out.println("--------------------- ���� �޴� ---------------------");
			System.out.println("1.���»���    2.�Ա�    3.���    4.��ü   5.����   6.���¸�� \n ���� : ");
			int ch1 = scanner.nextInt();
			
			Bank2 bank = new Bank2();//1~4 {}���� ����ϱ� ���� 
			
			if(ch1==1) {
				boolean result = bank.���»���();//1.ȸ������ �޼ҵ� ȣ��
				if(result == true) {
					System.out.println("[ �˸� ] ���»��� ����");
				}//true if end
				
				else System.out.println("[ �˸� ] ���»��� ����");//false else end
			}//1.���»��� if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch1==2) {
				bank.�Ա�();//2.�Ա� �޼ҵ�
			}//2.�Ա� if end
			
	//----------------------------------------------------------------------------------		
			
//			else if(ch1==3) {
//				bank.���();//3.��� �޼ҵ� ȣ��
//				
//			}//3.���̵�ã�� if end
//			
//			else if(ch1==4) {
//				bank.��ü();//4.��ü�޼ҵ� ȣ��
//				
//			}//4.��й�ȣã�� if end
//			
//			else {
//				System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�");
//			}//else end
			
		}//���� �ݺ� while end
	//1.���»���
	//2.�Ա�
	//��� / 4.��ü / 5.���� / 6.���¸��
	}//����޴� void end
	
}//ce
