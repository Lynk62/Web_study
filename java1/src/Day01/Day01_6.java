package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		// ����2 : �ϳ��� �湮��
			//1. �ۼ���, ����, ��¥
		
		//1. �Է°�ü ����
		Scanner scan = new Scanner(System.in);
		
		//2. �Է��� ��� �ȳ�						3. �Է¹��� ������ �ٸ����� ����
		System.out.println("�ۼ��� : ");			String name = scan.next();
		System.out.println("���� : ");			String memo = scan.next();
		System.out.println("��¥(mm-dd) : "); 	String date = scan.next();
		
		//4. ���
		System.out.println("*--------�湮��------------");
		System.out.println("*|����|�ۼ���|����    |��¥  |");
		System.out.println("*|1  |"+name+"|"+memo+"|"+date+"|");
		System.out.println("*------------------------");
	}
}
