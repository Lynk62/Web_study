package Day05;

import java.util.Scanner;

public class Day05_2_방문록 {//cs

	public static void main(String[] args) {//ms
		
		/*회원제 방문록 프로그램
		 * 1. 초기메뉴 [1. 회원가입 / 2. 로그인 ]
		 * 	- 회원가입 [아이디, 비밀번호, 이름]
		 * 	- 로그인 [아이디, 비밀번호 동일하면 로그인처리]
		 * 
		 * 2. 로그인시 메뉴 [ 1. 방문록쓰기 / 2. 로그아웃]
		 * 	- 방문록쓰기 [제목, 내용, 작성자(로그인된 아이디)]
			- 로그아웃 [초기메뉴로 돌아가기]*/
		
	//1. 준비
		Scanner scan = new Scanner(System.in);
		//회원 100명 [id, pw, name] 저장하는 배열
		String[][] memberlist = new String[100][3];	//100행 3열 = 회원당 1행 [1열=id][2열=pw][3열=name]
		//방문록 100갸 [title, contents, writer] 저장하는 배열
		String[][] boardlist = new String[100][3];	//100행 3열 = 게시글당 1행
		
	//2. 초기메뉴
		while(true) {//무한루프 [종료조건 : X]
			
			System.out.println("------[[ 회원제 방문록 ]]-------");
			System.out.println("-----------------------------");
			System.out.println("1.회원가입    2.로그인\n>>>선택 : ");	int ch = scan.nextInt();
			
			if(ch==1) {
				System.out.println("-----<< 회원 가입 >>-----");
				System.out.println("Member ID : ");			String id = scan.next();
				System.out.println("Member Password : ");	String pw = scan.next();
				System.out.println("Member Name : ");		String name = scan.next();
				//String 3개 변수 입력받아 memberlist 2차원 배열에 저장
					
					//1. 빈 공간[정수=0 / 실수=0.0 / 객체(문자열)=null]을 찾아서 저장 [만약에 빈공간이 없으면 회원 100초과]
					//2. 아이디 중복체크
				
				//아이디 중복체크 [기존 회원에 id와 동일하면 회원가입 불가]
				boolean idcheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						// ==null : 회원x / !=null : 회원o
						System.err.println("동일한 아이디가 존재합니다");
						idcheck = false; //저장x
						break;
					}//if end
				}//아이디 중복체크 for end
				
				
				//아이디, 비밀번호, 이름 저장부분
					if(idcheck) {//idcheck가 true인 경우에만 회원가입 처리
						for(int i=0; i<memberlist.length; i++) {
							if(memberlist[i][0]==null) {	//i번쨰 행에 id가 없으면 = 빈공간이면 저장
						
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								memberlist[i][2] = name;
								//i번째 각 열에 데이터 저장
						
								System.err.println("[알림] 회원가입 완료!");
								break;	//저장했으면 끝! [1번만 저장해야하기 때문]
							}//if end
						}//for end
					}//idcheck if end
				}//ch==1 if end
			
			//로그인
			else if(ch==2) {
				System.out.println("-----<< 로 그 인 페 이 지>>-----");
				System.out.println("Member ID : ");			String id = scan.next();
				System.out.println("Member Password : ");	String pw = scan.next();
				
				boolean logincheck = false; // 로그인 성공 초기값
				for(int i=0; i<memberlist.length; i++) {//배열내 데이터가 입력받은 id와 pw가 동일하면 로그인 처리
					
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						//i번째 행에 id와 pw가 입력받은 값과 equals 같으면 로그인 성공!
							//null은 객체가 아니기 때문에 equals가 불가능 >> ==
						System.err.println("로그인 성공!");
						logincheck = true;
	
						/////////////////////////////////////////////////////////////////////////////////////////////////////////
						while(true) {	// 로그인시 메뉴 무한 루프 [종료조건 : 로그아웃]
							System.out.println("--------------------------------");
							System.out.println("-----------[[ 방문록 ]]----------");
							System.out.println("번호\t작성자\t제목\t내용");
							
							//모든 방문록 출력
							for(int j=0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null) {	//게시물이 없는 인덱스는 제외
								System.out.printf("%d\t%s\t%s\t%s\n", i, memberlist[j][2], memberlist[j][0], memberlist[j][1] );
								}//if end
							}//방문록 출력 for end
							
							System.out.println("1.방문록남기기     2. 로그아웃 \n\n>>>선택 : ");	int ch2 = scan.nextInt();
							
							//1. 글쓰기 선택
							if(ch2==1) {
								System.out.println("-------글쓰기--------");
								System.out.println("title : "); 	String title = scan.next();
								System.out.println("content : ");	String content = scan.next();
								
								//배열내 공백 찾아서 저장
								for(int j=0; j<boardlist.length; j++) {
									if(boardlist[j][0] == null) {//j번쨰 인덱스 게시물이 공백이면
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id;	//로그인시 사용된 id를 대입
										System.out.println("방문록이 작성되었습니다.");
										break;
									}//if end
								}//for end
							}//ch1==1 if end
							
							//2. 로그아웃 선택
							else if(ch2==2){
								System.out.println("알림]] 로그아웃");
								break;  //가장 가까운 반복문 탈출
							}//ch2==2 if end
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							//3. 알수없는 번호
							else {
								System.err.println("알림 )) 알 수 없는 번호입니다.\n");
								}//else end
						}//회원메뉴 while end
						
					}//로그인 성공 if end
				}//for end
				
				//로그인 실패시
				if(logincheck == false) System.err.println("회원정보가 없거나 다릅니다");
			
			}//ch==2 if end
			
			else {
				System.err.println("알림 )) 알 수 없는 번호입니다.\n");
			}//else end
			
			
		}//초기메뉴 while end
	}//me
}//ce
