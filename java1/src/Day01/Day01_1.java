// 확대 / 축소 : ctrl + shift + (+/-)

// <= 주석처리 (컴파일[실행] 제외)
	// 1. // 슬래시 2번 : 한줄 주석
	// 2. /* 여러줄 주석 */

// tab키 = 들여쓰기 [5칸 이동]

package Day01; // 패키지명 [소스파일들의 폴더]

public class Day01_1 { //class 시작
	
	//public : 접근제한자
		//class : 클래스 선언
			// Day01_1 : 클래스 이름
	
	// 모든 곳에서 사용하는 'Day01_1'이라는 이름을 갖는 클래스 선언
		// { = 시작 / } = 끝
	
	// 1. class 안에서 코드 작성한다. [class 밖에서 작성 불가]
	// 2. 실행코드 main 함수 
		// 1. main 입력 후
		// 2. ctrl + space 누르면 자동완성 => 엔터
	
	public static void main(String[] args) { //main 시작
		
		// public : 접근 제한자
			// static : 정적
				// void : 반환타임 [돌려주는 값] 없다
					// main 함수 : 메인 스레드(코드를 읽어주는 흐름)를 가지고 있는 함수 [필수]
		
		// main함수 {} 안에 작성된 코드는 실행된다. 
		//syso => ctrl + space : 출력 자동완성
		System.out.println("java 출력"); // 고급언어 [사람 이해 가능 언어]
		//컴파일 단축키 ctrl + F11
		
	} //main 끝
	
} // class의 끝
