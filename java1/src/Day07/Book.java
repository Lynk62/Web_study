package Day07;

public class Book {
	//클래스 선언
	//1.필드
		String ISBN;		//ISBN [도서번호 = 식별용 ]
		String bname;		//도서명
		String bwriter;		//작가
		boolean brental;	//도서대여여부
		String mid;			//대여인 ID
	
		
	//2.생성자
		//1.빈 생성자[기본생성자] : 메소드호출용 (ctrl + spacebar)
		public Book() {}
		
		//2.풀생성자[모든필드받는생성자] : 도서등록
		public Book(String ISBN, String bname, String bwriter, boolean brental, String mid) {
			this.ISBN = ISBN;
			this.bname = bname;
			this.bwriter = bwriter;
			this.brental = brental;
			this.mid = mid;
		}
		
		
	//3.메소드
		//1.도서검색
		void 도서검색() {
			System.out.println("--------------[[ 도서검색 페이지 ]]-----------------");
		}//도서검색void end
		
		
		
		//2.도서목록
		void 도서목록() {
			System.out.println("--------------[[ 도서목록 페이지 ]]-----------------");
			System.out.println("ISBN\t도서명\t작가\t대여가능여부");
			
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null) {	//도서가 존재하면
					if(temp.brental) {	//해당도서의 도서대여여부가 true면
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여가능");
					}//if end
					
					else {	//해당 도서 대여여부가 false면
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여중");
						}//else end
				}//if end
			}//for end
			
		}//도서목록void end
		
		
		//3.도서대여
		void 도서대여(String loginid) {
			System.out.println("--------------[[ 도서대여 페이지 ]]-----------------");
			System.out.println("대여할 도서 ISBN : ");		String ISBN = Day07_5_BookAplication.scanner.next();
			
	
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					if(temp.brental) {
						System.out.println("알림)) 해당 도서를 대여합니다!");
						temp.brental = false;
						temp.mid = loginid;
						return;
					}//if end 
					else {
						System.out.println("알림)) 이미 대여된 도서입니다");
						return;
					}//대여불가능 else end
				}//if end
			}//for end
		}//도서대여void end
		
		
		//4.도서반납
		void 도서반납(String loginid) {
			System.out.println("--------------[[ 도서반납 페이지 ]]-----------------");
			도서대여목록(loginid);
			System.out.println("도서 ISBN");	String ISBN = Day07_5_BookAplication.scanner.next();
			
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					if(temp.mid.equals(loginid)) {
						if(temp.brental) {	//대여중이 아니면
							System.out.println("알림)) 현재 도서가 대여중이 아닙니다");
						}//대여중인지 아닌지 if end
						
						else {	//대여중이면
							System.out.println("알림)) 반납 완료");
							temp.brental = true;
							temp.mid = null;
							return;
						}//대여중인지아닌지 else end
					}//대여도서 맞음 if end
					else {
						System.out.println("알림)) 회원님이 대여한 도서가 아닙니다");
					}//대여도서아님 else end
				}//isbn이 일치하다면 if end
			}//for end
		}//도서반납void end
			
			//현재 로그인 한 회원이 대여중인 도서 목록 [내 도서 대여목록]
			void 도서대여목록(String loginid) {
				System.out.println("--------------[[ 도서목록 페이지 ]]-----------------");
				System.out.println("ISBN\t도서명\t작가\t대여가능여부");
				for(Book temp : Day07_5_BookAplication.books) {
					if(temp != null && temp.mid.equals(loginid)) {	//도서가 존재하면
						//도서가 존재하면서 대여id와 현재 로그인된 id와 같으면
						System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여중");
					}//if end
				}//for end
			}//도서대여목록void end
	
		
		
		
		
		
		//5.도서등록
		void 도서등록() {
			System.out.println("--------------{{ 도서등록 페이지 }}-----------------");
			
			//1.입력받기
			System.out.println("ISBN : ");	String ISBN = 	 Day07_5_BookAplication.scanner.next();
			System.out.println("도서명 : ");	String bname = 	 Day07_5_BookAplication.scanner.next();
			System.out.println("작가명 : ");	String bwriter = Day07_5_BookAplication.scanner.next();
			
			//ISBN 중복체크
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp != null && temp.ISBN.equals(ISBN)) {
					System.out.println("알림 )) 현재 사용중인 ISBN입니다 [등록실패]");
					return;//도서등록 메소드 종료 (등록 실패)
				}//if end
			}//for end
			
			//2. 객체화 [초기값 = 도서대여여부 = true / 대여회원id = null]
			Book book = new Book(ISBN, bname, bwriter, true, null);
			
			//3. 배열대입[넣기]
			int i = 0;
			for(Book temp : Day07_5_BookAplication.books) {
				if(temp == null) {
					Day07_5_BookAplication.books[i] = book;
					System.out.println("알림)) 도서 등록이 완료되었습니다!");
					return;
				}//if end
				i++;	//인덱스증가
			}//for end
		
		}//도서등록void end
		
		
		
		//6.도서삭제
		void 도서삭제() {
			System.out.println("--------------{{ 도서삭제 페이지 }}-----------------");
		}//도서삭제void end
	

}
