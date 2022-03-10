package Day07;

public class Calculator2 {

	//클래스 선언
	
	//1.필드
	
	//2.생성자
	
	//3.메소드
		//1.실행 메소드
		void execute() {//인수x 반환x
			double result = avg(7, 10);
			println("실행결과 : " + result);
		}//void end
		
		//2.평균 메소드
		double avg(int x, int y) {//인수o 반환o
			double sum = plus(x, y);
			double result = sum/2;
			return result;
		}// double end
		
		//3. 더하기 메소드
		int plus(int x, int y) {//인수o 반환o
			int result = x+y;
			return result;
		}//int end
		
		//4. 결과출력 메소드
		void println(String message){//인수o 반환x
			System.out.println(message);
		}
	}
