// 확대축소 ctrl+shift+[+/-]
// 테마, 폰트변경 가능
// 주석처리 [코드 설명]

package Day02; //패키지 이름

public class Day02_1 { //c s
	//1. 모든 코드 작성은 클래스 { } 안에서 작성
	//2. 실행할 코드는 main 함수 { } 안에서 작성 [스레드 : 코드를 읽어주는 역할]
	//3. 자동완성 : 1~3글자까지 입력 후 ctrl + space => enter
	//4. { } 안에서 tab[들여쓰기]
	
	// 메모리 : 컴퓨터 저장하는 공간 [RAM] : 자원
	
	//변수
		//1. 데이터 1개 저장하는 메모리 공간 [저장 상자]
		//2. 변수 선언 	[자료형	변수명;]
		//3. 변수 초기화(처음값) [자료형 변수명 = 데이터;]
		//4. 변수 호출 [변수명]
	
	//용량 단위
		// 0,1 => 1비트
		// 01010101 = 8비트 => 1바이트
		// 1024 => KB => 1024KB => 1MB => 1024MB => 1GB
	
	// 자료형
		//1. 메모리를 아껴쓰자 [효율성]
			// boolean 	: 1비트		: 참(true), 거짓(false)
			// char 	: 2바이트	: 문자 1개 [ 아스키코드(c언어) / 유니코드(자바)]
			// byte 	: 1바이트	: 정수 +-128
			// short 	: 2바이트	: 정수 +-3만정도
			// int 		: 4바이트	: 정수 +-20억정도
			// long 	: 8바이트	: 정수 +-20억이상
			// float 	: 4바이트	: 실수(소수점) 8자리 표현가능
			// double	: 8바이트	: 실수(소수점) 18자리 표현가능
	
	public static void main(String[] args) {//m s
		
		//p.35 예제1
		
		int value = 10;				// 1. 변수 선언과 초기화
		// int : +-20억 정도의 데이터를 저장할 수 있는 상자
			// value[아무거나] : 상자의 이름 ( 개발자가 구분하기 위해 )
				// = : 오른쪽 데이터가 왼쪽으로 대입
		//* 정수 10을 int형 value 변수에 저장
		
		
		int result = value + 10;
		// int : +-20억 정도의 데이터를 저장할 수 있는 상자
			// result[아무거나] : 상자 이름
				// 변수호출(변수불러오기) + 10
				// 10 + 10 = 20 <= result
		
		System.out.println(result);
		
	}//m e
} //c e
