package Day06;

import java.util.Scanner;

public class Day06_6_비회원제게시판 {//cs
	/*게시판 [클래스]
	 * 0. 게시물 설계 = 클래스
	 * 		-필드 : 제목, 내용, 작성자, 비밀번호
	 * 		-생성자 : 사용유무 선택
	 * 
	 * 1. 첫 화면 [모든 게시물 (번호, 작성자, 제목) 출력]
	 * 2. 메뉴 [1.글쓰기 / 2.글보기 ]
	 * 		1.글쓰기 [제목, 내용, 작성자, 비밀번호] = 4개변수 = 객체화
	 * 		2.글보기 [해당 글번호를 입력받아 해당 글 상세페이지(번호, 작성자, 제목, 내용)표시]
	 * 			- 글번호는 배열에 저장되는 순서 [인덱스]
	 * 			- 글보기 메뉴
	 * 3. 글보기 메뉴 [1. 목록보기 / 2. 삭제 / 3.수정]
	 * 		1. 삭제 : 작성자와 비밀번호 입력받아 동일하면 삭제
	 * 		2. 수정 : 작성자와 비밀번호 입력받아 동일하면 제목과 내용만 수정*/
	
	
	public static void main(String[] args) {//ms
		
		//준비 [모든 {}안에서 사용되는 변수 선언]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
			// Board 객체를 100개 저장할 수 있는 1차원 배열
		
		//프로그램 실행
		while(true) {	//무한루프 [종료조건 : x]
			
			System.out.println("------[[ 커뮤니티 ]]------");
		
////////////////////////////////////////////////  모든게시물 조회  ////////////////////////////////////////////
			
			//모든 게시물 조회
			System.out.println("번호\t작성자\t제목");
			int index = 0;
			//배열내 모든 객체(게시물) 출력 반복문
			for(Board temp : boardlist) {
				
				if(temp != null) {
					//만약에 해당 board 객체가 내용물이 있으면 출력
				System.out.printf("%d\t%s\t%s\n", index, temp.writer, temp.title);
				}//내용물이 있으면 출력 if end
				
				index++;	//인덱스 증가
			}//모든 게시물 조회 for end
			
    ////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("1.글쓰기    2. 글보기");
			System.out.println(">> 선택 : ");		int ch = scanner.nextInt();

	//---------------------------------  1. 글쓰기  --------------------------------------------------
			
			if(ch==1) {	//1. 글쓰기
				//1. 4개 변수를 입력받는다
				System.out.println("-------- 글쓰기 페이지 ---------");
				System.out.println("title : ");			String title = scanner.next();
				System.out.println("content : ");		String content = scanner.next();
				System.out.println("writer : ");		String writer = scanner.next();
				System.out.println("password : ");		String password = scanner.next();
				
				//2. 4개 변수를 객체화 [객체를 만들어서 4개변수를 객체내 필드에 저장]
				Board board = new Board(title, content, writer, password);
							//4개 필드를 갖는 생성자 사용
				
				//3. 배열내 빈공간을 찾아서 빈공간에 객체 대입
				int i=0;
				for(Board temp : boardlist) {
					if(temp==null) {
						boardlist[i] = board; //해당 인덱스에 새로운 객체 저장
						break;	//한번 저장했으면 반복문 종료
					} //temp==null if end
					i++;
				}//빈공간찾기 for end
			}//1.글쓰기 if end
			
	//-------------------------------------- 글쓰기 end / 2. 글보기   ------------------------------------------------
			
			else if(ch==2) {	//2. 글보기
				//1. 글번호 입력 받는다
				System.out.println("게시글 번호(인덱스) 입력 : ");		int bno = scanner.nextInt(); //현 게시물의 인덱스 번호
				
				//2. 해당 번호 게시글 출력
				System.out.println("------------------------------게시물 상세페이지----------------");
				//반복문 사용 목적x = 출력할 위치[인덱스] 입력 받았기 때문에
				System.out.printf("작성자: %s  제목 : %s\n", boardlist[bno].writer, boardlist[bno].title);
				System.out.printf("내용 : %s\n", boardlist[bno].content);
				System.out.println("----------------------------------------------------------");
				System.out.println("1.목록보기(뒤로가기)    2.글삭제    3.글수정 \n>>선택 : ");
				
				
				int ch2 = scanner.nextInt();
				
				if(ch2==1) {/*반복문이 없기 떄문에 나갈 수 있음*/}//1.목록보기 if end
	
	//-------------------------------------- 글보기 end / 2. 글삭제   ------------------------------------------------
				
				else if(ch2==2) {
					//1. 비밀번호 입력받기
					System.out.println("알림)) 현 게시물 비밀번호 : ");	String password = scanner.next();
					//반복문x = 삭제할 인덱스 위치를 입력받았기 때문에 [검색 x]
					if(boardlist[bno].password.equals(password)) { //게시물객체내 비밀번호 == 입력한 비밀번호
						System.out.println("알림)) 삭제 성공!!");
						boardlist[bno] = null;	//해당 게시물에 null로 변경 // 삭제처리
						
							//삭제후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동
							//왜?? 만약에 해당코드가 없을 경우 배열내 사이사이 공백 발생
						for(int i=bno; i<boardlist.length; i++) {
										//배열길이 = 100  인덱스 0 ~ 99
							if(i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							//검색된 게시물의 인덱스부터 마지막 인덱스까지 1씩 증가
							//i가 마지막 인덱스이면 마지막 인덱스에서 null 대입
							
							else boardlist[i] = boardlist[i+1]; //삭제된 게시물 다음 게시물
								//만약에 2번 인덱스 삭제시
								//2번인덱스 = 3번인덱스 / 3번인덱스 = 4번인덱스 ~~ / 98인덱스 = 99인덱스
								//99인덱스 = null [100번 인덱스가 없기 때문에]
						}//for end
					}//if end
					
					else {
						System.out.println("알림)) 비밀번호가 다릅니다 [삭제실패]");
					}
					
				}//2.글삭제 if end
				
	//-------------------------------------- 글삭제 end / 3. 글수정   ------------------------------------------------
				
				else if(ch2==3) {
					//1.비밀번호 입력받기
					System.out.println("알림)) 현 게시물 비밀번호 : ");	String password = scanner.next();
					
					//2. bno 현게시물 (보고있는게시물)의 인덱스 객체내 비밀번호가 입력받은 비밀번호 동일하면
					if(boardlist[bno].password.equals(password)) {
						//해당 게시물의 제목과 내용을 새로 입력받아 현 게시물객체 내 제목과 내용에 대입
						System.out.println("수정할 제목 : ");		boardlist[bno].title = scanner.next();
						System.out.println("수정할 내용 : ");		boardlist[bno].content = scanner.next();
																//해당 게시물의 제목과 내용을 새로 입력받기
						System.out.println("알림)) 내용이 수정되었습니다");
					}//if end
					
					else {System.out.println("알림)) 비밀번호가 다릅니다 [수정실패]");}
				}//3.글수정 if end
	
	//-------------------------------------- 글삭제 end / 글수정   ------------------------------------------------
			}//2.글보기 if end 
			
			else{}//알수없음 else end
			
		}//프로그램 실행 while end
		
	}//me
}//ce
