package Day03;

import java.util.Scanner;

public class Day03_02 {//cs

	public static void main(String[] args) {//ms
		
		//입력객체 = { } 당 1번 선언
		Scanner scanner = new Scanner(System.in);
		
		
//		//문제 1 : 2개의 정수를 입력받아서 더 큰 수 출력
//		System.out.println("첫번째 정수 입력 : ");	int n1 = scanner.nextInt(); //int형 변수 선언하고 입력받은 데이터를 정수로 가져와서 대입
//		System.out.println("두번째 정수 입력 : ");	int n2 = scanner.nextInt();
//		
//		//제어
//		if(n1>n2) 		System.out.println("더 큰수 : "+n1);
//		//만약에 입력받은 n1변수가 n2변수보다 크면 실행 / 아니면 다음 조건
//		else if(n1<n2)	System.out.println("더 큰수 : "+n2);
//		//만약에 입력받은 n2변수가 n1변수보다 크면 실행 / 아니면 다음 조건
//		else			System.out.println("같다");
//		//나머지[그 외] 실행
//		
//		
//		
//		//문제2 : 3개의 정수를 입력받아서 가장 큰 수 출력
//		System.out.println("첫번째 정수 입력 : ");	int n3 = scanner.nextInt(); //변수명 중복 x
//		System.out.println("두번째 정수 입력 : ");	int n4 = scanner.nextInt();
//		System.out.println("세번째 정수 입력 : ");	int n5 = scanner.nextInt();
//		
//		int max = n3; // 가장 큰 수는 임시로 저장
//			//max에 첫번째 값 넣어두기
//		if(max<n4) { max = n4; }	//만약에 max보다 n4가 더 크면 max 교체
//		if(max<n5) { max = n5;}		//만약에 max보다 n5가 더 크면 max 교체
//		System.out.println("가장 큰 수 : "+max);
//		
//		
//		
//		//문제3 : 4개의 정수를 입력받아 가장 큰수 출력
//		System.out.println("첫번째 정수 입력 : ");	int n6 = scanner.nextInt(); //변수명 중복 x
//		System.out.println("두번째 정수 입력 : ");	int n7 = scanner.nextInt();
//		System.out.println("세번째 정수 입력 : ");	int n8 = scanner.nextInt();
//		System.out.println("네번째 정수 입력 : ");	int n9 = scanner.nextInt();
//		
//		int max2 = n6;
//		
//		if(max2<n7) { max = n7;}
//		if(max2<n8) { max = n8;}
//		if(max2<n9) { max = n9;}
//		System.out.println("가장 큰 수 : "+max2);
		
		
		//문제4 : 3개의 정수를 입력받아서 오름차순 정리 [선택 정렬]
		System.out.println("첫번째 정수 입력 : ");	int n1 = scanner.nextInt();
		System.out.println("두번째 정수 입력 : ");	int n2 = scanner.nextInt();
		System.out.println("세번째 정수 입력 : ");	int n3 = scanner.nextInt();
		
		if(n1>n2){	// > : 오름차순 / < : 내림차순
			// 교체 [스왑 = 두 개 변수의 데이터 교환방법]
			int temp = n1;	//임시변수 = 변수1
			n1 = n2;		//변수1 = 변수2
			n2 = temp;		//변수2 = 임시변수
		}
		if(n1>n3 ) {int temp = n1;	n1 = n3;	n3 = temp;
		}
		if(n2>n3) {int temp = n2;	n2 = n3;n3 = temp;}
		System.out.println("입력한 값 오름차순 : "+n1+" "+n2+" "+n3);
		System.out.printf("입력한 값 오름차순 : %d %d %d\n", n1, n2, n3);
		
		
		//문제5 : 4개의 정수를 입력받아서 오름차순 정리
		System.out.println("첫번째 정수 입력 : ");	int n4 = scanner.nextInt();
		System.out.println("두번째 정수 입력 : ");	int n5 = scanner.nextInt();
		System.out.println("세번째 정수 입력 : ");	int n6 = scanner.nextInt();
		System.out.println("네번째 정수 입력 : ");	int n7 = scanner.nextInt();
		
		//첫번째 값 기준으로 비교
		if(n4>n5) { int temp2 = n4;		n4 = n5;	n5 = temp2;}
		if(n4>n6) { int temp2 = n4;		n4 = n6;	n6 = temp2;}
		if(n4>n7) { int temp2 = n4;		n4 = n7;	n7 = temp2;}
		
		//두번째 값 기준으로 비교
		if(n5>n6) {	int temp2 = n5; 	n5 = n6;	n6 = temp2;}
		if(n5>n7) { int temp2 = n5;		n5 = n7;	n7 = temp2;}
		
		//세번째 값 기준으로 비교
		if(n6>n7) { int temp2 = n6;		n6 = n7;	n7 = temp2;}
		//네번째 값 기준으로 비교x
		System.out.printf("입력한 값 오름차순 : %d %d %d %d", n4, n5, n6, n7);
		
	}//me
}//ce
