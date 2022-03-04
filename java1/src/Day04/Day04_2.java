package Day04;

import java.util.Scanner;

public class Day04_2 {//cs
	
	public static void main(String[] args) {//ms
		/*자판기 프로그램
		 * 1. 메뉴판 [1.콜라(300원) / 2. 환타(200원) / 3. 사이다(100원) / 4. 결제 ]
		 * 		- 메뉴판에서 제품 선택하면 장바구니에 넣기
		 * 		- 재고가 부족하면 알림(재고부족)
		 * 2. 초기 재고 [제품당 10개씩]
		 * 3. 결제시 금액 입력받아 결제액 만큼 차감 후 잔돈 출력
		 * 		- 투입한 금액보다 결제액이 더 크면 구매 취소*/
		
		
		
		//공통변수 [모든 괄호 내에서 사용하는 변수들]
		Scanner scan = new Scanner(System.in);						//1. 입력객체
		int 콜라재고 = 10;		int 환타재고 = 10;		int 사이다재고 = 10;	//2. 재고변수
		int 콜라구매 = 0;		int 환타구매 = 0;		int 사이다구매 = 0;		//3. 장바구니
		
		// 프로그램 시작 [무한루프 / 종료조건 없음]
		while(true) {
			System.out.println("------------------------[[메뉴판]]------------------------\n");
			System.out.println("1. 콜라[300원]     2. 환타[200원]    3. 사이다[100원]    4. 결제");
			System.out.println("\n>>>>선택 : ");	int 선택 = scan.nextInt();
			
			if(선택==1) {			//콜라 구매
				if(콜라재고==0) {	//콜라 재고가 0이면 구매 불가
					System.err.println("알림)) 재고가 없습니다. 재고 준비중...");
				}
				else {			//콜라 재고가 있으면 구매
					System.err.println("[[ 콜라 담았습니다 ]]");
					콜라구매++;	//장바구니에 콜라 1 담기
					콜라재고--;	//콜라 재고 차감
				}
			} //콜라 구매 end
			
			else if(선택==2) {	//환타 구매
				if(환타재고==0) {	//환타 재고가 0이면 구매 불가
					System.err.println("알림)) 재고가 없습니다. 재고 준비중...");
				}
				else {			//환타 재고가 있으면 구매
					System.err.println("[[ 환타 담았습니다 ]]");
					환타구매++;	//장바구니에 콜라 1 담기
					환타재고--;	//환타 재고 차감
				}
			} //환타 구매 end
			
			else if(선택==3) {	//사이다 구매
				if(사이다재고==0) {	//사이다 재고가 0이면 구매 불가
					System.err.println("알림)) 재고가 없습니다. 재고 준비중...");
				}
				else {			//사이다 재고가 있으면 구매
					System.err.println("[[ 사이다 담았습니다 ]]");
					사이다구매++;	//장바구니에 사이다 1 담기
					사이다재고--;	//사이다 재고 차감
				}
			} //사이다 구매 end
			
			else if(선택==4) {	//결제
				System.out.println("----[ 결제제품 목록 ]----");
				System.out.println("제품명\t수량\t금 액");
				if(콜라구매!=0) System.out.println("콜 라\t"+콜라구매+"개\t"+(콜라구매*300)+"원");
				if(환타구매!=0) System.out.println("환 타\t"+환타구매+"개\t"+(환타구매*200)+"원");
				if(사이다구매!=0) System.out.println("사이다\t"+사이다구매+"개\t"+(사이다구매*100)+"원");
				int sum = (콜라구매*300)+(환타구매*200)+(사이다구매*100);
				System.out.println("제품 총 결제액 : "+sum+"원");
				
				System.out.println("\n-------------------------------");
				System.out.println("1. 결제   2. 취소");		int 결제선택 = scan.nextInt();
				if(결제선택==1) {	//1. 결제
					//1. 금액 입력
					while(true) { //무한루프 [ 종료조건 : 금액이 총결제액보다 크면 ]
						System.err.println("투입 금액 : ");		int money = scan.nextInt();
					
						//2. 금액이 결제액보다 적으면 결제 불가 = 금액 재 입력
						if(money<sum) {	//결제 불가 => 재입력
							System.err.println("알림)) 결제 불가 금액을 재입력 하세요");
						}//결제불가 end
					
						//3. 금액이 결제액보다 많으면 결제 성공 = 장바구니 초기화 = 잔돈출력
						else {
							System.err.println("\n결제 성공");
							System.out.println("잔돈"+(money-sum)+"원입니다\n");
							콜라구매 = 0;		환타구매 = 0;		사이다구매 = 0;			//구매수 초기화
							break;
						}//결제성공 end
					}//while2 end
				}//결제 end
				
				else if(결제선택==2) {		//2. 취소
					System.err.println("알림)) 구매목록 모두 지우기");
					콜라재고+=콜라구매;	환타재고+=환타구매;	사이다재고+=사이다구매;	//구매수 => 재고로 옮기기
					콜라구매 = 0;		환타구매 = 0;		사이다구매 = 0;			//구매수 초기화
				}//결제취소 end
				
				else {
					System.err.println("알림)) 알수 없는 행동입니다");
				}//에러 end
				
			} //결제 end
			else {
				System.err.println("알림)) 알수 없는 행동입니다");
				}//에러 end
		}//while end
		
		
		
	}//me
}//ce
