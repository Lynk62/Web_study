package Day03;

import java.util.Scanner;

public class Day03_3 {//cs

	public static void main(String[] args) {//ms
		
		Scanner scan = new Scanner(System.in);
		
//		//문제6 점수 1개를 입력받아 점수가 90이상이면 합격 아니면 불합격
//		System.out.println("점수 1개 입력 : ");		int score = scan.nextInt();
//		
//		if(score>=90) System.out.println("합격");
//		else System.out.println("불합격");
//		
//		
//		//문제7 점수를 입력받아서 90이상 A / 80점 이상 B / 70점이상 C / 그외 재시험
//		System.out.println("점수 1개 입력 : ");		int 점수 = scan.nextInt();
//		
//		if(점수>=90) System.out.println("A");
//		else if (점수>=80)	System.out.println("B");
//		else if (점수>=70)	System.out.println("C");
//		else System.out.println("재시험");
		
		
		
		
		//문제8 로그인페이지
		//[입력] : 아이디와 비밀번호
		/*[조건] : 회원아이디 = admin
		 * 		비밀번호 1234 일 경우 로그인성공 / 아니면 로그인 실패 */
		
		System.out.println("아이디 : ");		String id = scan.next();
											// char 자료형 [문자1개 저장]
											// 자료형으로 문자열을 저장할 수 없다
												//1. String 클래스를 사용하면 문자열 저장가능
												//2. char 배열/리스트 사용하면 가능
		System.out.println("비밀번호");		int pw = scan.nextInt();
		//객체는 연산불가
			//자료형 사용하는 변수는 연산자 사용가능
			// 클래스 사용하는 객체는 연산자 사용 불가 => 메소드
				//문자열 비교시 .equals()
				//문자열1.equals(문자열2) = 문자열1과 문자열2를 비교할 때
		
		boolean 로그인성공 = false;
		//boolean : 1브트 true혹은 false저장
		
		if(id.equals("admin")) { //입력한 id가 admin이면 /  id는 객체이기 때문에 == 불가능 // 객체 비교시에는 .equals() 사용
			
			if(pw == 1234) { // 입력한 pw가 1234이면
				System.out.println("로그인 성공");
				로그인성공 = true; //id와 pw가 모두 동일하면 변수값 변경
				}
			else { //입력한 pw가 1234rk 아니면
				System.out.println("[알림] 비밀번호가 틀렸습니다.");
				}
			
		}
		
		else{ // 입력한 id가 admin이 아니면
			System.out.println("[알림] 아이디가 틀렸습니다.");
			}
		
		if(로그인성공 == false) System.out.println("로그인 실패");
		 //로그인성공 변수가 false이면 출력
		
		
		
		
		/* 문제9
		[ 입력 ] : 국어,영어,수학 입력받기
		[ 조건 ]
			평균이 90점 이상이면서 
				국어점수 100점 이면 '국어우수' 출력
				영어점수 100점 이면 '영어우수' 출력
				수학점수 100점 이면 '수학우수' 출력
			평균이 80점 이상이면서 
				국어점수 90점 이면 '국어장려' 출력
				영어점수 90점 이면 '영어정려' 출력
				수학점수 90점 이면 '수학장려' 출력
			그외 재시험 
	 */
		
		System.out.println("국어 : ");		int ko = scan.nextInt();
		System.out.println("영어 : ");		int en = scan.nextInt();
		System.out.println("수학 : ");		int ma = scan.nextInt();
		
		int avg = (ko+en+ma)/3;
		
		if(avg>=90) {
			if(ko==100) 	System.out.println("국어 우수");
			if(en==100) 	System.out.println("영어 우수");
			if(ma==100)		System.out.println("수학 우수");
		}
		
		else if (avg>=80) {
			if(ko>=90) 		System.out.println("국어 장려");
			if(en>=80) 		System.out.println("영어 장려");
			if(ma>=80) 		System.out.println("수학 장려");
		}
		
		else { System.out.println("재시험");}
		
	}//me
}//ce
