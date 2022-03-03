package Day03;

public class Day03_1 {//cs

	public static void main(String[] args) {//ms
		
		//1일차 : 입출력
		//2일차 : 저장, 계산(연산)
		//제어문
			//컴퓨터의 판단력을 키워주는 제어문 = > 경우의 수가 있을 때 사용
			//조건식이 true면 실행문 처리
			//형태
				//1. IF( 조건[true / false]) 실행문;
				//2. if( 조건식 ) 실행문;
				//	else 실행문 [거짓];
				//3. 실행문이 2줄 이상이면 { }로 묶음 처리
				//4. 경우의 수가 다수일 때 [조건이 다수일 때]
				//	if(조건1) { 실행문[참1];}
				//	else if (조건2) {실행문[참2];}
				// 	else if (조건3) {실행문[참3];}
				//	else if (조건4) {실행문[참4];}
				//	else if (조건5) {실행문[참5];}
				//	else { 실행문 [거짓];}
				//5. if 중첩
				// if(조건식) {
				//		if(조건식) { 실행문;}
				//	} else {
				//		if(조건식) {실행문;}
				//		else {실행문;}
				//	}
		
		//예제1
		if(3>1) System.out.println("3이 1보다 크다");
			//만약에 3이 1보다 크면 출력 / 아니면 출력 x
			//true이면 실행
		
		//예제2
		if(3>5) System.out.println("3이 5보다 크다");
			//만약에 3이 5보다 크면 출력 / 아니면 출력x
			//true이면 실행
		
		//예제3
		if(3>1) System.out.println("예3) 3이 1보다 크다");
		else System.out.println("예3_1) 3이 1보다 작다");
			//만약에 3이 1보다 크면 예3 출력
			//아니면 (3이 1보다 작으면) 예3_1 츨력
		
		//예제4
		if(3>2) { //ts [실행문이 2개 이상일 때]
			System.out.println("True");
			System.out.println("3이 2보다 크다");
		}//t
		else {	//false 실행문 시작
			System.out.println("false");
			System.out.println("3이 2보다 작다");
		}// fe
		
		//예제5
		if(3>5) System.out.println("3이 5보다 크다");
		else if(3>4) System.out.println("3이 4보다 크다");
		else if(3>3) System.out.println("3이 3보다 크다");
		else if(3>2) System.out.println("3이 2보다 크다");
		else System.out.println("true는 없다"); //실행x
		// 묶음 처리 1개 취급 결과 1개
		
		if(3>5) System.out.println("3이 5보다 크다");
		if(3>4) System.out.println("3이 4보다 크다");
		if(3>3) System.out.println("3이 3보다 크다");
		if(3>2) System.out.println("3이 2보다 크다");
		if(3<2) System.out.println("true는 없다");
		// 개별처리 결과 다수
		
		
		
		
	}//me
}//ce
