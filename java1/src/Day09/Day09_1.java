package Day09;

public class Day09_1 {//cs

	/*p.277
	 * 하나의 클래스로 여러개 객체 생성가능
	 * 로컬변수 : {}내에서 선언
	 * 반드시는 x
	 * 클래스의 멤버 선언 순서는 상관이 없다
	 * 
	 * 객체는 생성자x	인스턴스는 생성자o
	 * this() : 빈생성자 호출
	 *this(데이터, 데이터) : 생성자'
	 *
	 *void : 메소드가 종료되면서 반환할 값이 없다
	 *Override : 동일한 메소드를 재정의
	 *
	 *static : 정적멤버, 전역변수 만들 때 사용 / 생성자에서는 static x 전혀관련없음
	 *	 	 	객체없이 클래스를 통해 접근 가능 <-----> new 객체로 접근
	 *
	 *final : 상수 [수정불가]
	 *default : 해당 패키지  / private : 해당 클래스
	 *{ }있으면 생성자 혹은 메소드
	 *클래스명과 이름이 동일하면 생성자 / 동일하지않으면 메소드
	 *
	 *
	 *14
	 *생성자 선언시 : 클래스 이름 동일
	 *Memeber(String name, String id){
	 *this.name = name;
	 *this.id = id;
	 *}
	 *
	 *15.
	 *매개변수 	인수 : 메소드 호출시 메소드로 들어오는 데이터
	 *>>> 로그인 메소드
	 *boolean login(String id, String password){
	 *	if(id.equals("hong") && password.equalse("12345"){
	 *		return true;
	 *}
	 *return false;
	 *}
	 *
	 *>>> 로그아웃 메소드
	 *void logout(String id){
	 *	System.out.println("로그아웃 되었습니다");
	 *	return;
	 *}
	 *
	 *
	 *
	 *16.
	 *동일한 이름으로 메소드를 선언가능 [단, 서로 다른 인수[매개변수] 사용]
	 *void println(int x){	외부로부터 int형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *void println(boolean x){	외부로부터 boolean형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *void println(double x){	외부로부터 double형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *void println(String x){	외부로부터 String형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *
	 *17.
	 *객체를 생성하지 않고 메소드를 호출하는 방법
	 *static void println(int x){	외부로부터 int형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *static void println(boolean x){	외부로부터 boolean형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *static void println(double x){	외부로부터 double형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}
	 *
	 *static void println(String x){	외부로부터 String형 변수를 인수로 받아 출력 메소드
	 *	System.out.println(x);
	 *}*/
	
	public static void main(String[] args) {//ms
		
	}//me
}//ce
