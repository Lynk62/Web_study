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
				
				boolean logincheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("�α��� ����!");
					}//if end
				}//�α���üũ for end
			}//ch==2 if end
			
		}//while end
		

		
	}//me
}//ce
