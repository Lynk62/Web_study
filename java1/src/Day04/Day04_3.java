package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {//cs

	public static void main(String[] args) {//ms
		/*가위바위보 게임
		 * 1. 사용자에게 가위[0] / 바위[1] / 보[2] / 종료[4]중에 입력받기
		 * 2.컴퓨터 난수 발생 [0~2]
		 * 3. 사용자 컴퓨터 중 승리자 판단 [경우의수]
		 * 4. 3번 선택하기 전까지 게임 실행
		 * 5. 3번 선택시 게임 종료
		 * 	- 총 게임 수 출력
		 * 	- 최종 승리자*/
		
		//변수 준비
		int p; 				//사용자가 선택한 수 저장
		int com;					//컴퓨터가 난수를 생성한 수 저장
		int term = 0;					//총 가위바위보 실행 횟수
		int pvic = 0;	int cvic = 0;	//각 승리 수
		
		//입력객체
		Scanner scan = new Scanner(System.in);
		
		//프로그램 실행
		while(true) {  // 프로그램 실행[무한루프 종료조건 : 3번입력시 종료(break)]
			System.out.println("--------------[[가위바위보 게임]]---------------");
			System.out.println("가위(0)    바위(1)    보(2)    종료(3)");
			System.out.println(">>>>>>>선택 : "); 	p = scan.nextInt(); //입력한 수 저장
			
			Random random = new Random(); 	//난수 객체 선언
				
			//random.nextInt() : int가 표현할 수 있는 범위내 난수 발생
				//random.nextInt(수) : 0 ~ 수 전까지 범위내 난수 발생
					//random.nextInt(10) : 0 ~ 9 중 범위내 난수 발생
					//random.nextInt(11)+10 : 0 ~ 20 전까지 범위내 난수 발생
			com = random.nextInt(3);		//난수를 정수(int형)으로 가져오기
			
			//종료조건
			if(p==3) {
				System.err.println("알림)) 게임종료");
				System.out.println("총 게임 수 : "+term);
				
				if(pvic>cvic)	{
					System.err.println("최종 승리자 : 플레이어");
				}
				else if(pvic<cvic) {
					System.out.println("최종 승리자 : 컴퓨터");
				}
				else if(pvic>0 && cvic>0 && pvic==cvic) {
					System.out.println("최종 승리자 : 무승부");
				}
				else {
					System.out.println("최종 승리자 : 없음");
				}
				break;
			}//종료조건 end
			
			else if(p>=0 && p<=2){  //정상입력
				//승리자 판단
				if((p==0 && com==2) || (p==1 && com==0) || (p==2 && com==1)) {  //플레이어 승리 경우의 수 [0=>2 / 1=>0 / 2=>1]
					//플레이어가 이기는 경우의 수는 3가지
					System.err.println(">> 플레이어 승리! <<");
					pvic++;  // 플레이어 승리 수 증가
				}//승리 end
				
				else if((p==0 && com==0) || (p==1 && com==1) || (p==2 && com==2)) {  // 비기는 경우의 수
					System.err.println(">> 비겼습니다! <<");
				}//비기기 end
				
				else {  //그외는 컴퓨터 승리
					System.err.println(">> 컴퓨터 승리! <<");
					cvic++;
				}//지기 end
				//게임수 증가
				term++;
			} // 정상출력 end
			
			else {
				System.err.println("알림))알 수 없는 행동입니다");//
			} //에러 end
		}//while1 end
		
	}//me
}//ce
