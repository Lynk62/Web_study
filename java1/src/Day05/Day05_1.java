package Day05;

public class Day05_1 {//cs

	public static void main(String[] args) {//ms
		
		//변수 : 하나의 데이터 저장
		//배열 : 동일한 자료형 데이터를 특정기준[인덱스]으로 나열
		//1차원배열	: 길이
			//형태 : 자료형[] 배열명 = new 자료형[길이];
			//int[] arr = new int[3];
			//int int int
			//int형 변수 3개 저장할 수 있는 배열
		
		//2차원배열	: 가로길이	세로길이
			//형태 : 자료형[][] 배열명 = new 자료형[가로=행][세로=열];
			//int[][]arr2 = new int[4][3];
			//int  int  int
			//int  int  int
			//int  int  int
			//int  int  int
			//int형 변수 12개 저장할 수 있는 배열
		
		//3차원배열	: 가로길이	세로길이	높이길이
			//형태 : 자료형[][][] 배열명 = new 자료형[행][열][높이];
		
		
		//예제1)
		int[]배열 = new int[3];	//int : 4바이트 * 3 = 12바이트 배열
			배열[0] = 80;	배열[1] = 90;	배열[2] = 100;
		//0번 인덱스에 80데이터 대입
		
		int[][]배열2 = new int[2][3];	//앞이 행(가로)이고 뒤가 열(세로) // 4바이트*2*3 = 24바이트
			배열2[0][0] = 80;	배열2[0][1] = 90;	배열2[0][2] = 100;
			배열2[1][0] = 40;	배열2[1][1] = 50;	배열2[1][2] = 60;
			
		System.out.println("1차원 배열 : " + 배열);
		System.out.println("2차원 배열 : " + 배열2);
		System.out.println("");
		System.out.println("1차원 배열 길이 : " + 배열.length); 		//배열의 길이
		System.out.println("2차원 배열 행 길이 : " + 배열2.length);		//2차원 배열의 행길이
		System.out.println("2차원 배열 열 길이 : " + 배열2[0].length);	//2차원 배열의 열길이
		
		//예제2) 반복문을 이용한 0~49까지 첫번째 행 저장 / 50~99까지 두번째 행 저장
		
		int[][]배열3 = new int[2][50];	//int : 4바이트 * 2 * 50 = 400바이트 배열 선언 = int 100개 저장
		
		for(int i=0; i<100; i++) {
			//i는 0부터 100미만까지(99까지) 1씩 증가 실행 반복처리 = 총 100번 실행
			
			if(i<50) 배열3[0][i] = i;	//i가 50미만이면 첫행
				//[0] : 첫번째행
				//[i] : i번째 열번호
			else 배열3[1][i-50] = i;		//i가 50이상이면 첫행
			//[0] : 첫번째행
			//[i] : i번째 열번호
		}//for end
		
		//출력 반복문
		
		for(int i=0; i<100; i++) {
			//첫번째 행 출력
			if(i<50)	System.out.printf("%3d", 배열3[0][i]);
									//%d : 정수		/ %2d : 2칸차지 자릿수 [단, 데이터가 없으면 공백처리]
									//%f : 실수		/ %3.2f : 세칸에 소수점 2자릿수
			
			//두번째 행 출력
			else	System.out.printf("%3d", 배열3[1][i-50]);
			
			if(i==49) System.out.println("");//줄바꿈
		}//출력반복 for end
		
	}//me
}//ce
