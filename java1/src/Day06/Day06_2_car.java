package Day06;

public class Day06_2_car {//cs

	public static void main(String[] args) {//cs
		
		//1. 클래스 생성 후 = 객체 생성
		Car myCar = new Car();//객체 생성
			//1. Car : 정의된 클래스명
			//2. myCar : 객체이름[아무거나]
			//3. new : 메모리 할당 연산자
			//4. Car() : 생성자
		
		//2. 객체 필드 호출 [. : 접근 연산자 (객체 내 멤버 접근)]
		System.out.println("제작회사 : " + myCar.company);
			//myCar 객체 내 필드 접근
			//객체이름.멤버이름
		System.out.println("모델명 : " + myCar.model);
			//myCar.model : model 필드 호출
		System.out.println("색깔 : " + myCar.color);
			//myCar.color : color 필드 호출
		System.out.println("최고 속도 : " + myCar.maxSpeed);
			//myCar.maxSpeed : maxSpeed 필드 호출
		System.out.println("현재 속도 : " + myCar.speed);
			//myCar.speed : speed 필드 호출
		
		//3. 객체 내 필드 값 변경
		myCar.speed = 60;
			//myCar 객체 내 speed 필드 호출해서 60이라는 데이터 대입
		System.out.println("수정된 속도 : " + myCar.speed+"\n");
		
		//새로운 자동차 객체 생성
		Car yourCar = new Car();
		System.out.println("2번 자동차 : " + yourCar.speed);
		
	}//ce
}//ce
