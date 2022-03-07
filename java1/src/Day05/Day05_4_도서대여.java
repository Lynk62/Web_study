package Day05;

import java.util.Scanner;

public class Day05_4_도서대여 {//cs

	public static void main(String[] args) {//ms
		
		//1. 준비
		Scanner scan = new Scanner(System.in);
		String[][]memberlist =	new String[100][2];
		String[][]booklist = new String[100][3];
		
		while(true) {
			
			System.out.println("-------[[ 회원제 도서대여 ]]------");
			System.out.println("1.회원가입     2. 로그인\n>>선택 : ");	int ch = scan.nextInt();
			
			if(ch==1) {
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				//중복 체크
				boolean idcheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("동일한 아이디가 존재합니다 [재입력]");
						idcheck = false;
						break;
					}//if end
				}//중복체크 for end
				
				//정상입력
				for(int i=0; i<memberlist.length; i++) {
					if(idcheck) {
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						
						System.out.println("회원가입 완료!");
						break;
					}//if end
				}//회원가입 정상입력 for end
			}//ch==1 if end
			
			
			else if(ch==2) {
				System.out.println("-----[[ 로그인 ]]------");
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				boolean logincheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("로그인 성공!");
					}//if end
				}//로그인체크 for end
			}//ch==2 if end
			
		}//while end
		

		
	}//me
}//ce
