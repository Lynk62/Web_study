package Day07;

public class Calculator {
	//클래스 선언
	
	//1.필드
	
	//2.생성자
		//만약에 생성자가 없으면 선언이 1개도 없음
		//기본 생성자가 자동 추가됨
		//기본생성자 : 매개변수(인수)가 없다
	
	//3.메소드
	void powerOn() { //1.인수x 반환x
		System.out.println("전원을 켭니다");
	}//void end
	
	//1.void : 리턴 타입
		//void : 함수가 종료되면서 나가는 데이터가 없다
			//return 생략 가능 [단 실행부 중간에 사용시 함수종료]
	//2.powerOn : 메소드이름 [소문자 추천]
	//3.(매개변수[인수]) : 함수로 들어오는 데이터들
	//4.{실행코드} : 함수 실행부
	
	int plus(int x, int y) {	//인수o 반환o
			//x = 5, y = 6
		int result = x+y;
		return result; //함수를 호출했던 곳으로 이동
	}//int end
	//1.int : 리턴타입[함수가 종료되면서 int형 데이터가 반환]
		//5.return 반환값
			//return 타입이 int이기때문에 return뒤에는 무조건 int형 데이터
	//2.plus : 메소드이름[아무거나]
	//3.(int x, int y) : int형 2개 매개변수 받기
		//함수 호출시 함수로 들어오는 x와 y는 int형으로 받기
	//4. {실행부}
	
	
	double divide(int x, int y) { //인수o 반환x
//  리턴타입  메소드명 (인수1 , 인수2)  {실행코드; return에는 실수데이터}
		double result = (double)x / (double)y;
			//(자료형)변수명 : 강제형변환
				//int형변수 = double로 변경
					//나누기 후에 소수점 있을 수 있기 때문에
		return result; //결과값은 메소드 호출했던 곳으로 이동
	}//double end
	
	
	void powerOff() {	//인수x 반환x
// 리턴타입 메소드명 (인수없음){실행부;}
		System.out.println("전원을 끕니다");
	}
	
}
