package Day03;

import java.util.Scanner;

public class Day03_4 {//cs

	public static void main(String[] args) {//ms
		//제어문 : 1. if문		2. switch문
			//if 	: 논리검사 (true / false) / 경우의 수 정해져있지 않는 경우
			//switch: 데이터검사 / 경우의 수 정해져 있는 경우
				//동일한 case면 실행문 처리 후 다음 case 이동
			//형태
				//switch(검사대상) {
				//	case'값' : 실행문;
				//	case'값' : 실행문;
				//	case'값' : 실행문;
				//	default : 실행문;
				// }
			//break; 가장 가까운 switch 혹은 반복문 탈출[나가기]
		
		
		//예제1 점수가 90이면 A 80점이면 B 70점이 C 그외 탈락
		
		int 점수 = 80;
		if(점수==90)		System.out.println("A등급");
		else if(점수==80)		System.out.println("B등급");
		else if(점수==70)		System.out.println("C등급");
		else System.out.println("탈락");
		
		System.out.println("--------------------------");
		
		switch (점수) {
		case 90: System.out.println("A등급");		break;
		case 80: System.out.println("B등급");		break;
		case 70: System.out.println("C등급");		break;
		default: System.out.println("탈락");		break;
		}
		
		
		//예제2 
		int 버튼 = 3;
		
		switch(버튼) {
		case 1 :  System.out.println("1층으로 이동");	break;
		case 2 :  System.out.println("2층으로 이동");	break;
		case 3 :  System.out.println("3층으로 이동");	break;
		case 4 :  System.out.println("4층으로 이동");	break;
		default:  System.out.println("정지");	
		}
		
		
		//예제3
		char 등급 = 'B';
		switch(등급) {
			case 'A' :
			case 'B' :  System.out.println("우수회원");	break;
			case 'C' :
			case 'D' :  System.out.println("일반회원");	break;
			default  : System.out.println("손님");
		}
		
		
		//예제4
		String 직급 = "과장";
		
		switch(직급) { // 선택 조건이기 떄문에 .equals 사용 x
			case "부장" : System.out.println("700만원");	break;
			case "과장" : System.out.println("500만원");	break;
			default : System.out.println("300만원");
		}
		
		
		
		//문제1 : if말고 switch = 국어, 영어, 수학 점수를 입력받아 평균이 90이상이면 A / 80점 이상 B / 나머지 탈락
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 : ");	int ko = scan.nextInt();
		System.out.println("영어 : ");	int en = scan.nextInt();
		System.out.println("수학 : ");	int ma = scan.nextInt();
		
		int avg = (ko+en+ma)/3;
		System.out.println("평균 : "+avg);
		
		switch(avg/10) {
			case 9 :  System.out.println("A등급입니다"); break;
			case 8 :  System.out.println("B등급입니다"); break;
			default : System.out.println("탈랍니다");
				
		}
		
	}//me
}//ce
