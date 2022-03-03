package Day03;

import java.util.Scanner;

public class Day03_7 {//cs

	public static void main(String[] args) {//ms
		
		boolean run = true; // 실행 여부 변수  / true = 실행 false = 종료
		
		int balance = 0; //예금액[통장안에 있는 금액] 변수
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {//while(조건식( { }:무한루프
			System.out.println("-----------------------------");
			System.out.println("1. 예금  2. 출금  3. 잔고  4. 종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			int 선택 = scan.nextInt();
			if(선택==1) {//만약에 입력값이 1이면
				System.out.println("예금액 : ");	int 예금 = scan.nextInt();
				//입력받은 예금액을 통장에 넣기
				balance += 예금;
			}
			
			else if(선택==2){//만약에 입력값이 2이면
				System.out.println("출금액 : ");	int 출금 = scan.nextInt();
				//입력받은 출금액을 통장에서 빼기
				//만약에 출금액이 예금액보다 더 크면 잔액부족
				//아니면 잔액 출금 실행
				if(출금>balance) {
					System.out.println("잔액이 부족합니다.");
				}
				else { balance -= 출금; }
			}
			else if(선택==3){//만약에 입력값이 3이면
				System.out.println("잔고: "+balance);
			}
			else if(선택==4){//만약에 입력값이 4이면
				break;//while 탈출 [무한루프 탈출]
				
			}
			else {//그외
				System.out.println("알림) 알 수 없는 번호입니다.");
			}
		}
		
	}//me
}//ce
