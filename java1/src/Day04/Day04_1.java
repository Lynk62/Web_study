package Day04;

import java.util.Scanner;

public class Day04_1 {//cs

	public static void main(String[] args) {//ms
		
		//제어문 : if, switch
		//반복문 : for, while[무한루프]
			//1.초기값  2.조건식  3.증감식[안넣으면 무한루프]  4.실행문[true이면 실행]
			//whilw문의 형태
			//		1.초기값;
			//		while(2.조건식) {
			//			4.실행문;
			//			3.증감식;
			//		}
		
		
		//for 예제1)
		for(int i=1; i<=10; i++) {
			//i는 1부터 10이하까지 1씩증가하면서 실행문 반복 = 총 10번 실행
			System.out.print(i+" ");
		}//for end
		
		System.out.println("");
		
		
		//while 예제1)
		int i = 1;//1.초기값
		
		while(i<=10) {//2. 조건식 
			System.out.print(i+" "); //4. 실행문
			i++;//3. 증감식
		}//while end
		
		System.out.println("");
		
		
		//for 예제2) 1 ~ 100까지 누적합
		int sum=0;
		for(int j=1; j<=100; j++) {
			sum+=j;
		}//for end
		
		System.out.println("1부터 100까지 누적합 : "+sum);
		
		
		//while 예제2) 1 ~ 100까지 누적합
		int j = 1;		//1. 초기값
		int sum2 = 0;
		
		while(j<=100) {	//2. 조건식[true이면 실행 / 아니면 실행안함]
			sum2+=j;	//4. 실행문
			j++;		//3.증감식
		}//while end
		
		System.out.println("1부터 100까지 누적합 : "+sum2);
		
		
		// while 예제3) 무한루프
		while(true) {	//조건식이 true이면 상수 = 무한루프
			System.out.println("무한루프");
			Scanner scan = new Scanner(System.in);
			int exit = scan.nextInt();
			
			if(exit==3)
				break; 	// break기준 가장 가까운 반복문 탈출
		}
		
	}//me
}//ce
