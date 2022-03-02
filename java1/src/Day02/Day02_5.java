package Day02;

import java.util.Scanner;

public class Day02_5 {//cs

	public static void main(String[] args) {//ms
//		//문제2 : 지폐세기
//			//[입력조건] : 금액
//			//[조건] : 십만원부터 백원까지의 개수 세기
		Scanner scanner = new Scanner(System.in);
//		System.out.println("금액 입력 : ");	int 금액 = scanner.nextInt();
//		
//		int 십만원 = 금액/100000;
//		System.out.println("십만원 : " +십만원+"장");
//		금액-= 십만원*100000;
//		
//		int 만원 = 금액/10000;
//		System.out.println("만원 : " +만원+"장");
//		금액-= 만원*10000;
//		
//		int 천원 = 금액 / 1000;
//		System.out.println("천원 : "+천원+"장");
//		금액 -= 천원*1000;
//		
//		int 백원 = 금액 / 100;
//		System.out.println("백원 : "+백원+"장");
//		금액 -= 백원*100;
//		
//		
//		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력 [true / false]
//		System.out.println("\n7의 배수인지 확인");
//		System.out.println("하나의 정수입력 : ");		int 정수1 = scanner.nextInt();
//		System.out.println("결과 : "+(정수1%7==0));
//		
//		
//		//문제4 : 하나의 정수를 입력받아 홀수인지 확인 [true / false]
//		System.out.println("\n홀수인지 확인");
//		System.out.println("하나의 정수입력 : ");		int 정수2 = scanner.nextInt();
//		System.out.println("결과 : "+(정수2%2==1));
//		
//		
//		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [true / false]
//		System.out.println("\n7의배수 and 짝수인지 확인");
//		System.out.println("\n하나의 정수를 입력");		int 정수3 = scanner.nextInt();
//		System.out.println("결과 : "+ (정수3%7==0 && 정수3%2==0));
//		
//		
//		//문제6 : 두개의 정수를 입력받아 더 큰 지 출력 [true, false]
//		System.out.println("\n두개의 정수 중 누가 더 큰지 확인");
//		System.out.println("첫번째 정수 입력 : ");		int 정수4 = scanner.nextInt();
//		System.out.println("두번째 정수 입력 : ");		int 정수5 = scanner.nextInt();
//		System.out.println("더 큰 수는 : "+(정수4>정수5 ? 정수4 : 정수5));
//		
//		
//		//문제7 : 반지름을 입력받아 원넓이 출력하기
//			// 원넓이 공식 : 반지름*반지름*3.14
//		System.out.println("\n원넓이 구하기");
//		System.out.println("반지름 입력 : ");		int 반지름 = scanner.nextInt();
//		System.out.println("원넓이 : "+(반지름*반지름*3.14));
		
		
//		//문제8 : 두 실수를 입력받아 앞 실수의 값이 뒤의 값의 몇 %인지 출력
//			// 예) 54.5   84.3 이면    64.285714%
//		System.out.println("\n실수 % 구하기");
//		System.out.println("첫번째 실수 입력 : ");	double 실수1 = scanner.nextDouble();
//		System.out.println("두번째 실수 입력 : ");	double 실수2 = scanner.nextDouble();
//		
//		double 비율 = (실수1/실수2);
//		System.out.println("실수1의 실수2 백분율 : "+ 비율 + "%");
//		System.out.println("실수1의 실수2 백분율 : %.2f %%"+ 비율);
//			// %f : 실수 표현
//				//%.숫자f : 숫자자리까지 표현
//		
//		
//		//문제9 : 사다리꼴 넓이 구하기 [윗변, 밑변 높이 입력받아 출력]
//			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//		System.out.println("\n사다리꼴 넓이 구하기");
//		System.out.println("윗변 : ");	int 윗변 = scanner.nextInt();
//		System.out.println("밑변 : ");	int 밑변 = scanner.nextInt();
//		System.out.println("높이 : ");	int 높이 = scanner.nextInt();
//		System.out.println("사다리꼴 넓이 : " + ((윗변*밑변)*높이/2));
//		
//		
//		//문제10 : 키를 정수로 입력받아 표준체중 출력
//			//표준체중 계산 : (키-100)*0.9
//		System.out.println("\n표준체중 구하기");
//		System.out.println("키 : ");	int 키1 = scanner.nextInt();
//		System.out.println("표준체중 : " + ((키1-100)*0.9));
//		
//		
//		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
//			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//		System.out.println("\nBMI 구하기");
//		System.out.println("키 : ");	int 키2 = scanner.nextInt();
//		System.out.println("몸무게 : ");	int 무게 = scanner.nextInt();
//		System.out.printf("BMI : %.2f\n" + (무게/((키2/100.0)*(키2/100.0))));
//		
//		
//		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
//		System.out.println("\n inch=>cm 변환하기");
//		System.out.println("inch 입력 : ");	int inch = scanner.nextInt();
//		System.out.println("결과 : " + (inch*2.54));
		
		
//		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
//			//소수 둘째 자리 까지 점수 출력하기
//			//중간고사 반영비율 => 30 %
//			//기말고사 반영비율 => 30 %
//			//수행평가 반영비율 => 40 %
//		System.out.println("\n반영비율 계산하기");
//		System.out.println("중간고사 : ");		double 중간 = scanner.nextDouble();
//		System.out.println("기말고사 : ");		double 기말 = scanner.nextDouble();
//		System.out.println("수행평가 : "); 	double 수행 = scanner.nextDouble();
//		
//		중간 *= 0.3;
//		기말 *= 0.3;
//		수행 *= 0.4;
//		
//		System.out.printf("반영비율 총점 : %.2f %%\n", (중간+기말+수행));
		
//		
//		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
//			//int x = 10;
//			//int y = x-- + 5 + --x;
//			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
//				//1. x-- + 5 => 감소 전에 먼저 + => 10+5
//				//2. x-- => x감소 [x = 9]
//				//3. 15 + --x => x 감소 먼저
//				//4. 15 + 8 = 23
		
		
		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		System.out.println("나이를 입력하세요 : ");		int age = scanner.nextInt();
		String 나이 = age>=10 && age<20 ? "학생" : age>=20 && age<40 ? "성인" : age>=40 ? "중년" : "알수없음";
		System.out.println("연령대 : " + 나이);
			
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬
		System.out.println("첫번째 정수를 입력 : ");		int num1 = scanner.nextInt();
		System.out.println("두번째 정수를 입력 : ");		int num2 = scanner.nextInt();
		System.out.println("세번째 정수를 입력 : ");		int num3 = scanner.nextInt();
		
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		System.out.println("첫번째 정수를 입력 : ");		int num5 = scanner.nextInt();
		System.out.println("두번째 정수를 입력 : ");		int num6 = scanner.nextInt();
		System.out.println("세번째 정수를 입력 : ");		int num7 = scanner.nextInt();
		System.out.println("네번째 정수를 입력 : ");		int num8 = scanner.nextInt();	
		
	}//me
}//ce
