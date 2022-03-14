package Day09;

public class Tire {	//클래스 선언

	//1.필드
	public int maxRotation;	//최대 회전수[회전가능수]
	public int accumulatedRotation;	//누적회전수
	public String location;	//타이어의 위치
	
	//2.생성자[객체 생성시 초기값 담당]
	public Tire(String location, int maxRoatation) {
				//타이어위치, 최대회전수
		this.location = location;	//외부로부터 전달받은 인수를 내부변수에 대입
		this.maxRotation = maxRoatation;
	}
	
	//3.메소드
	public boolean roll() {	//타이어 회전 구현 메소드
		accumulatedRotation++;	//누적회전수를 1증가 //타이어 회전
		
		if(accumulatedRotation < maxRotation) {
			//만약에 누적회전수가 최대회전수보다 작으면 [수명 남음]
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}//if end
		
		else {	//아니면 [수명없다]
			System.out.println("***" + location + "Tire 펑크" + "***");
			return false;
		}//else end
		
	}//boolean end	
}//ce
