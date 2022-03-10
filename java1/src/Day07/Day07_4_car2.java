package Day07;

public class Day07_4_car2 {//cs

	public static void main(String[] args) {//ms
		
		//p.229 : 외부호출
		
		//1.객체 생성
		Car2 myCar = new Car2();
		
		//2.자동차 시동
		myCar.keyTurnOn();//인수x 반환x
		
		//3.자동차 전진 메소드 호출
		myCar.run();
		
		//4.현재 스피드 확인 메소드 호출
		int speed = myCar.getSpeed();	//인수x반환o
		System.out.println("현재속도 : " + speed + "km.h");
	}//me
}//ce