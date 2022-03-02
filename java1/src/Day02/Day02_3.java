package Day02;

import java.util.Scanner;

public class Day02_3 {//cs

	public static void main(String[] args) {//ms
		
		//문제1 : 급여 계산
		//[입력조건]	기본급, 수당
		//[조건]		실수령액 = 기본급 + 수당 - 세금[기본급10%]
		//[출력조건]	실수령액 출력
		
		//입력 => 저장 => 계산 => 출력
		//1. 입력객체 만든다. [자료형 = 소문자 / 클래스명 = 대문자]
		Scanner scanner = new Scanner(System.in);
		
		//2. 입력받은 값을 변수에 저장한다 [입력객체는 입력 받을때마다 기존 데이터가 사라짐]
		System.out.println("기본급 입력 :");	int 기본급 = scanner.nextInt();
		//입려객체명.nextInt(); : 데이터 가져오기
		//입력객체명.next(); : 문자열 가져오기
		System.out.println("수당 입력 : ");	int 수당 = scanner.nextInt();
		
		//3. 변수 연산한다
		int 세금 = (int)(기본급*0.1);	  //int*double 후 int형으로 변환
		int 실수령액 = 기본급 + 수당 - 세금; //100% = 1 / 10% = 0.1
		
		//4. 출력한다
		System.out.println("회원님의 실수령액 : " + 실수령액);
							// 문자열 + 변수명(변수내 데이터 호출)
		

		
	}//me
}//ce
