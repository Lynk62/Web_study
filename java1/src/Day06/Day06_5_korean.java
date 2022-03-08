package Day06;

public class Day06_5_korean {//cs

	public static void main(String[] args) {//ms
		//p.207
		
		//1.생성자 없이 필드에 값 넣기
		Korean k1 = new Korean();
		k1.name = "유재석";
		k1.ssn = "123123-123123";
		System.out.println("k1 국적 : " + k1.nation);
		System.out.println("k1 이름 : " + k1.name);
		System.out.println("k1 주민등록번호 : " + k1.ssn);
		
		//2. 필드 2개를 갖는 생성자로 객체 생성
		Korean k2 = new Korean("박자바", "011225-1234567");
		System.out.println("k2 국적 : " + k2.nation);
		System.out.println("k2 이름 : " + k2.name);
		System.out.println("k2 주민등록번호 : " + k2.ssn);
		
		///////////////////////////////////////////////////////
		
		//1. 빈 생성자
		Korean 한국인1 = new Korean();
			//국적 = 대한민국 / 이름, 주민등록번호 = 없음
		
		//2. 필드 1개 생성자 객체 생성
		Korean 한국인2 = new Korean("유재석");
			//국적 = 대한민국 / 이름 = 유재석 / 주민등록번호 = 없음
		
		//3. 필드 2개 생성자 객체 생성
		Korean 한국인3 = new Korean("강호동", "1234-1234");
			//국적 = 대한민국 / 이름 = 강호동 / 주민등록번호 = 1234-1234
		
		//4. 필드 3개 생성자 객체 생성
		Korean 한국인4 = new Korean("일본", "신동엽", "123456789");
			//국적 = 일본으로 바뀜 / 이름 = 신동엽 / 주민등록번호 = 123456789
		
	}//me
}//ce
