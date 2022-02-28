package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		// 문제2 : 하나의 방문록
			//1. 작성자, 내용, 날짜
		
		//1. 입력객체 선언
		Scanner scan = new Scanner(System.in);
		
		//2. 입력할 대상 안내						3. 입력받은 데이터 다른곳에 저장
		System.out.println("작성자 : ");			String name = scan.next();
		System.out.println("내용 : ");			String memo = scan.next();
		System.out.println("날짜(mm-dd) : "); 	String date = scan.next();
		
		//4. 출력
		System.out.println("*--------방문록------------");
		System.out.println("*|순번|작성자|내용    |날짜  |");
		System.out.println("*|1  |"+name+"|"+memo+"|"+date+"|");
		System.out.println("*------------------------");
	}
}
