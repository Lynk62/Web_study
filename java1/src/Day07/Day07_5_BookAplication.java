package Day07;

import java.util.Scanner;

public class Day07_5_BookAplication {//cs
	// BookAplication Ŭ���� : ����� �����ڵ�
	// Book : ���� ���� �ڵ�
	// Member Ŭ���� : ȸ������ �ڵ�
	
	//�����뿩 console ���α׷� [Ŭ���� ����]
		//1.Ŭ���� ����
			//1.book
				//�ʵ�  : ISBN, ������, �۰�, �����뿩����, �뿩ȸ��
				//�޼ҵ� : 1.�����˻� / 2.������� / 3.�����뿩 / 4.�����ݳ�
	
			//2.member
				//�ʵ� : ��ȣ, ���̵�, ��й�ȣ, �̸�, ����ó
				//�޼ҵ� : 1.ȸ������ / 2.�α��� / 3.���̵�ã�� / 4.��й�ȣã�� / 5.�α׾ƿ�
				//�����ڸ޼ҵ� : 1.������� / 2.��������
	
		//2.ȭ�鼳��
			//1.�ʱ�޴� [1.ȸ������ / 2.�α��� / 3.���̵�ã�� / 4.��й�ȣã��]
			//2.�Ϲ�ȸ���޴� [1.�����˻� / 2.������� / 3.�����뿩 / 4.�����ݳ� / 5.�α׾ƿ� ]
			//3.�����ڸ޴� [1.������� / 2.������� / 3.�������� / 4.����(����) / 5�α׾ƿ�]
	
//////////////////////////////////////////////////////////////////////////////////////////	
	
	//main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		//�������� : { �������� } ��ȣ������ ����� ������ {}���� ������
			// ���� �ٸ� { } ������ ���� = ��������
		//static : �������� / ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ����� �޸� �ʱ�ȭ
			//������ �� ���� : ���α׷� ���������� ��� ���� ���Ǵ� �޸�[����]
	static Scanner scanner = new Scanner(System.in);	//static : ��� Ŭ�������� ���
	static Member[] members = new Member[100]; 			//��� Ŭ�������� ����ϴ� ȸ�� ���
	static Book[] books = new Book[100];
	
	//0. �ڵ带 �о��ִ� ���� �޼ҵ� [������]
	public static void main(String[] args) {//ms
		
		//�޼ҵ� ȣ��
		//1. ����ȣ��
			// menu(); //����ȣ�� �Ұ���
			//static : �޸� �켱�Ҵ� �̱⶧���� static �� �޼ҵ�, �ʵ�x
			//main �޼ҵ�� static �޼ҵ� �̱⋚���� static �޼ҵ常 ����ȣ�� ����
		//2. �ܺ�ȣ��
			//1.��ü����(�޸��Ҵ�) = �޼ҵ�ȣ��
			Day07_5_BookAplication application = new Day07_5_BookAplication();
			application.menu();
	}//me
	
////////////////////////////////////////////////////////////////////////////////////////////////
	
	//1. �ʱ�޴� �޼ҵ�
	void menu() {
		
		while(true) {
			System.out.println("--------------------- ���� �뿩 ���α׷� ---------------------");
			System.out.println("1.ȸ������    2.�α���    3.���̵�ã��    4.��й�ȣã�� \n ���� : ");
			int ch = scanner.nextInt();
			
			Member member = new Member();//1~4 {}���� ����ϱ� ���� 
			
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
				
				else if(result.equals("admin")) {
					//2.������ �޴� �޼ҵ� ȣ��
					System.out.println("�˸�)) �ȳ��ϼ���!" + result + "��");
					adminmenu();	//���� �޼ҵ� ȣ��
				}// �����ڸ޴�ȣ�� if end
				
				else {
					//1.�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�˸�)) �ȳ��ϼ���!" + result + "��");
					membermenu(result);	//�μ�1�� [�α��μ����� id] ����
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
	
////////////////////////////////////////////////////////////////////////////////////////////////
	
	//2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu(String loginid) {	// �μ��� �������� �ƹ��ų� / �ڷ����� ����
		while(true) {
			System.out.println("------------- ȸ�� �޴� --------------");
			System.out.println("1.�����˻�   2.�������   3.�����뿩   4.�����ݳ�   5.�α׾ƿ�\n ���� : ");
			
			int ch = scanner.nextInt();
			Book book = new Book();	//������� ��ü = �޼ҵ� ȣ���
			
			if(ch==1) {
				book.�����˻�();
			}//ch==1 if end
			
			else if(ch==2) {
				book.�������();
			}//ch==2 if end
			
			else if(ch==3) {
				book.�����뿩(loginid);
			}//ch==3 if end
			
			else if(ch==4) {
				book.�����ݳ�(loginid);
			}//ch==4 if end
			
			else if(ch==5) {
				return;	//�Ϲ�ȸ�� �޼ҵ� ���� [�α׾ƿ�]
			}//ch==5 if end
			
			else {
				System.out.println("�˸�)) �� �� ���� �Է��Դϴ�");
				}//else end
			
		}//while end
	}//membermenu void end
	
//------------------------------------------------------------------------------------------------------
	
	//3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while(true) {
			System.out.println("------------- ������ �޴� --------------");
			System.out.println("1.�������   2.�������   3.��������   4.�α׾ƿ�\n ���� : ");
			
			Book book = new Book();
			int ch = scanner.nextInt();
			
			if(ch==1) {
				book.�������();
			}//ch==1 if end
			
			else if(ch==2) {
				book.�������();
			}//ch==2 if end
			
			else if(ch==3) {
				book.��������();
			}//ch==3 if end
			
			else if(ch==4) {
				return;	//�����ڸ޴� �޼ҵ� ���� [�α׾ƿ�]
			}//ch==4 if end
			
			else {
				System.out.println("�˸�)) �� �� ���� �Է��Դϴ�");
				}//else end
			
		}//while end
	}//adminmenu void end
	
}//ce
