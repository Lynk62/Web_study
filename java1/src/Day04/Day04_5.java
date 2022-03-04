package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {//cs

	public static void main(String[] args) {//ms
		
		/*로또판별기
		 * 1. 사용자 6개 수 입력받기 => 배열저장
		 * 		- 1 ~ 45 사이 수만 입력받기 아니면 재입력
		 * 		- 중복x 재입력
		 * 2. 추첨번호 : 컴퓨터 난수 6개 발생 => 배열저장
		 * 		- 1 ~ 45 사이
		 * 		- 중복 x
		 * 3. 사용자 추첨번호와 컴퓨터 추첨번호 동일 수의 개수
		 */
		
		//준비 과정
		int[] num = new int[6]; //사용자 선택 번호
		int[] 추첨 = new int[6]; // 컴퓨터 난수 번호
		Scanner scan = new Scanner(System.in);
		
		//1. 사용자에게 입력받기
		for(int i=0; i<6; i++) {
			//i는 1부터 6까지 1씩 증가 반복 = 6회 반복
			System.out.printf("1부터 45사이 입력 : ");
			int 번호 = scan.nextInt();
			boolean pass = true; //저장되는 조건 변수
			
			//조건1 : 유효성 검사
			if(번호<1 || 번호>45) {
				System.err.println("알림)) 선택할 수 없는 번호입니다. [재입력]");
				//1보다 작거나 45보다 크면 선택할 수 없는 번호 입력시 재입력
				i--; // 현재 i는 정상입력x
				pass = false;
			}//입력받기 조건1 for end
			
			//조건2 : 중복체크
				//1. 배열내 모든 인덱스 호출
				//2. 입력받은 값과 같은지 비교
				
			for(int j=0; j<6; j++) {
				if(번호==num[j]) {
					//2. 입력받은 값과 j번째 인덱스값과 같은지 비교
					System.err.println("이미 입력한 번호 입니다 [재입력]");
					i--; //현재 i는 정상입력x = 현재 카운트 빼기
					pass = false;
				}//if end
			}//입력받기 조건2 for end
			
			//정상입력이면 배열에 저장하기
			if(pass==true) num[i] = 번호;
			
		}//입력받기 for end
		
		System.out.println("사용자가 선택한 번호 : ");
		//사용자 배열내 모든 인덱스 출력
		for(int temp : num) {
			System.out.printf(temp+"\t");
		}
		
		System.out.println("\n");
		
		//2. 컴퓨터 난수 생성
		for(int i=0; i<6; i++) {
			
			Random random = new Random();		//1. 난수객체
			int 난수 = random.nextInt(45)+1;		//2. 난수를 int형으로 가져오기
									//random.nextInt(); : +-20억 사이중 난수 발생
									//random.nextInt(수) : 0 ~ 수 사이중 난수 발생
			//조건1 : 중복체크
			boolean 통과 = true;
			for(int temp : 추첨) {
				if(난수==temp) {
					i--;		// 중복이 있을 경우 현재 i예외
					통과 = false;
				}//if end
			}//조건1 for end
			if(통과) 추첨[i] = 난수;
		}//난수생성 for end
		
		System.out.println("추첨번호 : ");
		//사용자 배열내 모든 인덱스 출력
		for(int temp : 추첨) {
			System.out.printf(temp+"\t");
		}
		
		
		//3. 비교 = 두 배열간 동일한 수 찾기
		
		//방법1
		int 동일 = 0;
//		for(int i=0; i<num.length; i++) {
//			//i 비교 기준점
//			for(int j=0; j<추첨.length; j++) {
//				//j 비교 대상
//				if(num[i] == 추첨[j]) {
//					//사용자 배열 내 i번째 인덱스와
//					//컴퓨터 배열 내 j번째 인덱스의 수가 동일하면
//					동일++;
//				}//if end
//			}// j for end
//		}//i for end
		
		//방법2
		for(int 기준 : num) {
			//num 배열 내 하나씩 기준에 대입
			for(int 비교 : 추첨) {
				//추첨 배열 내 하나씩 비교에 대입
				if(기준 == 비교) {
					동일++;
				}
			}
		}
		
		System.out.println("동일한 수 : " + 동일);
		
	}//me
}//ce
