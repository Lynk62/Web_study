package Day09;

public class Day09_3 {//cs

	public static void main(String[] args) {//ms
	//p.294 ~ 295
			//���� super()������ �ڵ��߰�
			//super() : �θ�Ŭ������ �� ������ ȣ��
			//super(�μ�1, �μ�2) : �θ�Ŭ������ [2���Τ���] ������ ȣ��
			//super
		//1.����Ŭ���� ��ü ����
		Student student = new Student("ȫ�浿", "123456-123456", 1);
		//2.����Ŭ������ ���� ��ü�� ����Ŭ������ ��� ����
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		//3.
		System.out.println("studentNo : " + student.studentNo);
	}//me
}//ce
