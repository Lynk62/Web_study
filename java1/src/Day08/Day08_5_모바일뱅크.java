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
		
		while(true) {
			System.out.println("--------------------- ���� �뿩 ���α׷� ---------------------");
			System.out.println("1.ȸ������    2.�α���    3.���̵�ã��    4.��й�ȣã�� \n ���� : ");
			int ch = scanner.nextInt();
			
			Member2 member = new Member2();//1~4 {}���� ����ϱ� ���� 
			
			if(ch==1) {
				boolean result = member.ȸ������();//1.ȸ������ �޼ҵ� ȣ��
				if(result == true) {
					System.out.println("[ �˸� ] ȸ������ ����!");
				}//true if end
				
				else System.out.println("[ �˸� ] ȸ������ ����");//false else end
			}//1.ȸ������ if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch==2) {
				String result = member.�α���();//2.�α��� �޼ҵ� ȣ��
				
				//1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
				if(result == null) {
					System.out.println("�˸�)) �α��� ����! ȸ�������� �����ϴ�");
				}//�α��ν��� if end
				
				else {
					//1.�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�˸�)) �ȳ��ϼ���!" + result + "��");
					bankmenu(result);	//�μ�1�� [�α��μ����� id] ����
				}//�Ϲݸ޴� ȣ�� else end
				
			}//2.�α��� if end
			
	//----------------------------------------------------------------------------------		
			
			else if(ch==3) {
				member.���̵�ã��();//3.���̵�ã�� �޼ҵ� ȣ��
				
			}//3.���̵�ã�� if end
			
			else if(ch==4) {
				member.��й�ȣã��();//4.��й�ȣã�� �޼ҵ� ȣ��
				
			}//4.��й�ȣã�� if end
			
			else {
				System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�");
			}//else end
			
		}//���� �ݺ� while end
	}//void end
	
	
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
//				String result = bank.�Ա�();//2.�Ա� �޼ҵ�
//				//1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
//				if(result == null) {
//					System.out.println("�˸�)) ��ü�� �Ϸ�Ǿ����ϴ�");
//				}//�α��ν��� if end
//				
//				else {
//					//1.�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
//					System.out.println("�˸�)) �ȳ��ϼ���!" + result + "��");
//					bankmenu(result);	//�μ�1�� [�α��μ����� id] ����
				}//�Ϲݸ޴� ȣ�� else end
				
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
//	}//����޴� void end
	
}//ce
