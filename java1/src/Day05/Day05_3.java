package Day05;

import java.util.Scanner;

public class Day05_3 {//cs

	public static void main(String[] args) {//ms
		
		//p.181
//		//예제7)
//		int max = 0;				//최댓값 저장하는 변수
//		int [] array = {1,5,3,8,2};	//선언+초기값 선언
//		
//		for(int i=0; i<array.length; i++) {
//			//i는 0부터 배열의 길이(5)까지 1씩 증가 실행 반복 처리
//			if(max<array[i]) {
//				max = array[i];
//			}//if end
//			//만약에 max보다 i번째 인덱스의 값이 더 크면 max에 i번째 값 대입
//		}//for end
//		System.out.println("max : " + max);
		
		
//		//예제8)
//		int[][] array2 = {
//				{95,86},			//1행
//				{83,92,96},			//2행
//				{78,83,93,87,88}	//3행
//		};
//		
//		int sum = 0;		//합계
//		double avg = 0.0;	//평균
//		int count = 0;
//		
//		//2차원 배열내 모든 데이터 호출
//		//풀이
//		for(int 행 = 0; 행<array2.length; 행++) {
//			//행은 0부터 배열의 행길이[3]미만까지 1씩 증가
//			for(int 열 = 0; 열<array2[행].length; 열++) {
//				//열은 0브타 베열의 열길이 [2,3,5]미만까지 1씩 증가
//				sum+=array2[행][열];
//			}//열for end
//			count += array2[행].length;	//열길이의 누적합계
//			
//		}//행 for end
//		
//		avg = (double)sum/count;
//		
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + avg);
		
		
		
		//예제9)
		boolean run = true;	// while문 스위치 변수
		
		int studentNum = 0;	// 학생수 변수
		int[] scores = null;	// 점수 배열 / 메모리 할당x
		
		Scanner scan = new Scanner(System.in);	//입력객체
		
		while(run) {	//무한루프 [5번입력시 종료]
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println(">> 선택 : ");		int selectNo = scan.nextInt();
			
			if(selectNo==1) {	//학생 수
				System.out.println("학생 수 >> : ");	studentNum = scan.nextInt();
				//입력받은 학생 수만큼 배열 길이 선언
				scores = new int[studentNum];
			}//selectNo==1 if end
			
			else if(selectNo==2) {	//학생 점수 입력하기
				for(int i=0; i<scores.length; i++) {	//배열내 모든 인덱스 만큼 반복 처리
					System.out.printf("scores[%d] : \n", i);
					scores[i] = scan.nextInt();	//입력받아 i번째 인덱스에 저장
				}//for end
			}//selectNo==2 if end
			
			else if(selectNo==3) {	//학생 점수 출력하기
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);	//i번째 인덱스 출력
				}//for end
			}//selectNo==3 if end
			
			else if(selectNo==4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0; i<scores.length; i++) {
					
					//최고점수 구하기
					if(max<scores[i]) {
						max = scores[i];	//i번째 인덱스에 데이터 대입
					}//if end
					
					//누적합계
					sum += scores[i];
				}//for end
				
				//평균점수 구하기
				avg = (double)sum / scores.length;
				
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			}//selectNo==4 if end
			
			else if(selectNo==5) {
				run = false;	//break;
			}//selectNo==5 if end
		}//while end
		
		System.out.println("프로그램 종료");
		
	}//me
}//ce
