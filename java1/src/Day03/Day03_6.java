package Day03;

import java.util.Scanner;

public class Day03_6 {//cs

	public static void main(String[] args) {//ms
		Scanner scan = new Scanner(System.in);
		
//		//별문제1 : 입력받은 수 만큼 * 출력
//		System.out.println("문제1) 별개수 : ");		int s1 = scan.nextInt();
//		for(int i=1; i<=s1; i++) {
//			//i는 1부터 입력받은 수까지 i는 1씩증가
//			System.out.print("*");
//		}
//		
//		
//		//별문제2 : 입력받은 수 만큼 * 출력 [5개마다 줄바꿈]
//		System.out.println("\n문제2) 별개수 : ");		int s2 = scan.nextInt();
//		for(int i=1; i<=s2; i++) {
//			//i는 1부터 입력받은 수까지 1씩증가하면서 실행문 반복
//			System.out.print("*");
//			//5개마다 줄바꿈 = 5배수마다 = 배수찾기
//			if(i%5==0) System.out.println(); //줄바꿈 처리
//		}
		
		
//		//별문제3 : 입력받은 줄 만큼 출력
//		System.out.println("문제3) 줄 개수 : ");		int line1 = scan.nextInt();
//		for(int i=1; i<=line1; i++) {
//			//i는 1부터 입력받은 줄 수 까지 1씩 증가
//			//1. 별찍기
//			for(int s=1; s<=i; s++) {
//				System.out.print("*");
//			}
//			//2. 줄바꿈
//			System.out.println("");
//		}
		//순서도
			//사용자가 3을 입력했을 때
			//i=1	i<=3 [true]
				//s=1	s<=i [true]	 *찍기 s++
				//s=2	s<=i [false] 반복문 종료
			//줄바꿈
			//i=2 i<=3 [true]
				//s=1	s<=i [true]	 *찍기 s++
				//s=2	s<=i [true]	 *찍기 s++
				//s=3	s<=i [false] 반복문 종료
			//줄바꿈
			//i=3 i<=3 [true]
				//s=1	s<=i [true]	 *찍기 s++
				//s=2	s<=i [true]	 *찍기 s++
				//s=3	s<=i [true]	 *찍기 s++
				//s=4	s<=i [false] 반복문 종료
			//줄바꿈
			//i=4 i<=3 [false] 반복문 종료
		
		
		
//		//별문제4 : 입력받은 줄 만큼 출력 [역방향]
//		System.out.println("문제4) 줄 개수 입력: ");		int line = scan.nextInt();
//		
//		for(int i=1; i<=line; i++) {
//		//1. 별찍기
//			for(int s=1; s<=(line-i+1); s++){
//				System.out.printf("*");
//			}
//			
//			//2. 줄바꿈
//			System.out.println("");
//		}
		
		
//		//별문제5 : 입력받은 줄 만큼 출력
//		System.out.println("문제5) 줄 개수 입력 : ");	int line = scan.nextInt();
//		
//		for(int i=1; i<=line; i++) {
//			//1. 공백찍기
//				for(int b=1; b<=(line-i); b++) {
//					System.out.print(" ");
//					}
//				//2.별찍기
//				for(int s=1; s<=i; s++) {
//					System.out.printf("*");
//				}
//				//3. 줄바꿈
//				System.out.println("");
//		}
//		
//	
//		//별문제6 : 입력받은 줄 만큼 출력
//		System.out.println("문제6) 줄 개수 입력 : ");	int line2 = scan.nextInt();
//		
//		for(int i=1; i<=line2; i++) {
//			//1. 공백찍기
//			for(int b2=1; b2<=i-1; b2++) {
//				System.out.print(" ");
//			}
//			//2. 별찍기
//			for(int s2=1; s2<=(line2-i+1);s2++) {
//				System.out.print("*");
//			}
//			//3. 줄바꿈
//			System.out.println("");
//		}
		
		
		//별문제7 : 입력받은 줄 만큼 출력
		System.out.println("문제7) 줄 개수 입력 : ");	int line3 = scan.nextInt();
		
		for(int i=1; i<=line3; i++) {
			//1. 공백찍기
			for(int b=1; b<=(line3-i); b++) {
				System.out.print(" ");
			}
			
			//2. 별찍기
			for(int s=1; s<=(i*2)-1; s++) {
				System.out.print("*");
			}
			
			//3. 줄바꿈
			System.out.println("");
		}
		
		
		//별문제8 : 입력받은 줄만큼 출력
		System.out.println("문제8) 줄 개수 입력 : ");	int line4 = scan.nextInt();
		
		for(int i=1; i<=line4; i++) {
			//1. 공백찍기
			for(int b=1; b<=(line4-i); b++) {
				System.out.print(" ");
			}
			
			//2. 숫자찍기
			for(int n=1; n<=(i*2)-1; n++) {
				System.out.print(i);
			}
			
			//3. 줄바꿈
			System.out.println("");
		}
		
		
		
		//별문제9 : 입력받은 줄만큼 출력
		System.out.println("문제9) 줄 개수 입력 : ");	int line5 = scan.nextInt();
		
		for(int i=1; i<=line5; i++) {
			//1. 공백찍기
			for(int b=1; b<=(line5-i); b++) {
				System.out.printf(" ");
			}
			
			//2. 별찍기
			for(int s=1; s<=(line5*2)-i; s++) {
				System.out.print("*");
			}
			//3. 줄바꿈
			System.out.println("");
		}
		
		
	}//me
}//ce
