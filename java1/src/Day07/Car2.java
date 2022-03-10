package Day07;

public class Car2 {//cs

	//클래스 선언
	
	//1.필드
	int speed;
	
	//2.생성자
		//생성자 없으면 기본 생성자 추가
	
	//3.메소드
	
	//1. 현재 필드값 = speed값을 알려주는 메소드
	int getSpeed() { //인수x 반환o
		return speed;
	}//int end
	
	//2. 출력메소드
	void keyTurnOn() {//인수x반환x
		System.out.println("키를 돌립니다");	
	}//void end
	
	//3. 스피드증가 메소드 [최대 50까지 10씩 증가 반복]
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다(시속 : " + speed + "km/h)");
		}//for end
	}//void end
	
}//ce
