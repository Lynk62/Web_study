package Day08;

public class Day08_1_calculator {//cs

	public static void main(String[] args) {//ms
	
		//p.238 : static
			//��������
			//�������� ������ = ���α׷� ���������� ���
		
		//Ŭ���� �ʵ�, �޼ҵ�(���) ���� ���
			//(static ����� �ƴ� ��)1. ��ü ���� = ��ü.���
				//��ü�� ������ �� new �����ڷ� ��ü (�� �������) �޸� �Ҵ�
		Calculator calculator = new Calculator();
		System.out.println("��ü�� �̿��� ��� ���� : " + calculator.pi);
			//(static ����� ��) 1. Ŭ������.���
				//Ŭ������ �ε� �ǰ� �޼ҵ念���� static ������ ���� 
		System.out.println("��ü ���� ��� ���� : " + Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
								//Ŭ������.����������
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}//me
}//ce
