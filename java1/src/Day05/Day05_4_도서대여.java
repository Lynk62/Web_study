package Day05;

import java.util.Scanner;

public class Day05_4_�����뿩 {//cs

	public static void main(String[] args) {//ms
		
		//1. �غ�
		Scanner scan = new Scanner(System.in);
		String[][]memberlist =	new String[100][2];
		String[][]booklist = new String[100][3];
		
		while(true) {
			
			System.out.println("-------[[ ȸ���� �����뿩 ]]------");
			System.out.println("1.ȸ������     2. �α���\n>>���� : ");	int ch = scan.nextInt();
			
			if(ch==1) {
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				//�ߺ� üũ
				boolean idcheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("������ ���̵� �����մϴ� [���Է�]");
						idcheck = false;
						break;
					}//if end
				}//�ߺ�üũ for end
				
				//�����Է�
				for(int i=0; i<memberlist.length; i++) {
					if(idcheck) {
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						
						System.out.println("ȸ������ �Ϸ�!");
						break;
					}//if end
				}//ȸ������ �����Է� for end
			}//ch==1 if end
			
			
			else if(ch==2) {
				System.out.println("-----[[ �α��� ]]------");
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				boolean logincheck = false;
				
				for(int i=0; i<memberlist.length; i++) {
					
					if(id.equals("admin")) {
						System.out.println("������ �α���");
						logincheck = true;
						
						while(true) {
							System.out.println("[[ ������ �޴� ]]");
							System.out.println("1.���� ���    2.���� ���    3.�α׾ƿ�\n>>���� : ");	int ch3 = scan.nextInt();
							
							if(ch3==1) {
								System.out.println("������ : ");		String title = scan.next();
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0] == null) {
										booklist[j][0] = title;
									}//if end
								}//for end
							}//1.������� if end
							
							else if(ch3==2) {
								System.out.println("-----[[ ������� ]]-----");
								System.out.println("��ȣ\t������");
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0]!=null) {
										System.out.printf("%d\t%s\n", i, booklist[j][0]);
									}//if end
								}//for end
							}//2.������� if end
							
							else if(ch3==3) {}//3.�α׾ƿ� if end
							
						}//������ while end
					}//admin if end
					
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("�α��� ����!");
						logincheck = true;
						
			////////////////////////////////////////////////////////////////////////////////
						
						while(true) {
							System.out.println("------[[ ���� �޴� ]]-------");
							System.out.println("1.���� �˻�    2.���� ���    3.���� �뿩    4.���� �ݳ�\n>>���� : ");	int ch2 = scan.nextInt();
							
							if(ch2==1) {	//���� �˻�
								System.out.println("������ : ");		String bookname = scan.next();
								
								for(int j=0; j<booklist.length; j++) {
									
								}//for end
							}//ch2==1 if end
							
							else if(ch2==2) {
								System.out.println("----[[ ���� ��� ]]-----");
								System.out.println("��ȣ\t������\t�뿩����\t�뿩��");
								
							}//ch2==2 if end
							
							else if(ch2==3) {}//ch2==3 if end
							
							else if(ch2==4) {}//ch2==4 if end
							
					
						}//�α��� �� ���ѷ��� while end	
					}//if end
				}//�α���üũ for end
			}//ch==2 if end
			
		}//while end
		

		
	}//me
}//ce
