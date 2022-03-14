package Day09;

import java.util.Random;

public class 은행컨트롤러 {// cs
	//해당 클래스는 은행 관련 컨트롤러
	//M : 모델 [데이터]
	//V : 뷰 [입출력]
	//C : 모델[M]과 뷰[V] 연결 역할
	
	//뷰에서 요청하는 서비스[기능] 제공
		//1.계좌생성 [c]
	public String 계좌생성(String 비밀번호, String 계좌주, int 은행번호) {
		
		//1.객체 입력받은 값을 가져옴[인수]
		String 계좌번호 = null;	//선언만 [이유 : while 안에서 선언시 while 안에서 사용가능]
		while(true) {	//무한루프 [종료조건 : 난수가 중복이 없을경우]
			//계좌번호 자동생성
			Random random = new Random();	// 랜덤
			
			//4자리 생성
			int 난수 = random.nextInt(10000);	//0 ~ 9999사이
			계좌번호 = String.format("%04d", 난수);
							//문자형식 변경
								//%d 정수
								//%4d 정수 4자리 [만일 자릿수 없으면 공백처리]
									// 15 = 15
								//%04d 정수 4자리 [만일 자릿수 없으면 0처리]
									//15 = 0015
		
		//중복체크
			boolean 계좌번호중복 = false;
			for(은행 temp2 : Day09_06_은행계좌프로그램.계좌리스트) {
				if(temp2.get계좌번호().equals(계좌번호)) {	//기존 배열내 계좌번호와 동일
					계좌번호중복 = true;
				}
			}
			//a만일중복이 없으면
			if(계좌번호중복 == false) break;
		}	
		
		//2.객체화 [다수의 변수를 하나의 객체로 만들기]
		은행 temp = null;	//빈 객체 선언
		if(은행번호 == 1) {
			temp = new 국민은행("0", 비밀번호, 계좌주, 0);
		}//if end
		
		else if(은행번호 == 2) {
			temp = new 신한은행("0", 비밀번호, 계좌주, 0);
		}//else if end
		
		else if(은행번호 == 3) {
			temp = new 하나은행("0", 비밀번호, 계좌주, 0);
		}//else if end
		
		
		//3.배열에 저장 [DB]
		int i = 0;	//인덱스
		for(은행 temp2 : Day09_06_은행계좌프로그램.계좌리스트) {
			if(temp2 == null) {	//해당 temp2가 공백이면
				Day09_06_은행계좌프로그램.계좌리스트[i] = temp;	//공백 인덱스에 저장
				System.out.println("*** 계좌 등록 ***");
				return 계좌번호;
			}//if end
			i++;
		}//for end
		return null;	//false이면 실패했다는 의미
	}//계좌생성 boolean
		
		//2.입금[u]
	public boolean 입금(String 계좌번호, int 입금액) {
		int i = 0;
		for(은행 temp : Day09_06_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌번호().equals(계좌번호)) {
				
			}
		}
		return false;}//입금 boolean end
	
		//3.출금[u]
	public boolean 출금(String 계좌번호, String 비밀번호, int 출금액) {return false;}//출금 boolean end
	
		//4.이체[u]
	public boolean 이체() {
		return false;}//이체 boolean end
		
		//5.내계좌목록[r]
	public boolean 내계좌목록(String 계좌주) {
		//입력받은 계좌주의 계좌목록 만들어서 반환
		은행[] 내계좌목록 = new 은행[100];
		for(은행 temp : Day09_06_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.get계좌주().equals(계좌주)) {
				//해당 계좌내 계좌주와 인수의 계좌주와 동일하면
				//내계좌목록 배열내 빈공간을 찾아서 내계좌목록에 넣기
				int i = 0;
				for(은행 temp2 : 내계좌목록) {
					if(temp2 == null) {
						내계좌목록[i] = temp;	break;
					}
					i++;
				}
			}
		}
		return false;}//내계좌목록 boolean end
		
		//6.대출[u]
	public boolean 대출() {return false;}//대출 boolean end
	
}//ce
